package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CityDao;
import kodlamaio.hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public List<City>getAll() {
        return this.cityDao.findAll();
    }

    @Override
    public Result add(City city) {
        this.cityDao.save(city);
        return new SuccessResult("Başarıyla oluşturuldu");
    }
}
