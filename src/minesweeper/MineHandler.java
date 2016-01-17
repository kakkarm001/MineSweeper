/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Random;

/**
 *
 * @author Manish
 */
public class MineHandler {
    int fieldSize = 6;
    int numberOfMines = 8;
    Box[][] boxes = new Box[fieldSize][fieldSize]; 
    
    public void createMine(){

        Random r = new Random();
        for(int minesCreator=0; minesCreator<numberOfMines; minesCreator++){
            Mine tempMine = new Mine();
            int mineX = r.nextInt(fieldSize - 0);
            int mineY = r.nextInt(fieldSize - 0);
            tempMine.setRange(mineX, mineY);
            
            boxes[mineX][mineY] = tempMine;    
        }
          
        for(int x=0; x<fieldSize; x++){
            for(int y=0; y<fieldSize; y++){
                Number tempNum = new Number();
                tempNum.setRange(x,y);
                tempNum.setNumber(getNumberFromEnvironment(tempNum));//dousnt work if rang is not set

                
                boxes[x][y] = tempNum;
            } 
        }
        
        
    }
    
    public int getNumberFromEnvironment(Number number){
        
        if(number.getX()==0){
            
        }
        
            
            
            return 1;
        }
    
}
