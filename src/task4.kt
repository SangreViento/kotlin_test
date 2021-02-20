fun main(args: Array<String>){
    if (args.isEmpty())
        print("No input params")
    else
        for (arg in args.sortedArray().distinct()) {
            var count: Int = 0
            for (i in args) {
                if (i == arg)
                    count += 1
            }
            println("$arg $count")
        }
}
