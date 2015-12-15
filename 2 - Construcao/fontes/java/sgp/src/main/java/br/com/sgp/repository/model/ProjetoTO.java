package br.com.sgp.repository.model;

public class ProjetoTO {
	
	private Long idProjeto;
	private String nmProjeto;
	private String dtInicio;
	private String dtFim;
	private Long vlHoras;
	
	public ProjetoTO(){
		
	}

	public Long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getNmProjeto() {
		return nmProjeto;
	}

	public void setNmProjeto(String nmProjeto) {
		this.nmProjeto = nmProjeto;
	}

	public String getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}

	public String getDtFim() {
		return dtFim;
	}

	public void setDtFim(String dtFim) {
		this.dtFim = dtFim;
	}

	public Long getVlHoras() {
		return vlHoras;
	}

	public void setVlHoras(Long vlHoras) {
		this.vlHoras = vlHoras;
	}
}
