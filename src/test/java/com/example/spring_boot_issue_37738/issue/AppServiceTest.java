package com.example.spring_boot_issue_37738.issue;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppServiceTest implements WithAssertions {
  @Autowired
  private AppService appService;

  @Test
  void getName() {
    assertThat(appService.getName()).isEqualTo("SpringBoot");
    /*
     * No qualifying bean of type 'com.example.spring_boot_issue_37738.issue.AppProperties' available:
     * expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
     */
  }
}