package org.sopt.algo

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        var max = priorities.maxOrNull()
        val queue : Queue<Pair<Int,Int>> = LinkedList()
        priorities.withIndex().onEach {
            queue.add(Pair(it.index, it.value))
        }
        val deleteList = mutableListOf<Pair<Int,Int>>()
        while(queue.peek() != null){
            val polledElement = queue.remove()
            var delete = true
            queue.onEach {
                if(it.second > polledElement.second){
                    delete = false
                    return@onEach
                }
            }
            if(delete) deleteList.add(polledElement) else queue.add(polledElement)
        }

        deleteList.forEachIndexed { index, pair ->
            if (pair.first == location) {
                answer = index + 1
            }
        }
        return answer
    }
}