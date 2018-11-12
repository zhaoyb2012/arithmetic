package connectionpool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataBaseTest {
    static DBPool sqlServerPool = new SQLServerPool();
    public static void main(String[] args) throws Exception{
        sqlServerPool.init();

        for(int i=0;i<100;i++){
            test();
        }
    }

    private static void test() throws Exception{
        Connection conn  = sqlServerPool.getConnection();
        String sql = "show databases;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet resultSet = ps.executeQuery();
        System.out.println(resultSet);
        ps.close();
        sqlServerPool.close(conn);
    }
}
