package br.com.sgp.controller;

import java.text.ParseException;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.sgp.repository.DAO.ProjetoDAO;
import br.com.sgp.repository.DAO.ReuniaoDAO;

@Controller
@Path("/admreuniao")
public class AdmReuniaoController {

	@Inject
    private Result result;
	
	@Path("/")
	public void admreuniao() {	
		ProjetoDAO daoP = new ProjetoDAO();
		result.include("listaProjetos", daoP.buscaProjetos());
	}
	
	
	@Path("/cadastra")
	public void cadastra( String nmLocal, String dtInicio, String dtHorario, Long idProjeto ) throws ParseException {
		ReuniaoDAO daoR = new ReuniaoDAO();
		daoR.save(nmLocal, dtInicio, dtHorario, idProjeto);
	}
}
