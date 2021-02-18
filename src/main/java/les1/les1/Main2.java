package les1.les1;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static <T> List<T> toArList(T[]arr){
        List<T> list = new ArrayList<>();
        for (T array:arr
             ) {
            list.add(array);


        }

        return list;

    }

    public static void main(String[] args) {
        String[] array = {"s","m","k"};
        List <String> strList = toArList(array);
        System.out.println(strList);

    }
}
