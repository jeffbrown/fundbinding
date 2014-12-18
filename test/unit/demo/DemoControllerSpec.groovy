package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
class DemoControllerSpec extends Specification {

    void "test something"() {
        when:
        request.json = '{"causes":[{"name":"prabh","description":"ggg","icon":"deec"}]}'
        controller.saveCreateFunding()

        then:
        response.text == 'No errors were found'
    }
}
