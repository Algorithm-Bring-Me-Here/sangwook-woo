package org.sopt.algo

class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()

        val map = mutableMapOf<String, Int>()

        for (i in name.indices) {
            map[name[i]] = yearning[i]
        }

        answer = photo.map { array ->
            array.sumOf { name ->
                map[name] ?: 0
            }
        }.toIntArray()

        return answer
    }
}