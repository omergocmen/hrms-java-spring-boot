package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.City;

import java.util.List;

public interface CityService {

    List<City>getAll();
    Result add(City city);
}
