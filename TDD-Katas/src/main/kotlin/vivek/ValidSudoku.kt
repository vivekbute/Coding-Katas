package org.example.vivek

import kotlin.math.floor

class ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { mutableSetOf<Char>() }
        val cols = Array(9) { mutableSetOf<Char>() }
        val boxes = Array(9) { mutableSetOf<Char>() }

        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val char = board[i][j]
                if (char == '.') continue

                if (rows[i].contains(char)) return false
                rows[i].add(char)


                if (cols[j].contains(char)) return false
                cols[j].add(char)

                val boxIndex = ((floor((i / 3).toDouble()) * 3) + (floor((j / 3).toDouble()))).toInt()
                if (boxes[boxIndex].contains(char)) return false
                boxes[boxIndex].add(char)
            }
        }
        return true
    }
}

fun main() {

    val input = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )


    val input1 =
        arrayOf(
            charArrayOf('8','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf ('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )
    val result = ValidSudoku().isValidSudoku(input)
    println("****RESULT****, $result")

    val result1 = ValidSudoku().isValidSudoku(input1)
    println("****RESULT****, $result1")
}