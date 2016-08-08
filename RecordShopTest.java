import static org.junit.ssert.assertEquals;
import org.junit.*;

public class RecordShopTest{
  RecordShop recordShop;
  Album album;

  @Before
  public void before(){
    recordShop = new RecordShop("Surface Noise");
    album = new Album();
  }

  @test
  public void shopHasName(){
  assertEquals("Surface Noise", recordShop.getName());
}

  @test
  public void shopHasNoStock(){
    assertEquals(0, recordShop.stockCheck());
  }

  @test
  public void bookAlbumInotStock(){
    assertEquals(1, recordShop.stockCheck());
  }

}