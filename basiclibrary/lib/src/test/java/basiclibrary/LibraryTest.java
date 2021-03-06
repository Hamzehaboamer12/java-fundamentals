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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


class LibraryTest {
    @Test
    void calculateAverageTest() {

        int[] arr = {1, 2, 3};
        int testResult = Library.calculateAverage(arr);
        assertEquals(2, testResult);
    }

    @Test
    void avgArrayinsideArrayTest() {
        int[][] arr = {{66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}};
        int[] testResult = Library.avgArrayinsideArray(arr);
        int[] testExpec = {63, 63, 57, 57};
        //assertEquals(testExpec , testResult);

    }

    @Test
    void containsDuplicatesTest() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean testResult = Library.containsDuplicates(arr);
        assertFalse(testResult);
    }

    @Test
    void rollTest() {
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
    @Test
    void test1(){
        HashSet result = new HashSet<>();
        HashSet result1 = new HashSet<>();

        String[]resultAc= new  String[6];
        resultAc[0]="Never saw temperature: 63";
        resultAc[1]="Low :51";
        resultAc[2]="High :72";
        resultAc[3]="Never saw temperature: 69";
        resultAc[4]="Never saw temperature: 67";
        resultAc[5]="Never saw temperature: 68";

        result1.addAll(Arrays.asList(resultAc));

        int[][] testArr = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        result.addAll(Library.AnalyzingWeatherData(testArr));
        assertEquals(result1,result);
    }
    @Test
    void test2(){
        List<String> votes = new ArrayList<>();
        votes.add("hashem");
        votes.add("hashem");
        votes.add("hashem");
        votes.add("hashem");
        votes.add("hashem");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String expected = "hashem" +"  received the most votes!";

        String result = Library.tally(votes);

        assertEquals(expected,result);



    }

}