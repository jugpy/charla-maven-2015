package org.jugpy.services;

import javax.ejb.Stateless;

@Stateless
public class JugPyService {
	
	public String getBasicInformation() {
		return "The JUGPy was founded in 2015. " + 
			"Its objectives are to promote " + 
			"the use of Java technologies " +
			"and share expertise.";
	}
}
