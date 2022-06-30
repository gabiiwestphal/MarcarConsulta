package br.udesc.exemplomarcarconsulta.modelo;

import java.time.LocalDate;

/**
 *
 * @author mattheus
 */
public abstract class Pessoa implements Comparable<Pessoa>{
   
    private String nome;
    private String CPF;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String CPF, LocalDate dataNascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public int compareTo(Pessoa p) {
        return this.CPF.compareTo(p.getCPF());
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", CPF=" + CPF + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
}
