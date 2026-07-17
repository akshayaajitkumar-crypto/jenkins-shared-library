def call() {
    echo "Starting Maven Build..."

    dir('app') {
        sh 'mvn clean compile'
    }

    echo "Build Completed Successfully."
}
