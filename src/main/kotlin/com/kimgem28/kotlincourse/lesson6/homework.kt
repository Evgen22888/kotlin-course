package com.kimgem28.kotlincourse.lesson6
fun main() {

}
// Задача №1
fun season(month: Int): String {
    return when {
        month < 1 || month > 12 -> "Все не так"
        month in 3..5 -> "Весна"
        month in 6..8 -> "Лето"
        month in 9..11 -> "Осень"
        else -> "Зима"
    }
}
// Задача №3
fun transport(km: Int): String {
    if (km in 0..1) {
        println("Пешком")
    } else if (km in 2..5) {
        println("Велосипед")
    } else if (km < 0) {
        println("Не ходите")
    } else println("Транспорт")

}

// Задача №5
fun docType(extension: String): String {
    return when(extension) {
        in "txt","doc","docx" -> "Текстовый документ"
        in "jpg","png","bmp","gif" -> "Изображение"
        in "xls","xlsx" -> "Таблица"
        else -> "Нет такого"
    }
}

// Задача #7
fun clothe(temp: Int): String {
    return when(temp) {
        in -30..-1 -> "куртка и шапка"
        in 0..14 -> "ветровка"
        in 15..34 -> "футболка и шорты"
        else -> "Не выходим"
    }
}

