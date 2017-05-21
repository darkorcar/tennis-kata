package tennis

class ScoreTracker(p1: String, p2: String) {

    var p1Score: Int = 0
    var p2Score: Int = 0

    fun score(): String {
        return if(p1Score == 1 && p2Score == 0) {
            "fifteen love"
        }
        else {
            "love all"
        }
    }

    fun p1Score(): Unit {
        p1Score += 1
    }
}