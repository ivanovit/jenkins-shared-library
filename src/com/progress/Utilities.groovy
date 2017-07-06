package com.progress

import groovy.json.JsonSlurper
 
defaultExecutorLabel = "linux"

def test(String propertyName) {
    echo defaultExecutorLabel
    echo "${defaultExecutorLabel} ${propertyName}"
}
