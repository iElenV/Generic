import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Integer integer = 5;
//     Optional <Integer> optional = new Optional<>(integer);
//       Double doubleVal = 5.0;
//       Optional <Double> optional2 = new Optional<>(doubleVal);
//
//      Integer o = optional.get();
//     System.out.println(o);

//       Integer [] array = new Integer[4];
//
//
//        ArrayList <Integer> list = new ArrayList<>();
//        ArrayList <Integer> from1to100 = new ArrayList<>();
//        //from1to100.add(Integer.valueOf(5));
//        for (int i=0; i<99; i++) {
//            from1to100.add(i);
//        }
//        System.out.println("from1to100Size " + from1to100.size());
//
//        list.add(Integer.valueOf(5));
//        System.out.println(list.isEmpty());
//        System.out.println(list.get(0));
//        for (int i=0; i<100; i++) {
//            list.add(i);
//        }
//        list.removeIf(integer -> integer==5);
//        System.out.println("listSize " + list.size());
//
//        ArrayList <Integer> from100to200 = new ArrayList<>();
//        for (int i=100; i<200; i++) {
//            from100to200.add(i);
//        }
//        System.out.println("from100to200Size " + from100to200.size());
//        from1to100.addAll(from100to200);
//        System.out.println("from1to200 after add Size " + from1to100.size());
//
//        for (Integer integer: from1to100) {
//            System.out.println(integer);
//        }
//
//        from1to100.clear();

        String string = " ((1234) 23 []567788{uu(uu)}oo(888))";
        System.out.println(checkStr(string));



    }

    public static boolean checkStr (String string) {
        Stack <Byte> stack = new Stack<>();
        byte element1 = "(".getBytes()[0];
        byte element2 = "[".getBytes()[0];
        byte element3 = "{".getBytes()[0];

        byte element4 = ")".getBytes()[0];
        byte element5 = "]".getBytes()[0];
        byte element6 = "}".getBytes()[0];
        Set <Byte> openBrackets = new HashSet<>();
        openBrackets.add("(".getBytes()[0]);
        openBrackets.add("[".getBytes()[0]);
        openBrackets.add("{".getBytes()[0]);
//        Set <Byte> closeBrackets = new HashSet<>();
//        openBrackets.add(")".getBytes()[0]);
//        openBrackets.add("]".getBytes()[0]);
//        openBrackets.add("}".getBytes()[0]);




        for (byte letter: string.getBytes()) {
            if (openBrackets.contains(letter)) {
                stack.add (letter);
            }
//            if (letter== element1) {
//                stack.add(letter);
//            } else if (letter== element2) {
//                stack.add(letter);
//            } else if (letter== element3) {
//                stack.add(letter);
            else  if (letter== element4){
                byte peek =  stack.peek();
                if (peek ==element1) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (letter== element5) {
                byte peek =  stack.peek();
                if (peek == element2) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (letter== element6) {
                byte peek =  stack.peek();
                if (peek ==element3) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}