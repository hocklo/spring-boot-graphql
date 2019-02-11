package hocklo.samples.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import hocklo.samples.graphql.entities.Brand;
import hocklo.samples.graphql.entities.Car;
import hocklo.samples.graphql.repositories.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class CarResolver implements GraphQLResolver<Car> {

  private BrandRepository brandRepository;

  public Optional<Brand> getBrand(Car car) {
    return brandRepository.findById(car.getBrandId());
  }
}
