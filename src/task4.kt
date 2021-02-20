fun main(args: Array<String>){
    if (args.isEmpty())
        print("No input data")
    else
        for (arg in args.sortedArray().distinct()) {
            var count = 0
            for (i in args) {
                if (i == arg)
                    count += 1
            }
            println("$arg $count")
        }
}
