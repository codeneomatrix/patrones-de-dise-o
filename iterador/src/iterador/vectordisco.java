package iterador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class vectordisco implements agregado{
     File f = new File("D:\\NetBeansProjects\\iterador\\src\\iterador\\vector.txt");
     int t;
    public vectordisco(int valores){ 
       t=valores;
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);  
            for (int i = 0; i < t; i++){
                wr.append(0+"\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){};
    }
    
    @Override
    public int getValor(int pos){ 
        int s=-1;
        int c=0;
        try {
            if(f.exists()){
           BufferedReader Flee= new BufferedReader(new FileReader(f));
           String Slinea;
          
           while((Slinea=Flee.readLine())!=null) {  
            
            if(c==pos){
               s=Integer.parseInt(Slinea);
            }
            c++;
           }
     
           Flee.close();
         }else{
           System.out.println("Fichero No Existe");
         }
        } catch (Exception ex) {}
        return s; 
    }
    
    @Override
    public void colocar(int pos, int valor) {
        int[] s=new int[t];
        int c=0;
        try {
            if(f.exists()){
           BufferedReader Flee= new BufferedReader(new FileReader(f));
           String Slinea;
          
           while((Slinea=Flee.readLine())!=null) {  
            
            if(c==pos){
               s[c]=valor;
            }else{
                s[c]=Integer.parseInt(Slinea);
            }
            c++;
           }
     
           Flee.close();
         }else{
           System.out.println("Fichero No Existe");
         }
        } catch (Exception ex) {}
        
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw); 
            wr.write("");
            for (int i = 0; i < t; i++){
                wr.append(s[i]+"\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){};
        
    }

    @Override
    public int dimension(){ 
        return t;
    }

    @Override
    public iiterador creariterador() {
        return new iteradorconcreto(this); 
    }
    
}
