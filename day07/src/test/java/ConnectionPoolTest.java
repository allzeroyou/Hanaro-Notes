import com.hana.frame.ConnectionPool;

import java.sql.SQLException;

public class ConnectionPoolTest {
    public static <Connection> void main(String[] args) {
        // try 밖으로 빼내기
        ConnectionPool cp = null;

        try {
            cp.create();
            System.out.println(cp.getSize());

            cp.create();
            System.out.println(cp.getSize());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //
    }
}
