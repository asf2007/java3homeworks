package les1.les1;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
List <T> fruits = new ArrayList<>();
public void addFruit(T fruit){
    fruits.add(fruit);
    System.out.println(fruit.getName() +" "+  getWeight(fruit.getWeight(),fruits.size()));
}

    public  float getWeight(float weightOfOne, int num){
        return weightOfOne*num;
    }
    public boolean compare(Box<?> anotherbox){
    return Math.abs(this.getWeight(this.fruits.get(0).getWeight(), this.fruits.size())-anotherbox.getWeight(anotherbox.fruits.get(0).getWeight(), anotherbox.fruits.size()) )<0.00001;

}
public void toanotherBox(Box<T> anotherBox){
    for (T fr: fruits
         ) {
        anotherBox.addFruit(fr);


    }
  fruits.clear();
}

}
