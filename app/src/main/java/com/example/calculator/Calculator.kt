package com.example.calculator

fun main() {

    // Lv4 abstrct fix

    println("첫번째 값을 입력해주세요.")
    val inputNum1 = readLine()!!.toInt()

    println("두번째 값을 입력해주세요.")
    val inputNum2 = readLine()!!.toInt()

    println(
        "연산자 옵션을 선택해주세요." +
                "\n1 = 더하기, 2 = 빼기, 3 = 곱하기, 4 = 나누기"
    )

    val add = AddOperation().operation(inputNum1, inputNum2)
    val sub = SubstractOperation().operation(inputNum1, inputNum2)
    val mul = MultiplyOperation().operation(inputNum1, inputNum2)
    val div = DivideOperation().operation(inputNum1, inputNum2)

    while (true) {
        val selectOperation = readLine()!!.toInt()

        when (selectOperation) {
            1 -> {
                println(add)
                break
            }

            2 -> {
                println(sub)
                break
            }

            3 -> {
                println(mul)
                break
            }

            4 -> {
                println(div)
                break
            }

            else -> {
                println(
                    "1부터 4까지의 숫자만 입력해주세요." +
                            "\n1 = 더하기, 2 = 빼기, 3 = 곱하기, 4 = 나누기"
                )
            }
        }
    }
}