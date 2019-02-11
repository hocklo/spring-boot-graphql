package hocklo.samples.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import hocklo.samples.graphql.entities.Car;
import hocklo.samples.graphql.repositories.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

  private CarRepository carRepository;

  public Long add(Car car) {
    return carRepository.save(car).getId();
  }
}
