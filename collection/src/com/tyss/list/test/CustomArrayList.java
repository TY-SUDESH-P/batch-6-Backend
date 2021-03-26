package com.tyss.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayList<T> implements Iterable<T>{
 private Object elementData[];
 private final int DEFAULT_SIZE=4;
 private int size=0;
 
   CustomArrayList(){
	   this.elementData=new Object[DEFAULT_SIZE];
   }
 
   
   public void add(Object el){
	   System.out.println("inside add block");
	   if(size== elementData.length){
		   System.out.println("inside if");
		   System.out.println("size"+size);
		   int prevSize=elementData.length;
		   System.out.println("prevsize"+prevSize);
	       int newSize=prevSize*2;
	       System.out.println("newSize"+newSize);
	       
	       elementData=Arrays.copyOf(elementData, newSize);
	   
	   }// end of the if block
         this.elementData[size]=el;
         size++;
   }// End Of The Add()
   
    @Override
    public String toString(){
    	String s1= new String("[");
    	for(int i =0 ; i<size;i++){
    		if(i==size-1){
    			s1=s1+elementData[i];
    		}else{
    			s1=s1+elementData[i]+",";
    			
    		}
    	}
    	s1=s1+"]";
    	return s1;
    }
    
    
    public void remove(int index){
    	if(index < 0 || index >=size ){
    		throwIndex new ArrayIndexOutOfBound
    	}
    }
    
    private class Itr implements Iterator<T> {
		private int index;

		public boolean hasNext() {

			return (index < size) ? true : false;
		}

		public T next() {
			T e = (T) elementData[index];
			index++;
			return e;

		}
   
    }

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Itr();
	}
}
   
