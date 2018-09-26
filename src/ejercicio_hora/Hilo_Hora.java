package ejercicio_hora;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hilo_Hora implements Runnable {
    @Override
    public void run() {
        Date date;
        DateFormat simplyFormat = new SimpleDateFormat("HH:mm:ss");

        for (int i=0;i<10;i++){
            date = new Date();
            System.out.printf("Hora: %s\n", simplyFormat.format(date));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
