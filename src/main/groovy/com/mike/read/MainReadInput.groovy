package com.mike.read

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory

class MainReadInput {

    static void main(String[] args) {

        //---------read user input
        print "What is your name? "
        def name = System.in.newReader().readLine()
        println "Your name is " + name
    }
}
