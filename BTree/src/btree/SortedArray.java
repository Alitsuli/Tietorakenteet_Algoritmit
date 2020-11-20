package btree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArray {
	private List<String> sortedList;
	
	public SortedArray() {
		this.sortedList = new ArrayList<String>();
	}
	
	public void add(String key) {
		
		if(!sortedList.contains(key)) {
			sortedList.add(key);
			Collections.sort(sortedList);
		}else {
			System.out.println("Alkio on jo olemassa");
		}
	}
	
	public int find(String aData) {
		return binarySearch(sortedList, 0, sortedList.size() - 1, aData);
	}
	
	// returns the element index or -1 if the element is not present
    private int binarySearch(List<String> list, int low, int high, String key) 
    { 
        if (high >= low) { 
            int mid = low + (high - low) / 2; 
  
            if (list.get(mid).compareToIgnoreCase(key) == 0) 
                return mid; 
  
            if (list.get(mid).compareToIgnoreCase(key) > 0) 
                return binarySearch(list, low, mid - 1, key); 
  

            return binarySearch(list, mid + 1, high, key); 
        } 
  
        return -1; 
    } 
    
    public void print() {
		System.out.println("Järjestetty lista");

    	for(String s: sortedList) {
    		System.out.println(s);
    	}
    }

}
