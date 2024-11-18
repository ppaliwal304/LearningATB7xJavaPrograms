package ex_04082024_Collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab125 {
    public static void main(String[] args) {
        // Print all elements
        List myList = new ArrayList();
        myList.add("Pramod");
        myList.add("Paliwal");
        myList.add("123");

        // 1st Type
        for (int i=0; i<myList.size();i++){
            System.out.println("Print element"+myList.get(i));
        }

        // 2nd Type-- Advanced for loop
        for(Object o: myList){
            System.out.println(o);
        }

        //3rd Type-- Iterator

        Iterator myIts = myList.iterator();
            while(myIts.hasNext()){
                    System.out.println(myIts.next());
                }
            }

        }
