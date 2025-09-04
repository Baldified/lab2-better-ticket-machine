Project: better-ticket-machine
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling
   Pearson Education

It is discussed in chapter 2.

Purpose of project: To illustrate conditional statements.
How to start this project: Create one or more TicketMachine objects.



ANSWERS

47. I predicted that if I were to make the price value to zero it would be free tickets costing 0 cents and I was right. The balance did not change and printing tickets worked.

48. I forgot to make a prediction, but the difference it has made is that you can now insert 0 as an amount of money.

50. It was the isVisible feature. Yes, it was well suited to being controlled by a type with only 2 difference values.

51. In the naive ticket machine it's total = total + balance; and balance = 0; meaning the value of balance is added to the value of total after using printTicket and then the value of balance is set back to 0.
    Whereas in the better ticket machine it's total = total + price; and balance = balance - price; meaning the value of the price is added to the total after using printTicket and the balance only removes the amount of the value of price.

52. It is possible to remove the else part of the if statement in the printTicket method, but when printing a ticket without inserting any money will result in nothing happening.

