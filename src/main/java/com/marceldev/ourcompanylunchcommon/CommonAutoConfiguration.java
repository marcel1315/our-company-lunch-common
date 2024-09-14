package com.marceldev.ourcompanylunchcommon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "common.jwt", name = {"secret", "expired-in-hour"})
public class CommonAutoConfiguration {

  @Value("${common.jwt.secret}")
  private String secret;

  @Value("${common.jwt.expired-in-hour}")
  private int expiredInHour;

  @Bean
  @ConditionalOnMissingBean
  public JwtAuthenticationFilter jwtAuthenticationFilter() {
    return new JwtAuthenticationFilter(tokenProvider());
  }

  @Bean
  @ConditionalOnMissingBean
  public TokenProvider tokenProvider() {
    return new TokenProvider(expiredInHour, secret);
  }
}
