package gft;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gft.entities.Atendimento;
import gft.entities.AtendimentoGato;
import gft.entities.Cachorro;
import gft.entities.Cliente;
import gft.entities.Endereco;
import gft.entities.Gato;
import gft.entities.Medico;
import gft.entities.Perfil;
import gft.entities.Usuario;
import gft.repository.AtendimentoGatoRepository;
import gft.repository.AtendimentoRepository;
import gft.repository.CachorroRepository;
import gft.repository.ClienteRepository;
import gft.repository.GatoRepository;
import gft.repository.MedicoRepository;
import gft.repository.PerfilRepository;
import gft.repository.UsuarioRepository;

@SpringBootApplication
public class ApiPetshopApplication implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private CachorroRepository cachorroRepository;
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@Autowired
	private AtendimentoRepository atendimentoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PerfilRepository perfilRepository;
	
	@Autowired
	private GatoRepository gatoRepository;
	
	@Autowired
	private AtendimentoGatoRepository atendimentoGato;

	public static void main(String[] args) {
		SpringApplication.run(ApiPetshopApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	// ----------------------------------- USUARIOS ------------------------------------------	
		
		Perfil p1 = new Perfil();
		p1.setNome("Admin");
		
		Perfil p2 = new Perfil();
		p2.setNome("Usuario");
		
		perfilRepository.save(p1);
		perfilRepository.save(p2);
		
		Usuario u1 = new Usuario();
		u1.setEmail("math@gmail.com");
		u1.setSenha("$2a$10$Pbne8tN8kOB23NcVcEAgSukgeOzFv9hvkllL/QQSzCSQKJKRqQjIG");
		u1.setPerfil(p1);
		
		usuarioRepository.save(u1);
		
		Usuario u2 = new Usuario();
		u2.setEmail("usu@gmail.com");
		u2.setSenha("$2a$10$hsj.mo0/BMORGkwb2Jw6reY/l7RRjdetuwbmYWBy9BCVS1afDZW4u");
		u2.setPerfil(p2);
		
		usuarioRepository.save(u2);
		
		
	// ----------------------------------- ENDEREÇOS ------------------------------------------	
		Endereco e1 = new Endereco();
		e1.setLogradouro("Rua Nascimento");
		e1.setNumero("758");
		e1.setComplemento("Apartamento");
		
		Endereco e2 = new Endereco();
		e2.setLogradouro("Rua Nazare");
		e2.setNumero("598");
		e2.setComplemento("Casa de fundo");
		
		Endereco e3 = new Endereco();
		e3.setLogradouro("Rua Benjamin");
		e3.setNumero("23");
		e3.setComplemento("Casa Portao Branco");
		
		Endereco e4 = new Endereco();
		e4.setLogradouro("Rua Recomeço");
		e4.setNumero("159");
		e4.setComplemento("Casa com Terreno do lado");
		
		Endereco e5 = new Endereco();
		e5.setLogradouro("Rua Bem me quer");
		e5.setNumero("1789");
		e5.setComplemento("Casa");
		
		Endereco e6 = new Endereco();
		e6.setLogradouro("Rua Tonho");
		e6.setNumero("951");
		e6.setComplemento("Portao Preto");
		
		Endereco e7 = new Endereco();
		e7.setLogradouro("Rua Santa Fe");
		e7.setNumero("1478");
		e7.setComplemento("Apartamento");

		Endereco e8 = new Endereco();
		e8.setLogradouro("Rua Rodrigues");
		e8.setNumero("1596");
		e8.setComplemento("Apartamento");
		
		
	// ----------------------------------- CLIENTES -------------------------------------------	
		
		Cliente c1 = new Cliente();
		c1.setNome("Matheus Nascimento");
		c1.setTelefone("(15)9964578");
		c1.setEmail("Math@hotmail.com");
		c1.setEndereco(e1);
		
		Cliente c2 = new Cliente();
		c2.setNome("Max");
		c2.setTelefone("(11)55987456");
		c2.setEmail("Max@gmail.com");
		c2.setEndereco(e2);
		
		Cliente c3 = new Cliente();
		c3.setNome("Neide");
		c3.setTelefone("(81)5698547");
		c3.setEmail("Neidinha@hotmail.com");
		c3.setEndereco(e3);
		
		Cliente c4 = new Cliente();
		c4.setNome("Justino");
		c4.setTelefone("(79)23569887");
		c4.setEmail("JuMilGrau@gmail.com");
		c4.setEndereco(e4);
		
		clienteRepository.save(c1);
		clienteRepository.save(c2);
		clienteRepository.save(c3);
		clienteRepository.save(c4);
		
	// ----------------------------------- CACHORROS --------------------------------------------	
		
		Cachorro ca1 = new Cachorro();
		ca1.setNome("Mel");
		ca1.setRaca("Pinchers");
		ca1.setEspecie("Miniatura");
		ca1.setVacina("Em dia");
		ca1.setCliente(c1);
		
		Cachorro ca2 = new Cachorro();
		ca2.setNome("Toquinho");
		ca2.setRaca("Dachshund");
		ca2.setEspecie("Cão-Salcicha");
		ca2.setVacina("Em dia");
		ca2.setCliente(c2);
		
		Cachorro ca3 = new Cachorro();
		ca3.setNome("Tody");
		ca3.setRaca("Spitz Alemao");
		ca3.setEspecie("Lulu Pomerania");
		ca3.setVacina("Em dia");
		ca3.setCliente(c3);
		
		Cachorro ca4 = new Cachorro();
		ca4.setNome("Meg");
		ca4.setRaca("Poodle");
		ca4.setEspecie("Poodle Toy");
		ca4.setVacina("Em dia");
		ca4.setCliente(c4);
		
		cachorroRepository.save(ca1);
		cachorroRepository.save(ca2);
		cachorroRepository.save(ca3);
		cachorroRepository.save(ca4);
		
	// -------------------------------------- MEDICOS ---------------------------------------------	
		Medico m1 = new Medico();
		m1.setNome("Dr.João");
		m1.setTelefone("(15)998755");
		m1.setEmail("Dr_joao@gmail.com");
		m1.setEndereco(e5);
		
		Medico m2 = new Medico();
		m2.setNome("Dr.Pedro");
		m2.setTelefone("(15)9986745");
		m2.setEmail("Dr_Pedrin@hotmail.com");
		m2.setEndereco(e6);
		
		Medico m3 = new Medico();
		m3.setNome("Dr.Paulo");
		m3.setTelefone("(11)15987547");
		m3.setEmail("Dr_Paulao@gmail.com");
		m3.setEndereco(e7);
		
		Medico m4 = new Medico();
		m4.setNome("Dr.Jose");
		m4.setTelefone("(81)99878855");
		m4.setEmail("Dr_josezin@hotmail.com");
		m4.setEndereco(e8);
		
		medicoRepository.save(m1);
		medicoRepository.save(m2);
		medicoRepository.save(m3);
		medicoRepository.save(m4);
		
		
	// ----------------------------------- ATENDIMENTOS -------------------------------------------	
		
		LocalDateTime localDateTime = LocalDateTime.now();

		
		Atendimento a1 = new Atendimento();
		a1.setDadosAnimal("Tudo em dia");
		a1.setDiagnostico("Perfeitamente");
		a1.setComentarios("Nada a Comentar");
		a1.setLocaldatatime(localDateTime);
		a1.setCliente(c1);
		a1.setCachorro(ca1);
		a1.setMedico(m1);
		
		Atendimento a2 = new Atendimento();
		a2.setDadosAnimal("Nada grave");
		a2.setDiagnostico("Raiva Canina");
		a2.setComentarios("Medicado");
		a2.setLocaldatatime(localDateTime);
		a2.setCliente(c2);
		a2.setCachorro(ca2);
		a2.setMedico(m3);
		
		Atendimento a3 = new Atendimento();
		a3.setDadosAnimal("Tosse seca, nada grave");
		a3.setDiagnostico("Cinomose");
		a3.setComentarios("Virose em observação");
		a3.setLocaldatatime(localDateTime);
		a3.setCliente(c3);
		a3.setCachorro(ca3);
		a3.setMedico(m2);
		
		atendimentoRepository.save(a1);
		atendimentoRepository.save(a2);
		atendimentoRepository.save(a3);
		
		// ---------------------------------------- GATOS ---------------------------------------------
		
				Gato g1 = new Gato();
				g1.setNome("Felizbino");
				g1.setRaca("Siames");
				g1.setCliente(c1);
				
				gatoRepository.save(g1);
				
				Gato g2 = new Gato();
				g2.setNome("Tonho");
				g2.setRaca("Persa");
				g2.setCliente(c3);
				
				gatoRepository.save(g2);
				
				Gato g3 = new Gato();
				g3.setNome("Cebolinha");
				g3.setRaca("Ragdoll");
				g3.setCliente(c2);
				
				gatoRepository.save(g3);
				
				Gato g4 = new Gato();
				g4.setNome("Bolinha");
				g4.setRaca("Maine Coon");
				g4.setCliente(c4);
				
				gatoRepository.save(g4);
				
		
	// -------------------------------- ATENDIMENTOS GATOS ----------------------------------------	
		
		AtendimentoGato a4 = new AtendimentoGato();
		a4.setDadosAnimal("Tudo em dia");
		a4.setDiagnostico("Perfeito");
		a4.setComentarios("Nada a comentar");
		a4.setLocaldatatime(localDateTime);
		a4.setCliente(c1);
		a4.setMedico(m4);
		a4.setGato(g1);
		
		atendimentoGato.save(a4);
		
		AtendimentoGato a5 = new AtendimentoGato();
		a5.setDadosAnimal("Tudo em dia");
		a5.setDiagnostico("Tosse");
		a5.setComentarios("Medicado");
		a5.setLocaldatatime(localDateTime);
		a5.setCliente(c3);
		a5.setMedico(m1);
		a5.setGato(g2);
		
		atendimentoGato.save(a5);
		
		AtendimentoGato a6 = new AtendimentoGato();
		a6.setDadosAnimal("Tudo em dia");
		a6.setDiagnostico("Perfeito");
		a6.setComentarios("Nada a comentar");
		a6.setLocaldatatime(localDateTime);
		a6.setCliente(c4);
		a6.setMedico(m2);
		a6.setGato(g4);
		
		atendimentoGato.save(a6);
		
	
		
	}

}
