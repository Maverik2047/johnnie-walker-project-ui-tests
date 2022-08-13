package com.johnniewalker.config;


import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credential.properties")
public interface CredConfig extends Config {
    String login();

    String password();

    String baseUrl();


}
