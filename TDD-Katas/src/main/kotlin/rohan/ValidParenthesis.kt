package org.example.rohan

import java.util.*

class ValidParenthesis {

    fun isValid(s: String): Boolean {
        if (s.length % 2 == 1) return false
        val bracketStack=Stack<String>()
        s.forEach {
            when(it.toString()){
                "{"->bracketStack.push("}")
                "("->bracketStack.push(")")
                "["->bracketStack.push("]")
                else-> {
                    if(bracketStack.isEmpty()||bracketStack.pop()!=it.toString()){
                        return false
                    }
                }
            }
        }
        return bracketStack.isEmpty()
    }

//    fun isValid(inputString: String): Boolean {
//        if (inputString.length % 2 == 1) return false
//        val bracketStack= Stack<String>()
//        for (eachChar in inputString) {
//            when (eachChar) {
//                '(' -> bracketStack.push(')'.toString())
//                '{' -> bracketStack.push('}'.toString())
//                '[' -> bracketStack.push(']'.toString())
//                else -> if (bracketStack.isEmpty() || (bracketStack.pop() != eachChar.toString())) return false
//            }
//        }
//        return bracketStack.isEmpty()
//    }
}

fun main() {
    val result = ValidParenthesis().isValid("{[]}")
    println("Remove Element, ${result.toString()}")
}
