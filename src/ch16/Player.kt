package ch16

// damageRoll을 아직 구현하지않아 빨간줄이 발생
class Player(_name : String,
             override var healthPoints: Int = 100,
             var isBlessed: Boolean = false,
             private var isImmortal : Boolean) : Fightable{

    override val dicecount = 3
    override val diceSides= 6

    override fun attack(opponent: Fightable): Int {
        val damageDealt = if(isBlessed){
            damageRoll * 2
        }else {
            damageRoll
        }
        opponent.healthPoints -= damageDealt
        return damageDealt
    }
}