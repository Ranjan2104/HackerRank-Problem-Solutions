import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int a = 0;
        int b = 0;
        if(a0>b0) 
            a++;
        else if(a0<b0) 
            b++;
        if(a1>b1) 
            a++;
        else if(a1<b1) 
            b++;
        if(a2>b2) 
            a++;
        else if(a2<b2) 
            b++;
        System.out.println(a+" "+b);
       
    }
} // Contributed by Amresh Ranjan.
