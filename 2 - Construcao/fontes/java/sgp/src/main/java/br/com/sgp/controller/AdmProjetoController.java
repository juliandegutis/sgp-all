package br.com.sgp.controller;

import java.text.ParseException;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.sgp.repository.DAO.ProjetoDAO;
import br.com.sgp.repository.DAO.ReuniaoDAO;

@Controller
@Path("/admprojeto")
public class AdmProjetoController {
	@Inject
    private Result result;
	
	@Path("/")
	public void admprojeto() {
		
	}
	
	@Path("/cadastra")
	public void cadastra( String nmProjeto, String dtInicio ) throws ParseException {
		ProjetoDAO daoP = new ProjetoDAO();
		daoP.save(nmProjeto, dtInicio);
	}
}
