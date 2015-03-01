package com.java.ResturantMgmt.common.service;

import com.java.ResturantMgmt.dto.util.GenericDTO;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public abstract class GenericService {
	
	

	public abstract GenericVO doProcess(GenericDTO genericdto);
	
}
