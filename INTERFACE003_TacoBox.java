interface taroBox{
  int tacoRemaining();
  void eat();
}

class TripleTaroBox implements taroBox{
  int taros = 3;
  @Override
  public int tacoRemaining(){
    return taros;
  }
  @Override
  public void eat(){
    if(taros > 0){
      --taros;
    }
  }
}

class CustomTacoBox implements taroBox{
  int taros = 0;
  public CustomTacoBox(int num){
    taros = num;
  }
  @Override
  public int tacoRemaining(){
    return taros;
  }
  @Override
  public void eat(){
    if(taros > 0){
      --taros;
    }
  }
}

public class INTERFACE003_TacoBox {
  public static void main(String[] args) {
    TripleTaroBox triple = new TripleTaroBox();
    triple.eat();
    triple.eat();
    System.out.println("Triple taco boxes left: " + triple.tacoRemaining());
    CustomTacoBox custom = new CustomTacoBox(8);
    custom.eat();
    System.out.println("Custom taco boxes left: " + custom.tacoRemaining());
  }
}
