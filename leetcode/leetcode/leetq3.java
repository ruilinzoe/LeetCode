package leetcode;

import com.sun.org.apache.xpath.internal.Arg;

public class leetq3 {
    static void moveZero(int list[], int n){
        n=list.length;
        int count=0;
        int temp;

        for (int i=0; i<n; i++){
            if (list[i]!=0){
                temp=list[count];
                list[count]=list[i];
                list[i]=temp;
                count++;
            }
        }
    }

    public static void main(String args[]){
        int list[]={0,0,4,3,0};
        moveZero(list, 5);
        for (int i=0; i<list.length; i++)
            System.out.println(list[i]);
    }
}
