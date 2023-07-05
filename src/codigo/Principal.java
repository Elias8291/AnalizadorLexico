/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.io.File;

/**
 *
 * @author Abisai
 */
public class Principal {

    public static void main(String[] args) {
        String ruta = "C:/Users/jacqu/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/lexer.flex";
        generatedLexer(ruta);
    }

    public static void generatedLexer(String ruta) {
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);

    }
}
