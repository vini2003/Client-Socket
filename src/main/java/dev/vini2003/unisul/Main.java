package dev.vini2003.unisul;

import java.net.*;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        try {
            PrintWriter out;

            try (var servidor = new Socket("localhost", 4444)) {
                out = new PrintWriter(servidor.getOutputStream(), true);
            }//endereco e porta

            var mensagem = "";

            while (!mensagem.equals("fim")) {
                mensagem = JOptionPane.showInputDialog("Digite a Mensagem ou fim para sair");

                out.println(mensagem); //escreve a mensagem
            }
        } catch (IOException io) {
            System.err.println("Problemas de IO");
        }
    }
}