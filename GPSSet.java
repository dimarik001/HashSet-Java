
package gpsset;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import javafx.print.PaperSource;

public class GPSSet {

    public static void main(String[] args) {
        
        Set<String> names = new HashSet<String>();
        // 1. || 2. Input the users names
        //Easy input
//        names.add("Sam");
//        names.add("John");
//        names.add("Sarah");
//        names.add("Mouna");
//        names.add("Natasha");
//        names.add("Chris");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the names, to exit please write \"End\": ");
        String userNames = scan.nextLine();
        
        while(!userNames.equals("End")){
            names.add(userNames);
            userNames = scan.nextLine();
        }
        
        Iterator<String> iterator = names.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //5. Convert the set into an array.
        String[]arrayNames =  names.toArray(new String[0]);
        for (int i = 0; i < arrayNames.length; i++) {
            System.out.print(arrayNames[i] + " ");
        }
        System.out.println("");
        SortFunction sorting = new SortFunction();
        sorting.sortFunction(arrayNames);
        
        for (int i = 0; i < arrayNames.length; i++) {
            System.out.print(arrayNames[i] + " ");
        }
        System.out.println("");
        Set<String>S2=new HashSet<String>();
        S2.add("James");
        S2.add("Sam");
        S2.add("Natasha");
        Set<String>is=new HashSet<String>();
        BinarySearch bs=new BinarySearch();
        
        for (String string : S2) {
            if (bs.binSearch(string, arrayNames)>=0)is.add(string);
            if (names.contains(string))is.add(string);
        }
        System.out.println("Intersection: "+is);
    }
}
