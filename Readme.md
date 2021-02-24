# Тестовый проект на Kotlin

### Проект содержит 6 задач:
* В папке src содержатся исходники задач в формате .kt
* В папке compiled содержатся скомпилированные jar файлы готовые для запуска
* запуск производится из консоли (cmd, powershell)


### Задания скомпилированны и протестированны на машине с версией окружения:
* java version "11.0.9" 2020-10-20 LTS
* Java(TM) SE Runtime Environment 18.9 (build 11.0.9+7-LTS)

**пример вызова из консоли: `java -jar task1.jar the quick brown fox jumps over the lazy dog`**

Во всех задачах при отсутствии переданных параметров или строки консоли выводится сообщение "No input data"

## `task1.kt`

### Задача:
* _Напишите приложение, которое на вход через 
параметры командной строки получит текст 
и выдаст список слов, разделенных пробельными символами._
  
* Программа принимает параметры: "the quick brown fox jumps over the lazy dog"
### Вывод в консоль:
- the
- quick
- brown
- fox
- jumps
- over
- the
- lazy
- dog

## `task2.kt`
### Задача:
* _Слова из предыдущего задания должны быть отсортированы._
* Программа принимает параметры: "the quick brown fox jumps over the lazy dog"
### Вывод в консоль:
- brown
- dog
- fox
- jumps
- lazy
- over
- quick
- the
- the

## `task3.kt`
### Задача:
* _Слова из предыдущего задания должны быть уникальные_
* Программа принимает параметры: "the quick brown fox jumps over the lazy dog"
### Вывод в консоль:
- brown
- dog
- fox
- jumps
- lazy
- over
- quick
- the

## `task4.kt`
### Задача:
* _После каждого слова выведите количество повторений_
* Программа принимает параметры: "the quick brown fox jumps over the lazy dog"
### Вывод в консоль:
- brown 1
- dog 1
- fox 1
- jumps 1
- lazy 1
- over 1
- quick 1
- the 2

## `task5.kt`
### Задача:
* _Список должен быть отсортирован сначала
по количеству повторений в убывающем порядке, 
в случае одинакового количества – по алфавиту._
* Программа принимает параметры: "the quick brown fox jumps over the lazy dog"
### Вывод в консоль:
- the 2
- brown 1
- dog 1
- fox 1
- jumps 1
- lazy 1
- over 1
- quick 1


## `task6.kt`
### Задача:
* _Если вашему приложению не передано ни одного параметра, 
то считайте список слов для сортировки из стандартного потока ввода (stdin)_
### Пример запуска: 
`echo "the quick brown fox jumps over the lazy dog" | java -jar task6.jar`

#### Случай 1:
Программа принимает параметры: "the quick brown fox jumps over the lazy dog"
### Вывод в консоль:
- the 2
- brown 1
- dog 1
- fox 1
- jumps 1
- lazy 1
- over 1
- quick 1

#### Случай 2:
* Программа принимает на вход: ничего
* Чтение stdin: "the quick brown fox jumps over the lazy dog"
### Вывод в консоль:
- the 2
- brown 1
- dog 1
- fox 1
- jumps 1
- lazy 1
- over 1
- quick 1
