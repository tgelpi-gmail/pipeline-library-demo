#!/usr/bin/env groovy
def call(Closure body) {
    node('teds-mbp') {
        body()
    }
}
