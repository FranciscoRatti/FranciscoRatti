

import java.sql.*;

public class Consulta {
    public Consulta(){}

    public static final int UPDATE = 1;
    public static final int QUERY = 0;
    private ResultSet resultado;
    private DatabaseMetaData metaData;
    private boolean flag;

    public Consulta (int tipo, String consulta) {
        flag = true;
        if (tipo == 0) {
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection coneccion = DriverManager.getConnection("jdbc:ucanaccess://BaseDeDatos.accdb");
                Statement estado = coneccion.createStatement();
                resultado = estado.executeQuery(consulta);
                metaData = coneccion.getMetaData();

                coneccion.close();
                estado.close();
            } catch (SQLException | ClassNotFoundException e) {flag = false; e.printStackTrace();}
        } else if (tipo == 1) {
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection coneccion = DriverManager.getConnection("jdbc:ucanaccess://BaseDeDatos.accdb");
                Statement estado = coneccion.createStatement();
                estado.executeUpdate(consulta);
                metaData = coneccion.getMetaData();

                coneccion.close();
                estado.close();
            } catch (SQLException | ClassNotFoundException e) {flag = false; e.printStackTrace();}
        }
    }

    public ResultSet getResultado() {if (resultado == null) {return null;} else {return resultado;}}
    public DatabaseMetaData getMetaData() {return metaData;}
    public boolean getFlag() {return flag;}
}