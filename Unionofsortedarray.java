// Union of sorted Array 

// optimal approach

import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
       int n1 = a.length;
       int n2 = b.length;
       int i = 0;
       int j =0;
        Vector<Integer> unionArr = new Vector<>();
        while( i <n1 && j <n2){
            if(a[i] < b[j]){
                if(unionArr.isEmpty() || unionArr.lastElement() != a[i] ){
                    unionArr.add(a[i]);

                }
                i++;
            }
            else if((b[j] < a[i])){
                if(unionArr.isEmpty() || unionArr.lastElement()!= b[j]){
                        unionArr.add(b[j]);
                    }
                    j++;
            }
            else {
                if(unionArr.isEmpty() || unionArr.lastElement()!= b[j]){
                        unionArr.add(a[i]);
                        
                    }
                    i++ ; j++;
            }

        }

        while(i<n1){
            if(unionArr.isEmpty() || unionArr.lastElement()!= a[i]){
                        unionArr.add(a[i]);
                        
                    }
                    i++;
        }
        while(j<n2){
            if(unionArr.isEmpty() || unionArr.lastElement()!= b[j]){
                        unionArr.add(b[j]);
                        
                    }
                    j++;
        }
            return unionArr;

        }
       
    }
