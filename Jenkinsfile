pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'building stage printing ...'
      }
    }

    stage('test') {
      steps {
        sleep 3
      }
    }

    stage('deploy') {
      steps {
        echo 'deploy stage ...'
      }
    }

  }
}