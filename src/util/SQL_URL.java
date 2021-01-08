/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author KLEYN
 */
public class SQL_URL {
    //public static String url = "jdbc:sqlserver://localhost:14333;databaseName=Beatriz_SISTEMA;user=user;password=mastersys";
    public static String url = "jdbc:mysql://192.168.0.250/beatriz_sistema?user=beatriz&password=mastersys&useTimezone=true&serverTimezone=UTC";
    
    public static String getUrl(){
        return url;
    }
   
}
