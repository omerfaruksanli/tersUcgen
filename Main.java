import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int value;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Değer Giriniz: ");
        value = inp.nextInt();

        System.out.println();
        for (int i = 0; i<=value-1; i++){
            for (int a = value; a>=value-i; a--){
                System.out.print(" ");
            }for (int b = 1; b<(value-i-1)*2; b++){
                System.out.print("0");
            }
            System.out.println();
        }






    }
}