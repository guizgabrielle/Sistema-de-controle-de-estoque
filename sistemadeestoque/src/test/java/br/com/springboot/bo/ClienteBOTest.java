package br.com.springboot.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.springboot.model.Cliente;

@SpringBootTest
final public class ClienteBOTest {

	@Autowired
	private ClienteBO bo;

	public void pesquisaPeloId() {
		Cliente cliente = bo.pesquisaPeloId(1L);
		System.out.println(cliente);
	}
	
	public void lista() {
		List<Cliente> clientes = bo.listaTodos();
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
	
	public void inativa() {
		Cliente cliente = bo.pesquisaPeloId(1L);
		bo.inativa(cliente);
	}
	
	public void remove() {
		Cliente cliente = bo.pesquisaPeloId(1L);
		bo.remove(cliente);
	}
}
