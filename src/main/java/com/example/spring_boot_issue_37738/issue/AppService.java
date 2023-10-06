package com.example.spring_boot_issue_37738.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppService {
  private final AppProperties appProperties;

  public String getName() {
    return appProperties.name();
  }
}
