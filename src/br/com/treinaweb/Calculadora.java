package br.com.treinaweb;

public class Calculadora {

    public int somar() {
        int a = 2;
        int b = 2;
        if (verificar(a, b)) {
            return a + b;
        } else {
            return 0;
        }

    }

    public boolean verificar(int x, int y) {
        return x > 0 && y > 0;
    }
}
