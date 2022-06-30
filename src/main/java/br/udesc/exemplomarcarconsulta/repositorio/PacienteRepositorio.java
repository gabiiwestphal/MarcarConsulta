package br.udesc.exemplomarcarconsulta.repositorio;

import br.udesc.exemplomarcarconsulta.modelo.Paciente;
import java.util.List;

/**
 *
 * @author matth
 */

//DAO - Data Access Object
public interface PacienteRepositorio {
    public void salvarPaciente(Paciente p);
    public void recuperarPaciente(String CPF);
    public List<Paciente> recuperarTodosPacientes();
}
