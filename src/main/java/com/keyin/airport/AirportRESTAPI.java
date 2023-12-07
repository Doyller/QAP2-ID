package com.keyin.airport;

import com.keyin.aircraft.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "airport", path = "airport")
public interface AirportRESTAPI extends JpaRepository<Airport, Long> {
}