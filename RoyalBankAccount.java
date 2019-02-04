/**
 * This class describes Royal Bank Account.
 *
 * @author (Mark Ng)
 * @version (1.0)
 */
public class RoyalBankAccount{
    private final String        BANK_MOTTO;
    private final int           ACCOUNT_NUMBER;
    private double              interestRate;
    private double              balanceUSD;
    private int                 thePin;
    private static String       firstName;
    private static String       lastName;
    private boolean             isOverdraftAvailable;
    
    /**
     * @param theInterestRate - is the interest rate
     * @param theBalanceUSD - is the account holders balance
     * @param pinNumber - is the pin number
     * @param givenName - is the first name of the account holder
     * @param surName - is the last name of the account holder
     * @param overdraftAvailable - is an overdraft available for the account holder
     */
    public RoyalBankAccount(double theInterestRate, 
                            double theBalanceUSD,
                            final String bankMotto,
                            int pinNumber, 
                            String givenName, 
                            String surName, 
                            boolean overdraftAvailable
                            )
    {
 
    if(theInterestRate == 0.025){
        interestRate = theInterestRate;
    }else{
        throw new IllegalArgumentException("The interest rate is not valid");
    }
    if(theBalanceUSD != 0){
        balanceUSD = theBalanceUSD;
    }else{
        throw new IllegalArgumentException("The balance is not valid");
    }
    if(pinNumber != 0){
        thePin = pinNumber;
    }else{
        throw new IllegalArgumentException("The pin number is invalid");
    }
    if(givenName != null){
        firstName = givenName;
    }else{
        throw new IllegalArgumentException("The given name is not valid");
    }
    if(surName != null){
        lastName = surName;
    }else{
        throw new IllegalArgumentException("The last name is not valid");
    }
    if(overdraftAvailable){
        isOverdraftAvailable = true;
    }
    if(bankMotto != null)
        BANK_MOTTO = bankMotto;
        
 }
    
    public double getTheInterestRate(){
        return interestRate; 
 }
    
    public double getTheBalanceUSD(){
        return balanceUSD;           
 }
    
    public int getPinNumber(){
        return thePin;
 }
    
    public String getGivenName(){
        return firstName;
 }
    
    public String getSurname(){
        return lastName;
 }
    
    public boolean getOverdraftAvailable(){
        return isOverdraftAvailable;
 }
    
    public void setGetTheInterestRate(double theInterestRate){
    if(theInterestRate == 0.025){
        interestRate = theInterestRate;
    }else{
        throw new IllegalArgumentException("The interest rate is not valid");
    }
 }
    public void setGetTheBalance(double theBalanceUSD){
       if(theBalanceUSD != 0){
        balanceUSD = theBalanceUSD;
    }else{
        throw new IllegalArgumentException("The balance is not valid");
    } 
 }
    
    public void setPinNumber(int pinNumber){
    if(pinNumber != 0){
        thePin = pinNumber;
    }else{
        throw new IllegalArgumentException("The pin number is invalid");
    }
 }

    public void setGivenName(String givenName){
    if(givenName != null){
        firstName = givenName;
    }else{
        throw new IllegalArgumentException("The given name is not valid");
    }
 }

    public void setSurName(String surName){
    if(surName != null){
        lastName = surName;
    }else{
        throw new IllegalArgumentException("The last name is not valid");
    }
 }

    public void setOverdraftAvailable(boolean overdraftAvailable){
    if(overdraftAvailable){
        isOverdraftAvailable = true;
    }   
 }    
    /**
     * @param  amount - the amount of money to withdraw
     * @return 
     */
    
  public boolean withdrawMoney(double amount){
   if(balanceUSD >= amount){
       balanceUSD = amount;
       return true;
      }else
        if(isOverdraftAvailable = true){
      }    
        return false;
 }
   
  public boolean depositMoney(double amount){
  if(balanceUSD >= amount){
       balanceUSD = amount;
       return true;
    }else{
  if(balanceUSD >= 10000){
       balanceUSD = amount;
       System.out.println("The manager will be contacting you. Thank you for your deposit");
    }return true;
  }
} 
  public static double getPrimeInterestRate(double theInterestRate, String BANK_MOTTO){
  if(theInterestRate == 0.025)
    interestRate = theInterestRate;
    bankMotto = BANK_MOTTO;
  }return true;
 }
}  



      
      
       
 
