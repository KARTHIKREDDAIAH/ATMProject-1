package com.abhi.introtospringboot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class 
Bank {
	@Id
	  private Long accountNo;
	    private String userName; 
	    String  balance;
	    String passward;
		public Long getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(Long accountNo) {
			this.accountNo = accountNo;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getBalance() {
			return balance;
		}
		public void setBalance(String balance) {
			this.balance = balance;
		}
		public String getPassward() {
			return passward;
		}
		public void setPassward(String passward) {
			this.passward = passward;
		}
	    
}
