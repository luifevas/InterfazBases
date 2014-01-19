/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfazGrafica;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Luis Vasquez
 */
public class new_KeyListener implements KeyListener{
    int x;
    public new_KeyListener(int x){
        this.x=x;
    }
    @Override
    public void keyTyped(KeyEvent ke) {
        if(Character.isDigit(ke.getKeyChar()) && x==0){
            ke.consume();
        }
        if(Character.isLetter(ke.getKeyChar()) && x==1){
            ke.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
}
