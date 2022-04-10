#!/usr/bin/env groovy
// DOESN'T WORK DISREGARD
import groovy.json.JsonSlurperClassic
 
Map parseJSONString(String json) {
    def jsonSlurper = new JsonSlurperClassic()
    return jsonSlurper.parseText(json) as Map
}

