package javaexemplos.classmath;

import java.text.SimpleDateFormat;

import java.util.Date;



public class Hora {
public static void main(String[] args) {
        // Define o formato de exibição da hora
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        while (true) {
            // Obtém a hora atual
            Date horaAtual = new Date();
            
            // Formata a hora atual para exibição
            String horaFormatada = formatoHora.format(horaAtual);
           
            // Imprime a hora atual
            System.out.println(horaFormatada);
            
            try {
                // Pausa o programa por 1 segundo
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

