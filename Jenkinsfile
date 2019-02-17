node{
    //stage('get clone'){
        //check CODE
      //  echo 'Checkout==========》》》'
        //        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://source.enncloud.cn/qinzhao/spring-boot-demo.git']]])
    //}

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
   // def dockerfile = 'Dockerfile'
   // def customImage = docker.build("10.39.47.22/qinzhao/demo:v1.0", "-f ${dockerfile} .")
    //customImage.push()

}
