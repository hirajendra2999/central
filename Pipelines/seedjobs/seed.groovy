freeStyleJob('myFirstJob') {
    steps {
        shell('echo Hello Raj World!')
    }
}
freeStyleJob('mySecondJob') {
    steps {
        shell('echo Hello Raj World!')
    }
}