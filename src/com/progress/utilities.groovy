package com.progress

import groovy.json.JsonSlurper

class Utilities {
    private static defaultExecutorLabel = "linux"
    private static pullRequestPrefix = "PR-"

    static def test(String propertyName) {
        echo "${defaultExecutorLabel} ${propertyName}"
    }
}
