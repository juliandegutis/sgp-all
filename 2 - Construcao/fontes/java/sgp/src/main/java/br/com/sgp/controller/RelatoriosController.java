package br.com.sgp.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
@Path("/relatorios")
public class RelatoriosController {
	@Inject
    private Result result;

    private String nomeCliente;
	
	@Path("/")
	public void relatorios() {

	}
}
