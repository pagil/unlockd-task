package unlockd.task

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test should fail if id is not odd"() {
        given:
        User user = new User()
        when:
        user.fileId = 2
        then:
        thrown IllegalArgumentException.class
    }

}
