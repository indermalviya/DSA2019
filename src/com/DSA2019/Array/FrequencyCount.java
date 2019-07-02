package com.DSA2019.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(4);
		frequencyCount(arrayList);

	}

	private static void frequencyCount(ArrayList<Integer> arrayList) {
		HashMap<Integer, Integer> hashMap=new HashMap<Integer, Integer>();
		for(Integer i:arrayList) {
			Integer j=hashMap.get(i);
			hashMap.put(i, (j==null) ? 1 : j+1);
		}
		
		for(Map.Entry<Integer, Integer> hmap: hashMap.entrySet()) {
			System.out.println("key :" + hmap.getKey() +",  no of occurence : " + hmap.getValue());
		}

	}
}
