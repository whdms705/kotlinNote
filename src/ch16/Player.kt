package ch16

// damageRoll을 아직 구현하지않아 빨간줄이 발생
class Player(_name : String,
             override var healthPoints: Int = 100,
             var isBlessed: Boolean = false,
             private var isImmortal : Boolean) : Fightable{
    var name = _name
    override val dicecount = 3
    override val diceSides= 6

    constructor(name: String) : this(name , isBlessed = true , isImmortal = false){
        if(name.toLowerCase() == "kar") healthPoints = 40
    }

    fun auraColor(): String {
        val auraVisible = isBlessed && healthPoints > 50 || isImmortal
        val auraColor = if (auraVisible) "GREEN" else "NONE"
        return auraColor
    }

    fun formatHealthStatus() =
            when (healthPoints) {
                100 -> " 최상의 상태임!"
                in 90..99 -> "약간의 찰과상만 있음."
                in 75..89 -> if (isBlessed) {
                    "경미한 상처가 있지만 빨리 치유되고 있음!"
                } else {
                    "경미한 상처만 있음."
                }
                in 15..74 -> "많이 다친 것 같음."
                else -> "최악의 상태임!"
            }

    fun castFireball(numFireballs: Int = 2) =
            println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")

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