package com.elton.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.elton.curso.modelo.Cliente;

public class ConsultandoPrimeiroObjeto {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 1L);
		
		if(cliente != null ) { // validando
			System.out.println("\nNome ..: "+cliente.getNome());
			System.out.println("Idadde ..: "+cliente.getIdade());
			System.out.println("Profissão ..: "+cliente.getProfissao());
			System.out.println("Sexo ..: "+cliente.getSexo());
		}else {
			System.out.println("Cliente não localizado");
		}
	}

}
