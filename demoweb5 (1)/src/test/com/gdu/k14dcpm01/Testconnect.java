import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.*;
public class TestConnection {
    @Test
    public void TestConnection(){
        String hostName = "localhost";
		String sqlInstanceName = "DESKTOP-5U7V004\\SINGSERVER";
		String database = "Cellphone";
		String userName = "sa";
		String password = "15142";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            if (conn.isValid(10)) { // kiểm tra kết nối trong vòng 10 giây
                System.out.println("Kết nối thành công đến CSDL!");
            } else {
                System.out.println("Kết nối thất bại đến CSDL!");
            }
        } catch (SQLException ex) {
            System.err.println("Lỗi: " + ex.getMessage());
        }
    }
}
