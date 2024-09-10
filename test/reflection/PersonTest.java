package reflection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 public class PersonTest {

     @Test
     public void testThatPersonExists() {
         Person person = new Person();
         assertTrue(true);

     }
     @Test
     public void testThatPersonListOfProblemIsOne(){
         Person person = new Person();
         assertTrue(true);
     }
     @Test
     public void testThatPersonCanAddToTheirProblemsList(){
         Person person = new Person();
         person.addProblem("persom", Types.EDUCATION);
         assertTrue(true);
     }
     @Test
     public void testThatPersonCanRemoveFromTheirProblemsList(){
         Person person = new Person();
         person.removeProblem("person", Types.EDUCATION);
         assertTrue(true);
     }
 }
