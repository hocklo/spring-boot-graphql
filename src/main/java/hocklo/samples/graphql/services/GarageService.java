package hocklo.samples.graphql.services;

import hocklo.samples.graphql.entities.Car;
import hocklo.samples.graphql.enums.Brand;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GarageService {

  private static final List<Car> store = new ArrayList<>();

  public GarageService(){
    Car car = new Car();
    car.setId(UUID.randomUUID());
    car.setName("Ford shelby gt500");
    car.setLaunchAt(LocalDateTime.of(1967, Month.JANUARY.getValue(), 1, 0, 0));
    car.setType(Brand.FORD);
    car.setDiscontinued(true);
    store.add(car);
  }

  public void add(Car car) {
    store.add(car);
  }

  public List<Car> get() {
    return store;
  }

  public Optional<Car> get(UUID id) {
    return store.stream().filter(x -> x.getId().equals(id)).findFirst();
  }
}
