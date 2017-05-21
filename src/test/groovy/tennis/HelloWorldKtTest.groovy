package tennis

import spock.lang.Specification

import static tennis.HelloWorldKt.hello

class HelloWorldKtTest extends Specification {

    def "should hello world"() {
        expect:
        hello()
    }

}
