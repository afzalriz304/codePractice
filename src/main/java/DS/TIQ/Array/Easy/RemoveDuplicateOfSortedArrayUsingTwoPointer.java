package DS.TIQ.Array.Easy;

import java.util.Arrays;

public class RemoveDuplicateOfSortedArrayUsingTwoPointer {
    public static void removeDuplicate(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        updateAndPrintArr(nums,i+1);
    }
    public static void updateAndPrintArr(int arr[],int startIndex){

        for (int i=startIndex;i<arr.length;i++){
            arr[i]='_';
        }
        System.out.println(startIndex+", nums = "+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int inputArr0[] = {0,0,1,1,1,2,2,3,3,4};
        int inputArr1[] ={1,1,2};
        int inputArr2[] ={1,2,2,2,3};
        removeDuplicate(inputArr0);
        removeDuplicate(inputArr1);
        removeDuplicate(inputArr2);

    }
}

