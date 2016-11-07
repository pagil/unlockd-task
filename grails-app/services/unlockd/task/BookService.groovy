package unlockd.task

import grails.transaction.Transactional

@Transactional
class BookService {

    def serviceMethod() {
        Book book = new Book(title: "Effective Java", author: "Joshua Bloch")
        book.save(failOnError: true)
        return book
    }
}
