package com.robust.springboot.cucumber.datasets;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class RunConfiguration {

    @Value("${browser}")
    private String browser;

    @Value("${testType}")
    private String testType;


}
