package com.eva.marketing.Account;

import java.util.Map;
import java.util.Random;

import com.evs.vtiger.utils.KishanWebUtil;

import net.bytebuddy.utility.RandomString;

public class AcccountCreation extends AccountORlayer{
   private KishanWebUtil kc;
   
	public AcccountCreation(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;	
	}
	
	public void marketingAccountCreation(Map<String, String> mapentry)
		{
		String rd=      RandomString.make(5);
		//System.out.println(mapentry.get("AccountName"));
		kc.mySenkeys(getAccountname(), mapentry.get("AccountName")+rd);
		kc.mySenkeys(getPhone(), mapentry.get("Phone"));
		kc.mySenkeys(getEmail(), mapentry.get("Email")+rd);
		kc.mySenkeys(getDescription(),mapentry.get("Description"));
		
	}
		
}
