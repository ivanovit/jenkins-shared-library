package com.progress

import groovy.json.JsonSlurper

defaultExecutorLabel = "linux"
pullRequestPrefix = "PR-"

def test(String propertyName) {
    echo "${defaultExecutorLabel} ${propertyName}"
}

return this