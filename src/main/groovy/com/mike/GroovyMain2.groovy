package com.mike


import groovy.json.JsonSlurper

class GroovyMain2 {




    static void main(String[] args) {
        println "hello, I am in GroovyMain2"

/*
        def postmanGet = new URL('https://postman-echo.com/get')
        def getConnection = postmanGet.openConnection()
        getConnection.requestMethod = 'GET'
        assert getConnection.responseCode == 200

        println getConnection.getContent()
        getConnection.re
        */




        //def location = System.console().readLine( 'Location: ' )

        def location = 'en'

        /*
        def connection = new URL( "https://query.yahooapis.com/v1/public/yql?q=" +
                URLEncoder.encode(
                        "select item " +
                                "from weather.forecast where woeid in " +
                                "(select woeid from geo.places(1) " +
                                "where text='$location')",
                        'UTF-8' ) )
                .openConnection() as HttpURLConnection
         */

        def connection = new URL('https://postman-echo.com/get').openConnection() as HttpURLConnection


// set some headers
        //connection.setRequestProperty( 'User-Agent', 'groovy-2.4.4' )
        //connection.setRequestProperty( 'Accept', 'application/json' )

        if ( connection.responseCode == 200 ) {
            // get the JSON response
            def json = connection.inputStream.withCloseable { inStream ->
                new JsonSlurper().parse(inStream as InputStream)
            }

            // extract some data from the JSON, printing a report
            def item = json.headers.accept
            println item

            /*
            item = json.query.results.channel.item
            println item.title
            println "Temperature: ${item.condition?.temp}, Condition: ${item.condition?.text}"

            // show some forecasts
            println "Forecasts:"
            item.forecast.each { f ->
                println " * ${f.date} - Low: ${f.low}, High: ${f.high}, Condition: ${f.text}"
            }
        } else {
            println connection.responseCode + ": " + connection.inputStream.text
        }
*/
        }

    }
}
