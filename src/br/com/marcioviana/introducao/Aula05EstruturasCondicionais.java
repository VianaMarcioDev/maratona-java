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

        //Switch

        byte dia = 5;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }

    }

}

