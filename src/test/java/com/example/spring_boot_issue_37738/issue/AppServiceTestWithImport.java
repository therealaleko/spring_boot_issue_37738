package com.example.spring_boot_issue_37738.issue;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(AppProperties.class)
@SpringBootTest
public class AppServiceTestWithImport implements WithAssertions {
  @Autowired
  private AppService appService;

  @Test
  void getName() {
    assertThat(appService.getName()).isEqualTo("SpringBoot");

    /*
     * Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type
     * 'com.example.spring_boot_issue_37738.issue.AppProperties' available: expected single matching bean but
     * found 2: com.example.spring_boot_issue_37738.issue.AppProperties
     * ,app-com.example.spring_boot_issue_37738.issue.AppProperties
     */
  }
}
