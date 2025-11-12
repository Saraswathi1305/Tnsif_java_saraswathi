package com.tnsif.entityclass;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer c1=new Customer();
        c1.id=101;
        c1.cname="raja";
        c1.city="villupuram";
        System.out.println("id:"+c1.id+" name:"+c1.cname:" city:"+c1.city);
        
        Customer c2=new Customer();
        c2.id=102;
        c2.cname="raj";
        c2.city="villupuram";
        System.out.println("id:"+c2.id+" name:"+c2.cname:" city:"+c2.city);
        
	}

}
