/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chararray;

public class CharArray {

    public static void main(String[] args) {
         char[][] animals={{'c','a','t',' ',' ',' '},{'d','o','g',' ',' ',' '},{'p','i','g',' ',' ',' '},{'p','a','r','r','o','t'},{'r','a','b','b','i','t'}};
          for(int i=0;i<5;i++)
          {
                
                    if(animals[i][0]!='p')
                    {
                        for(int j=0;j<6;j++)
                        {
                            System.out.print(animals[i][j]);
                        }
                        System.out.println();
                    }
               
          }
    }
    
}
