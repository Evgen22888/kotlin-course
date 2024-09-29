package com.kimgem28.kotlincourse.lesson8

fun main () {

}

fun str(word: String): String{
    return when{
        word.contains("невозможно", true) -> word.replace("невозможно", "совершенно точно возможно, просто требует времени")
        word.startsWith("Я не уверен", true) -> "${word.trim('.')}, но моя интуиция говорит об обратном."
        word.contains("катастрофа", true) -> word.replace("катастрофа", "интересное событие")
        word.endsWith("без проблем.",true) -> word.replace("без проблем", "с парой интересных вызовов по пути")
        !word.contains(" ") -> "Иногда, ${word.lowercase()}, но не всегда"
        else -> ""
    }
}

//Пользователь вошел в систему -> 2021-12-01 09:48:23

fun time(login: String) {
    val timeData = login.split(" ")
    return println("${timeData[5]}\n${timeData[6]}")
}

//Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".
fun creditCard(number: String) {
    val numb2 = number.split(" ")
    return println("**** **** **** ${numb2[3]}")
}

// У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".
fun emailAdress(email: String) {
    val newEmail = email.replace("@", " [at] ").replace(".", " [dot] ")
    return println(newEmail)
}

//Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.
fun filePath(path: String){
    val namePath = path.split("/")
    return println(namePath.last())
}

//У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").
fun string(phrase: String): String {
    val shorPhrase = phrase.split(' ', '-')
    var string = ""
    for (j in shorPhrase.indices) { //for (i in 0 until abbrList.length)
        string += (shorPhrase[j][0].uppercase())
    }
    return string
}