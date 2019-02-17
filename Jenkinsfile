pipeline {
    agent any
    stages {
        stage('hello') {
            steps {
              echo 'hello world'
              echo "${env.WORKSPACE}"
              echo "${WORKSPACE}"
              echo "${cluster}"
            }
        }
        // build three times.
        stage('build') {
           //when {
           //     environment name:'cluster',value:'2'
           // }
            steps {
                parallel(
                    a: {
                        echo "This is branch a"
                    },
                    b: {
                        echo "This is branch b"
                    },
                    c: {
                        echo "This is branch c"
                    }
                )
            }
        }
        // deploy ---> choose target.
        stage('deploy') {
            steps {
                parallel(
                    a: {
                        echo "This is branch a"
                    },
                    b: {
                        echo "This is branch b"
                    },
                    c: {
                        echo "This is branch c"
                    }
                )
            }
        }

        //定义mvn环境
            def mvnHome = tool 'maven3.5.3'
            env.PATH = "${mvnHome}/bin:${env.PATH}"

            stage('mvn test'){
                //mvn 测试
                sh "mvn test"
            }

            stage('mvn build'){
                //mvn构建
                sh "mvn clean install -Dmaven.test.skip=true"
            }

            stage('deploy'){
                //执行部署脚本
                sh "ls -l target"
                echo "deploy ......"
            }
    }

}