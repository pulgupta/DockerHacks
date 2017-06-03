package com.example.docker.pipeline.DockerPipeline;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {
	@RequestMapping("/test")
	public String checkApplication(){
		return "v1.0 is working fine";
	}
}
