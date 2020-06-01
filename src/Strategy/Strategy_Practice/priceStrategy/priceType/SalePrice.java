package Strategy.Strategy_Practice.priceStrategy.priceType;

public class SalePrice implements PricingStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {

        if(isSignedUpForNewsletter == false) {
            System.out.println("Przecena: " + price/2);
        }
        if(isSignedUpForNewsletter == true) {
            System.out.println("Użytkownik nie jest zapisany do newslettera, należy wybrać inną strategię cenową!");
        }
    }
}
