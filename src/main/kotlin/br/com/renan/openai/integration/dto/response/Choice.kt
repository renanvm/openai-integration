package br.com.renan.openai.integration.dto.response

import br.com.renan.openai.integration.dto.request.Message
import com.fasterxml.jackson.annotation.JsonAlias

data class Choice(val index: Int,
                  val message: Message,
                  @JsonAlias("finish_reason") val finishReason: String)
