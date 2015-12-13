package br.com.sgp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.sgp.repository.DAO.SessaoDAO;

@Controller
public class IndexController {
	
	@Inject
    private Result result;

    private String nomeCliente;
	
	@Path("/")
	public void index() {

	}

}