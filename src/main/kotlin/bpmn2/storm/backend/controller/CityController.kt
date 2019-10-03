package bpmn2.storm.backend.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.couchbase.client.deps.com.lmax.disruptor.Foo
import org.springframework.web.bind.annotation.GetMapping




@RestController
@RequestMapping("/value")
class CityController {

    @GetMapping("/city")
    fun findAll(): List<String> {

        val cites = listOf("Moscow", "Berlin", "LA")
        return cites
    }
}