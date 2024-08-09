package org.example.shubham

class LongestPrefixInStringsArray {
    fun longestCommonPrefix(strings: Array<String>): String {
        var firstStr = strings[0]
        var droppedStringsArray = strings.drop(1)

        // ["flower","flow","flight"]
        for (i in 1 until strings.size) {
            while (strings[i].indexOf(firstStr)!=0){
                firstStr = firstStr.dropLast(1)
            }
        }
        return firstStr // fl

//        while (firstStr.isNotEmpty()) {
//            for ((index, str) in droppedStringsArray.withIndex()) {
//                if (str.length < firstStr.length || str.indexOf(firstStr) != 0) {
//                    firstStr = firstStr.dropLast(1)
//                    break
//                }else{
//                    if(droppedStringsArray.size-1 == index){
//                        return firstStr
//                    }
//                    continue
//                }
//            }
//        }
//        return firstStr
    }
}