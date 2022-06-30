package br.udesc.exemplomarcarconsulta.repositorio;

import br.udesc.exemplomarcarconsulta.modelo.Medico;
import java.util.List;

/**
 *
 * @author mattheus
 */
public interface MedicoRepositorio {
    public void salvarMedico(Medico m);
    public void recuperarMedico(String CPF);
    public List<Medico> recuperarTodosMedicos();
}
