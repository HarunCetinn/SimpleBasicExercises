package inheritance;

public class Main {

	public static void main(String[] args) {
		ŻndividualCustomer bireysel1 = new ŻndividualCustomer();
		bireysel1.CustomerNumber = "12345";
		
		
		CorporateCustomer kurumsal1 = new CorporateCustomer();
		kurumsal1.CustomerNumber = "123999";
		
		SendikaCustomer sendika1 = new SendikaCustomer();
		sendika1.CustomerNumber = "6666";
		
		CustomerManager customerManager = new CustomerManager();
		/*customerManager.Add(kurumsal1);
		customerManager.Add(bireysel1);
		customerManager.Add(sendika1);
		*/
		Customer[] customers = {bireysel1, kurumsal1, sendika1 };
		customerManager.AddMultiple(customers);
		
		
		
		
	}

}
