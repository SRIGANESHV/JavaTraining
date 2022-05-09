import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CrudTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Trying to read persistence.xml file...");
		
		//3
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager created....");
		
		EntityTransaction et = em.getTransaction();
		System.out.println("EntityTransaction created....");
		
		System.out.println("Trying to create record.....");
		Flight theFlight= new Flight();
		
		/*
		theFlight.setFlightNumber(105);
		theFlight.setFlightName("Vistara");
		theFlight.setFlightSource("Jaipur");
		theFlight.setFlightDestination("Hydrabad");
		theFlight.setFlightTicketCost(6000);
		theFlight.setNumberOfPassangers(290);
		theFlight.setFlightDepartureFromSource(LocalDateTime.now());
		theFlight.setFlightArrivalAtDestination(LocalDateTime.now());
		
		et.begin();
		em.persist(theFlight);
		et.commit();
		System.out.println("=================");
		*/
		
		et.begin();
		Flight f = em.find(Flight.class, 105);	
		f.setFlightNumber(101);
		//f.setFlightSource("Honkong");
		//em.merge(f);
		//em.remove(f); // Please Uncomment the code when want to remove
		//f.getFlightName();
		
		//et.commit();
		
				
		Query q = em.createNativeQuery("SELECT * FROM Flight_Info", Flight.class);
		List<Flight> flight1 = (List<Flight>) q.getResultList();
		System.out.println("Created the record....."+flight1);
		
		for(Flight list:flight1)
		{
			System.out.println("Flight Number is: "+list.getFlightNumber());
			
		}
		
		System.out.println("Created the record.....");
		
	}

}