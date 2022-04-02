package kodlamaio.hrms.api.controllers;


import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
@CrossOrigin
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping("/getAll")
    public List<Language> getAll(){
       return this.languageService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Language language){
        return this.languageService.add(language);
    }


}
