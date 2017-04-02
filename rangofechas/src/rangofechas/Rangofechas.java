package rangofechas;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Rangofechas extends JPanel implements Serializable {

    private final com.toedter.calendar.JDateChooser fecha1;
    private final com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private boolean listo=false;
    
    public Rangofechas(){
        etiqueta1 = new javax.swing.JLabel(" ");
        fecha1 = new com.toedter.calendar.JDateChooser();
        etiqueta2 = new javax.swing.JLabel(" ");
        etiqueta2.setEnabled(false);
        fecha2 = new com.toedter.calendar.JDateChooser();
        fecha2.setEnabled(false);
        add(etiqueta1);
        
        add(fecha1);
        add(etiqueta2);
        add(fecha2);
        
        fecha1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                validacion(evt);
            }
        });
        
        fecha2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                validacion2(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiqueta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiqueta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqueta2)
                    .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
    
    public void setetiqueta1(String e){
        etiqueta1.setText(e);
    }
    public void setetiqueta2(String e){
        etiqueta2.setText(e);
    }
    
    
    
    private void validacion(java.beans.PropertyChangeEvent evt) { 
        
        if(fecha1.getDate()!=null){
            fecha2.setEnabled(true);
            etiqueta2.setEnabled(true);
            Calendar g= Calendar.getInstance();
            g.setTime(fecha1.getDate());
            g.add(Calendar.DATE, 1);
            fecha2.setDate(g.getTime());
        }else{
            fecha2.setEnabled(false);
            etiqueta2.setEnabled(false);
        }
    }  
    
    private void validacion2(java.beans.PropertyChangeEvent evt) {
     if((fecha1.getDate()!=null)&&(fecha2.getDate()!=null)){
     Calendar f= Calendar.getInstance();
            f.setTime(fecha1.getDate());
     
     Calendar f2= Calendar.getInstance();
            f2.setTime(fecha2.getDate());
        listo=true;
        if(!(f.before(f2))){
            f.add(Calendar.DATE, 1);
            fecha2.setDate(f.getTime());
        }
      }  
    }
    
     public Date getfecha1(){
        return fecha1.getDate();
    }
     
     public Date getfecha2(){
         if(listo){
             return fecha2.getDate();
         }
        return null;
    }
    
    
}
