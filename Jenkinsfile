pipeline {
    agent any
    // { label 'master' }
    stages {
        stage ('Clone') {
            steps{
        git url: 'https://github.com/Avanishpatel/order-orderline-servcie.git'
             }
        }
       stage('Build') {
          steps {
             sh 'gradle clean compileJava'
             sh './gradlew clean build'
          }
       }
       stage('Test'){
           steps{
               sh './gradlew test'
           }
       }
       stage('Deploy'){
           steps{
               sh 'cf push order-orderline-service -p ./build/libs/order-orderline-service-0.0.1-SNAPSHOT.jar --no-start --random-route'
           }
       }
    }
}