package hocklo.samples.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import hocklo.samples.graphql.entities.Car;
import hocklo.samples.graphql.repositories.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

  private CarRepository carRepository;

  public List<Car> cars() {
    return carRepository.findAll();
  }

  public Optional<Car> car(Long id) {
    return carRepository.findById(id);
  }
}
