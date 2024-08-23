package org.example.trishal

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (i in s.indices) {
            if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
                stack.push(s[i])
            } else if (stack.empty()) return false
            else if (s[i] == ')') {
                val char = stack.pop()
                if (char != '(') return false
            } else if (s[i] == '}') {
                val char = stack.pop()
                if (char != '{') return false
            } else if (s[i] == ']') {
                val char = stack.pop()
                if (char != '[') return false
            }
        }

        return stack.empty()
    }
}