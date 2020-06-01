package Strategy.Strategy_Practice;

import Strategy.Strategy_Practice.priceStrategy.priceType.PricingStrategy;

public class PriceCalculator {
    private PricingStrategy pricingStrategy;


    public void setPricingStrategy(Strategy.Strategy_Practice.priceStrategy.priceType.PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }


    public void calculate(int price, boolean isSignedUpForNewsletter){
        this.pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }
}
