fun main(args: Array<String>) {
    if(args.isNotEmpty()) {
        println("Day ${args[0]}:")
        when(args[0]) {
            "1" -> day01()
        }
    }
}