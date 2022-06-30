package br.udesc.exemplomarcarconsulta.modelo;

import br.udesc.exemplomarcarconsulta.excecao.ConsultaException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mattheus
 */
public class Consulta implements Comparable<Consulta>{

    private LocalDateTime dataHora;
    private Medico medico;
    private Paciente paciente;

    private Consulta(LocalDateTime dataHora, Medico medico, Paciente paciente) throws ConsultaException {
        this.dataHora = dataHora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public static Consulta criarConsulta(LocalDateTime dataHora, Medico medico, Paciente paciente) throws ConsultaException {
        validarDataHoraConsulta(dataHora);
        validarDiaConsulta(dataHora);
        validarHorarioConsulta(dataHora);
        return new Consulta(dataHora, medico, paciente);
    }

    /*
        Verifica se a data e hora estão no passado
     */
    private static void validarDataHoraConsulta(LocalDateTime dataHora) throws ConsultaException {
        LocalDateTime dataHoraAgora = LocalDateTime.now();
        if (!dataHora.isAfter(dataHoraAgora)) {
            throw new ConsultaException("Tentativa de agendar consulta no passado");
        }
    }

    /*
        Verifica se a data é sábado ou domingo
     */
    private static void validarDiaConsulta(LocalDateTime dataHora) throws ConsultaException {
        DayOfWeek dayOfWeek = dataHora.getDayOfWeek();
        switch (dayOfWeek) {
            case SATURDAY:
                throw new ConsultaException("Tentantiva de agendar no sábado");
            case SUNDAY:
                throw new ConsultaException("Tentantiva de agendar no domingo");
            default:
        }
    }

     /*
        Verifica se o horário é antes das 09:00 ou depois das 18:00
     */
    private static void validarHorarioConsulta(LocalDateTime dataHora) throws ConsultaException {
        LocalTime horarioValidoInicial = LocalTime.of(9, 0, 0);
        LocalTime horarioValidoFinal = LocalTime.of(18, 0, 0);

        if (dataHora.toLocalTime().isBefore(horarioValidoInicial)) {
            throw new ConsultaException("Tentantiva de agendar antes das 09:00");
        }

        if (dataHora.toLocalTime().isAfter(horarioValidoFinal)) {
            throw new ConsultaException("Tentantiva de agendar após às 18:00");
        }
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDataFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataHora.format(formatter);
        return dataFormatada;
    }

    public String getHoraFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormatada = dataHora.format(formatter);
        return horaFormatada;
    }

    @Override
    public String toString() {
        return "data=" + getDataFormatada() + ", hora=" + getHoraFormatada() + ", medico=" + medico + ", paciente=" + paciente;
    }

    @Override
    public int compareTo(Consulta c) {
        if(this.dataHora.isAfter(c.getDataHora()))
            return 1;
        else
            return -1;
    }

}
