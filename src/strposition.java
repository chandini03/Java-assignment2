/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */









import java.io.*;

public class strposition {
    public static void main(String[] args) throws Exception {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         String str=br.readLine();
         int position = Integer.parseInt(br.readLine());
         char result = str.charAt(position);
        System.out.println(result);
    }
}
