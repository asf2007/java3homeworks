package les1.les1;

public class Main3 {
    public static void main(String[] args) {
Apple apple = new Apple();
Orange orange = new Orange();
Box <Apple> box1ap = new Box<>();
Box <Orange> box1or = new Box<>();
        Box <Orange> box2or = new Box<>();
box1ap.addFruit(apple);
box1ap.addFruit(apple);
//box1or.addFruit(orange);
        box1or.addFruit(orange);
        box1or.addFruit(orange);
        box1or.addFruit(orange);
        box2or.addFruit(orange);
        box2or.addFruit(orange);
        box2or.addFruit(orange);
        System.out.println( box1or.compare(box2or));
        box1or.toanotherBox(box2or);
    }
}
