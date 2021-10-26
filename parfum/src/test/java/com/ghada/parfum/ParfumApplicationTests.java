package com.ghada.parfum;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ghada.parfum.entities.Parfum;
import com.ghada.parfum.repos.ParfumRepository;


@SpringBootTest
class ParfumApplicationTests {
	@Autowired
	private ParfumRepository produitRepository;
	@Test
	public void testCreateProduit() {
	Parfum parf = new Parfum("Dios","Homme",69.990);
	produitRepository.save(parf);
	}
	@Test
	public void testFindParfum()
	{
	Parfum p = produitRepository.findById(1L).get(); 
	System.out.println(p);
	}
	@Test
	public void testUpdateParfum()
	{
	Parfum p = produitRepository.findById(1L).get();
	p.setPrix(200.0);
	produitRepository.save(p);
	}
	@Test
	public void testDeleteParfum()
	{
	produitRepository.deleteById(1L);;
	}
	 
	@Test
	public void testListerTousParfum()
	{
	List <Parfum> prods = produitRepository.findAll();
	for (Parfum p : prods)
	{
	System.out.println(p);
	}
	}
}
