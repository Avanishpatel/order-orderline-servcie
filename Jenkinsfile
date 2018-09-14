pipeline {
    agent any
    // { label 'master' }
    stages {
       stage('Build') {
          steps {
             sh 'gradle clean compileJava'
             sh './gradlew clean build'
          }
       }
       stage('Deploy'){
           steps{
               sh 'cf push order-orderline-service -p ./build/libs/order-orderline-service-0.0.1-SNAPSHOT.jar --random-route'
           }
       }
    }
}