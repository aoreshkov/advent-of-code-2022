fun main(args: Array<String>) {
    if(args.isNotEmpty()) {
        println("Day ${args[0]}:")
        when(args[0]) {
            "1" -> day01()
            "2" -> day02()
            "3" -> day03()
        }
    }
}