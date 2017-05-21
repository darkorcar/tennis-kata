package tennis

import org.junit.Assert
import org.junit.Test

class ScoreTrackerTest {

    @Test fun shouldScoreLoveAll() {
        val tracker = ScoreTracker("p1", "p2")

        Assert.assertEquals("love all", tracker.score())
    }

}