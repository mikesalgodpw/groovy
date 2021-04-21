package com.mike.read

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory

class MainReadConfig {

    static void main(String[] args) {
        println "hello"

        //default1.conf is located in folder "resource"
        Config defaultConfig = ConfigFactory.parseResources("default1.conf")
        println defaultConfig.getString("conf.name")
        println defaultConfig.getString("featureFlags.featureA")
    }
}
