package br.com.renan.openai.integration.client

import br.com.renan.openai.integration.dto.request.RequestDto
import br.com.renan.openai.integration.dto.response.ResponseDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader

@FeignClient(value = "api-openai", url = "https://api.openai.com")
interface OpenAiClient {

    @PostMapping("/v1/chat/completions")
    fun chat(@RequestHeader("Authorization") auth : String, @RequestBody requestDto: RequestDto) : ResponseDTO

}