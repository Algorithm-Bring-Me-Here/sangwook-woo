package org.sopt.algo

class Solution {
    fun solution(record: Array<String>): Array<String> {
        val recordMap: MutableMap<String, String> = mutableMapOf()

        record.forEach {
            val sep = it.split(" ")
            if (sep[0] == "Enter" || sep[0] == "Change") {
                recordMap[sep[1]] = sep[2]
            }
        }

        val answer = mutableListOf<String>()
        record.forEach {
            val sep = it.split(" ")
            when(sep[0]) {
                "Enter" -> answer.add("${recordMap[sep[1]]}님이 들어왔습니다.")
                "Leave" -> answer.add("${recordMap[sep[1]]}님이 나갔습니다.")
            }
        }

        return answer.toTypedArray()
    }
}