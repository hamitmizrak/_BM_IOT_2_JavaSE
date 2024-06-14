package iot;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class IoTExample {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/iot_db";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            while (true) {
                // Sahte ışık seviyesi verisi üretimi
                Random rand = new Random();
                int lightLevel = rand.nextInt(1000); // 0 ile 1000 arasında rastgele ışık seviyesi

                // Veritabanına veri ekleme
                String insertSQL = "INSERT INTO air_quality_data (air_quality) VALUES (?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                    pstmt.setInt(1, lightLevel);
                    pstmt.executeUpdate();
                    System.out.println("Inserted light level: " + lightLevel);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                // 5 saniye bekleme
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}