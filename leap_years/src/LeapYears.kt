package leap_years

const val FIRST_GREGORIAN_YEAR = 1583

class Year(val year: Int) {

    fun isLeap(): Boolean {
        if (year < FIRST_GREGORIAN_YEAR) throw NotGregorianYear()
        return when {
            (year % 400 == 0) -> true
            (year % 100 == 0) -> false
            (year % 4 == 0) -> true
            else -> false
        }
    }
}


class NotGregorianYear : Throwable() {

}
