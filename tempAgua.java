import java.util.Scanner;
public class tempAgua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8, temp9, temp10, temp11, temp12, media;

        do {
            System.out.println("Digite a temperatura 1 (entre 4 e 10): ");
            temp1 = scanner.nextDouble();
        } while (temp1 < 4 || temp1 > 10);

        do {
            System.out.println("Digite a temperatura 2 (entre 4 e 10): ");
            temp2 = scanner.nextDouble();
        } while (temp2 < 4 || temp2 > 10);

        do {
            System.out.println("Digite a temperatura 3 (entre 4 e 10): ");
            temp3 = scanner.nextDouble();
        } while (temp3 < 4 || temp3 > 10);

        do {
            System.out.println("Digite a temperatura 4 (entre 4 e 10): ");
            temp4 = scanner.nextDouble();
        } while (temp4 < 4 || temp4 > 10);

        do {
            System.out.println("Digite a temperatura 5 (entre 4 e 10): ");
            temp5 = scanner.nextDouble();
        } while (temp5 < 4 || temp5 > 10);

        do {
            System.out.println("Digite a temperatura 6 (entre 4 e 10): ");
            temp6 = scanner.nextDouble();
        } while (temp6 < 4 || temp6 > 10);

        do {
            System.out.println("Digite a temperatura 7 (entre 4 e 10): ");
            temp7 = scanner.nextDouble();
        } while (temp7 < 4 || temp7 > 10);

        do {
            System.out.println("Digite a temperatura 8 (entre 4 e 10): ");
            temp8 = scanner.nextDouble();
        } while (temp8 < 4 || temp8 > 10);

        do {
            System.out.println("Digite a temperatura 9 (entre 4 e 10): ");
            temp9 = scanner.nextDouble();
        } while (temp9 < 4 || temp9 > 10);

        do {
            System.out.println("Digite a temperatura 10 (entre 4 e 10): ");
            temp10 = scanner.nextDouble();
        } while (temp10 < 4 || temp10 > 10);

        do {
            System.out.println("Digite a temperatura 11 (entre 4 e 10): ");
            temp11 = scanner.nextDouble();
        } while (temp11 < 4 || temp11 > 10);

        do {
            System.out.println("Digite a temperatura 12 (entre 4 e 10): ");
            temp12 = scanner.nextDouble();
        } while (temp12 < 4 || temp12 > 10);

        media = (temp1 + temp2 + temp3 + temp4 + temp5 + temp6 + temp7 + temp8 + temp9 + temp10 + temp11 + temp12) / 12;
        System.out.println("A média das 12 temperaturas de hoje é: " + media + "º C");
        
        scanner.close();
    }
    
}
