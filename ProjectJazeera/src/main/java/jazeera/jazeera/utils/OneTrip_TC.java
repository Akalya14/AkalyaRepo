package jazeera.jazeera.utils;

import org.testng.annotations.Test;

import jazeera.jazeera.common.CommonMethod;
import jazeera.jazeera.pages.Trip;




public class OneTrip_TC  extends CommonMethod {
	
		@Test
		public void Select() throws InterruptedException {
			
			Trip tr=new Trip();
			tr.TripSelect("one")
			
			
			.ClickSearch()
			.VerifySearchFlight()
			.SearchFlight()
			.SelectMr()
			.Fname()
			.lname()
			.Gender1()
			.Adult2Mr()
			.Adult2fname()
			.Adult2Lname()
			.Gender2()
			.ChildMr()
			.ChildFname()
			.ChildLname()
			.Title()
			.Fname()
			.Lname()
			.Country()
			.CountryCode()
			.Mobile().Email()
			.click();
			
			
			
			
			
			
		}
			
			 
			}
			




	

