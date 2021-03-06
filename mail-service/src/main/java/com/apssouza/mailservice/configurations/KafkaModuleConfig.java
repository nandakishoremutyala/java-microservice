package com.apssouza.mailservice.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Kafka event module configuration
 *
 * @author apssouza
 */
@ComponentScan({"com.apssouza.kafkaevent"})
@Configuration
public class KafkaModuleConfig {

}
