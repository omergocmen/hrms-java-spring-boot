package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.SocialAddress;

import java.util.List;

public interface SocialAddressService {
    Result add(SocialAddress socialAddress);
    List<SocialAddress>getAll();
}
