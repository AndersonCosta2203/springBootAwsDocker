package com.hibicode.beerstore.service;

import java.math.BigDecimal;

import org.junit.Test;

import com.hibicode.beerstore.exception.BeerAlreadyExistException;
import com.hibicode.beerstore.model.Beer;
import com.hibicode.beerstore.model.BeerType;

public class BeerServiceTest {

	@Test(expected = BeerAlreadyExistException.class)
	public void should_deny_creation_of_beer_that_exist() {
		final BeerService beerService = new BeerService();
		final Beer newBeer = new Beer(null, "Heineken", BeerType.LAGER, new BigDecimal("355"));
		beerService.save(newBeer);
	}
	
}
