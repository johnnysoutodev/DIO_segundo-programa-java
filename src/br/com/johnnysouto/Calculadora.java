package br.com.johnnysouto;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.im);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        double dividir = dividir(a, b);
        double multiplicar = multiplicar(a, b);

        System.out.println(somar);
        System.out.println(subtrair);
        System.out.println(dividir);
        System.out.println(multiplicar);

    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }

    public static double multiplicar(double a, double b){
        return a / b;
    }


}
