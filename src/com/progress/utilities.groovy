package com.progress

import groovy.json.JsonSlurper

class Utilities
    static String defaultExecutorLabel = "linux"

    static void test(String propertyName) {
        echo this.defaultExecutorLabel
        echo "${this.defaultExecutorLabel} ${propertyName}"
    }
}
