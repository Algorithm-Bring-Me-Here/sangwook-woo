package org.sopt.algo

class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val wordList = listOf("aya", "ye", "woo", "ma")

        babbling.onEach { babblingWord ->
            val temp = babblingWord
            var lastWord = ""
            var startIndex = 0
            val length = temp.length
            var totalLength = 0

            while(startIndex < temp.length){
                var find = false
                wordList.forEach { word ->
                    if(find){
                        return@forEach
                    }
                    val findWord = if(startIndex+word.length > length) null else temp.substring(startIndex, startIndex+word.length)

                    if(findWord != null && findWord == word && findWord != lastWord){
                        totalLength += findWord.length
                        startIndex += findWord.length
                        find = true
                        lastWord = findWord
                    }
                }
                if(!find){
                    lastWord = ""
                    startIndex++
                }
            }

            if(length == totalLength){
                answer++
            }
        }

        return answer
    }
}