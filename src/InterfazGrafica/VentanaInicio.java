/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfazGrafica;

import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Administrador
 */
public class  VentanaInicio {
    
    public static void main(String args[]){
        
    VentanaInit v=new VentanaInit();
    VentanaInit.setDefaultLookAndFeelDecorated(true);
       SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.FindingNemoSkin");
                SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSteelBlueTheme");
                new VentanaInit().setVisible(true);
    
    
}
}
