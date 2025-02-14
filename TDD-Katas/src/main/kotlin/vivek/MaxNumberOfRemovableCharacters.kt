package org.example.vivek

class MaxNumberOfRemovableCharacters {
    fun maximumRemovals(s: String, p: String, removable: IntArray): Int {
        fun isSubsequence(removedSet: Set<Int>): Boolean {
            var i = 0
            for (j in s.indices) {
                if (j in removedSet) continue
                if (s[j] == p[i]) i++
                if (i == p.length) return true
            }
            return false
        }

        var left = 0
        var right = removable.size
        while (left < right) {
            val mid = left + (right - left) / 2 + 1
            val removedSet = removable.take(mid).toSet()

            if (isSubsequence(removedSet)) {
                left = mid
            } else {
                right = mid - 1
            }
        }

        return left
    }
}