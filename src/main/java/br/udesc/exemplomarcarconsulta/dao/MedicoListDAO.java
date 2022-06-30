package br.udesc.exemplomarcarconsulta.dao;

import br.udesc.exemplomarcarconsulta.modelo.Medico;
import br.udesc.exemplomarcarconsulta.repositorio.MedicoRepositorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mattheus
 */
public class MedicoListDAO implements MedicoRepositorio{

    private static List<Medico> medicos = new ArrayList<>();
    
    @Override
    public void salvarMedico(Medico m) {
        medicos.add(m);
    }

    @Override
    public void recuperarMedico(String CPF) {
        
    }

    @Override
    public List<Medico> recuperarTodosMedicos() {
        return medicos;
    }
    
}
