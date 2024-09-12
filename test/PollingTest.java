
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PollingTest {
    private final PollingApplication polling = new PollingApplication();
    @Test
    public void testThatPollingAppExist(){
        PollingApplication pollingApplication = new PollingApplication();
        assertNotNull(polling);

    }
@Test
    public void test_That_Polling_App_Has_5_Issues(){
        String[] topics =  polling.getTopics();
    System.out.println(Arrays.toString(topics));
        assertEquals(5,topics.length);

}
@Test
public void testThatPollingIssuesExist(){
        String[] topics = polling.getTopics();
        for(String topic : topics){
            assertNotNull(topic);

        }
}
@Test
//@Disabled("polling app has 5 by 10 table for responses")
    public void test_That_Polling_Application_Has_5_By_10_Table_For_Responses() {
    int[][] responses = polling.getResponses();
    int numberOfRows = responses.length;
    assertEquals(5,numberOfRows);
    for(int [] response : responses){
        assertEquals(10,response.length);
    }

}
@Test
    public void testThatPollingApplicationCanStoreRating(){
        polling.getRating( 5, 8);
        polling.getRating( 3, 2);
        polling.getRating( 4, 1);
        int [][] responses = polling.getResponses();
        int fifthIssuesResponses = responses[4][7];
        assertEquals(1,fifthIssuesResponses);
        int thirdIssuessResponses = responses[2][1];
        assertEquals(1,thirdIssuessResponses);
        int fourthIssuesResponses = responses[3][0];
        assertEquals(1,fourthIssuesResponses);


}

}
