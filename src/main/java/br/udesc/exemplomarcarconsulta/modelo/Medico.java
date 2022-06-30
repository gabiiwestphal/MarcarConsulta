package br.udesc.exemplomarcarconsulta.modelo;

import java.time.LocalDate;

/**
 *
 * @author mattheus
 */
public class Medico extends Pessoa {
    
    private String CRM;

    public Medico(String nome, String CPF, LocalDate dataNascimento, String CRM) {
        super(nome, CPF, dataNascimento);
        this.CRM = CRM;
    }

    public String getCRM() {
        return CRM;
    }


    @Override
    public String toString() {
        return "Medico{" + "Nome=" + getNome() + "CRM=" + CRM + '}';
    }
        
    
}
