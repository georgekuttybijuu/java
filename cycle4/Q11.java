import java.util.*;

public class Q11 {
    public static  void main(String[] args){
        System.out.println("Georgekutty Biju");
        System.out.println("22MCA027");
        System.out.println("27 June 2023");
        LinkedList<String> L=new LinkedList<>();
        L.add("Gold");
        L.add("Silver");
        L.add("Bronze");
        L.add(0,"Olympics Medals");
        System.out.println(L);
        L.remove("Bronze");
        System.out.println(L);
        L.remove(2);
        System.out.println(L);
        L.removeLast();
        System.out.println(L);
        L.removeFirst();
        System.out.println(L);


    }

}
