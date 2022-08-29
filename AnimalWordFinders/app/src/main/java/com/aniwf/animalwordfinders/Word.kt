package com.aniwf.animalwordfinders

class Word(word: String) {

    var isFound = false
    val wordVal = word
    var _start = 0
    var _end = 0

    fun setLoc(tag: Int, isHorizontal: Boolean){
        _start = tag
        _end = if(isHorizontal) tag + wordVal.length - 1 else tag + (wordVal.length -1)*10
    }

    fun checkLoc(start: Int, end: Int, isHorizontal: Boolean): Boolean{
        if(isHorizontal) {
            if(end - start != wordVal.length - 1){
                return false
            }
        } else {
            if((end - start)/10 != wordVal.length - 1){
                return false
            }
        }
        if(_start == start && _end == end){
            return true
        }
        return false
    }
}