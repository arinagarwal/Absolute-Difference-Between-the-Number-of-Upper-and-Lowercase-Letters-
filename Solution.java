import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int lower = 0;
        int upper = 0;
        String l = "qwertyuiopasdfghjklzxcvbnm";
        String u = "QWERTYUIOPASDFGHJKLZXCVBNM";
        for(int x = 0; x < s.length(); x++)
        {
            String b = s.substring(x,x+1);
            if(l.contains(b))
            {
                lower++;
            }
            if(u.contains(b))
            {
                upper++;
            }
        }
        System.out.println(Math.abs(lower - upper));
    }
}
