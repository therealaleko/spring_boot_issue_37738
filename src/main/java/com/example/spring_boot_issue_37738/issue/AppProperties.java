package com.example.spring_boot_issue_37738.issue;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@EnableConfigurationProperties(AppProperties.class)
@ConfigurationProperties(prefix = "app")
@Validated
public record AppProperties(@NotBlank String name) {
}
