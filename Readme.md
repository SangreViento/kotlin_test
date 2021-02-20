Тестовый проект на Kotlin
Проект содержит 6 задач:
Все задачи можно запустить из среды IntelliJ IDEA


task1.kt
Поставлена задача:
"""Напишите приложение, которое на вход через 
параметры командной строки получит текст 
и выдаст список слов, разделенных пробельными символами."""

Программа принимает на вход: "the quick brown fox jumps over the lazy dog"

Вывод в консоль:
the
quick
brown
fox
jumps
over
the
lazy
dog


task2.kt
"""Слова из предыдущего задания должны быть отсортированы."""

Программа принимает на вход: "the quick brown fox jumps over the lazy dog"

Вывод в консоль:
brown
dog
fox
jumps
lazy
over
quick
the
the


task3.kt
"""Слова из предыдущего задания должны быть уникальные"""

Программа принимает на вход: "the quick brown fox jumps over the lazy dog"

Вывод в консоль:
brown
dog
fox
jumps
lazy
over
quick
the


task4.kt
"""После каждого слова выведите количество повторений"""

Программа принимает на вход: "the quick brown fox jumps over the lazy dog"

Вывод в консоль:
brown 1
dog 1
fox 1
jumps 1
lazy 1
over 1
quick 1
the 2


task5.kt
"""Список должен быть отсортирован сначала
по количеству повторений в убывающем порядке, 
в случае одинакового количества – по алфавиту."""

Программа принимает на вход: "the quick brown fox jumps over the lazy dog"

Вывод в консоль:
the 2
brown 1
dog 1
fox 1
jumps 1
lazy 1
over 1
quick 1


task6.kt
"""Если вашему приложению не передано ни одного параметра, 
то считайте список слов для сортировки из стандартного потока ввода (stdin),
чтобы ваше приложение дополнительно могло запускаться вот так:"""

Случай1:
Программа принимает на вход: "the quick brown fox jumps over the lazy dog"

Вывод в консоль:
the 2
brown 1
dog 1
fox 1
jumps 1
lazy 1
over 1
quick 1

Случай2:
Программа принимает на вход: no params

Вывод в консоль/запрос ввода: No input params...Using stdin. Enter phrase: 
Вводимые данные: "the quick brown fox jumps over the lazy dog"
Вывод в консоль:
the 2
brown 1
dog 1
fox 1
jumps 1
lazy 1
over 1
quick 1

Случай3:
Программа принимает на вход: no params
Вывод в консоль/запрос ввода: No input params...Using stdin. Enter phrase:
Вводимые данные:
Вывод в консоль:
No any text entered


P.S. созданные jar файлы пока не запускаются через JVM ... В процессе поиска решения