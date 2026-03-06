package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
    "spring.cloud.gcp.bigquery.enabled=false",
    "spring.cloud.gcp.project-id=test-project"
})
class DemoApplicationTests {
    @Test
    void contextLoads() {
    }
}
