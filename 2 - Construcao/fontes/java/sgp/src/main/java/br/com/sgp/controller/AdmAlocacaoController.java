package br.com.sgp.controller;

import java.text.ParseException;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.sgp.repository.DAO.ProjetoDAO;
import br.com.sgp.repository.DAO.RecursoDAO;
import br.com.sgp.repository.DAO.ReuniaoDAO;

@Controller
@Path("/admalocacao")
public class AdmAlocacaoController {
	
	@Inject
    private Result result;
	
	@Path("/")
	public void admalocacao() {
		ProjetoDAO daoP = new ProjetoDAO();
		RecursoDAO daoRec = new RecursoDAO();
		result.include("listaProjetos", daoP.buscaProjetos());
		result.include("listaRecursos", daoRec.buscaRecursos());
	}
	
	@Path("/cadastra")
	public void cadastra( Long idProjeto, Long idRecurso, String dtInicio, String dtFim ) throws ParseException {
		RecursoDAO daoRec = new RecursoDAO();
		daoRec.save(idProjeto, idRecurso, dtInicio, dtFim);
	}
}
