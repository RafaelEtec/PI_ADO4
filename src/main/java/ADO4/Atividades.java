package ADO4;
import java.util.Scanner;
/**
   por Rafael Ferreira Goulart
**/
public class Atividades {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar agora?\n"
                + "Insira o número da atividade: ");
        int escolha = ent.nextInt();
        while (escolha < 1 || escolha > 2) {
            System.out.println("É possível escolher apenas 1 ou 2");
            escolha = ent.nextInt();
        }
        
        switch (escolha) {
            case 1:
                System.out.println(
                    "Utilizando a instrução switch escreva um programa que recebe um valor inteiro de\n" +
                    "1 a 7 e retorna o correspondente dia da semana. Considere que 1 corresponde a\n" +
                    "domingo, 2 a segunda-feira, ..., 7 a sábado. Além disso, no caso de uma entrada\n" +
                    "errada, como por exemplo 0, deve ser impresso “Valor inválido!”\n");
                Exercicio1();
                break;
            case 2:
                System.out.println(
                    "Implemente uma questão de múltipla escolha referente a alguma das outras\n" +
                    "disciplinas que você está cursando neste semestre. Primeiro deverá ser apresentado\n" +
                    "o enunciado da questão com as 5 opções/alternativas de resposta, que são (a), (b),\n" +
                    "(c), (d) e (e). Depois que o usuário escolher uma opção, se for a resposta correta\n" +
                    "deverá ser impresso “Resposta correta”, caso contrário “Resposta incorreta”.\n" +
                    "Utilize a instrução switch, invés de if, na implementação.\n");
                Exercicio2();
                break;
        }
    }
    
    public static void Exercicio1() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Insira um número"
                + "É necessário que seja de 1 à 7: ");
        int dia = ent.nextInt();
        while (dia < 1 || dia > 7) {
            System.out.println("É necessário inserir um número de 1 à 7!");
            dia = ent.nextInt();
        }
        
        switch (dia) {
            case 1:
                System.out.println("Este número corresponde ao Domingo!");
                break;
            case 2:
                System.out.println("Este número corresponde a Segunda-feira!");
                break;
            case 3:
                System.out.println("Este número corresponde a Terça-feira!");
                break;
            case 4:
                System.out.println("Este número corresponde a Quarta-feira!");
                break;
            case 5:
                System.out.println("Este número corresponde a Quinta-feira!");
                break;
            case 6:
                System.out.println("Este número corresponde a Sexta-feira!");
                break;
            case 7:
                System.out.println("Este número corresponde ao Sábado");
                break;
        }
    }
    
    public static void Exercicio2() {
        Scanner ent = new Scanner(System.in);
        String resp;
        System.out.println(
                  "Segundo o Sistema de Numeração Egípcio.\n"
                + "O número 1000 corresponde a: \n"
                + "(A) Bastão\n"
                + "(B) Rolo de Corda\n"
                + "(C) Peixe\n"
                + "(D) Flor de Lótus\n"
                + "(E) Homem");
        
        resp = ent.next();
        switch (resp.toLowerCase()) {
            case "a":
                System.out.println("Resposta Incorreta!");
                break;
            case "b":
                System.out.println("Resposta Incorreta!");
                break;
            case "c":
                System.out.println("Resposta Incorreta!");
                break;
            case "d":
                System.out.println("Resposta Correta!");
                break;
            case "e":
                System.out.println("Resposta Incorreta!");
                break;
        }
    }
}