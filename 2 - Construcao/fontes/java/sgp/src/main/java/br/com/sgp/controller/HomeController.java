package br.com.sgp.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;

@Controller
@Path("/home")
public class HomeController {
	@Path("/")
	public void home() {

	}
}
