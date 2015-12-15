package br.com.sgp.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.sgp.repository.DAO.ProjetoDAO;
import br.com.sgp.repository.DAO.SessaoDAO;

@Controller
@Path("/projetos")
public class ProjetosController {
	@Inject
    private Result result;
	
	@Path("/")
	public void projetos() {
		ProjetoDAO daoP = new ProjetoDAO();
		SessaoDAO daoS = new SessaoDAO();
		result.include("listaProjetos", daoP.buscaProjetosRecurso(daoS.buscaRecursoSessao()) );
	}
	
	@Path("/lancaHoras")
	public void lancaHoras( Long idProjeto, String dataLanc, Long horasLanc ) {
		ProjetoDAO daoP = new ProjetoDAO();
		SessaoDAO daoS = new SessaoDAO();
		daoP.lancarHoras( idProjeto, daoS.buscaRecursoSessao() , dataLanc, horasLanc );
	}
}
