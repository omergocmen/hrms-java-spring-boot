package kodlamaio.hrms.api.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

	
	
	private CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		this.candidateService=candidateService;
	}
	
	@GetMapping("/getAll")
	public List<Candidate> getAll(){
		return candidateService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate)  throws Exception  {
		return candidateService.add(candidate);
	}

	@GetMapping("/email")
	public DataResult<Candidate> getByEmail(@RequestParam String email){
		return candidateService.getByEmail(email);
	}

	@GetMapping("/identity")
	public DataResult<Candidate> getByIdentityNumber(@RequestParam String identityNumber){
		return candidateService.getByIdentityNumber(identityNumber);
	}

	
}
