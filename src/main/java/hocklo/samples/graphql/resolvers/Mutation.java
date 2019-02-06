package hocklo.samples.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import hocklo.samples.graphql.entities.Car;
import hocklo.samples.graphql.services.GarageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

  private GarageService garageService;

  public UUID add(Car car) {
    car.setId(UUID.randomUUID());
    garageService.add(car);
    return car.getId();
  }
}
