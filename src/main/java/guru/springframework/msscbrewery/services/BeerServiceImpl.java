package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	public BeerDto getBeerById(UUID beerId) {

		return BeerDto.builder().id(UUID.randomUUID())
								.beerName("Galaxy Cat")
								.beerStyle("Pale Ale")
								.build();
	}

	public BeerDto saveNewBeer(BeerDto beerDto) {
		log.debug("Saved new Beer....");
		return BeerDto.builder().id(UUID.randomUUID()).build();
		
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBeer(UUID beerId) {
		// TODO Auto-generated method stub
		log.debug("Deleteing a beer...");
	}

}
