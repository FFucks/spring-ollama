package com.ffucks.controller;

import dev.langchain4j.model.chat.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AiController {

    ChatModel chatModel;

    public AiController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping
    public String getMessage(@RequestParam String message) {
        return chatModel.chat(message);
    }
}
