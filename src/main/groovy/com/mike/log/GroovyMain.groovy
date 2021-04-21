package com.mike.log

import com.typesafe.config.ConfigFactory

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.typesafe.config.ConfigFactory.parseFile
import static com.typesafe.config.ConfigFactory.parseResources
import com.typesafe.config.Config

class GroovyMain  {

    void printSomething(){
        println "In printSomething"
    }

    static void main(String[] args) {
        println "hello"

        //log.info("name: {}", defaultConfig.getString("conf.name"));

        //Logger logger = Logger.getLogger("")
        //logger.info ("I am a test info log")

        //final
        Logger logger = LoggerFactory.getLogger("myGroovyLogger");
        logger.info("This is debug msg");

        Config defaultConfig = ConfigFactory.parseResources("default1.conf");
        logger.info("name: {}", defaultConfig.getString("conf.name"));
        logger.info("name: {}", defaultConfig.getString("featureFlags.featureA"));

    }
}
