package leetcode;

import java.lang.reflect.Array;

public class leetq2 {
    public static int distance(String[] word, String word1, String word2){
        int p=-1;
        int q=-1;
        int distance=Integer.MAX_VALUE;

        for (int i=0; i<word.length; i++){
            if (word1.equals(word[i])){
                p=i;
            }
            if (word2.equals(word[i])){
                q=i;
            }
            if (p!=-1 && q!=-1){
                distance=Math.min(Math.abs(p-q),distance);
            }
        }
        return distance;

    }

    public static void main(String[] args){
        String[] word= {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(distance(word, "coding","makes"));

    }
}
