package br.com.sgp.repository.model;

public class ProjetoTO {
	
	private Long idProjeto;
	private String nmProjeto;
	
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
}
