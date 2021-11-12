package leetcode;

import com.sun.org.apache.xpath.internal.Arg;

public class moveZeroToEnd {
    static void moveZero(int nums[], int m){
        m= nums.length;
        int count=0;
        int temp;

        for(int i=0; i<m; i++){
            if(nums[i]!=0){
                temp=nums[count];
                nums[count]=nums[i];
                nums[i]=temp;
                count++;
            }
        }

    }

    public static void main(String args[]) {
        int nums[]={1,2,0,3,4,8,9,4,0,9,0};
        moveZero(nums,5);
        for(int i=0; i< nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
