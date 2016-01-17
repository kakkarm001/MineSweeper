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
public class Number extends Box {
    int number;
    
    public void open(){
       // show content 
       //open more fields if number==0
    }
    
    public int getNumber(){
        return number;
    }
    
    public void setNumber(int number){
        this.number=number;
    }
    
    
    
}
