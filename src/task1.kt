fun main(args: Array<String>){
    println("hello")
    if (args.isEmpty())
        print("No input params")
    else
        for (arg in args)
            println(arg)
}
