package Java;
public class Main {

    public static void main(String[] args) {

        // CAR
        System.out.println("CAR====================================================");
        Car car = new Car("AMQ258", new Account("Andrés López", "AND123"));        
        car.printDataCar();
        
        // UBERX
        System.out.println("UBERX====================================================");
        UberX uberX = new UberX("HZI833", new Account("Felipe Molina", "HS73N73HD73JD"), "Ford", "Focus");
        uberX.setPassenger(4);
        uberX.getPassenger();
        uberX.printDataCar();        

        // CARD
        System.out.println("CARD====================================================");
        Card card = new Card(3246, 5429983212272529L, (short)611, "06/23");
        card.printPaymentId();
        card.printCardInfo();

        // PAYPAL
        System.out.println("PAYPAL====================================================");
        PayPal paypal = new PayPal(3645, "andres@example.com");
        paypal.printPaymentId();
        paypal.printPaypalInfo();

        // CASH
        System.out.println("CASH====================================================");
        Cash cash = new Cash(2454);
        cash.printPaymentId();

        // ACCOUNT USER
        System.out.println("ACCOUNT USER====================================================");
        User user = new User("Andrés López", "JKLDASY780D", "andres@example.com", "SJ#K=FD987DFNF*");
        user.printAccountInfo();

        // DRIVER USER
        System.out.println("DRIVER USER====================================================");
        Driver driver = new Driver("Mariana Arango", "KDS98320U453", "mariana@example.com", "JSD&0344-454");
        driver.printAccountInfo();

    }

}