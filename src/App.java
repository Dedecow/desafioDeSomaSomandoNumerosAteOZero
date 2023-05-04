import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0){
            soma = soma + x;
            x= sc.nextInt();
            
        }
        System.out.print(soma);
        sc.close();
    }
}
