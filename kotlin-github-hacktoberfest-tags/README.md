# GitHub Hacktoberfest tags

This module is a small utility used to add the `Hacktoberfest` topic to all of your GitHub repositories.
It works with organizations as well as personal repos

## Setup

* Create [a personal access token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token) and save it on your system as environment variable `GITHUB_HACKTOBERFEST_TOKEN`.
* Set the `user` and `repoType` to the desired values 
* Have a quick look at the `getRepos` function, and possibly change the filters. Default is the last 10 updated repos you're owner of (`type=owner&sort=updated&per_page=10`);
* Run the script, et voila

The script shouldn't be able to screw up anything, since it only alters topics, but I am not liable for any weird (side) effects.

## Notable stuff

This utility is written in Kotlin, and pretty much only uses a Ktor Client and kotlinx serialization to do the bare minimum. Was fun to create.
Be aware that for large amounts of repos you might run into API limits issues.

Have fun!

## Author

* [Julien Lengrand-Lambert](https://twitter.com/jlengrand)