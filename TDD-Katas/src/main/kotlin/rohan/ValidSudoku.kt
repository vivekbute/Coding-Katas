package org.example.rohan

import kotlin.math.floor

class ValidSudoku {

    fun isValidSudoku(board: Array<CharArray>): Boolean {

        val outputSet = mutableSetOf<String>()

        for (i in 0..8) {
            for (j in 0..8) {
                if (board[i][j] != '.') {
                    val sm = (floor((i / 3).toDouble()) * 3) + (floor((j / 3).toDouble())).toInt()

                    val smString = "sm-$sm-${board[i][j]}"

                    val rString = "r-$i-${board[i][j]}"

                    val cString = "c-$j-${board[i][j]}"

                    if(outputSet.contains(smString) || outputSet.contains(rString) || outputSet.contains(cString)) {
                        return false
                    }

                    outputSet.add(smString)
                    outputSet.add(rString)
                    outputSet.add(cString)
                }
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

