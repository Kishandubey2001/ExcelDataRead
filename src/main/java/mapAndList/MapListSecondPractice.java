package mapAndList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapListSecondPractice {

	public static void main(String[] args) {
	List<Map<String, String>> findlistmap=	MapIntoList();
Iterator<Map<String, String>> itvalue=findlistmap.iterator();
  while(itvalue.hasNext())
  {
	  Map<String, String> mapit= itvalue.next(); 
	     Collection<String> setmap=  mapit.values();
	    Iterator<String> eachmap= setmap.iterator();
	    while(eachmap.hasNext())
	    {
	    String eachmapvalue= eachmap.next();	
	    System.out.println(eachmapvalue);
	    }
  }
//Map<String, String> mapvalue=	findlistmap.get(0);
//String valueofcity=mapvalue.get("City");
//System.out.println(valueofcity);
	}
	public static List<Map<String, String>> MapIntoList()
	{
	Map<String, String>	 map1= new HashMap<String, String>();
	map1.put("Name", "Adarsh");
	map1.put("Town", "Bankat");
	map1.put("Postalcode", "221401");
	map1.put("City", "Mumbai");
	map1.put("State", "Maharashtra");
	
	Map<String, String>	 map2= new HashMap<String, String>();
	map2.put("Name", "Ankit");
	map2.put("Town", "Bhikharirampur");
	map2.put("Postalcode", "221404");
	map2.put("City", "Surat");
	map2.put("State", "Gujrat");

	Map<String, String>	 map3= new HashMap<String, String>();
	map3.put("Name", "Vinit");
	map3.put("Town", "BankatVashi");
	map3.put("Postalcode", "221406");
	map3.put("City", "Bhadohi");
	map3.put("State", "UP");
	
List<Map<String, String>>listmap=new ArrayList< Map<String, String> >();
listmap.add(map1);
listmap.add(map2);
listmap.add(map3);
return listmap;

      
	         
	
	}

}
