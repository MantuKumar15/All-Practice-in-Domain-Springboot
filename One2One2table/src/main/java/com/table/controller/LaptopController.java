package com.table.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.table.model.Details;
import com.table.model.User;
import com.table.repository.*;

@Controller
public class LaptopController {
@Autowired
private UserRepository us;
@Autowired 
private Details dt;
@ResponseBody
@RequestMapping("/into")
public String p(int lid,String lname,String company,int pro_id,String pro_name){
	User use=new User();
	Details det=new Details();
	det.setPro_name(pro_name);
	det.setPro_id(pro_id);
	use.setLid(lid);
	use.setLname(lname);
	use.setCompany(company);
	use.setDt(det);
det.setUs(use);
	us.save(use);


	
	
	return "DETAILS ARE  SAVED";}


@RequestMapping("/")
public String ind() {
	
	
	return "index.jsp";
} 

@ResponseBody
@RequestMapping("/find")
public String ind(int lid) {
	Optional<User> optional=us.findById(lid);
	User damn=optional.get();
	return damn.getDt().getPro_name();
	
	
	}
	

}
