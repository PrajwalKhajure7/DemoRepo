import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

class Student implements Comparable<Student>{    
	 int rollno;    
	 String name;    
	 int age;    
	 Student(int rollno,String name,int age){    
	 this.rollno=rollno;    
	 this.name=name;    
	 this.age=age;    
	 }    
	     
	 public int compareTo(Student st){    
	 if(age==st.age)    
	 return 0;    
	 else if(age<st.age)    
	 return -1;    
	 else    
	 return 1;    
	 }    
	 }  


public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		//List<Integer> intrr=new ArrayList<>();
		List<String> list=new ArrayList<>();
		list.add("prajwal");
		list.add("sahil");
		list.add("tikam");
		//System.out.println(list);       1.
		
		//-------using iterator
		/*Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}*/
		
		//=====using for each
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("==========hashset=========");
		Set<String> s=new HashSet<>();
		s.add("ravi");
		s.add("viju");
		s.add("gaju");
		s.add("prajwal");
		s.add("ravin");
		s.add(null);
		s.add(null);
		System.out.println(s);
		
		//-----------treeset
		Set<String> sett=new TreeSet<>();
		sett.add("ravi");
		sett.add("prajwal");

		sett.add("viju");
		sett.add("gaju");
		sett.add("prajwal");
		System.out.println(sett);
		System.out.println("---------map=------------");
		
		Map<Integer, String> m=new HashMap<>();
		m.put(1, "amit");
		m.put(3, "ram");
		m.put(2, "akaran");
		m.put(4, "karan");
		m.put(6, "bkaran");
		System.out.println(m);
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);  
		System.out.println("=======linkedhashmap==========");
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(100,"Amit");  
		  lhm.put(102,"Vijay");  
		  lhm.put(101,"Rahul");  
		  System.out.println(lhm);
		  
		  
		  System.out.println("------------comparable");
		  ArrayList<Student> al=new ArrayList<Student>();    
		  al.add(new Student(101,"Vijay",23));    
		  al.add(new Student(106,"Ajay",27));    
		  al.add(new Student(105,"Jai",21));    
		      
		  Collections.sort(al);    
		  for(Student st:al){    
		  System.out.println(st.rollno+" "+st.name+" "+st.age);    
		  }   
		  System.out.println("---stack");
		  Stack<String> stk= new Stack<>();  
		//pushing elements into Stack  
		stk.push("Mac Book");  
		stk.push("HP");  
		stk.push("DELL");  
		stk.push("Asus");  
		System.out.println("Stack: " + stk);  
		// Search an element  
		int location = stk.search("HqP");  
		System.out.println("Location of Dell: " + location);  
		
		Iterator iterator = stk.iterator();  
		while(iterator.hasNext())  
		{  
		 
		System.out.println(iterator.next() );   
		}  
		int i=9;
		Integer in=i;
		System.out.println(in);
		
		String ss="Sachin";  
		   ss=ss.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(ss);
		   double d=10.5;
		   
		 
		   
		 
		String sss="B";
		switch(sss) {case "A":System.out.println(sss);
		case "B": System.out.println(sss);
		case "C": System.out.println(sss);
		default:System.out.println(sss);}
		
		 int num=21;
		  String range=(num<15)?"smaller":(num<25)?"inrange":"greater";
		  System.out.println(range);
		  
		  int [] arr= new int[0];
		
		
	}
}
