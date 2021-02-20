fun main(args: Array<String>){
    if (args.isEmpty()) {
        val phrase = readLine()!!.toString()
        val dplPhrase = phrase.split(' ').toTypedArray()
        sortedCounter(dplPhrase)
    }
    else{
        sortedCounter(args)
    }
}

fun sortedCounter(inpArgs: Array<String>){
    if (inpArgs.size > 1) {
        val numbers = mutableListOf<Int>()
        val res = mutableMapOf<String, Int>()
        for (arg in inpArgs.sortedArray().distinct()) {
            var count = 0
            for (i in inpArgs) {
                if (i == arg)
                    count += 1
            }
            numbers.add(count)
            res[arg] = count
        }
        for (j in numbers.sortedDescending().distinct()) {
            for ((k, v) in res) {
                if (v == j) {
                    println("$k $v")
                }
            }
        }
    }
    else{
        print("No input data")
    }
}