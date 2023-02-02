pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('real-world-app-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ModiconMe/real-world-app.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}