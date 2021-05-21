package spring5_webmvc_beanValidation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring5_webmvc_beanValidation.controller",
		"spring5_webmvc_beanValidation.survey"})
public class ControllerConfig {

	
}
