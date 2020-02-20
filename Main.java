import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue add1 = new Queue(5);

        add1.tammbahList(3,"zia");
        add1.tammbahList(2,"udin");
        add1.tammbahList(1,"ocha");


        System.out.println( add1.intipDepan());
        System.out.println( add1.hapusItem());
        System.out.println( add1.intipDepan());

        add1.hapuslist();

    }
}
