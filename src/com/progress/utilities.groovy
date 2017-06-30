package com.progress

import groovy.json.JsonSlurper

private defaultExecutorLabel = "linux"
private pullRequestPrefix = "PR-"

def test(String propertyName) {
    echo defaultExecutorLabel
    echo "${defaultExecutorLabel} ${propertyName}"
}
