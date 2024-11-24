package br.com.marcioviana.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        //if statement
        int idade = 45;

        if (idade >= 18) {
            System.out.println("Pode dirigir"); // condição é true
        } else if (idade < 18) {
            System.out.println("Não pode dirigir"); // primeira condição false e essa true
        } else {
            System.out.println("Outra opção"); // Nenhuma condiçao anterior é true
        }

        //operador ternário

        boolean canDrive = idade >= 18 ? true : false;

        System.out.println(canDrive);

    }

}

