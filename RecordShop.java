public class RecordShop {
  private String name;
  private Albums[] stock;

  public RecordShop(String name){
    this.name = name;
    this.stock = new Albums[100];
  }

  public String getName(){
    return this.name;
  }

  public int stockCheck(){
    int counter = 0;
    for(Albums album : this.stock){
      if (album != null){
        counter++;
      }
    }
    return counter;
  }

  public void checkInStock(Albums album){
    int stockCheck = stockCheck();
    stock[stockCheck] = album; 
  }
}



