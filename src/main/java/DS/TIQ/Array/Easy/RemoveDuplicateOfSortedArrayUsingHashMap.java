package DS.TIQ.Array.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateOfSortedArrayUsingHashMap {

    public static void removeDuplicate(int arr[]){
        int i=0,spaceAvailable=0;
        Map<Integer,Integer> occur = new HashMap<>();
        while(i<arr.length){
            if(occur.get(arr[i])==null){
                arr[spaceAvailable] = arr[i];
                spaceAvailable++;
            }
            occur.put(arr[i],1);
            i++;
        }
        updateAndPrintArr(arr,spaceAvailable);
    }

    public static void updateAndPrintArr(int arr[],int startIndex){

        for (int i=startIndex;i<arr.length;i++){
            arr[i]='_';
        }
        System.out.println(startIndex+", nums = "+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int inputArr[] = {0,0,1,1,1,2,2,3,3,4};
        int inputArr0[] ={1,1,2};
        removeDuplicate(inputArr0);
    }
}
