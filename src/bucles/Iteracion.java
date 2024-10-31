package bucles;

public class Iteracion {
    public static void main(String[] args) {
        //BUCLE FOR
        //i++....> i= 1+i;
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero: " + i);
        }
        System.out.println("**************************");
        //BUCLE WHILE
        int i = 0;
        while (i < 10) {
            System.out.println("Numero: " + i);
            i++;
        }
        System.out.println("**************************");
        //BUCLE DO WHILE
        int m = 0;
        do {
            System.out.println("Numero: " + m);
            m++;
        } while (m < 10);
    }
}

