package com.bolsadeideas.springboot.error.app.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bolsadeideas.springboot.error.app.errors.UsuarioNoEncontradoException;

@ControllerAdvice // Anotacion que captura y maneja errores
public class ErrorHandlerController {
	
	
	@ExceptionHandler({ArithmeticException.class}) // captura la excepcion en especifico para realizar el respectivo return
	public String aritmeticaError(ArithmeticException ex, Model model) {
		model.addAttribute("error", "Error de aritmetica");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		
		return "error/generica";
	}
	
	
	@ExceptionHandler(NumberFormatException.class)
	public String numeroFormatoError(NumberFormatException ex, Model model) {
		
		model.addAttribute("error", "Formato numero invalido");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		
		return "error/numero-formato";
	}
	
	@ExceptionHandler(UsuarioNoEncontradoException.class)
	public String usuarioNoEncontradoExceptionr(UsuarioNoEncontradoException ex, Model model) {
		
		model.addAttribute("error", "Usuario no encontrado");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		
		return "error/usuario";
	}
	
	
	
	

}
