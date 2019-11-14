pipeline {
    //Donde se va a ejecutar el Pipeline
    agent {
        label 'Slave_Induccion'
    }

    //Opciones espec�ficas de Pipeline dentro del Pipeline
    options {
        //Mantener artefactos y salida de consola para el # espec�fico de ejecucionesrecientes del Pipeline.
        buildDiscarder(logRotator(numToKeepStr: '3'))
        //No permitir ejecuciones concurrentes de Pipeline
        disableConcurrentBuilds()
    }

    //Una secci�n que define las herramientas para �autoinstalar� y poner en la PATH
    tools {
        jdk 'JDK8_Centos' //Preinstalada en la Configuraci�n del Master
        gradle 'Gradle5.0_Centos' //Preinstalada en la Configuraci�n del Master
    }

    //Aqu� comienzan los �items� del Pipeline
    stages {
        stage('Checkout') {
            steps {
                echo "------------>Checkout<------------"
                checkout([$class: 'GitSCM', branches: [[name: '*/master']],
                        doGenerateSubmoduleConfigurations: false, extensions: [], gitTool:
                        'Git_Centos', submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'GitHub_cdgparedes', url: 'https://github.com/cdgparedes/cine']]])
            }
        }

        stage('Compile') {
            steps {
                echo "------------>Compile<------------"
                sh 'gradle clean'
                sh 'gradle --b ./build.gradle compileJava'
            }
        }

        stage('Integration Tests') {
            steps {
                echo "------------>Integration Tests<------------"
                //sh 'gradle --b ./build.gradle integrationTest'
            }
        }

        stage('Build') {
            steps {
                echo "------------>Build<------------"
                //Construir sin tarea test que se ejecut� previamente
                sh 'gradle --b ./build.gradle build -x test'
            }
        }

        stage('Static Code Analysis') {
            steps{
                echo '------------>An�lisis de c�digo est�tico<------------'
                withSonarQubeEnv('Sonar') {
                	sh "${tool name: 'SonarScanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'}/bin/sonar-scanner"
                	
                } 
                
            }
        }

    }

    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'Esto correr� solo si se ejecuta satisfactoriamente'
            // Se ejecutar� correctamente, siempre y cuando exista la ruta expuesta
            //junit '**/build/test-results/*.xml'
        }
        failure {
            echo 'This will run only if failed'
            //      Send notifications about a Pipeline to an email
            mail(to: 'cesar.grajales@ceiba.com.co',
                subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                body: "Something is wrong with ${env.BUILD_URL}")
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'

            //      This will run only if the state of the Pipeline has changed
            //      For example, if the Pipeline was previously failing but is now successful'
            //      Send notifications about a Pipeline to an email
            mail(to: 'cesar.grajales@ceiba.com.co',
                subject: "Changed State Pipeline: ${currentBuild.fullDisplayName}",
                body: "The state of the Pipeline has changed. See ${env.BUILD_URL}")
        }
    }
}