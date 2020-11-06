/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author KLEYN
 */
public class ToHashHex {
    
    public static String toHexSHA256 (String senhaRecebida) throws UnsupportedEncodingException, NoSuchAlgorithmException{
        String senhaHexSHA256 = null;
        
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigestSenha[] = algorithm.digest(senhaRecebida.getBytes("UTF-8"));
        
        StringBuilder hexStringSenha = new StringBuilder();
        for (byte b : messageDigestSenha) {
            hexStringSenha.append(String.format("%02X", 0xFF & b));
        }
        
        senhaHexSHA256 = hexStringSenha.toString();
        
        return senhaHexSHA256;
    }
    
    public void checkPassword (){
        Scanner ler = new Scanner(System.in);
        String valorLido;
        System.out.printf("Informe o valor a ser convertido: ");
        valorLido = ler.next();
        
       System.out.println("Valor convertido: "+valorLido);
    }

    
}

