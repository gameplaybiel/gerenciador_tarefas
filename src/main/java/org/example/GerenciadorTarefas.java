package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;
    private int idCounter; // Gerar um contador de id

    public GerenciadorTarefas(){
        tarefas = new ArrayList<>();
        idCounter = 1; // Iniciar o contador de IDs
    }

    // Adicionar tarefa
    public void adicionarTarefa(String titulo, String descricao){
        Tarefa novaTarefa = new Tarefa(idCounter, titulo, descricao, LocalDate.now(), false);
        tarefas.add(novaTarefa);
        idCounter++; // Incrementar a próxima tarefa
    }

    // Listar tarefas
    public void listarTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("Não há tarefas cadastradas na lista.");
        } else {
            for(Tarefa tarefa : tarefas){
                System.out.println(tarefa);
            }
        }
    }

    // Editar a tarefa
    public void editarTarefa(int id, String novoTitulo, String novaDescricao){
        for(Tarefa tarefa: tarefas){
            if(tarefa.getId() == id){
                tarefa.setTitulo(novoTitulo);
                tarefa.setDescricao((novaDescricao));
                System.out.println("Tarefa editada com sucesso!");
                return;
            }
        }
        System.out.println("Tarefa com Id " + id + " não existe ou não foi encontrada");
    }

    // Remover a tarefa
    public void removerTarefa(int id){
        Iterator<Tarefa> iterator = tarefas.iterator();
        while(iterator.hasNext()){
            Tarefa tarefa = iterator.next();
            if(tarefa.getId() == id){
                iterator.remove();
                System.out.println("Tarefa removida com sucesso!");
                return;
            }
        }
        System.out.println("Tarefa com Id " + id + " não existe ou não foi encontrada");
    }

    // Concluir a tarefa
    public void concluirTarefa(int id){
        for(Tarefa tarefa: tarefas){
            if(tarefa.getId() == id){
                tarefa.setConcluida(true);
                System.out.println("Tarefa concluída com sucesso!");
                return;
            }
        }
        System.out.println("Tarefa com Id " + id + " não existe ou não foi encontrada");
    }
}
