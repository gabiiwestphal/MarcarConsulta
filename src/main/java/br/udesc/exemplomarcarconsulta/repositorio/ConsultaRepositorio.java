package br.udesc.exemplomarcarconsulta.repositorio;

import br.udesc.exemplomarcarconsulta.modelo.Consulta;
import java.util.List;

/**
 *
 * @author mattheus
 */
public interface ConsultaRepositorio {
    public void salvarConsulta(Consulta c);
    public void recuperarConsulta(String CPF);
    public List<Consulta> recuperarTodosConsultas();
}
