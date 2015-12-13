package br.com.sgp.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.sgp.repository.DAO.ReuniaoDAO;

@Controller
@Path("/reunioes")
public class ReunioesController {
	@Inject
    private Result result;

    private String nomeCliente;
	
	@Path("/")
	public void reunioes() {
		ReuniaoDAO daoR = new ReuniaoDAO();
		result.include("listaReunioes", daoR.buscaReunioes( 1L ) );
	}
}
