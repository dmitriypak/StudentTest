package ru.projects.edu.spring.task3.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageServiceConfig {
  @Bean
  public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Bean
  public MessageSource messageSource() {
    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
    messageSource.setBasename("/l10n/bundle");
    messageSource.setDefaultEncoding("UTF-8");
    return messageSource;

  }

}
