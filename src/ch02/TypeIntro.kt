package ch02

// 컴파일 시점 상수 선언하기
const val MAX_EXPERIENCE: Int = 5000;


// @Content : 변수 선언
fun main(args: Array<String>) {
    var experiencePoints = 5;
    experiencePoints += 5;
    println(experiencePoints);

    // 읽기전용 변수 선언
    val playerName = "에스트라곤";
    println(playerName)

    println(MAX_EXPERIENCE)



}
