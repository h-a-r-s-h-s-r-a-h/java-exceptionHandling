package eh4;

public class Main {
    public static void main(String[] args) throws CurrenciesDoNotMatch{
        Amount amount2 = new Amount("USD", 100);
        Amount amount1 = new Amount("IND", 10);
        amount1.add(amount2);
        amount2.substract(amount1);
        System.out.println(amount1);
    }
}

class Amount{
    private String currency;
    private int amount;
    public Amount(String currency, int amount){
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) throws CurrenciesDoNotMatch{
        // for unchecked exceptions;
        if(!this.currency.equals(that.currency)){
            throw new CurrenciesDoNotMatch("Currencies Don't match!");
        }
        this.amount = this.amount + that.amount;
    }

    public void substract(Amount that) throws CurrenciesDoNotMatch{
        //for checked exceptions;
        if(!this.currency.equals(that.currency)){
            throw new CurrenciesDoNotMatch("Currencies Don't match!");
            //throw new Exception("Currencies Don't match!");
        }
        this.amount = this.amount - that.amount;

    }

    public String toString(){
        return currency + " " + amount;
    }
}
class CurrenciesDoNotMatch extends Exception{
    public CurrenciesDoNotMatch(String msg){
        super(msg);
    }
}