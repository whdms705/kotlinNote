package ch12

//? 필드별로 커스텀 마이징하고 싶다면?

 class Player {
    // 각각 커스터 마이징(name) 가능
    var name = "madrigal"
        get() = field.capitalize()
        set(value){
            field = value.trim()
        }

    // 각각 커스터 마이징(healthPoints) 가능
    var healthPoints = 89
        get() = field*2;
        set(value){
            field = field*3;
        }



    val isBlessed = true
    private val isImmortal = false



    fun castFireBall(numFireballs: Int = 2) = println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")

}