package connectionpool;

import com.google.common.collect.Lists;

import java.sql.Connection;
import java.util.LinkedList;

public class SQLServerPool implements DBPool{

    public static final int minSize = 1;
    public static final int maxSize = 10;

    private static final LinkedList<Connection> pools = Lists.newLinkedList();
    SQLServerHandler handler = new SQLServerHandler();
    @Override
    public void init() {
        Connection conn = null;
        try{
            for(int i = 0;i<maxSize;i++){
                conn = handler.buildConnection();
                pools.add(conn);
            }
        }catch (Exception ex){

        }
    }

    @Override
    public Connection getConnection() {
        Connection conn = null;
        if(pools.size()==0){
            conn = handler.buildConnection();
        }else{
            conn = pools.remove();
        }
        return conn;
    }

    @Override
    public void close(Connection conn) {
        if(pools.size()<maxSize){
            pools.add(conn);
        }
    }
}
