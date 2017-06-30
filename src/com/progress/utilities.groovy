package com.progress

import groovy.json.JsonSlurper

class Utilities
    def defaultExecutorLabel

    Utilities() {
        this.defaultExecutorLabel = "linux"
    }

    def test(String propertyName) {
        echo this.defaultExecutorLabel
        echo "${this.defaultExecutorLabel} ${propertyName}"
    }
}
