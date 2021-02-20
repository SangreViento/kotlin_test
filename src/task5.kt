fun main(args: Array<String>){
    if (args.isEmpty()) {
        print("No input data")
    }
    else{
        val numbers = mutableListOf<Int>()
        val res = mutableMapOf<String, Int>()
        for (arg in args.sortedArray().distinct()) {
            var count = 0
            for (i in args) {
                if (i == arg)
                    count += 1
            }
            numbers.add(count)
            res[arg] = count
        }
        for (j in numbers.sortedDescending().distinct()){
            for ((k,v) in res){
                if (v == j){
                    println("$k $v")
                }
            }
            }
    }
}
