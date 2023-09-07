package br.com.renan.openai.integration.dto.response

import com.fasterxml.jackson.annotation.JsonAlias

data class Usage(@JsonAlias("prompt_tokens") val promptTokens: Int,
                 @JsonAlias("completion_tokens") val completionTokens: Int,
                 @JsonAlias("total_tokens")val totalTokens: Int)
