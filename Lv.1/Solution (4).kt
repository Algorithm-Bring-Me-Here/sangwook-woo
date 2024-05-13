package org.sopt.algo

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val realL: MutableList<Int> = lost.filter { it !in reserve }.sorted().toMutableList()
        val realR: MutableList<Int> = reserve.filter { it !in lost }.sorted().toMutableList()

        var answer = n - realL.size

        for (r in realR) {
            if (r - 1 in realL) {
                answer++
                realL.remove(r - 1)
            } else if (r + 1 in realL) {
                answer++
                realL.remove(r + 1)
            }
        }

        return answer
    }
}