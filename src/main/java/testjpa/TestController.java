package testjpa;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import testjpa.dto.DocumentDto;

@RestController
@RequestMapping(value = "/API", produces = { MediaType.APPLICATION_JSON_VALUE })
public class TestController {	//@Produces(MediaType.APPLICATION_JSON)
	@Autowired RuleService rlservice;
	@GetMapping
	
		@RequestMapping(value = "/Documents", method = RequestMethod.GET)
		//public ResponseBean getDocumentList(@RequestParam("stateCode") String stateCode)
	public ResponseBean getDocumentList() throws Exception
	{
				 
					ResponseBean responseBean = new ResponseBean();
				try{	
			//RuleDto ruleDto = ruleService.getDocumentList(stateCode, serviceCode, applicationNumber);
			//Map<String, RuleDto> m = new HashMap<>();
			//m.put("Details", ruleDto);
					System.out.println("going to call service");
			List<DocumentDto> dtolist = rlservice.getProofList();
			responseBean.setStatusCode(org.springframework.http.HttpStatus.OK.toString());
			responseBean.setStatusDesc("SUCCESS");
			responseBean.setBody("ok");
				}
				catch(Exception e){System.out.println("error is"+e.getMessage());}
			return responseBean;
		}
	}


		


