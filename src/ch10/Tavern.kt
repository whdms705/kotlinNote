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
}