/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author acer
 */
public class singletonframe extends javax.swing.JFrame {
   private static singletonframe instancia;
   private static int numins=0;
   private static men panelm1;
   private javax.swing.JLabel jLabel1;
//static {
//instancia = new singletonclasico()
//}

singletonframe(){
    numins++;
    //panelm1 = new men();
    
       jLabel1 = new javax.swing.JLabel();
       jLabel1.setText(""+System.currentTimeMillis());
       
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        pack();
}

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
       instancia = null;
       } 

public static singletonframe getInstancia() {
    if(instancia == null) {
        instancia = new singletonframe();
    }
    instancia.setVisible(true);
    System.out.println("\n Se creó una instancia");
    return instancia;
}
public int numins(){
    return numins;
}
    
}
