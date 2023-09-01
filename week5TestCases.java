package Demo;
import static org.junit.Assert.*;
import org.junit.Test;
public class week5TestCases {
  @Test
  public void addTest() {
    assertEquals(5, Sample.add(2,3));
  }
   @Test
  public void subTest() {
    assertEquals(4, Sample.sub(7,3));
  }
}
