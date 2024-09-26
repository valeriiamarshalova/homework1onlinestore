package app;

public class OnlineStore {

    public static void main(String[] args) {

        String finishSymbol = ".";
        String order = "Order No ";
        int orderNum = 1;
        String client = " Client: Alice.";
        String product = "Product: smartphone,";
        double price = 305.99;
        String priceCoin = "price EUR ";
        String address = "Address: Moon Street, ";
        int streetNum = 10;
        System.out.println(order + orderNum + client + "\n" +
                product + "\n"
                + priceCoin + price + finishSymbol + "\n" +
                address + streetNum + finishSymbol);

        orderNum = 2;
        client = " Client: Tom.";
        product = "Product: laptop,";
        price = 570.95;
        address = "Address: Terra Street, ";
        streetNum = 17;
        System.out.println(order + orderNum + client + "\n" +
                product + "\n"
                + priceCoin + price + finishSymbol + "\n" +
                address + streetNum + finishSymbol);
    }

}
