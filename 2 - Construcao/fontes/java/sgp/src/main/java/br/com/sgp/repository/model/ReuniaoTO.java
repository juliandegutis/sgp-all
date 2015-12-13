package br.com.sgp.repository.model;

import java.util.Date;

public class ReuniaoTO {
	
	private Long idReuniao;
	private Long idProjeto;
	private Date dtInicio;
	private Long idRecurso;
	private Long vlHoras;
	private String nmLocal;
	private String dtHorario;
	private String nmProjeto;
	private String status; 
	
	public ReuniaoTO(){
		
	}

	public Long getIdReuniao() {
		return idReuniao;
	}

	public void setIdReuniao(Long idReuniao) {
		this.idReuniao = idReuniao;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public Long getIdRecurso() {
		return idRecurso;
	}

	public void setIdRecurso(Long idRecurso) {
		this.idRecurso = idRecurso;
	}

	public Long getVlHoras() {
		return vlHoras;
	}

	public void setVlHoras(Long vlHoras) {
		this.vlHoras = vlHoras;
	}

	public String getNmLocal() {
		return nmLocal;
	}

	public void setNmLocal(String nmLocal) {
		this.nmLocal = nmLocal;
	}

	public String getDtHorario() {
		return dtHorario;
	}

	public void setDtHorario(String dtHorario) {
		this.dtHorario = dtHorario;
	}

	public String getNmProjeto() {
		return nmProjeto;
	}

	public void setNmProjeto(String nmProjeto) {
		this.nmProjeto = nmProjeto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		if( status == 0 ) {
			this.status = "PENDENTE";
		} else {
			this.status = "FINALIZADA";
		}
		
	}
}
