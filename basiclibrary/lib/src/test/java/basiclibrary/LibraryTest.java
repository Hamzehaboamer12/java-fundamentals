///*
// * This Java source file was generated by the Gradle 'init' task.
// */
//package basiclibrary;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class LibraryTest {
//    @Test void someLibraryMethodReturnsTrue() {
//        Library classUnderTest = new Library();
//        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
//    }
//}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void calculateAverage() {

        int[] arr = {1, 2, 3};
        int testResult = Library.calculateAverage(arr);
        assertEquals(2, testResult);
    }

    @Test
    void avgArrayinsideArray() {
        int[][] arr = {{66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}};
        int[] testResult = Library.avgArrayinsideArray(arr);
        int[] testExpec = {63, 63, 57, 57};
        assertArrayEquals(testExpec, testResult);

    }

    @Test
    void containsDuplicates() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean testResult = Library.containsDuplicates(arr);
        assertFalse(testResult);
    }

    @Test
    void roll() {
        boolean test = true;
        int n = 6;
        int[] rollValur = Library.roll(n);
        for (int elemnt :
                rollValur) {
            if (elemnt < 0 || elemnt > 6) {
                test = false;
            }
        }
        if (rollValur.length != n) {
            test = false;
        }
        assertTrue(test);
    }
}