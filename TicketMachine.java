/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.1
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount < 0) {
            System.out.println("Use a positive amount rather than: " + amount);
        }
        else {
            balance = balance + amount;
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        int amountLeftToPay;
        amountLeftToPay = price - balance;
        if(amountLeftToPay <= 0) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else{
            System.out.printf("You have %d cents left to pay %n" , amountLeftToPay);
        }
        
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    /**
     * affordable
     */
    public void affordable(int budget)
    {
         // TODO: Write an if-statement that checks budget against price and prints
        // a message weather a ticket is affordable
        if(price > budget) {
            System.out.printf("Too expensive. Your budget is %d cents. %n", budget);
        }
        else{
            System.out.println("Just right.");
        }
    }
    
    /**
     * emptyMachine
     */
    public int emptyMachine()
    {
        int amountToReturn;
        amountToReturn = total;
        total = 0;
        return amountToReturn;
    }
    
    /**
     * Discount
     */
    public void printDiscountedTicket()
    {
        int discount;
        int amountLeftToPay;
        discount = price * (1 / 2);
        amountLeftToPay = discount - balance;
        if(amountLeftToPay <= 0) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Discounted Ticket");
            System.out.println("# " + discount + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + discount;
            // Reduce the balance by the price.
            balance = balance - discount;
        }
        else{
            System.out.printf("You have %d cents left to pay %n" , amountLeftToPay);
        }
        
    }
}
