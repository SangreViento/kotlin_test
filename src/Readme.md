This test project writen by Kotlin
It contains 6 tasks:

task1.kt
"""Напишите приложение, которое на вход через 
параметры командной строки получит текст 
и выдаст список слов, разделенных пробельными символами."""

Input params string: "the quick brown fox jumps over the lazy dog"

Output:
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

Input params string: "the quick brown fox jumps over the lazy dog"

Output:
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

Input params string: "the quick brown fox jumps over the lazy dog"

Output:
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

Input params string: "the quick brown fox jumps over the lazy dog"

Output:
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

Input params string: "the quick brown fox jumps over the lazy dog"

Output:
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

Case1:
If Input params string: "the quick brown fox jumps over the lazy dog"

Output:
the 2
brown 1
dog 1
fox 1
jumps 1
lazy 1
over 1
quick 1

Case2:
if Input params string: no params

Output: No input params...Using stdin. Enter phrase: 
Input: "the quick brown fox jumps over the lazy dog"
Output:
the 2
brown 1
dog 1
fox 1
jumps 1
lazy 1
over 1
quick 1

