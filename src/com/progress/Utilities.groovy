package com.progress

import groovy.json.JsonSlurper
 
def defaultExecutorLabel = "linux"

def test(String propertyName) {
    echo defaultExecutorLabel
    echo "${defaultExecutorLabel} ${propertyName}"
}

return this
