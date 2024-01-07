/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ibrahim_Gökdemir_2221251372_cp2_p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ieren
 */
public class DBHelper {

    static final String connectionString = "jdbc:mysql://127.0.0.1:3306/company?user=root&password=12345";
    static Connection conn = null;

    public static boolean InsertNewEmployee(Employee Employee) {
    try {
        conn = DriverManager.getConnection(connectionString);

        String query = "INSERT INTO tblregister (name, surname, email, phonenumber, password, address, Employeetype, gender) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, Employee.name);
        pstmt.setString(2, Employee.surname);
        pstmt.setString(3, Employee.email);
        pstmt.setString(4, Employee.phonenumber);
        pstmt.setString(5, Employee.password);
        pstmt.setString(6, Employee.address);
        pstmt.setString(7, Employee.Employeetype);
        pstmt.setString(8, Employee.gender);

        pstmt.executeUpdate();
        conn.close();

        return true;
    } catch (SQLException ex) {
        Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
    }

    return false;
}


    public static Employee SignIn(String email, String password) {
        Employee rEmployee = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM tblregister WHERE email='" + email + "' AND password='" + password + "'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                rEmployee = new Employee();
                rEmployee.name = rs.getString("name");
                rEmployee.surname = rs.getString("surname");
                rEmployee.email = rs.getString("email");
                rEmployee.phonenumber = rs.getString("phonenumber");
                rEmployee.password = rs.getString("password");
                rEmployee.address = rs.getString("address");
                rEmployee.Employeetype = rs.getString("Employeetype");
            }
            conn.close();
        } catch (SQLException ex) {

            System.out.println(" error:" + ex.getMessage());
        }

        return rEmployee;

    }

    public static boolean InsertNewStaffAsset(StaffAsset StaffAsset) {
        try {
        conn = DriverManager.getConnection(connectionString);

       String query = "INSERT INTO tblstaffAsset "
        + "(name, serialno, acquisitiondate, value, category, fragile, snumber)"
        + "VALUES(?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, StaffAsset.name);
            pstmt.setString(2, StaffAsset.serialno);
            pstmt.setString(3, StaffAsset.acquisitiondate);
            pstmt.setString(4, StaffAsset.value);
            pstmt.setString(5, StaffAsset.category);
            pstmt.setString(6, StaffAsset.fragile);
            pstmt.setInt(7, StaffAsset.snumber);

            pstmt.executeUpdate();
        }

        conn.close();

        return true;
    } catch (SQLException ex) {
        Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
    }

    return false;
}

    public static boolean InsertNewManagerAsset(ManagerAsset ManagerAsset) {
        try {
        conn = DriverManager.getConnection(connectionString);

        String query = "INSERT INTO tblManagerAsset "
                + "(name, serialno, acquisitiondate, value, category, fragile, mnumber, managername)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, ManagerAsset.name);
            pstmt.setString(2, ManagerAsset.serialno);
            pstmt.setString(3, ManagerAsset.acquisitiondate);
            pstmt.setString(4, ManagerAsset.value);
            pstmt.setString(5, ManagerAsset.category);
            pstmt.setString(6, ManagerAsset.fragile);
            pstmt.setInt(7, ManagerAsset.mnumber);
            pstmt.setString(8, ManagerAsset.managername);

            pstmt.executeUpdate();
        }

        conn.close();

        return true;
    } catch (SQLException ex) {
        Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
    }

    return false;
}

    public static boolean isEmailExists(String email) {
        try {
            conn = DriverManager.getConnection(connectionString);

            String query = "SELECT COUNT(*) FROM tblregister WHERE email = ?";
            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setString(1, email);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int count = resultSet.getInt(1);
                        return count > 0;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();  
        }
        return false;
    }
}

