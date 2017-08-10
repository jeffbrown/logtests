package demo

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController> {

    void "test an action which uses the log property"() {
        when:
        controller.index()

        then:
        response.text == 'Success!'
    }
}
