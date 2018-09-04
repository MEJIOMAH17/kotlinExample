package example

import azadev.kotlin.css.Stylesheet
import azadev.kotlin.css.color
import kotlinx.html.*
import kotlinx.html.stream.createHTML
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloWorld {
    @RequestMapping("/")
    @ResponseBody
    fun mainPage(): String {
        return createHTML()
                .html {
                    head {
                        styleLink("https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css")
                        styleLink("https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css")
                        style("text/css"){
                          unsafe {
                                raw(
                                        Stylesheet {
                                            table and td and th {
                                                color=0xFC0Fc0
                                            }
                                        }.render()
                                )
                            }
                        }
                        meta {
                            charset="utf-8"
                        }

                    }
                    body {
                        table("table table-striped table-bordered") {
                            thead() {
                                tr {
                                    td {
                                        +"Имя"
                                    }
                                    td {
                                        +"Возраст"
                                    }
                                }
                            }
                            val personList= PersonGenerator().generate()
                            for (person in personList ) {
                                tr {

                                    td {
                                        +person.name
                                    }
                                    td {
                                        text(person.age)
                                    }
                                }

                            }
                        }
                    }
                }
    }



}
