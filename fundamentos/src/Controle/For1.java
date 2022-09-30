package Controle;
public class For1 {
    public static void main(String[] args) {



        for(int count = 1;count <= 10; count++){
            System.out.printf("i = %d\n", count);
        }
        int x = 1;
        for(;x < 10;) {
            System.out.println("x = " + x);
            x++;
        }
        //laço infinito!!!
        //for(;true;) {
        //   System.out.println("FIM!!!");
        //}
    }
}
