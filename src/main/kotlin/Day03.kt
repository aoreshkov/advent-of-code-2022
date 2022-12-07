fun day03() {

    fun Char?.getItemValue(): Int {
        if (this == null) return 0
        return if (this < 'a') (code - 'A'.code) + 27
        else code - 'a'.code + 1
    }

    fun String.getValue(): Int {
        val group = this.chunked(this.length / 2)

        return ( group[0].toSet() intersect group[1].toSet()).elementAtOrNull(0).getItemValue()
    }

    fun part1(input: List<String>): Int {

        return input.sumOf {
            it.getValue()
        }
    }

    fun part2(input: List<String>): Int {

        val result = input.chunked(3).sumOf {
            (it[0].toSet() intersect it[1].toSet() intersect it[2].toSet()).elementAtOrNull(0).getItemValue()
        }

        return result
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    check(part1(testInput) == 157)
    check(part2(testInput) == 70)

    val input = readInput("Day03")
    val result1 = part1(input)
    println(result1)
    check(result1 == 8349)
    val result2 = part2(input)
    println(result2)
    check(result2 == 2681)
}


