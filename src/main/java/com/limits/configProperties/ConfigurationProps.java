package com.limits.configProperties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limit-service")
@Getter
@Setter
public class ConfigurationProps {
    private int minimum;
    private  int maximum;

}
