package ua.andriypauk.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Andriy on 14.06.2016.
 */

@Configuration
@EnableWebMvc
@ComponentScan ("ua.andriypauk.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter {
}
