package ejercicio_hora;

public class Main_Segundos {

    public static void main(String[] args) {


        Thread hilo = new Thread(new Hilo_Hora());

        try {
            hilo.start();
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("\nSe terminó");
    }

}
