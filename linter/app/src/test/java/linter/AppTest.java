package linter;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
//    App app =new App();

    @Test public void readFileTest(){
        ArrayList<String> targets = new ArrayList<>();
        String filePath = "src/test/resources/gate.js";
        boolean containsTargets = App.readFile(filePath).containsAll(targets);
        assertTrue(containsTargets);
    }
}