package org.sopt.algo

class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        return dfs(numbers, target, 0, 0)
    }

    private fun dfs(numbers: IntArray, target: Int, index: Int, sum: Int): Int {
        if (index == numbers.size) {
            return if (sum == target) 1 else 0
        }

        val plus = dfs(numbers, target, index + 1, sum + numbers[index])
        val minus = dfs(numbers, target, index + 1, sum - numbers[index])

        return plus + minus
    }
}