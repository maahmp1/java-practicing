import java.util.Scanner;

public class classes {
    Scanner sc = new Scanner(System.in);
    String cliente;

    public String getCliente() {
        return cliente;

    }

    String corCar1;
    String marcaCar1;
    String anoCar1;
    String nomeCar1;

    public String getProduto1() {

        String produto1 = corCar1 + ", " + marcaCar1 + ", " + anoCar1 + ", " + nomeCar1;

        return produto1;
    }

    String corCar2;
    String marcaCar2;
    String anoCar2;
    String nomeCar2;

    public String getProduto2() {

        String produto2 = corCar2 + ", " + marcaCar2 + ", " + anoCar2 + ", " + nomeCar2;

        return produto2;
    }


    String vendedor;

    public String getVendedor() {
        System.out.println("Insira o nome do vendedor: ");
        vendedor = sc.next();
        return vendedor;
    }

}

