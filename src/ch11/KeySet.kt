package ch11


fun main(args: Array<String>) {
    //val map = HashMap<String, Double>()
    val map = mapOf("Elo" to 10.5 ,"Mordoc" to 8.0 ,"Sophie" to 5.5 )

    for (key in map.keys) {
        println(key)
    }
}