package ch06

fun main(args: Array<String>) {
    // signatureDrink 변수는 null 지정 불가능 타입이므로 컴파일러 null 값의 저장을 막는다.
    /*var signatureDrink = "맥주"
    signatureDrink = null*/

    // String? 타입은 문자열값이나 null을 저장할 수 있다.
    /*var beverage = readLine()
    beverage = null
    println(beverage)*/

    // capitalize() 문자열의 첫 자만 대문자로 바꿔 준다.
    // realLine의 반환 타입이 String? 이므로 null 값을 반환할 수 있기 때문에 capitalize() 호출 못하게 막음
    /*var beverage = readLine().capitalize()

    println(beverage)*/

    // 안전 호출연산자 ?.
    // 힘수 호출에 사용되는 변수나 다른 함수(여기서는 readLine)의 반환값이 null이 아닐 때만 해당 함수가 안전하개
    // 호출되므로 nullPointException을 방지 할 수 있다.
    //var beverage  = readLine()?.capitalize();

    // 안전 호출 연산자와 함께 let 함수 사용하기
    var beverage = readLine()?.let {
        if(it.isNotBlank()){
            it.capitalize()
        }else{
            "맥주"
        }
    }





}