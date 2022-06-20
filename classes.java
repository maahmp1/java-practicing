public class classes {
    //Desenvolver um programa que utiliza classe lendo dados de clientes,
    // de 2 produtos e do vendedor. Fazer o calculo de valor a pagar e de
    // comissão e mostrar os dados do cliente, dos produtos, do valor a pagar
    // do vendedor e da comissão a receber

    String clientName, telephone_client;
    // CLIENTE
    String adress_client;

    public String getClientInformations() {
       String client_informations = clientName + " | " + telephone_client + " | " +adress_client ;
        return client_informations;
    }

    //VENDEDOR
    String vendorName;

    public String getVendorInformations(){
        String vendorInformations = vendorName;
        return vendorInformations;
    }

    //PRODUTO1

    String product1_name1, product1_color, product1_type;
    double priceProduct1;
    public String getProduct1_informations(){
        String product1_informations = product1_name1 +" | "+ product1_color + " | " + product1_type + "| " + priceProduct1;
        return product1_informations;
    }
    //COMISSION
    double product1_quant;
    public double getComissionVendor(){
        double comission = priceProduct1 - (priceProduct1 * 0.1);
        return comission;
    }

}
