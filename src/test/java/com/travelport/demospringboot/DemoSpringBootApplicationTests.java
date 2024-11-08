package com.travelport.demospringboot;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.google.NotIncludedBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = DemoSpringBootApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT,
properties = {
  "server.port=9090"
}
) // - Integration test

class DemoSpringBootApplicationTests {

  @Autowired
  ApplicationContext applicationContext;

  @Test
  void contextLoads() {
    assertThrows(BeansException.class, () -> applicationContext.getBean(NotIncludedBean.class));
  }

}
