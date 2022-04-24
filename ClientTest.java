package com.mypack.employe;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class ClientTest {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("raj");
		EntityManager em=emf.createEntityManager();
		 EntityTransaction t=em.getTransaction();
				 t.begin();
		Student s=new Student();
		s.setId(102);
		s.setName("Sagar");
		s.setFees(123);
		em.persist(s);
		t.commit();
		emf.close();
		em.close();
		System.out.println("Data saved Successfully...");
	}
}