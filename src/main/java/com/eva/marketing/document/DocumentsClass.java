package com.eva.marketing.document;

import java.util.Map;

import com.evs.vtiger.utils.KishanWebUtil;

public class DocumentsClass extends DocumentsORlayer{
  private KishanWebUtil kc;
	public DocumentsClass(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
		
	}
	
	public void createDocuments(Map<String, String> docu)
	{
		kc.mySenkeys(getTitle(), docu.get("Title"));
		kc.switchtoframeIndex(0);
		kc.mySenkeys(getDescription(), docu.get("Description"));
		
	}
	
	

}
