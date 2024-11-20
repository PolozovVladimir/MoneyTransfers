package ru.netology

import kotlin.math.max

fun main(){
    val amount = 10000
    var comission = max(35, (amount * 0.0075).toInt())
    println(comission)
    }

