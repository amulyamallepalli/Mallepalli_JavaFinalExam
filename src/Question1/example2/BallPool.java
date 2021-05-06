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
public class BallPool extends OnlineGames implements GamingInterface {

    @Override
    public void playOnlineGame() {
        System.out.println("This is called 8 ball pool!!");
    }

    @Override
    public int getNoOfPlayers() {
        return 2;
    }
    
    @Override
    public String toString(){
        return "BallPool is an "+ GAME_TYPE +" Game. Number of players are "+
                this.getNoOfPlayers();
    }
}
 
    