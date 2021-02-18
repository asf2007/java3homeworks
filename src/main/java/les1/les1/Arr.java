package les1.les1;

public class Arr <T>{
    private T[] mas;

    public Arr(T[] mas) {
        this.mas = mas;
    }
    public void changeTwoPointsArr(int i1, int i2){
        T var = mas[i1];
        mas[i1]= mas[i2];
        mas[i2] =var;
        for (T arr: mas
             ) {
            System.out.println(arr);

        }
    }
}
