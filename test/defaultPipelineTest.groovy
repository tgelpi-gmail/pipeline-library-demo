import groovy.testSupport.PipelineSpockTestBase
 
class defaultPipelineTest extends PipelineSpockTestBase {
 
    def script
 
    def setup() {
        script = loadScript('vars/defaultPipeline.groovy')
    }
 
    def cleanup() {
        printCallStack()
    }
 
    void 'Happy flow'() {
        when:
        script.call([:])
 
        then:
        assertJobStatusSuccess()
 
    }
}
