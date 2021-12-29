package br.com.johnnysouto;

import br.com.johnnysouto.model.Gato;

public class SegundoPrograma {
    public static void main(String[] args) {
        /*int year = 2022;
        System.out.println("Bem-vindo a " + year + " !!!");*/

        Gato gato = new Gato("Tom", "Avermelhado", 3);

        System.out.println(gato);
    }
}
