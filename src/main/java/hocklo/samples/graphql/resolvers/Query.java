package hocklo.samples.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import hocklo.samples.graphql.entities.Car;
import hocklo.samples.graphql.services.GarageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

  private GarageService garageService;

  public List<Car> cars() {
    return garageService.get();
  }

  public Optional<Car> car(UUID id) {

    return garageService.get(id);
  }
}
