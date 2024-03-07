package com.example.calculator

class Calculator {
}

fun main() {

    // Lv4 abstrct

    println("첫번째 값을 입력해주세요.")
    var inputNum1 = readLine()!!.toInt()

    println("두번째 값을 입력해주세요.")
    var inputNum2 = readLine()!!.toInt()

    println("연산자 옵션을 선택해주세요." +
            "\n1 = 더하기, 2 = 빼기, 3 = 곱하기, 4 = 나누기")

    var add = AddOperation().operation(inputNum1,inputNum2)
    var sub = SubstractOperation().operation(inputNum1,inputNum2)
    var mul = MultiplyOperation().operation(inputNum1,inputNum2)
    var div = DivideOperation().operation(inputNum1,inputNum2)

    while (true){
        var selectOperation = readLine()!!.toInt()

        if (selectOperation == 1){
            println(add)
            break

        } else if (selectOperation == 2){
            println(sub)
            break

        } else if (selectOperation == 3){
            println(mul)
            break

        } else if (selectOperation == 4){
            println(div)
            break

        } else {
            println("1부터 4까지의 숫자만 입력해주세요." +
                    "\n1 = 더하기, 2 = 빼기, 3 = 곱하기, 4 = 나누기")
            continue
        }
    }
}

// 추상 class
abstract class AbstractOperation{
    abstract fun operation(a:Int, b:Int):Int
}

// 덧셈 class
class AddOperation: AbstractOperation() {
    override fun operation(a: Int, b:Int):Int{
        return a + b
    }
}
// 뺄셈 class
class SubstractOperation: AbstractOperation(){
    override fun operation(a: Int, b: Int): Int {
        return a - b
    }

}
// 곱셈 class
class MultiplyOperation: AbstractOperation(){
    override fun operation(a: Int, b: Int): Int {
        return a * b
    }

}
// 나눗셈 class
class DivideOperation: AbstractOperation(){
    override fun operation(a: Int, b: Int): Int {
        return a / b
    }
}
