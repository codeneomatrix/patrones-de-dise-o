/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strategia;

/**
 *
 * @author acer
 */
public class simetricofraccion implements modosimetrico{
    private datocompuesto e;
    
    simetricofraccion(datocompuesto yo){
     e=yo;   
    }
    
    public void simetrico(){
       /* if((e.dato1()%2==0)&&(e.dato2()%2==0)){
            System.out.print("" +e.dato1()+ "/"+e.dato2()+"-->" +e.dato1()/2+ "/"+e.dato2()/2+"\n");
        }
        
       if((e.dato1()%3==0)&&(e.dato2()%3==0)){
            System.out.print("" +e.dato1()+ "/"+e.dato2()+"-->" +e.dato1()/3+ "/"+e.dato2()/3+"\n");
        }
        
        if((e.dato1()%5==0)&&(e.dato2()%5==0)){
            System.out.print("" +e.dato1()+ "/"+e.dato2()+"-->" +e.dato1()/5+ "/"+e.dato2()/5+"\n");
        }
        
        if((e.dato1()%7==0)&&(e.dato2()%7==0)){
            System.out.print("" +e.dato1()+ "/"+e.dato2()+"-->" +e.dato1()/7+ "/"+e.dato2()/7+"\n");
        }*/
        
        System.out.print("operacion no aplicable\n");
        //System.out.print("" +e.dato1()+ "/"+e.dato2()+"\n");
         
    }
}
