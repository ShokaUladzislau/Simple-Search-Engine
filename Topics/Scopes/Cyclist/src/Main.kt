import kotlin.math.abs

fun main() {
    var distance = readLine()!!.toInt() // the distance back
    var totalDistance = readLine()!!.toInt()

    // fix the code below
    if (distance < 0) {
        distance =  abs(distance)
    }
    totalDistance += distance
    println(totalDistance)
}