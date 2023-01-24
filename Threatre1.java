class Threatre1{
public static void main(String[]args){
Threatre1 raja = new Threatre1();
int balance = raja.bookTicket(200);
System.out.println("After booking ticket " + balance);
}
int bookTicket(int sum){
int s = sum;
int ticket_price = 120;
int balance = s - ticket_price;
return balance;
}
}

