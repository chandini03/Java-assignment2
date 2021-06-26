/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */



import java.util.Scanner;
public class mahasena {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int  number=sc.nextInt();
        int even=0,odd=0;
	    for(int i=0;i<number;i++){
	        int k = sc.nextInt();
	        if(k%2==0){
	            even+=1;
	        }else{
	            odd+=1;
	        }
	    }
	    if(even>odd){
	        System.out.println("READY FOR BATTLE");
	    }else{
	        System.out.println("NOT READY");
	    }
        }
    }
