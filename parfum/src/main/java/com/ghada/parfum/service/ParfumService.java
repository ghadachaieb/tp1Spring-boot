package com.ghada.parfum.service;

import java.util.List;

import com.ghada.parfum.entities.Parfum;

public interface ParfumService {
	Parfum saveParfum(Parfum p);
	Parfum updateParfum(Parfum p);
	void deleteParfum(Parfum p);
	 void deleteParfumById(Long id);
	 Parfum getParfum();
	List<Parfum> getAllParfum();
	Parfum getParfum(Long id);

}
