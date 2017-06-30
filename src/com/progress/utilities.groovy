package com.progress

import groovy.json.JsonSlurper

class Utilities
    private defaultExecutorLabel = "linux"

    Utilities() {
        this.defaultExecutorLabel = "linux"
    }

    def test(String propertyName) {
        echo this.defaultExecutorLabel
        echo "${this.defaultExecutorLabel} ${propertyName}"
    }
}
