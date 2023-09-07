package br.com.renan.openai.integration.dto.request

data class RequestDto(val model: String,
                      val messages: List<Message>,
                      val temperature: Double)
