package tennis

class ScoreTracker(val p1: String, val p2: String) {

    var p1Score: Int = 0
    var p2Score: Int = 0

    fun score(): String {
        val result = if (isAll()) {
            "${asString(p1Score)} all"
        } else if (isDeuce()) {
            "deuce"
        } else if (isAdvantage()) {
            "advantage ${winningPlayer()}"
        } else if (isWin()) {
            "${winningPlayer()} win"
        } else {
            "${asString(p1Score)} ${asString(p2Score)}"
        }

        return result
    }

    private fun asString(score: Int) = when (score) {
        0 -> "love"
        1 -> "fifteen"
        2 -> "thirty"
        3 -> "forty"
        else -> "bollocks..."
    }

    private fun isAll() = p1Score < 3 && p2Score < 3 && p1Score == p2Score

    private fun isAdvantage(): Boolean {
        return (p1Score > 2 && p2Score > 2) &&
                ((p1Score - 1 == p2Score) || (p1Score + 1 == p2Score))
    }

    private fun isDeuce() = p1Score >= 3 && p2Score >= 3 && p1Score == p2Score

    private fun isWin(): Boolean {
        return (p1Score > 3 || p2Score > 3) &&
                ((p1Score - 2 >= p2Score) || (p2Score - 2 >= p1Score))
    }

    private fun winningPlayer() = if (p1Score > p2Score) "$p1" else "$p2"

    fun p1Score(): Unit {
        p1Score += 1
    }

    fun p2Score(): Unit {
        p2Score += 1
    }
}