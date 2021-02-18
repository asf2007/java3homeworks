package les1.les1;

public class Orange extends Fruit {

    //private float weight =1.5f;
    public Orange(){
    }

    @Override
    public float getWeight() {
       return 1.5f;
    }

    @Override
    public String getName() {
        return "orange";
    }
}
