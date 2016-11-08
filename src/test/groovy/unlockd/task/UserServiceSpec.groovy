package unlockd.task

import grails.test.mixin.TestFor
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(UserService)
class UserServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }

    void "test id is odd"() {
        when:
            User user = service.createUser()
        then:
            user.fileId % 2 == 1

    }

    void "full name consists of firstName and lastName"() {
        expect:"fix me"
        true == false
    }

    void "first name should be capitalized"() {
        expect:"fix me"
        true == false
    }

    void "last name should be capitalized"() {
        expect:"fix me"
        true == false
    }

    void "test should fail if the first name is not capitalized"() {
        expect:"fix me"
        true == false
    }

    void "test should fail if the last name is not capitalized"() {
        expect:"fix me"
        true == false
    }
}
