package org.sopt.algo


class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0

        answer = findRound(a,b)

        return answer
    }
    fun findRound(a: Int, b: Int, round: Int = 1): Int =
        if (a == b) round
        else findRound((a + 1) / 2, (b + 1) / 2, round + 1)
}