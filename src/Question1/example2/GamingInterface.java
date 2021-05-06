/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.example2;

/**
 *
 * @author Amulya Mallepalli
 */
public interface GamingInterface {
    String GAME_TYPE="ONLINE";
    
    public default String getGameType(){
        return GAME_TYPE;
    }
    
    int getNoOfPlayers();
    
}
