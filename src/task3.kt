fun main(args: Array<String>){
    if (args.isEmpty())
        print("No input params")
    else
        for (arg in args.sortedArray().distinct())
            println(arg)
}
