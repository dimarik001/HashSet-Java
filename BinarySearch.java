/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpsset;

/**
 *
 * @author cstuser
 */
public class BinarySearch {
    public int binSearch(String str, String[] array){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=(end-start)/2+start;
            if(array[mid].compareTo(str)>0){
                end=mid-1;
            }
            else if(array[mid].compareTo(str)<0){
                start=mid+1;
            }
            else return mid;
        }
        return -1;
    }
    
}
