package com.elton.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.elton.curso.modelo.Cliente;

public class AtualizandoPrimeiroObjeto {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 1L);// busquei o "Cliente" e estou com ele gerenciado
		em.getTransaction().begin();
		cliente.setNome("Elton Luiz Da Silva");
		cliente.setIdade(49);
		cliente.setProfissao("Programador Java");
		em.getTransaction().commit();
		
		System.out.println("Cliente atualizado com sucesso");
		
		
		
	}

}
