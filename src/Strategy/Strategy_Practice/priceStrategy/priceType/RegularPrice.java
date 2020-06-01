package Strategy.Strategy_Practice.priceStrategy.priceType;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(isSignedUpForNewsletter == false) {
            System.out.println("Normalna cena: " + price);
        }
        if(isSignedUpForNewsletter == true) {
            System.out.println("Użytkownik zapisany do newslettera, należy wybrać inną strategię cenową!");
        }
    }
}
