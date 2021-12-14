import kotlin.system.measureNanoTime
import kotlin.time.Duration
import kotlin.time.Duration.Companion.INFINITE
import kotlin.time.Duration.Companion.ZERO
import kotlin.time.Duration.Companion.convert
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.microseconds
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.nanoseconds
import kotlin.time.Duration.Companion.parse
import kotlin.time.Duration.Companion.parseIsoStringOrNull
import kotlin.time.Duration.Companion.parseOrNull
import kotlin.time.DurationUnit
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

//See here for the related blog post : https://lengrand.fr/measuring-time-and-durations-in-kotlin/

fun main() {
    val tenDays: Duration = 10.days
    val fiveNanoseconds = 5.nanoseconds

    println(tenDays + fiveNanoseconds)

//    days, hours, minutes, seconds, nanoseconds
//    val oneWeek = 1.week -> Nope, won't work

    val minusOneDay = (-1).days

    println(2.hours - 3.days)
    println((2.hours - 3.days).absoluteValue)

    println(1.days - INFINITE)
    println(ZERO)

    println((12.hours + 30.minutes).inWholeDays)
    println((12.hours + 30.minutes).toDouble(DurationUnit.DAYS))

    println((12.days + 5.hours + 18.minutes).toIsoString())
    println(INFINITE.toIsoString())
    println(parseIsoStringOrNull("PT283H18M"))

    println(parseOrNull("11d 19h 18m"))
//    println(parse("11w"))

    // All the comparable goodies
    println(12.milliseconds > 120.nanoseconds)
    println(12.milliseconds.coerceAtMost(1200.microseconds))
    println(12.milliseconds.coerceAtLeast(1200.microseconds))
    println(12.milliseconds.coerceIn(12.microseconds, 1200.microseconds))
    println(12.milliseconds.coerceIn(12.microseconds.rangeTo(1200.microseconds)))

    experimentalConversion()
    experimentalPrintDuration()
}

@OptIn(ExperimentalTime::class)
fun experimentalConversion(){
    val converted = convert(12.32, DurationUnit.DAYS, DurationUnit.MINUTES).minutes
    println(converted)
}

@OptIn(ExperimentalTime::class)
fun experimentalPrintDuration(){
    val timeToPlop = measureTimedValue {
        println("plop")
    }

    println(timeToPlop.duration)
}