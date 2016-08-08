import static org.junit.ssert.assertEquals;
import org.junit.*;

public class albumTest{
  Album album;
  

  @Before
  public void before(){
    album = new Album("Loveless", 7.99);
   
  }

  @test
  public void albumHasName(){
    assertEquals("Loveless", album.getName());
  }

  @test
  public void albumHasPrice(){
    assertEquals(7.99, album.getPrice());
  }
}