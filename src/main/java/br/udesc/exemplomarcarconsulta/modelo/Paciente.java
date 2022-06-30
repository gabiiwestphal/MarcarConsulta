package br.udesc.exemplomarcarconsulta.modelo;

import java.time.LocalDate;

/**
 *
 * @author matth
 */
public class Paciente extends Pessoa{
    
    boolean possuiPlano;

    public Paciente(String nome, String CPF, LocalDate dataNascimento) {
        super(nome, CPF, dataNascimento);
    }

    public Paciente(String nome, String CPF, LocalDate dataNascimento, boolean possuiPlano) {
        super(nome, CPF, dataNascimento);
        this.possuiPlano = possuiPlano;
    }
  

    public boolean isPossuiPlano() {
        return possuiPlano;
    }

    public void setPossuiPlano(boolean possuiPlano) {
        this.possuiPlano = possuiPlano;
    }  

    @Override
    public String toString() {
        return "Paciente{" + "Nome=" + getNome() + "CPF=" + getCPF() + '}';
    }
    
}
