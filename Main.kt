package ru.netology

import java.util.*

// Задача №2. Люди/Человеки
/*
Правила:
Если число заканчивается на 1, но не на 11 --> Используется слово "человеку".
Если число заканчивается на 2, 3, 4, но не на 12, 13, 14 --> Используется слово "людям".
Во всех остальных случаях (включая числа, оканчивающиеся на 11, 12, 13, 14, а также на 0, 5, 6, 7, 8, 9) -->
    --> Используется слово "людям".
 */

fun main() {

    // Инициализируем переменные
    // --------------------
    var likes = 0   // число лайков.
    var word = ""
    var input = ""
    // --------------------

    // Основной блок программы
    // --------------------
    print("Введите кол-во лайков: ")
    input = readln()   // Считываем строку

    if (input.isNotEmpty()) {  // Проверяем, что строка не пустая
        likes = input.toInt()  // Преобразовываем строку в число
        if ((likes % 10 == 1) && (likes % 100 != 11)) {
            word = "человеку"
        } else {
            word = "людям"
        }
    } else {
        print("Проверьте ввод данных !")
    }

    // likes % 10 - последняя цифра числа
    // likes % 100 - последние 2 цифра числа

    print("Понравилось $likes $word")
    // --------------------
}