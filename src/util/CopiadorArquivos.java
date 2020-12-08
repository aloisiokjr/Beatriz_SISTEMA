/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author KLEYN
 */
public class CopiadorArquivos {

    public static void copia(String source, String destiny) {
        File fonte = new File(source);
        File destino = new File(destiny);
        try {
            realizaCopia(fonte, destino);
        } catch (IOException e) {
        }
    }

    private static void realizaCopia(File fonte, File destino) throws IOException {
        OutputStream out;
        try ( InputStream in = new FileInputStream(fonte)) {
            out = new FileOutputStream(destino);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
        }
        out.close();
    }
}
