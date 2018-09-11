package br.com.treinaweb;

public class OutraEntrada {

    public static void main(String[] args) {
        TypoDeDados bancoDeDados = TypoDeDados.MYSQL;

        switch (bancoDeDados) {

            case MYSQL:
                break;

            case POSTRGRESQL:

        }

        System.out.println(bancoDeDados);
    }

}
