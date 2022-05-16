package zapatillas;
import entidades.zapatillas;
import implementacion.Impltabas;

public class Zapatillas {
    public static void main(String[] args) {
        zapatillas c=new zapatillas();
        c.setProd_id("1");
        c.setProd_nombre("ari force");
        c.setProd_precio("200");
        c.setProd_marca("nike");
        
        zapatillas c2=new zapatillas();
        c2.setProd_id("2");
        c2.setProd_nombre("bambas");
        c2.setProd_precio("500");
        c2.setProd_marca("adidas");
        
        Impltabas ic=new Impltabas();
        ic.agregarzapatillas(c);
        ic.agregarzapatillas(c2);
        ic.reportezapatilla();
        
    
    }
}
