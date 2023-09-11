package com.hibernate;

import org.hibernate.SessionFactory;

import com.util.HibernateUtils;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory session = HibernateUtils.getSessionFactory();
        System.out.println(session);
    }
}
