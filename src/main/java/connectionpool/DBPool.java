package connectionpool;

import java.sql.Connection;

public interface DBPool {

    void init();

    Connection getConnection();

    void close(Connection conn);
}
