/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ibrahim_Gökdemir;

/**
 *
 * @author ieren
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.JOptionPane;

public class exportEmployees extends JFrame {

    private JPanel mainPanel;
    private JLabel messageLabel;

    public exportEmployees() {
        super("Export Employee to File");
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        mainPanel.setPreferredSize(new Dimension(500, 300));
        pack();
        setLocationRelativeTo(null);

        setVisible(true);
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnexport = new JButton("Export Data");
        JButton btnhome = new JButton("Home Page");
        messageLabel = new JLabel();

        btnexport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnexportActionPerformed(e);
            }

        });
        btnhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnhomeActionPerformed(e);
            }

            private void btnhomeActionPerformed(ActionEvent e) {
                ManagerHome frmManagerHome = new ManagerHome();
                frmManagerHome.setVisible(true);
                exportEmployees.this.dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnexport);
        buttonPanel.add(btnhome);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Export the employees");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        

        btnexport.setPreferredSize(new Dimension(120, 32));
        btnhome.setPreferredSize(new Dimension(120, 32));

        title.setHorizontalAlignment(JLabel.CENTER);

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(messageLabel, BorderLayout.CENTER);

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
    }

    private void btnexportActionPerformed(ActionEvent evt) {

        String filePath = "/*your file*/";

        List<String> dataToWrite = DataFromDatabase();

        writeToFile(filePath, dataToWrite);

        List<String> readData = readFromFile(filePath);

        if (readData != null) {
            for (String line : readData) {
                System.out.println(line);
            }
        }
        messageLabel.setText("Data has been exported");

    }

    public static List<String> DataFromDatabase() {
        List<String> data = new ArrayList<>();

        String jdbcUrl = "";

        try (Connection connection = DriverManager.getConnection(jdbcUrl)) {
            String sql = "SELECT * FROM tblregister";
            try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
                while (resultSet.next()) {
                    String row = resultSet.getString("Name") + ","
                            + resultSet.getString("Surname") + ","
                            + resultSet.getString("PhoneNumber") + ","
                            + resultSet.getString("Address") + ","
                            + resultSet.getString("Password") + ","
                            + resultSet.getString("Email") + ","
                            + resultSet.getString("EmployeeType") + ","
                            + resultSet.getString("Gender");

                    data.add(row);

                }
            }
        } catch (SQLException e) {
            System.err.println("Error ing data from the database: " + e.getMessage());
        }

        return data;
    }

    public static void writeToFile(String filePath, List<String> data) {
        try {
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    public static List<String> readFromFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return lines;

        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
        return null;
    }
  

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exportEmployees().setVisible(true);
            }
        });
    }
}
