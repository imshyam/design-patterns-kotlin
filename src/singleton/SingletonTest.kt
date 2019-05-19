package singleton

import singleton.implementation.SingletonClass

fun main() {
    val singleTonClass = SingletonClass.instance
    val singleTonClass2 = SingletonClass.instance

    println(singleTonClass)
    println(singleTonClass2)
}