package com.progress

import groovy.json.JsonSlurper

def defaultExecutorLabel = "linux"
def pullRequestPrefix = "PR-"

def test(String propertyName) {
    echo "${defaultExecutorLabel} ${propertyName}"
}
