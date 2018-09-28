package ejercicio_hora_upgraded_version;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Hilo_Hora implements Runnable {
    @Override
    public void run() {
        Date date;
        DateFormat simplyFormat = new SimpleDateFormat("HH:mm:ss");

        while (!Thread.currentThread().isInterrupted()){
            date = new Date();
            System.out.printf("Hora: %s\n", simplyFormat.format(date));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.printf("Se me ha interrumpido a través del catch");
                return;
            }
        }
        System.out.printf("Se me ha interrumpido a través de la condición del while");
    }
}
