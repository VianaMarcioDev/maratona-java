package br.com.marcioviana.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /*
        int = inteiros 32 bits
        double = ponto flutuante 64bits
        float = ponto flutuante 32 bits
        char = caracteres 2 bits
        byte = inteiros 8 bits
        short = inteiros = 16 bits
        long = inteiros = 64 bits
        boolean = true or false
         */

        char caractere = 65;
        System.out.println(caractere);
        //noinspection RedundantCast
        System.out.println((char)caractere); //redundância utilizada para fins de experimentção e visualização de como é o comportamento

        int idade = 28;
        System.out.println((double)idade);

        long age = 45L;
        System.out.println((int)age);
    }
}
