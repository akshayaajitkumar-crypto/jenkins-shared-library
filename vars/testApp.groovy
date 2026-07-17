def call() {
    echo "Running Test"
    dir('app') {
           sh 'mvn test'
    }
    echo "Tests Completed"
}
