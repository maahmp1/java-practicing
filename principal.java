public class principal {
    public static void main(String[] args) {

        classes venda = new classes();
        //vendedor (ler)
        venda.cliente = "Luiza";

        // venda 1
        venda.marcaCar1 = "Ferrari";
        venda.anoCar1 = "2291";
        venda.nomeCar1 = "New Era";
        venda.corCar1 = "Rosa";

        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("VENDA 1");
        System.out.println("Comprado por: " + venda.getCliente());
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Vendido por: " + venda.getVendedor());
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("O produto é:");
        System.out.println("Marca: " + venda.marcaCar1 + " | Ano: " + venda.anoCar1 + " | Nome: " + venda.nomeCar1 + " | Cor: " + venda.corCar1);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

        //venda 2

        venda.marcaCar2 = "Ford";
        venda.anoCar2 = "1990";
        venda.nomeCar2 = "Old Era";
        venda.corCar2 = "Prata";
        System.out.println("");
        System.out.println("");
        System.out.println("VENDA 2");
        System.out.println("Comprado por: " + venda.getCliente());
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Vendido por: " + venda.getVendedor());
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("O produto é:");
        System.out.println("Marca: " + venda.marcaCar2 + " | Ano: " + venda.anoCar2 + " | Nome: " + venda.nomeCar2 + " | Cor: " + venda.corCar2);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");



    }
}


