package gft.controller;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gft.controllerForm.AutenticacaoForm;
import gft.dto.security.TokenDTO;
import gft.services.AutenticacaoService;

@RestController
@RequestMapping("/v1/auth")
public class AutenticacaoController {
	
	@Autowired
	AutenticacaoService autenticacaoService;
	
	@PostMapping
	public ResponseEntity<TokenDTO> autenticar(@RequestBody AutenticacaoForm authForm) {
		
		try {
			return ResponseEntity.ok(autenticacaoService.autenticar(authForm));
			
		}catch(AuthenticationException ae) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		
		
	}

}
