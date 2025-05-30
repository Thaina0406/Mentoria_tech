import java.util.Scanner;

class aula2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque as notas:");
        System.out.print("Nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = scanner.nextDouble();
        System.out.print("Nota 4: ");
        double n4 = scanner.nextDouble();
        System.out.print("Nota 5: ");
        double n5 = scanner.nextDouble();
        System.out.print("Nota 6: ");
        double n6 = scanner.nextDouble();
        System.out.print("Nota 7: ");
        double n7 = scanner.nextDouble();
        System.out.print("Nota 8: ");
        double n8 = scanner.nextDouble();

        double Ps = (n1 + n2) / 2;
        double Sb = (n3 + n4) / 2;
        double Tb = (n5 + n6) / 2;
        double Ss = (n7 + n8) / 2;
        double MS = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8) / 8;

        System.out.printf("Média do 1º Bimestre: %.2f%n", Ps);
        System.out.printf("Média do 2º Bimestre: %.2f%n", Sb);
        System.out.printf("Média do 3º Bimestre: %.2f%n", Tb);
        System.out.printf("Média do 4º Bimestre: %.2f%n", Ss);
        System.out.printf("Média Final: %.2f%n", MS);

        scanner.close();
    }
}


