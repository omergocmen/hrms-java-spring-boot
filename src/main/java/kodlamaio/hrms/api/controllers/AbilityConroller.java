package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.AbilityService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Ability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/abilities")
public class AbilityConroller {

    @Autowired
    private AbilityService abilityService;

    @GetMapping("/getAll")
    public List<Ability> add()
    {
        return this.abilityService.getAll();
    }

    @PostMapping("/add")
    public Result getAll(@RequestBody Ability ability){
        return this.abilityService.add(ability);
    }

}
