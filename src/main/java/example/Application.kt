package example

import azadev.kotlin.css.Stylesheet
import azadev.kotlin.css.color
import kotlinx.html.meta
import kotlinx.html.style
import kotlinx.html.styleLink
import kotlinx.html.unsafe
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
