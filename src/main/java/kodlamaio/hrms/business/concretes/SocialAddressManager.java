package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SocialAddressService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SocialAddressDao;
import kodlamaio.hrms.entities.concretes.SocialAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialAddressManager implements SocialAddressService {

    @Autowired
    SocialAddressDao socialAddressDao;

    @Override
    public Result add(SocialAddress socialAddress) {
        this.socialAddressDao.save(socialAddress);
        return new SuccessResult("Başarıyla eklendi");
    }

    @Override
    public List<SocialAddress> getAll() {
        return this.socialAddressDao.findAll();
    }
}
