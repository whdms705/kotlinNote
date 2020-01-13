package ch16

import  java.util.*

interface Fightable {
    var healthPoints: Int
    val dicecount : Int
    val diceSides : Int
    val damageRoll : Int
        get() = ( 0 until dicecount).map {
            Random().nextInt(diceSides) + 1
        }.sum()

    fun attack(opponent: Fightable):Int
}