package ch17

class LootBox<T> (item:T){
    var open = false
    private var loot: T = item

    fun fetch(): T? {
        return loot.takeIf { open }
    }
}

class Fedora(val name: String , val value:Int)

class Coin(val value : Int)

fun main(args: Array<String>) {
    val lootBoxOne: LootBox<Fedora>   = LootBox(Fedora("평범한 중절모",12))
    val lootBoxTwo: LootBox<Coin> = LootBox(Coin(15))

    // 타입 추론을 지원해주기 때문에 아래와 같이 생략가능
    val lootBox1 = LootBox(Fedora("평범한 중절모",12))
    val lootBox2 = LootBox(Coin(15))


    lootBoxOne.open = true

    lootBoxOne.fetch()?.run {
        println("$name 을 LootBox에서 꺼냈습니다.")
    }

}