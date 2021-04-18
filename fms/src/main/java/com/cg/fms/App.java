package com.cg.fms;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.fms.dto.Orders;
import com.cg.fms.service.ILoginServiceImpl;
import com.cg.fms.service.OrderServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Orders odd=new Orders(58,"north-Banglore",LocalDate.now(),10);
    	ILoginServiceImpl loginService=new ILoginServiceImpl();
    	OrderServiceImpl orderService = new OrderServiceImpl();
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        System.out.println("UserName:");
        String uname=sc.nextLine();
        System.out.println("Password:");
        String pass=sc.nextLine();
        System.out.println("Role:");
        String role=sc.nextLine();
        //System.out.println(loginService.validate(uname, pass, role));
        //System.out.println(orderService.addOrder(new Orders(58,"Banglore",LocalDate.now(),752)));
        System.out.println(orderService.getOrder(58));
        System.out.println(orderService.getAllOrders());
        //System.out.println(orderService.updateOrders(new Orders(58,"north-Banglore",LocalDate.now(),10)));
        System.out.println(orderService.deleteOrder(56));
    }
}
