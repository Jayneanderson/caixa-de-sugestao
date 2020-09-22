package com.style3.caixadesugestao.service;

import java.util.List;

public interface CrudGeneric<O, L>{
	
	public List<O> findAll();
	public O findById(L id);
	public void save(O object);
	public void delete(L id);
}
