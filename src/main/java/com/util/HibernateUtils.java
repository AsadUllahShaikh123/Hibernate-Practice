package com.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entities.EmployeeAnotationExample;
import com.entities.Student;
import com.mapping.Chancellor;
import com.mapping.University;
import com.mapping.one_to_many.Publisher;
import com.mapping.one_to_many.Title;


public class HibernateUtils {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate-demo");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "Admin");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "update");

                configuration.setProperties(settings);
//                configuration.addAnnotatedClass(Student.class);
//                configuration.addAnnotatedClass(EmployeeAnotationExample.class);
//                configuration.addAnnotatedClass(com.crud.Student.class);
//                configuration.addAnnotatedClass(University.class);
//                configuration.addAnnotatedClass(Chancellor.class);
                configuration.addAnnotatedClass(Title.class);
                configuration.addAnnotatedClass(Publisher.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}