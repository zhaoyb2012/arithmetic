package connectionpool;

import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;

@Data
public class SQLServerHandler {

    private static final String dbDriver = "";
    private static final String dbUrl = "";
    private static final String username = "";
    private static final String password= "";

    private Connection conn;

    public Connection buildConnection(){
        try {
            Class.forName(dbDriver);
            this.conn = DriverManager.getConnection(dbUrl,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.conn;
    }
}
