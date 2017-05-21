package tennis

class ScoreTracker(val p1: String, val p2: String) {

    var p1Score: Int = 0
    var p2Score: Int = 0

    fun score(): String {
        val result = if(p1Score == 1 && p2Score == 0) {
            "fifteen love"
        } else if(p1Score == 1 && p2Score == 1) {
            "fifteen all"
        } else if(p1Score == 2 && p2Score == 1) {
            "thirty fifteen"
        } else if(p1Score == 3 && p2Score == 1) {
        "forty fifteen"
        } else if(p1Score == 4 && p2Score == 1) {
            "$p1 win"
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