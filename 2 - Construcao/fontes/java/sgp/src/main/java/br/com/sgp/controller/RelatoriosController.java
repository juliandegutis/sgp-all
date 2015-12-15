package br.com.sgp.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.sgp.repository.DAO.ProjetoDAO;

@Controller
@Path("/relatorios")
public class RelatoriosController {
	@Inject
    private Result result;
	
	@Path("/")
	public void relatorios() {
		ProjetoDAO daoP = new ProjetoDAO();
		result.include("listaProjetos", daoP.buscaProjetos());
		result.include("listaHoras", daoP.buscaHorasLancadas());
	}
}
