package com.keyin.cities;

import com.keyin.airport.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "City", path = "city")
public interface CityRESTAPI extends JpaRepository<City, Long> {
}