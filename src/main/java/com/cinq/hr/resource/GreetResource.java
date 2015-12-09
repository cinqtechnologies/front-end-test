package com.cinq.hr.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.cinq.hr.jms.Client;

@Path("/greet")
@Component
public class GreetResource {
	static Logger logger = LoggerFactory.getLogger(GreetResource.class);

	@Autowired
	Client client;

}
