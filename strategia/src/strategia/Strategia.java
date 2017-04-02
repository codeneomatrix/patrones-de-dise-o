/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategia;

/**
 *
 * @author Neomatrix
 */
public class Strategia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        datocompuesto p1= new punto(1.0,2.0);
        p1.fijarsuma();
        
        datocompuesto p2= new punto(3.0,4.0);
        p2.fijarsuma();
        
        punto p3 =  (punto) p1.modosumar.sumar(p2);
        punto p4 =  (punto) p3.modoescalar.escala(2);
        System.out.print("p1: "+p1.escribir());
        System.out.print("p2: "+p2.escribir());
        System.out.print("p3: "+p3.escribir());
        System.out.print("p4: "+p4.escribir());
        p1.modosin.simetrico();
        p2.modosin.simetrico();
        p3.modosin.simetrico();
        p3.modorotar.rota(90);

        
        datocompuesto v1= new vector(1.0,2.0);
        v1.fijarsuma();
        
        datocompuesto v2= new vector(3.0,2.0);
        v2.fijarsuma();
        
        vector v3 = (vector) v1.modosumar.sumar(v2);
        vector v4 = (vector) v3.modoescalar.escala(2);
        System.out.print("v1: "+v1.escribir());
        System.out.print("v2: "+v2.escribir());
        System.out.print("v3: "+v3.escribir());
        System.out.print("v4: "+v4.escribir());
        v1.modosin.simetrico();
        v2.modosin.simetrico();
        v3.modosin.simetrico();
        v3.modorotar.rota(90);
        
        datocompuesto f1= new fraccion(5.0,10.0);
        f1.fijarsuma();
        
        fraccion f2= new fraccion(2.0,7.0);
        f2.fijarsuma();
        
        fraccion f3 = (fraccion) f1.modosumar.sumar(f2);
        fraccion f4 =  (fraccion) f3.modoescalar.escala(2);
        System.out.print("f1: "+f1.escribir());
        System.out.print("f2: "+f2.escribir());
        System.out.print("f3: "+f3.escribir());
        System.out.print("f4: "+f4.escribir());
        
        f1.modosin.simetrico();
        f2.modosin.simetrico();
        f3.modosin.simetrico();
        f4.modosin.simetrico();
        f4.modorotar.rota(90);
        
        
        
        
        datocompuesto t1= new tiempo(5,10);
        t1.fijarsuma();
        
        tiempo t2= new tiempo(2,7);
        t2.fijarsuma();
        
        tiempo t3 = (tiempo) t1.modosumar.sumar(t2);
        tiempo t4 =  (tiempo) t3.modoescalar.escala(20);
        System.out.print("t1: "+t1.escribir());
        System.out.print("t2: "+t2.escribir());
        System.out.print("t3: "+t3.escribir());
        System.out.print("t4: "+t4.escribir());
        
        t1.modosin.simetrico();
        t2.modosin.simetrico();
        t3.modosin.simetrico();
        t4.modosin.simetrico();
        t4.modorotar.rota(90);
        
        
    }
    
}
