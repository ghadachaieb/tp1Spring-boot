package com.ghada.parfum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghada.parfum.entities.Parfum;
import com.ghada.parfum.repos.ParfumRepository;

@Service
public abstract class ParfumServiceImpl implements ParfumService{
	@Autowired
	ParfumRepository produitRepository;
	@Override
	public Parfum saveParfum(Parfum p) {
	return produitRepository.save(p);
	}

	public Parfum updateParfum(Parfum p) {
	return produitRepository.save(p);
	}
	@Override
	public void deleteParfum(Parfum p) {
	produitRepository.delete(p);
	}
	@Override
	public void deleteParfumById(Long id) {
	produitRepository.deleteById(id);
	}
	@Override
	public Parfum getParfum(Long id) {
	return produitRepository.findById(id).get();
	}
	@Override
	public List<Parfum> getAllParfum() {
	return produitRepository.findAll();
	}	
}
