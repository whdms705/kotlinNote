package ch03

// @Content : 조건문
fun main(args: Array<String>) {
    var name = "마드리갈"
    var healthPoints = 100

    if(healthPoints == 100){
        println(name + "최상의 상태임!");
    }else{
        println(name + "최악의 상태임!");
    }

    // when 표현식
    val race = "gnome";

    val faction = when(race){
        "abc" -> "abc result"
        "abc" -> "abc result"
        "abc" -> "abc result"
        "gnome" -> "gnome result"
        else -> {
            "else"
        }
    }


    println(faction);

    // 3.11문자열 템플릿
    println("$name  $race");


    // 3.12 문자열 표현식을 사용해서 출력하기
    val isBlessed = true;
    val isImmortal = false;
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if(auraVisible) "Green" else "none";

    println("(Aura: $auraColor)" + "(Blessed : ${if (isBlessed) "Yes" else "No"})")


}