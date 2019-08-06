
package gpsset;

import java.util.Scanner;
import java.util.Set;

public class SetGPS {
    
    public void inputUser(Set<String> userNames){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name: ");
        String user = scan.nextLine();
        
        if(userNames.contains(user)){
            System.out.println("The name is exist already !");
        }
        else{
            userNames.add(user);
            System.out.println("Does not exist");
        }    
    }
}
