package ch11

val partronGold = mapOf("Elo" to 10.5 ,"Mordoc" to 8.0 ,"Sophie" to 5.5 )

val partronGold2 = mapOf(
        Pair("Eli",10.5),
        Pair("Mordoc",8.0),
        Pair("Sophie",6.5)
);

fun main(args: Array<String>) {
    println(partronGold)
    println(partronGold2)

    println(partronGold["Elo"]);
    println(partronGold["Mordoc"]);

    // 중복된 키 추가하기
    val partronGold3 = mutableMapOf("Elo" to 10.5 ,"Mordoc" to 8.0)
    println(partronGold3)
    partronGold3 +="Mordoc" to 11.0
    println(partronGold3)

}