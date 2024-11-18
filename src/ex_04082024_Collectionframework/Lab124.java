package ex_04082024_Collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab124 {
    //Sorting
    public static void main(String[] args) {
        List Marks =new ArrayList();
        Marks.add(100);
        Marks.add(10);
        Marks.add(200);
        Marks.add(300);
        System.out.println(Marks);
        Collections.sort(Marks);
        System.out.println("Sorting:"+Marks);
        Collections.reverse(Marks);
        System.out.println("Reverse:"+Marks);


    }
}
