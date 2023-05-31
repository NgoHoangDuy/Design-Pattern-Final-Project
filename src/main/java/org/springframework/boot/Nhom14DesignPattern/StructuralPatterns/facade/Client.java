package facade;

public class Client {

	public static void main(String[] args) {
		ShopFacade.getInstance().buyProductByCashWithFreeShipping("Phat");
		ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("Dat", "0988.999.999");
	}

}
