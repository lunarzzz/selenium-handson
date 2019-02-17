node{


    //stage('get clone'){
        //check CODE
      //  echo 'Checkout==========》》》'
        //        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://source.enncloud.cn/qinzhao/spring-boot-demo.git']]])
    //}

    //定义mvn环境
  //  def mvnHome = tool 'maven3.5.3'
    //env.PATH = "${mvnHome}/bin:${env.PATH}"

    stage('mvn test'){
         withMaven(
                // Maven installation declared in the Jenkins "Global Tool Configuration"
                maven: 'M3',
                // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
                // Maven settings and global settings can also be defined in Jenkins Global Tools Configuration
                mavenSettingsConfig: 'my-maven-settings',
                mavenLocalRepo: '.repository') {

              // Run the maven build
              sh "mvn clean install"

            } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe & FindBugs reports...
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
