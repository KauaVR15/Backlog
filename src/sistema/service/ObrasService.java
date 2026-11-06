//Aqui fica a parte logica do programa
package sistema.service;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import sistema.obras.*;

public class ObrasService {

    List<Jogo> listaJogos = new ArrayList<>();
    List<Filme> listaFilmes = new ArrayList<>();
    List<Livro> listaLivros = new ArrayList<>();


    Scanner scan = new Scanner(System.in);

    public void cadastroJogos(){

        while(true) {

            System.out.println("-----Cadastro de Jogos-----");

            System.out.println("Titulo: ");
            String tituloJogo = scan.nextLine();

            System.out.println("Ano de Lançamento: ");
            String anoLancamentoJogo = scan.nextLine();

            System.out.println("Anotação: ");
            String anotacaoJogo = scan.nextLine();

            System.out.println("Desenvolvedora: ");
            String desenvolvedoraJogo = scan.nextLine();

            System.out.println("Plataforma: ");
            String plataformaJogo = scan.nextLine();

            System.out.println("Horas campanha: ");
            Double horasCampanhaJogo = scan.nextDouble();
            scan.nextLine();

            Jogo novoJogo = new Jogo(tituloJogo, anoLancamentoJogo, anotacaoJogo, desenvolvedoraJogo, plataformaJogo, horasCampanhaJogo);

            listaJogos.add(novoJogo);

            System.out.println("Jogo adicionado com sucesso!");
            System.out.println("Você deseja continuar: ('S' / 'N')");
            String escolha = scan.nextLine();

            if(escolha.equals("N") || escolha.equals("n")) {
                break;
            }
            else if(escolha.equals("S") || escolha.equals("s")){
                continue;
            }
            else{
                System.out.println("Digite correto!");
                break;
            }

        }
    }

    public void cadastroFilmes(){

        while(true) {

            System.out.println("-----Cadastro de Filmes-----");

            System.out.println("Título: ");
            String tituloFilme = scan.nextLine();

            System.out.println("Ano de Lançamento: ");
            String anoLancamentoFilme = scan.nextLine();

            System.out.println("Anotação: ");
            String anotacaoFilme = scan.nextLine();

            System.out.println("Diretor: ");
            String diretorFilme = scan.nextLine();

            System.out.println("Genêro: ");
            String generoFilme = scan.nextLine();

            System.out.println("Duração(Minutos): ");
            Double duracaoFilme = scan.nextDouble();
            scan.nextLine();

            Filme novoFilme = new Filme(tituloFilme, anoLancamentoFilme, anotacaoFilme, diretorFilme, generoFilme, duracaoFilme);

            listaFilmes.add(novoFilme);

            System.out.println("Filme adicionado com sucesso!");
            System.out.println("Você deseja continuar: ('S' / 'N')");
            String escolha = scan.nextLine();

            if(escolha.equals("N") || escolha.equals("n")) {
                break;
            }
            else if(escolha.equals("S") || escolha.equals("s")){
                break;
            }
            else{
                System.out.println("Digite correto");
                break;
            }
        }
    }

    public void cadastroLivros(){

        while(true) {

            System.out.println("-----Cadastro de Livros-----");

            System.out.println("Título: ");
            String tituloLivro = scan.nextLine();

            System.out.println("Ano de Lançamento: ");
            String anoLancamentoLivro = scan.nextLine();

            System.out.println("Anotação: ");
            String anotacaoLivro = scan.nextLine();

            System.out.println("Autor: ");
            String autorLivro = scan.nextLine();

            System.out.println("Editora: ");
            String editoraLivro = scan.nextLine();

            System.out.println("Quantidade de paginas: ");
            String quantidadePaginasLivro = scan.nextLine();

            Livro novoLivro = new Livro(tituloLivro, anoLancamentoLivro, anotacaoLivro, autorLivro, editoraLivro, quantidadePaginasLivro);

            listaLivros.add(novoLivro);

            System.out.println("Livro adicionado com sucesso!");
            System.out.println("Você deseja continuar: ('S' / 'N')");
            String escolha = scan.nextLine();

            if(escolha.equals("N") || escolha.equals("n")) {
                break;
            }
            else if(escolha.equals("S") || escolha.equals("s")){
                break;
            }
            else{
                System.out.println("Digite correto");
                break;
            }
        }
    }

    public void listarJogos(){

        if(listaJogos.isEmpty()){

            System.out.println("A lista está vazia.");

        }else {


            System.out.println("-----Catálogo-----");

            for (Jogo j : listaJogos) {
                System.out.println("|" + (listaJogos.indexOf(j) + 1) + "- " + j.getTitulo());
            }
            System.out.println("|Escolha qual jogo deseja visualizar ou aperte '0' para sair.");
            int opcao = scan.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                return;
            }

            int escolha = opcao - 1;

            if (escolha >= 0 && escolha < listaJogos.size()) {
                System.out.println(listaJogos.get(escolha));
            } else {
                System.out.println("Nenhum jogo encontrado para esta opção.");
            }
        }
    }

    public void listarFilmes(){

        if(listaFilmes.isEmpty()){

            System.out.println("A lista está vazia.");

        }else {

            System.out.println("-----Catálogo-----");

            for (Filme f : listaFilmes) {
                System.out.println("|" + (listaFilmes.indexOf(f) + 1) + "- " + f.getTitulo());
            }
            System.out.println("|Escolha qual filme deseja visualizar ou aperte '0' para sair.");
            int opcao = scan.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                return;
            }

            int escolha = opcao - 1;

            if (escolha >= 0 && escolha < listaFilmes.size()) {
                System.out.println(listaFilmes.get(escolha));
            } else {
                System.out.println("Nenhum filme encontrado para esta opção.");
            }
        }
    }

    public void listarLivros(){

        if(listaLivros.isEmpty()){

            System.out.println("A lista está vazia.");

        }else {

            System.out.println("-----Catálogo-----");

            for (Livro l : listaLivros) {
                System.out.println("|" + (listaLivros.indexOf(l) + 1) + "- " + l.getTitulo());
            }
            System.out.println("|Escolha qual livro deseja visualizar ou aperte '0' para sair.");
            int opcao = scan.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                return;
            }

            int escolha = opcao - 1;

            if (escolha >= 0 && escolha < listaLivros.size()) {
                System.out.println(listaLivros.get(escolha));
            } else {
                System.out.println("Nenhum livro encontrado para esta opção.");
            }
        }
    }

    public void pesquisarJogo(){

        System.out.println("Digite o nome do jogo: ");
        String nomeJogo = scan.nextLine();

        if(nomeJogo.isEmpty()){
            System.out.println("O nome não pode ser vazio.");
        }

        boolean encontrado = false;

        for (Jogo j: listaJogos){

            if (j.getTitulo().equalsIgnoreCase(nomeJogo)){
                System.out.println(j);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Jogo não encontrado! Verifique se digitou corretamente.");
        }
    }

    public void pesquisarFilme(){

        System.out.println("Digite o nome do filme: ");
        String nomeFilme = scan.nextLine();

        if(nomeFilme.isEmpty()){
            System.out.println("O nome não pode ser vazio.");
        }

        for (Filme f: listaFilmes){

            if (f.getTitulo().equalsIgnoreCase(nomeFilme)){
                System.out.println(f);
            }else {
                System.out.println("Filme não encontrado! Verifique se digitou corretamente.");
            }
        }
    }

    public void pesquisarLivro(){

        System.out.println("Digite o nome do livro: ");
        String nomeLivro = scan.nextLine();

        if(nomeLivro.isEmpty()){
            System.out.println("O nome não pode ser vazio.");
        }

        for (Livro l: listaLivros){

            if (l.getTitulo().equalsIgnoreCase(nomeLivro)){
                System.out.println(l);
            }else {
                System.out.println("Livro não encontrado! Verifique se digitou corretamente.");
            }
        }
    }

    public void removerJogo(){

        if(listaJogos.isEmpty()){

            System.out.println("A lista está vazia.");

        }else{

            for (Jogo j : listaJogos) {
                System.out.println("|" + (listaJogos.indexOf(j) + 1) + "- " + j.getTitulo());
            }

            System.out.println("Digite o numero correspondente ao jogo que deseja remover:");
            int escolhaRemocao = scan.nextInt();
            scan.nextLine();

            int indice = escolhaRemocao - 1;

            if (indice >= 0 && indice < listaJogos.size()) {
                listaJogos.remove(indice);
                System.out.println("Jogo removido com sucesso!");
            } else {
                System.out.println("Nenhum jogo encontrado para remover.");
            }
        }
    }

    public void removerFilme(){

        if(listaFilmes.isEmpty()){

            System.out.println("A lista está vazia.");

        }else{

            for (Filme f : listaFilmes) {
                System.out.println("|" + (listaFilmes.indexOf(f) + 1) + "- " + f.getTitulo());
            }

            System.out.println("Digite o numero correspondente ao filme que deseja remover:");
            int escolhaRemocao = scan.nextInt();
            scan.nextLine();

            int indice = escolhaRemocao - 1;

            if (indice >= 0 && indice < listaFilmes.size()) {
                listaFilmes.remove(indice);
                System.out.println("Filme removido com sucesso!");
            } else {
                System.out.println("Nenhum lilme encontrado para remover.");
            }
        }
    }

    public void removerLivro(){

        if(listaLivros.isEmpty()){

            System.out.println("A lista está vazia.");

        }else{

            for (Livro l : listaLivros) {
                System.out.println("|" + (listaLivros.indexOf(l) + 1) + "- " + l.getTitulo());
            }

            System.out.println("Digite o numero correspondente ao livro que deseja remover:");
            int escolhaRemocao = scan.nextInt();
            scan.nextLine();

            int indice = escolhaRemocao - 1;

            if (indice >= 0 && indice < listaLivros.size()) {
                listaLivros.remove(indice);
                System.out.println("Livro removido com sucesso!");
            } else {
                System.out.println("Nenhum livro encontrado para remover.");
            }
        }
    }

    public void remover(){

        System.out.println("-----Remover-----");
        System.out.println("|1- Jogo \n|2- Filme \n|3- Livro \n|4- Voltar");
        int escolhaRemover =  scan.nextInt();
        scan.nextLine();

        switch(escolhaRemover){
            case 1:
                removerJogo();
                break;
            case 2:
                removerFilme();
                break;
            case 3:
                removerLivro();
                break;
            case 4:
                break;
            default:
                System.out.println("Digite um valor válido.");
        }



    }

    public void pesquisar(){

        System.out.println("-----Barra de Pesquisa-----");
        System.out.println("|1- Jogo \n|2- Filme \n|3- Livro \n|4- Voltar");
        int escolhaPesquisa =  scan.nextInt();
        scan.nextLine();

        switch(escolhaPesquisa){
            case 1:
                pesquisarJogo();
                break;
            case 2:
                pesquisarFilme();
                break;
            case 3:
                pesquisarLivro();
                break;
            case 4:
                break;
            default:
                System.out.println("Digite um valor válido.");
        }
    }

    public void catalogo(){
        System.out.println("-----Catálogo-----");
        System.out.println("|1- Jogo \n|2- Filme \n|3- Livro \n|4- Pesquisar \n|5- Remover \n|6- Voltar");

        int opcaoCatalogo = scan.nextInt();
        scan.nextLine();

        switch(opcaoCatalogo){
            case 1:
                listarJogos();
                break;
            case 2:
                listarFilmes();
                break;
            case 3:
                listarLivros();
                break;
            case 4:
                pesquisar();
                break;
            case 5:
                remover();
                break;
            case 6:
                break;
            default:
                System.out.println("Digite um valor válido.");
                break;
        }
    }

    public void inserirObras(){

        System.out.println("-----Opções-----");
        System.out.println("|1- Jogo \n|2- Filme \n|3- Livro \n|4- Voltar");

        int opcaoInserirObra = scan.nextInt();
        scan.nextLine();

        switch(opcaoInserirObra){
            case 1:
                cadastroJogos();
                break;
            case 2:
                cadastroFilmes();
                break;
            case 3:
                cadastroLivros();
                break;
            case 4:
                break;
        }
    }
}
