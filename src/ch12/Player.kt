package ch12

//? 필드별로 커스텀 마이징하고 싶다면?

class Player {
    var name = "madrigal"
        get() = field.capitalize()
        set(value){
            field = value.trim()
        }

    var healthPoints = 89
    val isBlessed = true
    private val isImmortal = false



    fun castFireBall(numFireballs: Int = 2) = println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")

}