package Strategy.Strategy_Practice.priceStrategy.priceType;

public interface PricingStrategy {
    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
