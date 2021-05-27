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
        int  size = in.nextInt();
        int[][] matrix = new int[size][size];
        for (int  x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                matrix[x][y] = in.nextInt();
            }
        }
        int leftcross=0,rightcross=0;
        for (int  x = 0; x < size; x++) {
            leftcross += matrix[x][x];
            rightcross += matrix[x][size-x-1];
        }
        System.out.println(Math.abs(leftcross-rightcross));
    }
}
// Contributed by Amresh Ranjan.