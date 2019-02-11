package hocklo.samples.graphql.repositories;

import hocklo.samples.graphql.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {}
