public class Hilo extends Thread{

    int[] miArray;
    int suma=0;

    public int getSuma() {

        return suma;
    }

    public Hilo(int[] paramArray){

        this.miArray = paramArray;

    }

    @Override
    public void run() {
        suma=0;
        for(int i=0; i<this.miArray.length; i++){

            suma = suma + this.miArray[i];

        }

    }
}
