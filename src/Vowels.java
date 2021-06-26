


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Vowels {
    public static void main(String[] args) throws Exception {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         String str=br.readLine();
         int count=0;
         for(int i=0;i<str.length();i++)
         {
             char ch = str.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
            count ++;
         }
         }
         System.out.println(count);
    }
    
}
