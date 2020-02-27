package com.company;

/*

Task: enter 30 numbers from the keyboard. Print the 10th and 11th minimum numbers.
Explanation:
The smallest number is the 1st minimum.
The next minimum after it is the 2nd minimum
Example:
1
6
5
7
1
fifteen
63
88
The first minimum is 1
The second minimum is 1
The third minimum is 5
Fourth minimum - 6

Requirements:
1. The program should read data from the keyboard.
2. The program should display the text on the screen.
3. The Solution class must contain two methods.
4. The sort () method should sort the array of elements.
5. The main () method should call the sort () method.
6. The program should output the 10th and 11th minimum numbers. Each value from a new line.
 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i=0; i<30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        System.out.println(array[9]);
        System.out.println(array[10]);
    }
    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[j]<array[i]) {
                    int min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }
            }
        }
    }
}


















