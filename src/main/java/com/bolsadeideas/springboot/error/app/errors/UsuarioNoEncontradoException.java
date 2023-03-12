package com.bolsadeideas.springboot.error.app.errors;

public class UsuarioNoEncontradoException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public UsuarioNoEncontradoException(String id) {
		super("Usuario con ID: ".concat(id).concat(" No existe en el sistema"));
		// TODO Auto-generated constructor stub
	}

	
	
}
