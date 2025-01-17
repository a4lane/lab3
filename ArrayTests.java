import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input2 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input2);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = {4, 5, 6};
    assertArrayEquals(new int[]{6, 5, 4}, ArrayExamples.reversed(input2));
  }


  @Test
  public void testAverageWithoutLowest(){
    double[] basecase = {9.5};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(basecase), 0.001);
    double[] multipleLowest = {8.0, 3.5, 3.5, 6.0, 10.0, 3.5};
    assertEquals(8.0, ArrayExamples.averageWithoutLowest(multipleLowest), 0.001);
  }
}
