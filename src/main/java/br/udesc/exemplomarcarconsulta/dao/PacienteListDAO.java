package br.udesc.exemplomarcarconsulta.dao;

import br.udesc.exemplomarcarconsulta.modelo.Paciente;
import java.util.ArrayList;
import java.util.List;
import br.udesc.exemplomarcarconsulta.repositorio.PacienteRepositorio;

/**
 *
 * @author matth
 */
public class PacienteListDAO implements PacienteRepositorio {

    private static List<Paciente> pacientes = new ArrayList<>();
    
    
    @Override
    public void salvarPaciente(Paciente p) {
        pacientes.add(p);
    }

    @Override
    public void recuperarPaciente(String CPF) {
        
    }

    @Override
    public List<Paciente> recuperarTodosPacientes() {
        return pacientes;
    }
    
}
