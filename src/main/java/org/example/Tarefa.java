package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private boolean concluida;

    // Construtor
    public Tarefa(int id, String titulo, String descricao, LocalDate dataCriacao, boolean concluida) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.concluida = concluida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Título: " + titulo + ", Descrição: " + descricao +
                ", Criada em: " + dataCriacao + ", Concluída: " + (concluida ? "Sim" : "Não");
    }
}