package com.progress

import groovy.json.JsonSlurper

def test(String propertyName) {
    echo this.defaultExecutorLabel
    echo "${this.defaultExecutorLabel} ${propertyName}"
}
