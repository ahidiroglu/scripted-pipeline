node {
    stage('Init') {
        withCredentials([sshUserPrivateKey(credentialsId: 'jenkins-master-ssh-key', keyFileVariable: 'SSHKEY', passphraseVariable: '', usernameVariable: 'SSHUSERNAME')]) {
            sh 'ssh -o StrictHostKeyChecking=no -i $SSHKEY root@159.65.234.153 yum install epel-release -y'
        }
    }
}