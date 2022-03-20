package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

	
	
	private CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		this.candidateService=candidateService;
	}
	
	@GetMapping("getAll")
	public List<Candidate> getAll(){
		return candidateService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate)  throws Exception  {
		return candidateService.add(candidate);
	}
	

	
}
