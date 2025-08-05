package JavaPractice;

import java.util.ArrayList;

public class FindDupElem_In_ArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("100");
		al.add("kumar");
		al.add("kumar");
		al.add("100");
		System.out.println(al);
		int count;
		for(int i=0;i<al.size();i++)
		{
			count=0;
		
			 for(int j=i+1;j<al.size();j++)
			  {
			if(al.get(i)==al.get(j))
			   
				count++;     
		      }
            if(count>=1)
            {
            	System.out.println("Duplicate Element in ArrayList is: "+al.get(i));
            }
	     }
		

     }
  }