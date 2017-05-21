package tennis

class ScoreTracker(p1: String, p2: String) {

    var p1Score: Int = 0
    var p2Score: Int = 0

    fun score(): String {
        val result = if(p1Score == 1 && p2Score == 0) {
            "fifteen love"
        } else if(p1Score == 1 && p2Score == 1) {
            "fifteen all"
        } else {
            "love all"
        }

        return result
    }

    fun p1Score(): Unit {
        p1Score += 1
    }

    fun p2Score(): Unit {
        p2Score += 1
    }
}