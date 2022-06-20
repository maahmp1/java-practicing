import java.text.DecimalFormat;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        //Desenvolver um programa que utiliza classe lendo dados de clientes,
        // de 2 produtos e do vendedor. Fazer o calculo de valor a pagar e de
        // comissão e mostrar os dados do cliente, dos produtos, do valor a pagar
        // do vendedor e da comissão a receber
        classes classes = new classes();
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,##0.00");

        //CLIENT
        //String client_informations = clientName + " | " + telephone_client + " | " +adress_client ;
        System.out.println("-----------------------------------------------------------");
        System.out.println("client name: ");
        classes.clientName = sc.next();
        System.out.println("-----------------------------------------------------------");

        System.out.println("client telephone: ");
        classes.telephone_client = sc.next();
        System.out.println("-----------------------------------------------------------");

        System.out.println("client adress: ");
        classes.adress_client = sc.next();
        System.out.println("-----------------------------------------------------------");

        System.out.println("CLIENT INFORMATIONS: " + classes.getClientInformations());
        System.out.println("-----------------------------------------------------------");


        //PRODUCT1
        //  String product1_informations = product1_name1 +" | "+ product1_color + " | " + product1_type + "| " + precoProduct1;

        System.out.println("product name: ");
        classes.product1_name1 = sc.next();
        System.out.println("-----------------------------------------------------------");

        System.out.println("product color: ");
        classes.product1_color = sc.next();
        System.out.println("-----------------------------------------------------------");

        System.out.println("product type: ");
        classes.product1_type = sc.next();
        System.out.println("-----------------------------------------------------------");

        System.out.println("product price: ");
        classes.priceProduct1 = sc.nextDouble();
        System.out.println("-----------------------------------------------------------");

        System.out.println("PRODUCT 1 INFORMATIONS: " + classes.getProduct1_informations());

        //VENDOR
        System.out.println("vendor name: ");
        classes.vendorName = sc.next();

        System.out.println("VENDOR INFORMATIONS: " + classes.getVendorInformations());
        System.out.println("comission: " + classes.getComissionVendor());


    }
}
