package org.sopt.algo

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        var correctCount = 0
        var zeroCount = 0
        lottos.forEach { lotto ->
            if (lotto == 0) zeroCount++
            win_nums.forEach { win ->
                if (lotto == win) {
                    correctCount++
                }
            }
        }

        val rank = 7 - correctCount
        answer[0] = rank - zeroCount
        if(answer[0] == 7) answer[0] -= 1
        answer[1] = rank
        if(answer[1] == 7) answer[1] -= 1
        return answer
    }
}