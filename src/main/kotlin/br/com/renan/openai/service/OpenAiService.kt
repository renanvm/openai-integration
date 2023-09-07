package br.com.renan.openai.service

import br.com.renan.openai.integration.client.OpenAiClient
import br.com.renan.openai.integration.dto.request.Message
import br.com.renan.openai.integration.dto.request.RequestDto
import br.com.renan.openai.model.ChatAnswer
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class OpenAiService(private val openAiClient: OpenAiClient) {

    @Value("\${openai-api-key}")
    private lateinit var authorization: String

    fun getAnswer(question: String): ChatAnswer {

        val requestDto = RequestDto(
                model = "gpt-3.5-turbo",
                messages = listOf(
                        Message(
                                role = "user",
                                content = question
                        )
                ),
                temperature = 1.0)


        val response = openAiClient.chat("Bearer $authorization", requestDto);

        return ChatAnswer(response.choices.map { it.message.content }[0])
    }

}