
public class CustomerManager {
	
	public ILogger loggers;
	
	public CustomerManager(ILogger logger) {
		this.loggers = logger;
	}
	
	public void MüşteriKontrol(Customer customer) {
		System.out.println("Müşteri bilgileriniz doğrulandı: " +customer.getTcNo()+" "+ customer.getAd()+" "+customer.getSoyad());
		
		}
	
	

}
