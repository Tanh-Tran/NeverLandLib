package com.NVLLib.Model.Book;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;



public class IdGenerator implements Serializable{
	   
    private String code;
    public static Map<Integer, Integer> semester = new HashMap<Integer, Integer>();
   
    private String prefix = "M";
    private int postfix;
   
   /**
    * initialize semester*/
    public IdGenerator(int semester){
       

       
        this.setCode(semester);
    }
   /**
    * @effects
    * 	validate that the key semester is existed or not
    * 		if return false
    * 			set a new key semester and add the new value 1
    * 		else
    * 			check the key and add 1 to the value inside. 
    * */
   
    private void setCode(int semester) {       
        if(IdGenerator.semester.containsKey(semester) == false)
            IdGenerator.semester.put(semester, 1);
        else
            IdGenerator.semester.put(semester, IdGenerator.semester.get(semester)+1);
       
        this.postfix = 100 * semester + IdGenerator.semester.get(semester);
       
        this.code =  this.prefix + this.postfix;
    }
   
    public String getPrefix() {
        return this.prefix;
    }
   
    public int getPostfix() {
        return this.postfix;
    }
   
   
    public String toString() {
        return this.code;
    }
   
}
