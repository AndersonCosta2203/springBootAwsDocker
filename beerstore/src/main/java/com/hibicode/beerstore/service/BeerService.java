package com.hibicode.beerstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibicode.beerstore.exception.BeerAlreadyExistException;
import com.hibicode.beerstore.model.Beer;
import com.hibicode.beerstore.repository.Beers;

@Service
public class BeerService {
	
	private Beers beers;

	public BeerService(@Autowired Beers beers) {
		this.beers = beers;
	}
	
	public Beer save(final Beer beer) {
		throw new BeerAlreadyExistException();
	}
}
