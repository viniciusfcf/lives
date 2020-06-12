package com.github.viniciusfcf.meetup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.microprofile.config.inject.ConfigProperty;

public class MeuPrimeiroServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
    @ConfigProperty(name = "meu.nome")
    String nome;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().print("Meu Primeiro Servlet "+nome);
    }

}