package br.com.sgp.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.sgp.repository.DAO.ProjetoDAO;
import br.com.sgp.repository.DAO.ReuniaoDAO;
import br.com.sgp.repository.DAO.SessaoDAO;

@Controller
@Path("/home")
public class HomeController {
	
	@Inject
    private Result result;
	
	@Path("/")
	public void home() {
		ProjetoDAO daoP = new ProjetoDAO();
		ReuniaoDAO daoR = new ReuniaoDAO();
		SessaoDAO daoS = new SessaoDAO();
		result.include("projetosFinalizados", daoP.buscaProjetosFinalizados( daoS.buscaRecursoSessao() ) );
		result.include("projetosPendentes", daoP.buscaProjetosPendentes( daoS.buscaRecursoSessao() ) );
		result.include("reunioesAgendadas", daoR.buscaReunioesPendentes( daoS.buscaRecursoSessao() ) );
		result.include("listaReunioes", daoR.buscaReunioes( daoS.buscaRecursoSessao() ) );
	}
}
