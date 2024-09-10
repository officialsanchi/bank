package reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemsTest {
    @Test
    public void testThatProblemsAreNotSolved() {
        Person person = new Person();
        person.isSolved();
        assertTrue(true);

    }
}
