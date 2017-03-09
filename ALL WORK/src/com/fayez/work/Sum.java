package com.fayez.work;

public class Sum
{
	int x = 0;
    int y = 0;
    
    public Sum(int x, int y)
    {
        this.x =x;
        this.y = y;
        
    }
   
    
    public String toString()
    {
    	int sumof=0;
        sumof = this.x + this.y;
        return "\nNumber : " + this.x +
        		"\nNumber : " + this.y +
        		"\nEquals : " + sumof;
        
    }
    
    public static void main(String []args)
    {
    	Sum question = new Sum(1,3);
    	System.out.println(question);
    }
}


    
