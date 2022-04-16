package ioc.service;

import ioc.model.City;
import ioc.repository.CrudRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CityServiceTest {

    private final CrudRepository repository = mock(CrudRepository.class);
    private CityService cityService = new CityService(repository);

    @Test
    void shouldReturnAllCities() {
        var cities = List.of(new City(1, "name"));
        when(repository.findAll()).thenReturn(cities);

        assertIterableEquals(cities, cityService.list());
        assertTrue(false);
    }
}
