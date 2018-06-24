package per.mapt.kt.testkt

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController {
    @GetMapping("/")
    fun welcome(): String {
        /** What's the nean of MR, may by Map-Reduce (●'◡'●)*/
        return "Happy Birthday To MR!"

    }
}