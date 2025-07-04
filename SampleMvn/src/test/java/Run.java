
public class Run {

	public static void main(String[] args) {
		
		LoginTest login= new LoginTest();
		AddToCartTest cart= new AddToCartTest();
		LogOutTest lo = new LogOutTest();
		
		login.login();
		cart.addcart();
		lo.logout();
	}

}
