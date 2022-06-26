package com.capgemini.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollection {
		private List<String> myList;
		private Set<String> mySet;
		private Map<Integer,String> myMap;	
		
		public MyCollection () {}
		public MyCollection(List<String> myList, Set<String> mySet, Map<Integer,String> myMap) {
			this.myList = myList;
			this.mySet = mySet;		
			this.myMap = myMap;
			
		}
		public List<String> getMyList() {
			return myList;
		}
		public void setMyList(List<String> myList) {
			this.myList = myList;
		}
		public Set<String> getMySet() {
			return mySet;
		}
		public void setMySet(Set<String> mySet) {
	      this.mySet = mySet;
		}
		public Map<Integer, String> getMyMap() {
			return myMap;
		}
		public void setMyMap(Map<Integer, String> myMap) {
			this.myMap = myMap;
		}
		
	} 