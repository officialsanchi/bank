import reflection.Issue;

public class PollingApplication {
    private  final String[]TOPICS ;
    private final int [][] RESPONSES = new int [5][10];

    public PollingApplication() {
        Issue[] issue = Issue.values();
        TOPICS =  new String []{ "education","paternity","fraud", "maternity issues","mystery"};
    }
    public String[] getTopics() {
            return TOPICS;
    }
    public int[][] getResponses() {
        return RESPONSES;
    }
    public void getRating(int issues, int rating) {
        issues = issues - 1;
        int[] issueToRate = RESPONSES [issues];
        rating = rating -1;
        issueToRate[rating] = ++ issueToRate[rating];
    }
}
