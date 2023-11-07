import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListTests{

    @Test
    public void testFilter1(){
        StringCheckerObject sc = new StringCheckerObject();
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b,c,d");
        List<String> expected = new ArrayList<>();
        expected.add("a");
        assertEquals(expected, ListExamples.filter(input1, sc));
    }

    @Test
    public void testFilter2(){
        StringCheckerObject sc = new StringCheckerObject();
        List<String> input2 = new ArrayList<>();
        input2.add("a");
        input2.add("b c");
        input2.add("d,e,f");
        input2.add("g");
        List<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("b c");
        expected.add("g");
        assertEquals(expected, ListExamples.filter(input2, sc));
    }


    @Test
    public void testMerge1(){
        List<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("D");
        List<String> l2 = new ArrayList<>();
        l2.add("B");
        l2.add("C");
        List<String> expected = new ArrayList<>();
        expected.addAll(l1);
        expected.addAll(l2);
        Collections.sort(expected);
        assertEquals(expected, ListExamples.merge(l1, l2));
    }
}