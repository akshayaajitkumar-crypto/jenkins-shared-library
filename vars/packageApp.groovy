def call() {
 echo "Packaging Application..."
 dir('app') {
            sh 'mvn package'
 }
 echo "Package Created"
}
