package com.keyin.passenger;

import com.keyin.airport.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "passenger", path = "passenger")
public interface PassengerRESTAPI extends JpaRepository<Passenger, Long> {
}