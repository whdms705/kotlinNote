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

// 추상클래스 정의
abstract class Monster(val name : String
                       , val description : String
                       , override var healthPoints: Int) : Fightable {

    override fun attack(opponent: Fightable): Int {
        val damageDealt = damageRoll
        opponent.healthPoints -= damageDealt
        return damageDealt
    }
}

// Monster 추상클래스의 서브 클래스 생성
class Goblin(name : String = "Goblin"
            ,description: String = "추악하게 생긴 고블린"
            ,healthPoints: Int = 30) : Monster(name, description, healthPoints)
{
    override val diceSides = 2
    override val dicecount = 8

}