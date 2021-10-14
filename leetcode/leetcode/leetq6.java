package leetcode;

import java.util.Arrays;

public class leetq6 {
    public boolean isIsomorphic(String s, String t){
        int[] mapStoT = new int[256];
        Arrays.fill(mapStoT, 100);

        int[] mapTtoS =new int[256];
        Arrays.fill(mapTtoS, 100);

        for (int i=0; i<s.length(); i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if (mapStoT[c1]==100 && mapTtoS[c2]==100){
                mapStoT[c1]=c2;
                mapTtoS[c2]=c1;
            }

            else if (!(mapStoT[c1]==c2 && mapTtoS[c2]==c1)){
                return false;
            }

        }
        return true;
    }

}
