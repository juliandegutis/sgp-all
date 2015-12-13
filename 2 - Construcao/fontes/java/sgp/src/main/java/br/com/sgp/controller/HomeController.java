package br.com.sgp.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.sgp.repository.DAO.ProjetoDAO;
import br.com.sgp.repository.DAO.ReuniaoDAO;

@Controller
@Path("/home")
public class HomeController {
	
	@Inject
    private Result result;
	
	@Path("/")
	public void home() {
		ProjetoDAO daoP = new ProjetoDAO();
		ReuniaoDAO daoR = new ReuniaoDAO();
		result.include("projetosFinalizados", daoP.buscaProjetosFinalizados( 1L ) );
		result.include("projetosPendentes", daoP.buscaProjetosPendentes( 1L ) );
		result.include("reunioesAgendadas", daoR.buscaReunioesPendentes( 1L ) );
		result.include("listaReunioes", daoR.buscaReunioes( 1L ) );
	}
}
