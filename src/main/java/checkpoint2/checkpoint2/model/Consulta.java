package checkpoint2.checkpoint2.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta extends AbstractEntity  {
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Profissional profissional_id;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Paciente paciente_id;
	
	@Column(nullable = false)
	private LocalDateTime data_consulta;
	
	@Column(nullable = false)
	private Status status_consulta;
	private double quantidade_horas;
	private double valor_consulta;
	
	
	public Profissional getProfissional_id() {
		return profissional_id;
	}
	public void setProfissional_id(Profissional profissional_id) {
		this.profissional_id = profissional_id;
	}
	public Paciente getPaciente_id() {
		return paciente_id;
	}
	public void setPaciente_id(Paciente paciente_id) {
		this.paciente_id = paciente_id;
	}
	public LocalDateTime getData_consulta() {
		return data_consulta;
	}
	public void setData_consulta(LocalDateTime data_consulta) {
		this.data_consulta = data_consulta;
	}
	public Status getStatus_consulta() {
		return status_consulta;
	}
	public void setStatus_consulta(Status status_consulta) {
		this.status_consulta = status_consulta;
	}
	public double getQuantidade_horas() {
		return quantidade_horas;
	}
	public void setQuantidade_horas(double quantidade_horas) {
		this.quantidade_horas = quantidade_horas;
	}
	public double getValor_consulta() {
		return valor_consulta;
	}
	public void setValor_consulta(double valor_consulta) {
		this.valor_consulta = valor_consulta;
	}
	
	
	
}
