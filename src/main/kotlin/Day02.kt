fun day02() {
    fun <E> List<E>.getScore(): Int {
        val n = this[1].toString()[0].code - 'X'.code + 1
        val m = when (this[0]){
            "A" ->  when (this[1]) {
                "X" -> 3
                "Y" -> 6
                "Z" -> 0
                else -> 1000
            }
            "B" ->  when (this[1]) {
                "X" -> 0
                "Y" -> 3
                "Z" -> 6
                else -> 1000
            }
            "C" ->  when (this[1]) {
                "X" -> 6
                "Y" -> 0
                "Z" -> 3
                else -> 1000
            }
            else -> 1000
        }
        return n + m
    }

    fun <E> List<E>.getNewScore(): Int {
        val n = (this[1].toString()[0].code - 'X'.code) * 3
        val m = when (this[0]){
            "A" ->  when (this[1]) {
                "X" -> 3
                "Y" -> 1
                "Z" -> 2
                else -> 1000
            }
            "B" ->  when (this[1]) {
                "X" -> 1
                "Y" -> 2
                "Z" -> 3
                else -> 1000
            }
            "C" ->  when (this[1]) {
                "X" -> 2
                "Y" -> 3
                "Z" -> 1
                else -> 1000
            }
            else -> 1000
        }
        return n + m
    }

    fun part1(input: List<String>): Int {

        return input.sumOf { it.split(" ").getScore() }
    }

    fun part2(input: List<String>): Int {

        return input.sumOf { it.split(" ").getNewScore() }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)
    check(part2(testInput) == 12)

    val input = readInput("Day02")
    val result1 = part1(input)
    println(result1)
    check(result1 == 11841)
    val result2 = part2(input)
    println(result2)
    check(result2 == 13022)
}