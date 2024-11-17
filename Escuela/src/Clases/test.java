/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.SQLException;
public class test {
    public static void main(String[] args) {
        try (Connection conn = Conexion.getConnection () ) {
            if (conn != null) {
                System.out.println("Conexion exitosa con phpMyAdmin.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
