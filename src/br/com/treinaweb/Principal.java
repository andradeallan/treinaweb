package br.com.treinaweb;

public class Principal {

    public static void main (String[] args) {

        int a = 3;
        int b = 5;
        double resultadoDivisao = a / 5.0;
//        int c = 5;
//        int resultado = (a * b) + c;
//        System.out.println("O resultado de " + a + " x " + b + " + "+ c +" é " + resultado);
//        System.out.printf("O resultado de %d x %d + %d é %d", a, b, c, resultado);
        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d x %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d módulo %d = %d%n", a, b, a % b);
        System.out.printf("%d / %d = %f%n", a, b, resultadoDivisao);
    }
}

// git config --global user.email "allanpctec@gmail.com"
// git config --global user.name "@andradeallan"