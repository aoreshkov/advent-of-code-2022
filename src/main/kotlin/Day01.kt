fun day01() {

    fun getCaloriesList(input: List<String>): List<List<String>> {
        val calories = mutableListOf<List<String>>()
        var others = input.toMutableList()

        while(others.isNotEmpty()) {
            val scan = others.takeWhile { it.trim().isNotEmpty() }
            others = others.drop(scan.size + 1).toMutableList()
            calories.add(scan)
        }
        return calories.toList()
    }

    fun part1(input: List<String>): Int {
        return getCaloriesList(input).map { it -> it.sumOf { it.toInt() } }.maxOf { it }
    }

    fun part2(input: List<String>): Int {
        return getCaloriesList(input).map { it -> it.sumOf { it.toInt() } }.sortedDescending().take(3).sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInput("Day01")
    val result1 = part1(input)
    println(result1)
    check(result1 == 71471)
    val result2 = part2(input)
    println(result2)
    check(result2 == 211189)
}
