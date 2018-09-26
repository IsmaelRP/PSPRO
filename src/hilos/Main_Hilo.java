package hilos;

public class Main_Hilo {

    public static void main(String[] args) {

        Thread hilos;

        for (int i=0;i<10;i++){
            hilos = new Thread(new Hilo(i));
            hilos.start();
        }




    }

}
