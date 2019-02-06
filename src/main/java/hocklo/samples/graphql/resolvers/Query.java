package hocklo.samples.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import hocklo.samples.graphql.entities.Car;
import hocklo.samples.graphql.enums.Brand;
import hocklo.samples.graphql.services.GarageService;
import lombok.AllArgsConstructor;
import org.apache.catalina.Store;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

  private GarageService garageService;

  public List<Car> cars() {
    return garageService.get();
    /*List<Car> cars = new ArrayList<>();

    Car car = new Car();
    car.setId(UUID.randomUUID());
    car.setName("Ford shelby gt500");
    car.setLaunchAt(LocalDateTime.of(1967, Month.JANUARY.getValue(), 1, 0, 0));
    car.setType(Brand.FORD);
    car.setDiscontinued(true);

    cars.add(car);

    return cars;*/
  }

  public Optional<Car> car(UUID id) {

//    Car car = new Car();
//    car.setId(id);
//    car.setName("Ford shelby gt500");
//    car.setLaunchAt(LocalDateTime.of(1967, Month.JANUARY.getValue(), 1, 0, 0));
//    car.setType(Brand.FORD);
//    car.setDiscontinued(true);
//
//    return car;
    return garageService.get(id);
  }
}
