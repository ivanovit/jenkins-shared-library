package com.progress

import groovy.json.JsonSlurper

class Globals {
   static String defaultExecutorLabel  = "linux"
}

def test(String propertyName) {
    echo Globals.defaultExecutorLabel
    echo "${Globals.defaultExecutorLabel} ${propertyName}"
}
