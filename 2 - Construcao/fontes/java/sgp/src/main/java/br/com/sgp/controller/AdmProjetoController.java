package br.com.sgp.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
@Path("/admprojeto")
public class AdmProjetoController {
	@Inject
    private Result result;
	
	@Path("/")
	public void admprojeto() {
		
	}
}
