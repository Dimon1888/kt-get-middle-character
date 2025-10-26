package mate.academy
private const val TAX_RATE = 2
private const val NUMBER_ZERO = 0
private const val NUMBER_MAGIG = 1
// реалізувати функцію `getMiddleString()`, яка приймає рядок
// та повертає середній символ (або символи) як рядок

fun getMiddleString(originalString: String): String =
    if (originalString.isEmpty()) {
         ""
    } else {
        val length = originalString.length
        val middleIndex = length / TAX_RATE
        if (length % TAX_RATE == NUMBER_ZERO) {
            originalString.substring(middleIndex - NUMBER_MAGIG, middleIndex + NUMBER_MAGIG)
        } else {
            originalString.substring(middleIndex, middleIndex + NUMBER_MAGIG)
        }
    }

fun main() {
    println("hello -> \"${getMiddleString("hello")}\"")
    println("1234 -> \"${getMiddleString("1234")}\"")
    println("(()) -> \"${getMiddleString("(())")}\"")
    println(" -> \"${getMiddleString("")}\"")
}
