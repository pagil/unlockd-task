package unlockd.task

import grails.transaction.Transactional

@Transactional
class UserService {

    User createUser() {
        return new User(fileId: 1, firstName: 'First', lastName: 'Last')
    }
}
