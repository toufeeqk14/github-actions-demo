package com.cogni.action;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EntityScan("com.cogni.action.*")
class ActionDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
