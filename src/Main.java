public class Main {
    public static void main(String[] args) {
       VatCalcalator calculate = new VatCalcalator();
       calculate.getPrice();
       calculate.calculateVat(calculate.price);
       calculate.calculateTotal();

       System.out.println(calculate.calculateVat(calculate.price));
       System.out.print(calculate.calculateTotal());


    }
}