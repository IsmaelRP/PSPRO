package ejercicio_hora_upgraded_version;

import teclado.Teclado;

public class Main_Segundos {

    public static void main(String[] args) {

        Thread hilo = new Thread(new Hilo_Hora());

        hilo.start();

        System.out.printf("Presione ENTER para interrumpir el hilo\n\n");
        Teclado.leerString();
        hilo.interrupt();
        System.out.printf("\nSe ha terminado el hilo principal\n");
    }

}
