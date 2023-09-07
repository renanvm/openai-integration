package br.com.renan.openai.controller

import br.com.renan.openai.model.ChatAnswer
import br.com.renan.openai.service.OpenAiService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/chat")
class OpenAiController(private val openAiService: OpenAiService) {

    @PostMapping
    fun getAnswer(@RequestBody question: String): ChatAnswer {
        return openAiService.getAnswer(question)
    }

}