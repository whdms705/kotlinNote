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



    // 중복된 키 추가하기
    val partronGold3 = mutableMapOf("Elo" to 10.5 ,"Mordoc" to 8.0)
    println(partronGold3)
    partronGold3 +="Mordoc" to 11.0
    println(partronGold3)

    //Map에서 값 가져오기

    // 키의 값을  가져오며 , 키가 없으면 null을 반환한다.
    /*println(partronGold["Elo"])
    println(partronGold["Mordoc"])

    //getValue 키의 값을 가져오며, 키가 없으면 예외를 발생시킨다.
    println(partronGold.getValue("Elo"))
    println(partronGold.getValue("aaa"))

    //getOrElse 키의 값을 가져오며, 키가 없으면 지정된 익명함수를 실행해서 결과값 반환한다.
    println(partronGold.getOrElse("aaaa"){"No such patron"})


    // getOrDefault 키의 값을 가져오거나 , 또는 키가 없으면 우리가 지정한 기본값을 반환한다.
    println(partronGold.getOrDefault("aaa",0.0))*/


    //Map에 항목 추가하기
    val name = mutableMapOf<String,Double>("ka" to 0.5)
    name.put("Kim",5.5)
    name.put("Jo",3.5)


    println(name.toString())


}