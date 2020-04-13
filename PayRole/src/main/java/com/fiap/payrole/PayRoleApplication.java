package com.fiap.PayRole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayRoleApplication implements ComandLineRunner{
	private VaquinhaService vaquinhaService;

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(PayRoleApplication.class, args);
	}

	public void run(final String... args){
		line();

		System.out.println("ProdutoApplication.run");

		System.out.println("Criar Vaquinha");
		final Vaquinha add = vaquinhaServive.add("01", "Vaquinha 1", "00,00", "00,00" "Contatos");
		System.out.println(add);

		line();
	}

	private void line(){
		System.out.println();
	}

}
