package br.com.sgp.repository.model;

public class HorasTO {
	
	private Long idProjeto;
	private Long idRecurso;
	private String nmRecurso;
	private String dtLanc;
	private Long vlHora;
	private String nmProjeto;
	
	public HorasTO() {
		
	}

	public Long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getDtLanc() {
		return dtLanc;
	}

	public void setDtLanc(String dtLanc) {
		this.dtLanc = dtLanc;
	}

	public Long getIdRecurso() {
		return idRecurso;
	}

	public void setIdRecurso(Long idRecurso) {
		this.idRecurso = idRecurso;
	}

	public Long getVlHora() {
		return vlHora;
	}

	public void setVlHora(Long vlHora) {
		this.vlHora = vlHora;
	}

	public String getNmProjeto() {
		return nmProjeto;
	}

	public void setNmProjeto(String nmProjeto) {
		this.nmProjeto = nmProjeto;
	}

	public String getNmRecurso() {
		return nmRecurso;
	}

	public void setNmRecurso(String nmRecurso) {
		this.nmRecurso = nmRecurso;
	}
}
