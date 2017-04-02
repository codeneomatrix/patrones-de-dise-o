package strategia;
/**
 *
 * @author acer
 */
public class simetricovector implements modosimetrico{
    private datocompuesto e;
    
    simetricovector(datocompuesto yo){
     e=yo;   
    }
    
    public void simetrico(){
        System.out.print(""+(e.dato1())+"@"+(e.dato2()+180)+"\n");
    }
}
