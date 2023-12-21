import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Integer integer = 5;
       Optional <Integer> optional = new Optional<>(integer);
       Double doubleVal = 5.0;
       Optional <Double> optional2 = new Optional<>(doubleVal);

       Integer o = optional.get();
        System.out.println(o);

       Integer [] array = new Integer[4];


        ArrayList <Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(5));
        System.out.println(list.isEmpty());
        System.out.println(list.get(0));
        for (int i=0; i<100; i++) {
            list.add(i);
        }
        System.out.println(list.size());
    }
}