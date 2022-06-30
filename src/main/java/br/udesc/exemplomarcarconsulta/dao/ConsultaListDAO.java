package br.udesc.exemplomarcarconsulta.dao;

import br.udesc.exemplomarcarconsulta.modelo.Consulta;
import br.udesc.exemplomarcarconsulta.repositorio.ConsultaRepositorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mattheus
 */
public class ConsultaListDAO implements ConsultaRepositorio {
    
    private static List<Consulta> consultas = new ArrayList<>();

    @Override
    public void salvarConsulta(Consulta c) {
        consultas.add(c);
    }

    @Override
    public void recuperarConsulta(String CPF) {
        
    }

    @Override
    public List<Consulta> recuperarTodosConsultas() {
        return consultas;
    }
    
}
