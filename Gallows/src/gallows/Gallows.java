/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallows;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author BILLYS
 */
public class Gallows {
    //it prints Gallow when you lose lives
    
    static void PrintGallow(int lives)
    {
        
        char[][] gallow={{' ','_','_','_',' '},{' ','|',' ','|',' '},{' ','0',' ','|',' '},{' ',' ',' ','|',' '},{' ',' ',' ','|',' '},{' ',' ','_','|','_'}};
        System.out.println("\nBecarful of the Galllow !!\n");
        if(lives==3)
        {
            gallow[3][1]='|';
        }
        if(lives==2)
        {
            gallow[3][1]='|';
            gallow[3][0]='/';
        }
        if(lives==1)
        {
            gallow[3][1]='|';
            gallow[3][0]='/';
            gallow[3][2]='\\';
        }
        if(lives==0)
        {
            gallow[3][1]='|';
            gallow[3][0]='/';
            gallow[3][2]='\\';
            gallow[4][0]='/';
            gallow[4][2]='\\';
        }
          for(int i=0;i<6;i++)
          {
              for(int j=0;j<5;j++)
              {
                  System.out.print(gallow[i][j]);
              }
              System.out.println();
          }
          System.out.print("You lose one life...");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // words initialization
        ArrayList<String> words=new ArrayList<String>();
        words.add("monday");
        words.add("perception");
        words.add("knife");
        words.add("yellow");
        words.add("anniversary");
        String[] board=new String[40];
        Scanner sc=new Scanner(System.in);
        char letter;
        int random,correctLetters=0,wrongLetters=0,temp,lives=5;
        Random r=new Random();
        random=r.nextInt(5);
        //gets a random word from words,counts its letters and prints "_" for every letter
        for(int i=0;i<words.get(random).length();i++)
        {
            board[i]="_ ";
            System.out.print(board[i]);
        }
        while(true)
        {
            System.out.println("\nGuess a letter!!");
            letter=sc.next().charAt(0);
            temp=correctLetters;
            for(int i=0;i<words.get(random).length();i++)
            {
                if(words.get(random).charAt(i)==letter)
                {
                     board[i]=letter+" ";
                     correctLetters++;
                }
                
                System.out.print(board[i]);
            }
            if(correctLetters==temp)
            {
                wrongLetters++;
                System.out.println();
                PrintGallow(lives-wrongLetters);
            }
            if(wrongLetters==5)
            {
                System.out.println("You lost all your lives ....GAME OVER!!!");
                break;
            }
            if(correctLetters==words.get(random).length())
            {
                System.out.println("\nYou Win!!!");
                break;
            }
        }
        
        
    }
    
}
