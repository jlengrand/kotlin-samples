import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

suspend fun main(){
    val user = "jlengrand"
    val repoType = RepoType.users

    val repositories = getRepos(user, repoType)
    repositories.forEach { applyTag(it.fullName) }

    client.close()
}

val token: String = System.getenv("GITHUB_HACKTOBERFEST_TOKEN")
val client = HttpClient(){ install(JsonFeature) {
        serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
            prettyPrint = true
            isLenient = true
            ignoreUnknownKeys = true
        })
    }
}

enum class RepoType { users, orgs }

@Serializable
data class Tags(val names : List<String>){
    private val hacktoberfest = "hacktoberfest"
    fun isFun() = this.names.contains(hacktoberfest)
    fun addHacktoberfest() = if (isFun()) this else Tags(this.names + hacktoberfest)
}

@Serializable
data class Repository(val id : Long, @SerialName("full_name") val fullName : String )

suspend fun getRepos(owner: String, repoType: RepoType): List<Repository> {
    val repos: List<Repository> = client.get("https://api.github.com/$repoType/${owner}/repos?type=owner&sort=updated&per_page=10"){
        headers {
            append(HttpHeaders.Accept, "application/vnd.github.mercy-preview+json")
        }
    }
    return repos
}

suspend fun applyTag(ownerAndRepo: String){
    val tags = readTags(ownerAndRepo)
    if(!tags.isFun()) {
        println("Applying tag to $ownerAndRepo")
        println(setTags(ownerAndRepo, tags.addHacktoberfest()))
    }
    else println("Tag already found. Skipping $ownerAndRepo")
}

suspend fun readTags(ownerAndRepo: String): Tags {
    val tags: Tags = client.get("https://api.github.com/repos/$ownerAndRepo/topics"){
        headers {
            append(HttpHeaders.Accept, "application/vnd.github.mercy-preview+json")
        }
    }
    return tags
}

suspend fun setTags(ownerAndRepo: String, tags: Tags): Tags {
    val newTags: Tags = client.put("https://api.github.com/repos/$ownerAndRepo/topics"){
        headers {
            append(HttpHeaders.Accept, "application/vnd.github.mercy-preview+json")
            append(HttpHeaders.ContentType, ContentType.Application.Json)
            append(HttpHeaders.Authorization, "token $token")
        }
        body = tags
    }
    return newTags
}