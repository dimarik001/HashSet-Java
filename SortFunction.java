
package gpsset;

public class SortFunction {
    
    public void sortFunction(String[]arrayNames){

        for (int i = 1; i < arrayNames.length; i++) {
            String temp = arrayNames[i];
            int j=i-1;
            while(j >= 0 && arrayNames[j].compareTo(temp)>0){
                arrayNames[j + 1] = arrayNames[j];
                j--;
            }
            arrayNames[j + 1] = temp;
        }
    }
}
