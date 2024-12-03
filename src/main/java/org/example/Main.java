package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();

        while(true){
            System.out.println("\n===== Gerenciador de Tarefas =====\n");
            System.out.println("1. Adicionar tarefas");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Editar tarefas");
            System.out.println("4. Remover tarefas");
            System.out.println("5. Concluir tarefas");
            System.out.println("6. Sair");

            System.out.println("Digite uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Capturar a quebra de linha do próximo input

            switch(opcao){
                case 1:
                    // Adicionar tarefa
                    System.out.println("Digite o título da tarefa");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite a descrição da tarefa:");
                    String descricao = scanner.nextLine();
                    gerenciadorTarefas.adicionarTarefa(titulo, descricao);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                   gerenciadorTarefas.listarTarefas();
                   break;
                case 3:
                    // Editar a tarefa
                    System.out.println("Digite Id da tarefa para editar: ");
                    int editarId = scanner.nextInt();
                    scanner.nextLine(); // Capturar enter
                    System.out.println("Digite o novo título da tarefa: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.println("Digite a nova descrição da tarefa");
                    String novaDescricao = scanner.nextLine();
                    gerenciadorTarefas.editarTarefa(editarId, novoTitulo, novaDescricao);
                    break;
                case 4:
                    // Remover a tarefa
                    System.out.println("Digite um Id para remover: ");
                    int excluirId = scanner.nextInt();
                    gerenciadorTarefas.concluirTarefa(excluirId);
                    break;
                case 5:
                    // Encerrar
                    System.out.println("Encerrando do programa");
                    scanner.close();
                    return; // Encerrar o programa
                default:
                    System.out.println("Opcão inválidas! Por favor, tente novamente.");
            }
        }
    }

}
