package sistema.main;

import sistema.obras.Jogo;
import sistema.service.ObrasService;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        ObrasService gerenciador = new ObrasService();
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {

            System.out.println(" ------Backlog------");
            System.out.println("|1- Visualizar Obras \n|2- Inserir obras \n|3- Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    gerenciador.catalogo();
                    break;
                case 2:
                    gerenciador.inserirObras();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    rodando = false;
                    break;
                default:
                    System.out.println("Digite um valor válido.");
            }
        }
    }
}
//Adicionar opcao de remover obras -> FEITO

//Adicionar funçao de editar as informações de uma obra escolhida
