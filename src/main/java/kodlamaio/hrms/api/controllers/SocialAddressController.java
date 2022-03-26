package kodlamaio.hrms.api.controllers;


import kodlamaio.hrms.business.abstracts.SocialAddressService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.SocialAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/socialAddress")
public class SocialAddressController {

    @Autowired
    SocialAddressService socialAddressService;

    @GetMapping("/getAll")
    public List<SocialAddress>getAll(){
        return this.socialAddressService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SocialAddress socialAddress)
    {
        return this.socialAddressService.add(socialAddress);
    }
}
