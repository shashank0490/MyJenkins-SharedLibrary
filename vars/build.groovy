import org.apache.commons.lang.StringUtils

def call(String name, String location) {
     sh "echo hello ${name}, welcome to ${location}"
}
