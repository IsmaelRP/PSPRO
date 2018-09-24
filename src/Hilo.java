public class Hilo implements Runnable{

    int num;

    Hilo(int num){
        this.num = num;
        Thread t = new Thread(this, "Tabla del " + num);
    }

    @Override
    public void run() {

        for (int i=0;i<=10;i++){
            System.out.printf("%s - %d * %d = %d\n",Thread.currentThread().getName(), num, i, num*i);
        }



    }
}
