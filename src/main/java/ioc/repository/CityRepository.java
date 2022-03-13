package ioc.repository;

import ioc.model.City;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class CityRepository implements CrudRepository<City> {

    @Override
    public List<City> findAll() {
        return List.of(new City(1, "City name"));
    }
}
