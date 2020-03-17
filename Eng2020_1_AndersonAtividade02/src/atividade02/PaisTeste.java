package atividade02;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTeste {
	Pais pais, copia;
	static int id = 0;

	//Rodar o banco
	
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais(id, "Vaticano", 831, 0.44);
		copia = new Pais(id, "Vaticano", 831, 0.44);
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}

	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		Pais fixture = new Pais(1, "Itália", 60665551, 301338);
		Pais novo = new Pais(1, null, 0, 0);
		novo.carregar();
		assertEquals("Teste de carregar", novo.getId(), fixture.getId());
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		pais.criar();
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("Teste de criar", pais.getId(), copia.getId());
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPopulacao(222222);
		copia.setPopulacao(222222);
		pais.atualizar();
		pais.carregar();
		assertEquals("Teste de atualizar", pais.getId(), copia.getId());
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(0);
		copia.setArea(0);
		pais.excluir();
		pais.carregar();
		assertEquals("Teste de excluir", pais.getId(), copia.getId());
	}
	
}