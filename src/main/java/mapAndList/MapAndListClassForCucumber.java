package mapAndList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAndListClassForCucumber {

	public static void main(String[] args) {
	List<Map<String, String>> listmapvalue= createAndgetAllPersonInfoinListMap();
	Map<String, String> mapvalue=  listmapvalue.get(0);
String valuemap=	mapvalue.get("firstname");
System.out.println(valuemap);



   List<List<String>> listlistvalue=    createAndgetAllPersonInfoinListList();
 List<String> listvalue=  listlistvalue.get(0);
  String valuelist= listvalue.get(3);
  System.out.println(valuelist);

	}
	
	public static List<Map<String, String>> createAndgetAllPersonInfoinListMap()
	{
	       Map<String, String> map1= new HashMap<String,String>();
	       map1.put("firstname", "Kishan");
	       map1.put("lastname", "Dubey");
	       map1.put("town", "Bankat");
	       map1.put("cityname", "Varansi");
	       
	       Map<String, String> map2= new HashMap<String,String>();
	       map2.put("firstname", "Dinesh");
	       map2.put("lastname", "Tiwari");
	       map2.put("town", "Bhorimahjuda");
	       map2.put("cityname", "Kanpur");
	       
	       Map<String, String> map3= new HashMap<String,String>();
	       map3.put("firstname", "Rahul");
	       map3.put("lastname", "Yadav");
	       map3.put("town", "Deipur");
	       map3.put("cityname", "Prayagraj");
	       
    List<Map<String, String>> listmap=new ArrayList<Map<String, String>>();	
    listmap.add(map1);
    listmap.add(map2);
    listmap.add(map3);
    return listmap;      
	}
	
	
	
	public static List<List<String>> createAndgetAllPersonInfoinListList()
	{
	     List<String> list1=  new ArrayList<String>();
	     list1.add("KishanL");
	     list1.add("DubeyL");
	     list1.add("BankatL");
	     list1.add("VaransiL");
	     
	     List<String> list2=  new ArrayList<String>();
	     list2.add("VikashL");
	     list2.add("TiwariL");
	     list2.add("RampurL");
	     list2.add("JaunpurL");
	     
	     List<String> list3=  new ArrayList<String>();
	     list3.add("VinodL");
	     list3.add("YadavL");
	     list3.add("MondhL");
	     list3.add("MumbaiL");
	     
	     List<List<String>> listlist=new ArrayList<List<String>>();
	     listlist.add(list1);
	     listlist.add(list2);
	     listlist.add(list3);
	     return listlist;
	        
	}

}
