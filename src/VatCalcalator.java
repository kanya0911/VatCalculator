import java.util.Scanner;

public class VatCalcalator {

    public double vat = 7.0;
    public double price;

    public double getPrice() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter price = ");
        price = sc.nextDouble();
        return price;
    }

    public double calculateVat(double price) {
        return price * vat / 100.0;
    }

    public double calculateTotal() {
        return price + calculateVat(price);
    }

}
