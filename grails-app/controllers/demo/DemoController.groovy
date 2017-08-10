package demo

class DemoController {

    def index() {
        log.debug 'index is running'

        render 'Success!'
    }
}
