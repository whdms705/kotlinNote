package ch14

fun main(args: Array<String>) {

    var currentRoom = Room("Eunho Room");
    println(currentRoom.description())
    println(currentRoom.load())

    var subCurrentRoom = TownSquare()
    println(subCurrentRoom.description())
    println(subCurrentRoom.load())

}