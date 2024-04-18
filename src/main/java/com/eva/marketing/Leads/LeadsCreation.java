package com.eva.marketing.Leads;

import java.util.Map;

import com.evs.vtiger.utils.KishanWebUtil;

public class LeadsCreation extends LeadsOrLayer{
	protected KishanWebUtil kw=	KishanWebUtil.getobject();  
      private KishanWebUtil kc;
	public LeadsCreation(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
	}
	public void marketingLeadsCreation(Map<String, String> testdata)
	{
		  kw.mydropdownindex(getFirstnameDropDown(), 2);
		 kc.mySenkeys(getFirstname(), testdata.get("FirstName"));
		 kc.mySenkeys(getLastname(), testdata.get("LastName"));
		 kc.mySenkeys(getCompanyname(), testdata.get("CompanyName"));
		 kc.mySenkeys(getPhone(), testdata.get("Phone"));
		 kc.mySenkeys(getMobile(), testdata.get("Mobile"));
		 kc.mySenkeys(getEmail(), testdata.get("Email"));
		 kc.mySenkeys(getDescription(), testdata.get("Description"));
		 
	}

}
