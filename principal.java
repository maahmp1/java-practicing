import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        classes classes = new classes();
        //cliente
        //o que comprou
        // quem comprou
        //qto pagou
        // quem vendeu
        // qual a comissao

        System.out.println("-----------------------------------------------------------");
        System.out.println("Informe o *nome* do cliente: ");
        classes.cliente = sc.next();
        System.out.println("Informe o *telefone* do cliente: ");
        classes.telefone = sc.next();
        System.out.println("Informe o *endereço* do cliente: ");

        classes.endereco = sc.next();
        System.out.println("-----------------------------------------------------------");

        //produto 1
        String prod1;
        double preco_prod1;
        int qt_prod1;

        System.out.println("Informe o *nome* do 1º produto: ");
        classes.nome_prod1 = sc.next();
        System.out.println("Informe o *preço* do 1º produto: ");
        classes.preco_prod1 = sc.nextDouble();
        System.out.println("Informe a *quantidade* do 1º produto: ");
        classes.quant_prod1 = sc.nextInt();


        //
        //prod2
        String prod2;
        double preco_prod2;
        int qt_prod2;
        System.out.println("-----------------------------------------------------------");
        System.out.println("Informe o *nome* do 2º produto: ");
        classes.nome_prod2 = sc.next();
        System.out.println("Informe o *preço* do 2º produto: ");
        classes.preco_prod2 = sc.nextDouble();

        System.out.println("Informe a *quantidade* do 2º produto: ");
        classes.quant_prod2 = sc.nextInt();
        System.out.println("-----------------------------------------------------------");

        System.out.println("");

        //

        //vendedor
        String vendedor;
        System.out.println("Informe o *nome* do vendedor: ");
        classes.vendedor = sc.next();

        //cliente
        System.out.println("-----------------------------------------------------------");
        System.out.println("CLIENTE");
        System.out.println("Nome: " + classes.cliente);
        System.out.println("Endereço: " + classes.endereco);
        System.out.println("Telefone: " + classes.telefone);
        //vendedor
        System.out.println("-----------------------------------------------------------");
        System.out.println("VENDEDOR");
        System.out.println("Nome: " + classes.getVendedor());
        System.out.println("-----------------------------------------------------------");
        System.out.println("PRODUTO 1");
        System.out.println("Nome: " +classes.nome_prod1);
        System.out.println("Preço: " + classes.preco_prod1);
        System.out.println("Quantidade: " + classes.quant_prod1);
        System.out.println("-----------------------------------------------------------");
        System.out.println("PRODUTO 2");
        System.out.println("Nome: " +classes.nome_prod2);
        System.out.println("Preço: " + classes.preco_prod2);
        System.out.println("Quantidade: " + classes.quant_prod2);
        System.out.println("-----------------------------------------------------------");



    }
}
