/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author BILLYS
 */
public class TicTacToe {
    
    static ArrayList<Integer> playerPositions=new ArrayList<Integer>();
    static ArrayList<Integer> pcPositions=new ArrayList<Integer>(); 
    
    public static int CheckWinner()
    {
        List topRow = Arrays.asList(1,2,3);
        List middleRow = Arrays.asList(4,5,6);
        List bottomRow = Arrays.asList(7,8,9);
        List leftColumn = Arrays.asList(1,4,7);
        List middleColumn = Arrays.asList(2,5,8);
        List rightColumn = Arrays.asList(3,6,9);
        List  cross1= Arrays.asList(1,5,9);
        List  cross2= Arrays.asList(3,5,7);
        List<List> winning=new ArrayList<List>();
        winning.add(topRow);
        winning.add(bottomRow);
        winning.add(middleRow);
        winning.add(leftColumn);
        winning.add(middleColumn);
        winning.add(rightColumn);
        winning.add(cross1);
        winning.add(cross2);
        for(List l:winning)
        {
            if(playerPositions.containsAll(l))
            {
                return 1;
            }
            if(pcPositions.containsAll(l))
            {
                return 2;
            }
        }
            
        return 0;
    }
    
    static boolean RandomCheck(int[] array1,int[] array2,int number)
    {
        for(int i=0;i<5;i++)
        {
            if(number==array1[i]||number==array2[i])
            {
                return false;
            }
        }
        return true;
    }
    static void PrintGameBoard(char[][] gameboard)
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(gameboard[i][j]);
            }
            System.out.println();
        }
      
    }   
    static void Move(char[][] gameboard,String user,int pos)
    {
        char symbol=' ';
        if(user.equals("player"))
        {
            symbol='X';
            playerPositions.add(pos);
        }
        else if(user.equals("pc"))
        {
            symbol='O';
            pcPositions.add(pos);
        }
        
        if(pos==1)
        {
            gameboard[0][0]=symbol;
        }
        else if(pos==2)
        {
            gameboard[0][2]=symbol;
        }
        else if(pos==3)
        {
            gameboard[0][4]=symbol;
        }
        else if(pos==4)
        {
            gameboard[2][0]=symbol;
        }
        else if(pos==5)
        {
            gameboard[2][2]=symbol;
        }
        else if(pos==6)
        {
            gameboard[2][4]=symbol;
        }
        else if(pos==7)
        {
            gameboard[4][0]=symbol;
        }
        else if(pos==8)
        {
            gameboard[4][2]=symbol;
        }
        else if(pos==9)
        {
            gameboard[4][4]=symbol;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r=new Random();
        int pos,i=0,random;
        char [][] gameboard={{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
        PrintGameBoard(gameboard);
        while(true)
        {
            System.out.println("choose a position from 1-9");
            Scanner sc=new Scanner(System.in);
            pos=sc.nextInt();
            Move(gameboard,"player",pos);
            PrintGameBoard(gameboard);
            if(CheckWinner()==1)
            {
                System.out.println("Congratulations you WIN!!!");
                break;
            }
            System.out.println("\n---***---***---***---***---***---\n");
            i++;
            System.out.println(i);
            if(i==5)
            {
                System.out.println("It's a tie !!!");
                break;
            }
            random=r.nextInt(9)+1;
            while(playerPositions.contains(random)||pcPositions.contains(random))
            {
                random=r.nextInt(9)+1;
            }
            Move(gameboard,"pc",random);
            PrintGameBoard(gameboard);
            if(CheckWinner()==2)
            {
                System.out.println("Sorry you LOSE.....");
                break;
            }
            
            
            
            
        }     
    }
    
}
