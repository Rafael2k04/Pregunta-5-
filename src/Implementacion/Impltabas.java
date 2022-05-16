package implementacion;
import conexion.ConectaDBSqlite;
import entidades.zapatillas;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Impltabas {
    ConectaDBSqlite cc=new ConectaDBSqlite();
    zapatillas cli=new zapatillas();
    
    ArrayList<zapatillas>listazapatillas = new ArrayList<>();
    
    public void agregarzapatillas(zapatillas zap){
        try {
            String query="insert into zapatillas values('"+zap.getProd_id()+"','"+zap.getProd_nombre()+"','"+zap.getProd_precio()+"','"+zap.getProd_marca()+"')";
            Statement st = cc.getConnect().createStatement();
            st.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void reportezapatilla(){
        try {
            String query="select * from zapatilla";
            Statement st = cc.getConnect().createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                zapatillas zap = new zapatillas();
                zap.setProd_id(rs.getString(1));
                zap.setProd_nombre(rs.getString(2));
                zap.setProd_precio(rs.getString(3));
                zap.setProd_marca(rs.getString(4));
                listazapatillas.add(zap);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
