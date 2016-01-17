/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 *
 * @author Manish
 */
public class Box {
    private boolean flag= false; 
    private int rangeX;
    private int rangeY;
    
    public void open(){
        
    }
    
    public void flag(){
      flag = true;
    }

    public void setRange(int x, int y){
        rangeX=x;
        rangeY=y;
    }
    
    public int getX(){
        return this.rangeX;
    }
    
    public int getY(){
        return this.rangeY;
    }
    
}
