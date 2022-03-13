package ioc.service;

import ioc.model.City;
import ioc.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class CityService implements CrudService<City> {
    private final CrudRepository<City> repository;

    CityService(CrudRepository<City> courseRepository) {
        repository = courseRepository;
    }

    @Override
    public List<City> list() {
        return repository.findAll();
    }
}
