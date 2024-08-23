package org.example.vivek

class ValidParentheses {

    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        for (char in s) {
            when (char) {
                '(', '{', '[' -> stack.add(char)
                ')', '}', ']' -> {
                    val last = stack.removeLastOrNull() ?: return false
                    if ((char == ')' && last != '(') ||
                        (char == '}' && last != '{') ||
                        (char == ']' && last != '[')
                    ) {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}