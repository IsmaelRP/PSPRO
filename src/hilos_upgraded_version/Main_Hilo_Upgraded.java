package hilos_upgraded_version;

public class Main_Hilo_Upgraded {

    public static void main(String[] args) {

        Thread hilos[] = new Thread[11];

        for (int i=0;i<=10;i++){
            hilos[i] = new Thread(new Hilo_Upgraded(i));
            hilos[i].start();
        }
        for (int i=0;i<=10;i++){
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Han terminado todos los hilos");

    }

}
