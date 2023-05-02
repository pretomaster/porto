/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculamedia;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CalculaMedia {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       CalculaMedia calcular = new CalculaMedia();

        System.out.println("Escolha a disciplina:");
        System.out.println("1 - Pratica");
        System.out.println("2 - Teorica");
        System.out.println("3 - Regular");
        System.out.println("4 - Regular 3 ano");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                calcular.recebeDadosPratica("Pratica");
                calcular.CalculaMediaPratica(opcao, opcao, opcao, opcao, opcao,opcao);
                calcular.exibeDadosPratica();
                break;
            case 2:
                calcular.recebeDadosTeorica("Teorica");
                calcular.CalculaMediaTeorica(opcao, opcao, opcao, opcao, opcao);
                calcular.exibeDadosTeorica();
                break;
            case 3:
                calcular.recebeDadosRegular("Regular");
                calcular.CalculaMediaRegular(opcao, opcao, opcao, opcao, opcao);
                calcular.exibeDadosRegular();
                break;
            case 4:
                calcular.recebeDadosRegular3ano("Regular 3 ano");
                calcular.CalculaMediaRegular3ano(opcao, opcao, opcao, opcao, opcao, opcao);
                calcular.exibeDadosRegular3ano();
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
    }
}
