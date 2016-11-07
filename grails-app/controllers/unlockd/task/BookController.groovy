package unlockd.task

import grails.converters.JSON

class BookController {

    def bookService

    static responseFormats = ['json', 'xml']

    def index() {
        render(bookService.serviceMethod() as JSON)
    }
}
