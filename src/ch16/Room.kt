package ch16

open class Room(val name: String){
    protected open val dangerLevel = 5

    var monster : Monster? = Goblin()

    fun description() = "Room : $name\n" + "위험수준: $dangerLevel\n" +
                        "Creature: ${monster?.description ?: "none."}"

    open fun load() = "아무도 여기에 오지 않았습니다....."
}

class TownSquare : Room("Town Square"){
    override val dangerLevel = super.dangerLevel - 5

    private var bellSound = "댕댕"

    override fun load() = "당신의 참여를 주민들 다 환영합니다!\n${ringBell()}"

    private fun ringBell() = "당신의 도착을 종탑에서 알립니다. $bellSound "
}