package com.projeto1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Atividade01 {
	
	@GetMapping ("/")
	  public String index () {
		return "index.html";
	}
	@GetMapping ("/Compras")
	  public String compras () {
		return "Compras.html";
	}
	@GetMapping ("/Vendas")
	  public String vendas () {
		return "Vendas.html";
	}
	@GetMapping ("/Estoque")
	  public String estoque () {
		return "Estoque.html";
	}

	
	

}
