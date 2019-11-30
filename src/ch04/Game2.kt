package ch04

fun main(args: Array<String>) {
    var healthpoints = 50;
    val isBlessed = true;
    val isImmortal = false;


    formatHealthStatus(healthpoints, isBlessed)


}
// 함수 헤드
// 가시성 제한자 , 함수 선언 키워드 , 함수 이름 , 함수 매계변수 , 반환타입
private fun formatHealthStatus(healthpoints: Int, isBlessed: Boolean) {

    // 함수 몸체 start
    val healthStatus = when (healthpoints) {
        100 -> "최상의 상태임"

        in 90..99 -> "약간의 철과상만 있음"
        in 75..89 -> if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유되고 있음"
        } else {
            "경미한 상처만 있음"
        }

        in 15..74 -> "많이 다친것 같음"
        else -> "최악의 상태임"

    }
    // 함수 몸체 end
}