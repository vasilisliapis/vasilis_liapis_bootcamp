/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import interfaces.IGame;
import java.lang.Math;
/**
 *
 * @author George.Pasparakis
 */
public class Game extends Naming implements IGame {
    private Player[] players;
    
    public  Game() {
       System.out.println("Game 1");
    }
    
    public Game(String name, Player[] players) {
        this.setName(name);
        this.start(players);
    }
    
    public void start(Player[] players) {
        System.out.println(this.getName());
        System.out.println("Player " + players[0] + " plays against Player " + players[1]);
        this.players = players;
        this.playersMove(players, new Clock());
        
    }
    
    public void playersMove(Player[] players, Clock c) {
        // Player X plays move m against Player Y
        // 15" * 4 = 1' * 10 = 10' == 600"
        // 600" = 40 cycles, 20 cycles
        c.setTimer(600);
        for (int i = 0; i < 40; i++) {
            System.out.println("Player " + players[i%2] + " plays move " +
                                       players[i%2].moves(this) + 
                                   " against Player "+players[Math.abs(i%2-1)] );
            c.setTimer(c.getTimer()-15);
            System.out.println("Time is: " + c.getTimer());
            
        }
    }
}
