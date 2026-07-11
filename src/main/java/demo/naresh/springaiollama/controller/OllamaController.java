package demo.naresh.springaiollama.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OllamaController {
  
  ChatClient chatClient;

  public OllamaController(ChatClient.Builder chatClientBuilder) {
    this.chatClient = chatClientBuilder.build();
  }

  @GetMapping("/ask/ollama/{userText}")
  public String askOllama(@PathVariable String userText){
    
    return chatClient.prompt(userText).call().content();
  }
}
