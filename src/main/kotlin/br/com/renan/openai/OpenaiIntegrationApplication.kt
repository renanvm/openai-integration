package br.com.renan.openai

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class OpenaiIntegrationApplication

fun main(args: Array<String>) {
    runApplication<OpenaiIntegrationApplication>(*args)
}
