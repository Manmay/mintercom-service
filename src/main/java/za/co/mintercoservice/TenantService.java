package za.co.mintercoservice;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import za.co.mintercoservice.model.Tenant;

@RestController
public class TenantService {
	
	 private static final Logger log = LoggerFactory.getLogger(TenantService.class);
	 
	 @RequestMapping(value = "api/tenants", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Tenant> findAllTenants() {
	        log.info("Returning Tenants");
	        return null;
	    }

}
