package sort;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Product[] products=new Product[6];
        products[0]=new Product("bamba",80,8);
        products[1]=new Product("bisli",40,4);
        products[2]=new Product("chitos",55,6);
        products[3]=new Product("bafla",100,13);
        products[4]=new Product("cofee",75,22);
        products[5]=new Product("kola",800,7);
        for (Product product:products) {
            System.out.println(product);
        }
//        Arrays.sort(products);
        Arrays.sort(products,new SortByNameAscending());
        System.out.println();
        for (Product product:products) {
            System.out.println(product);
        }


    }
}
