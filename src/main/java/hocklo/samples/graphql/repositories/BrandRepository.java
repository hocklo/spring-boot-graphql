package hocklo.samples.graphql.repositories;

import hocklo.samples.graphql.entities.Brand;
import hocklo.samples.graphql.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {}
