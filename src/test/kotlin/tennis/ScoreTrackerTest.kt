package tennis

import org.junit.Assert
import org.junit.Test

class ScoreTrackerTest {

    @Test fun shouldScoreLoveAll() {
        val tracker = ScoreTracker("p1", "p2")
        Assert.assertEquals("love all", tracker.score())
    }

    @Test fun shouldScoreFifteenLove() {
        val tracker = ScoreTracker("p1", "p2")

        tracker.p1Score()

        Assert.assertEquals("fifteen love", tracker.score())
    }

    @Test fun shouldScoreFifteenAll() {
        val tracker = ScoreTracker("p1", "p2")

        tracker.p1Score()
        tracker.p2Score()

        Assert.assertEquals("fifteen all", tracker.score())
    }

    @Test fun shouldScoreThirtyFifteen() {
        val tracker = ScoreTracker("p1", "p2")

        tracker.p1Score()
        tracker.p2Score()
        tracker.p1Score()

        Assert.assertEquals("thirty fifteen", tracker.score())
    }

    @Test fun shouldScoreFortyFifteen() {
        val tracker = ScoreTracker("p1", "p2")

        tracker.p1Score()
        tracker.p2Score()
        tracker.p1Score()
        tracker.p1Score()

        Assert.assertEquals("forty fifteen", tracker.score())
    }

    @Test fun shouldScoreP1Win() {
        val tracker = ScoreTracker("p1", "p2")

        tracker.p1Score()
        tracker.p2Score()
        tracker.p1Score()
        tracker.p1Score()
        tracker.p1Score()

        Assert.assertEquals("p1 win", tracker.score())
    }

    @Test fun shouldScoreDuce() {
        val tracker = ScoreTracker("p1", "p2")

        tracker.p1Score()
        tracker.p1Score()
        tracker.p1Score()
        tracker.p2Score()
        tracker.p2Score()
        tracker.p2Score()

        Assert.assertEquals("deuce", tracker.score())
    }
}