public class Main {

    public static void main(String[] args) {


        int[] miArray = new int[100];

        for(int i=0; i<miArray.length; i++){
            miArray[i]=(int) (Math.random()*10);
        }

        Hilo h1 = new Hilo(miArray);

        h1.start();

        while(h1.isAlive()){

        }

        System.out.println(h1.getSuma());

    }
}
