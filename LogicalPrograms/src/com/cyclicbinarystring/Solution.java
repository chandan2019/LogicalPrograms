package com.cyclicbinarystring;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String s = bufferedReader.readLine();

    	String s = "0100";
        int result = Result.maximumPower(s);

        System.out.println("result " + result);
     /*   bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
