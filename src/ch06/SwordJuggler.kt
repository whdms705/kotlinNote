package ch06

// 예외

fun main(args: Array<String>) {
    var swordsJuggling : Int? = null
    val isJugglingProfficinet = (1..3).shuffled().last() == 3
    if(isJugglingProfficinet){
        swordsJuggling = 2
    }

    /*proficiencyCheck(swordsJuggling)
    swordsJuggling = swordsJuggling!!.plus(1);*/

    try{
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1);
    }catch (e:Exception){
        println(e)
    }

    println("$swordsJuggling 개의 칼로 저글링합니다. ")
}

fun proficiencyCheck(swordsJuggling: Int?){
    //swordsJuggling ?: throw IllegalStateException("플레이어가 저글링을 할 수 없음")

    // 커스텀 예외처리
    //swordsJuggling ?: throw UnskilledSwordJugglerException()

    // 전제 조건 함수 chdeckNotNull사용
    checkNotNull(swordsJuggling,{"플레이어가 저글링을 할 수 없음2"})
}

class UnskilledSwordJugglerException() :
        IllegalStateException("플레이어가 저글링을 할 수 없음")
