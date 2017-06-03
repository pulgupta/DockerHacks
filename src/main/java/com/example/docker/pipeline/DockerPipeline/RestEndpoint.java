package com.example.docker.pipeline.DockerPipeline;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Its just a sample endpoint to test that our application is working
 * once it is deployed and running as a container.
 * @author pulgupta
 *
 */
@RestController
public class RestEndpoint {
	@RequestMapping("/test")
	public String checkApplication(){
		return "v1.0 is working fine";
	}
}
