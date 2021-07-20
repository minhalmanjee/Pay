package com.company;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {

    public void HW()
    {
        System.out.println("Hello World");
    }

    public void reverse() throws IOException {
        String fileName = "D://Payfwd/news.txt";
        Path path = Paths.get(fileName);
        Scanner s = new Scanner(path);
        int i = 0;
        String[] arr = new String[100];
        while(s.hasNext()) {
            arr[i] = s.next();
            i++;
        }
        for(int c = arr.length-1; c>=0; c--)
        {
            if(arr[c] != null && ! arr[c]. isEmpty()) {
                System.out.println(arr[c]);
            }
        }
        s.close();
    }
    public static void main(String[] args) throws IOException{
        Main ob = new Main();
        ob.HW();
        ob.reverse();
    }
}
