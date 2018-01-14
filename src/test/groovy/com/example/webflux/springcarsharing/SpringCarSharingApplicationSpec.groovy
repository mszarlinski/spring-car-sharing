package com.example.webflux.springcarsharing

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.reactive.context.ReactiveWebApplicationContext
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@SpringBootTest
@ContextConfiguration
class SpringCarSharingApplicationSpec extends Specification {

    @Autowired
    ReactiveWebApplicationContext ctx

    def contextLoads() {
        expect:
            ctx != null
    }

}
