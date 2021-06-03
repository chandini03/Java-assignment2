/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class patternplus {
    public static void main(String[] args)
    {
        int n=5;
        for(int rows=1;rows<=n;rows++)
        {
            for(int plus=1;plus<=n-rows;plus++)
            {
                System.out.print("+");
            }
            for(int plus=1;plus<=rows;plus++)
            {
                System.out.print("/");
            }
            System.out.println();
        }
    }
    
}
