public class classes {
    //String corCar2;
    //    String marcaCar2;
    //    String anoCar2;
    //    String nomeCar2;
    //
    //    public String getProduto2() {
    //
    //        String produto2 = corCar2 + ", " + marcaCar2 + ", " + anoCar2 + ", " + nomeCar2;
    //
    //        return produto2;
    //    }
    // System.out.println("Marca: " + venda.marcaCar2 + " | Ano: " + venda.anoCar2 + " | Nome: " + venda.nomeCar2 + " | Cor: " + venda.corCar2);
    String cliente;
    String telefone;
    String endereco;
    public String getCliente() {

        String cliente1 = cliente + ", " + telefone + ", " + endereco + ".";
        return cliente1;
    }

    String nome_prod1;
    double preco_prod1;
    int quant_prod1;
    public String getProd1() {

        String prod1 = nome_prod1 + ", " + quant_prod1 + ", " + quant_prod1 + ".";
        return prod1;
    }

    String nome_prod2;
    double preco_prod2;
    int quant_prod2;
    public String getProd2() {

        String prod2 = nome_prod2 + ", " + quant_prod2 + ", " + quant_prod2 + ".";
        return prod2;
    }

    String vendedor;
    public String getVendedor(){
        return vendedor;
    }
}
