package ch12

fun main(args: Array<String>) {

    val player = Player()
    player.castFireBall()

    player.name = "eunho"
    println(player.name)
    println(player.healthPoints)
}

private fun printPlayerStatus(plyer : Player){
    println("(Aura: ${plyer.healthPoints})")
}