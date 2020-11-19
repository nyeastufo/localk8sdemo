package com.ycic.localk8sdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
	@GetMapping
	public List<String> getMessage() {
		return Arrays.asList("Hello", "from", "K8S");
	}
}
