package br.com.renan.openai.integration.dto.response

data class ResponseDTO(val id: String,
                       val `object`: String,
                       val created: Long,
                       val model: String,
                       val choices: List<Choice>,
                       val usage: Usage)
