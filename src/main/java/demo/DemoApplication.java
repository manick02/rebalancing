package demo;
import org.apache.curator.test.TestingServer;
public class DemoApplication {
    /**
     * DemoApplication
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        try {
         TestingServer server = new TestingServer();
        } catch(Exception e){
         e.printStackTrace();
        }
//        TestingServer server = new TestingServer();

        // Refering the sample https://github.com/apache/curator/blob/master/curator-examples/src/main/java/leader/LeaderSelectorExample.java

    }
}
