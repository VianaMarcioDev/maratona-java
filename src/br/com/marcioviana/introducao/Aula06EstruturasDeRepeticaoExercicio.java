package br.com.marcioviana.introducao;

public class Aula06EstruturasDeRepeticaoExercicio {
    public static void main(String[] args) {

        int contador = 0;
        while(contador < 1000000){
            if(contador % 2 == 0){
                System.out.println(contador);

            } contador++;

        }

        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


    }
}
