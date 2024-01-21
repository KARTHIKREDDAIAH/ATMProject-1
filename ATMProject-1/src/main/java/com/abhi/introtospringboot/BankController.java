package com.abhi.introtospringboot;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BankController {
	long accountNo;
	
	@Autowired
	BankRepository r;
	@PostMapping("/post")
	@ResponseBody
	public Bank m1(Bank e) {
		r.save(e);
		return e;
	}
	@RequestMapping("/saveCustomerDetails")
    public String saveLaptop(Bank b) {

          r.save(b);
   	 return "home.jsp";
    }
	@GetMapping("/Login")
 	 public String Login(@RequestParam long no,@RequestParam String passward) {
     		accountNo	=no;
     		
 	Optional<Bank> yi =r.findById(no);
   	if(yi.isPresent()) {
 	 		Bank entity   =r.findById(accountNo).orElse(null);
 	       String    s1=entity.getPassward();
 	       if(s1.equalsIgnoreCase(passward)) {
 	    	   return "details.html";
 	       }
 	  		else {
 	 			return "Login2.jsp"; 	 		
 	       
 		}
 	       }else {
 			return "Login1.jsp";
 	}
     	}

 	@GetMapping("/depositBalance")
	
         public String  depositBalance(@RequestParam String amount) {
		
 		Bank entity = r.findById(accountNo).orElse(null);
        	String   s1=entity.getBalance();
       long 	l1=Long.parseLong(s1);
       long 	l2=Long.parseLong(amount);
       long sum=l1+l2;
        	
        	   entity.setBalance(sum+"");
                r.save(entity);
       return "DepositSuccessful.jsp";
         } 
 	@GetMapping("/withdraw")
         public String  withdraw(@RequestParam String amount) {
		
 		Bank entity = r.findById(accountNo).orElse(null);
        	String   s1=entity.getBalance();
       long 	l1=Long.parseLong(s1);
       long 	l2=Long.parseLong(amount);
       if(l2<=l1) {	
			
    	   long sum=l1-l2;
    	   entity.setBalance(sum+"");
           r.save(entity);
			
			return "balanceamount.html";
		}else {
		   return "Faild.html";
		}
     
         } 
 	@GetMapping("/getbalance")
	@ResponseBody
         public String  checkbalance() {
		
 		Bank entity = r.findById(accountNo).orElse(null);
        	String   s1=entity.getBalance();
	return s1;
 	}
}
