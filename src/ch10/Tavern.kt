package ch10

const val TAVERN_NAME = "taeernyl's Folly"

var playerGold = 10
var playerSilver = 10
var patronList = listOf("Eli","Mordoc","Sophie");


fun main(args: Array<String>) {
    println(patronList)

    // 첫번째 고객 정보 가져오기
    println(patronList[0])

    println(patronList.first())

    println(patronList.last())


    // 존재 하지않는 인덱스 사용시
    //println(patronList[4])

    // getOrElse
    println(patronList.getOrElse(4){"Unknown Patron"})


    // getOrNull 테스트하기
    val fifthPatron = patronList.getOrNull(4) ?: "Unknown Patron 2"
    println(fifthPatron)
}