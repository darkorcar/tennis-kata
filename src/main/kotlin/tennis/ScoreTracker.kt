package tennis

class ScoreTracker(val p1: String, val p2: String) {

    var p1Score: Int = 0
    var p2Score: Int = 0

    fun score(): String {
        val result = if (p1Score == 1 && p2Score == 0) {
            "fifteen love"
        } else if (p1Score == 2 && p2Score == 1) {
            "thirty fifteen"
        } else if (p1Score == 3 && p2Score == 1) {
            "forty fifteen"
        } else if (isAll()) {
          "${asString(p1Score)} all"
        } else if (isWin()) {
            "${winningPlayer()} win"
        } else if (isDeuce()) {
            "deuce"
        } else if (isAdvantage()) {
            "advantage ${winningPlayer()}"
        } else {
            "love all"
        }

        return result
    }

    private fun asString(score: Int) = when(score) {
        0 -> "love"
        1 -> "fifteen"
        2 -> "thirty"
        3 -> "forty"
        else -> "bollocks..."
    }

    private fun isAll() = p1Score < 3 && p2Score < 3 && p1Score == p2Score

    private fun isAdvantage() = p1Score >= 3 && p2Score >= 3 && p1Score != p2Score

    private fun isDeuce() = p1Score >= 3 && p2Score >= 3 && p1Score == p2Score

    private fun isWin(): Boolean {
        return (p1Score > 3 || p2Score > 3) &&
                ((p1Score - 2 >= p2Score) || (p2Score - 2 >= p1Score))
    }

    private fun winningPlayer() = if(p1Score > p2Score) "$p1" else "$p2"

    fun p1Score(): Unit {
        p1Score += 1
    }

    fun p2Score(): Unit {
        p2Score += 1
    }
}