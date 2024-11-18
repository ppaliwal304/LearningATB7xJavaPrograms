package ex_04082024_Collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Lab123 {
    public static void main(String[] args) {


        List myList = new ArrayList();
        myList.add("Pramod");
        myList.add("Paliwal");
        myList.add("123");
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.contains("123"));
        //System.out.println(myList.remove(2));
        System.out.println(myList);
        System.out.println(myList.removeFirst());
        System.out.println(myList);
       // myList.clear();
        System.out.println(myList);
        myList.set(2,"Anusha");
        System.out.println(myList);
        //myList.retainAll();



    }
}
