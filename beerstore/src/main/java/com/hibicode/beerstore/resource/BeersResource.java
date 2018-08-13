package com.hibicode.beerstore.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hibicode.beerstore.model.Beer;
import com.hibicode.beerstore.repository.Beers;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/beers")
public class BeersResource {
	
	@Autowired
	private Beers beers;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Beer create(@Valid @RequestBody Beer beer) {
		int i = 5 / 0;
		return beers.save(beer);
	}
	
    @GetMapping
    public List<Beer> all() {
    	return beers.findAll();
    }
}
