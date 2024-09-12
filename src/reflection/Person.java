package reflection;
import java.util.ArrayList;


public class Person {
    ArrayList <Problem> problems = new ArrayList<>();
    private String status;
    public Person() {
        problems = new ArrayList<>();
        Problem problem = new Problem("John", Types.EDUCATION);
    }
    public boolean isSolved() {

        return false;
    }
    public  void addProblem(String name,Types types) {
        Problem problem = new Problem(name, types);
        problems.add(problem);
    }
    public void removeProblem(String name,Types types) {
        Problem problem = new Problem(name, types);
        problems.remove(problem);
    }
}
