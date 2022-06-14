import java.util.*;
import java.util.stream.Collectors;

/*
Программа содержит форму ввода счета-фактуры.
Производит автоматический расчет totalValue и добавляет значение в коллекцию.
Выводит в консоль новую счет-фактуру.
Выводит в консоль весь перечень счетов-фактур.
Отображает список всех товаров.
Выводит в консоль список внешних поставщиков.
Через консоль запрашивает наименование товара, который необходимо найти на складе.
Осуществляет поиск товаров на складе по названию.
*/


public class Program {

    public static void main(String[] args) {
        // Коллекция счета-фактур
        ArrayList<GoodsReceivedNote> goodsReceivedNoteList = new ArrayList<>();
        GoodsReceivedNote invoice1 = new GoodsReceivedNote("M&M", "Mila", 1,
                "2022-05-02", "Shower gel", "piece", 2, 2,
                12, 24);
        GoodsReceivedNote invoice2 = new GoodsReceivedNote("Stock 1", "Mila", 2,
                "2022-05-15", "Shampoo", "piece", 10, 10,
                15, 150);
        GoodsReceivedNote invoice3 = new GoodsReceivedNote("Stock 2", "Mila", 3,
                "2022-05-26", "Washing powder", "piece", 5, 5,
                45, 225);
        goodsReceivedNoteList.add(invoice1);
        goodsReceivedNoteList.add(invoice2);
        goodsReceivedNoteList.add(invoice3);

        inputDatas(goodsReceivedNoteList);
        getGoodsInStock(goodsReceivedNoteList);
    }

    public static void inputDatas(ArrayList<GoodsReceivedNote> goodsReceivedNoteList) {
        // Коллекция поставщиков
        ArrayList<String> suppliers = new ArrayList<>();
        suppliers.add("M&M");
        suppliers.add("Stock 1");
        suppliers.add("Stock 2");

        //Коллекция товаров
        ArrayList<String> allGoodsInStock = new ArrayList<>();
        allGoodsInStock.add("Shower gel");
        allGoodsInStock.add("Shampoo");
        allGoodsInStock.add("Washing powder");


        // Форма вводы счета-фактуры
        Scanner in = new Scanner(System.in);
        System.out.println("Fill in the invoice.\n From (Supplier): ");
        String supplier = in.nextLine();
        suppliers.add(supplier);
        System.out.println("To (Receiving): ");
        String receiving = in.nextLine();
        System.out.println("Order No: ");
        double orderNo = in.nextDouble();
        in.nextLine();
        System.out.println("Date (YYYY-MM-DD): ");
        String date = in.nextLine();
        System.out.println("Product Name: ");
        String productName = in.nextLine();
        allGoodsInStock.add(productName);
        System.out.println("Unit: ");
        String unit = in.nextLine();
        System.out.println("Qty Ordered: ");
        double qtyOrdered = in.nextDouble();
        in.nextLine();
        System.out.println("Qty Received: ");
        double qtyReceived = in.nextDouble();
        in.nextLine();
        System.out.println("Unit Cost: ");
        double unitCost = in.nextDouble();
        in.nextLine();

        // Отображение новой счет-фактуры
        double totalValue = qtyReceived * unitCost;
        System.out.printf("New invoice{" +
                "Supplier='" + supplier + '\'' +
                ", Receiving='" + receiving + '\'' +
                ", Order No='" + orderNo + '\'' +
                ", Date='" + date + '\'' +
                ", Product Name='" + productName + '\'' +
                ", Unit='" + unit + '\'' +
                ", Qty Ordered='" + qtyOrdered + '\'' +
                ", Qty Received='" + qtyReceived + '\'' +
                ", Unit Cost='" + unitCost + '\'' +
                ", Total Value='" + totalValue + '\'' +
                '}' + "\n");

        GoodsReceivedNote invoice = new GoodsReceivedNote(supplier, receiving, orderNo, date,
                productName, unit, qtyOrdered, qtyReceived, unitCost, totalValue);
        goodsReceivedNoteList.add(invoice);

        // Отображение списка всех счет-фактур
        System.out.println("List of invoices: ");
        goodsReceivedNoteList.forEach(System.out::println);

        // Отображение списка всех товаров на складе
        System.out.println("List goods in stock: " + allGoodsInStock);

        // Отображение списка внешних поставщиков
        List<String> externalSuppliers = suppliers.stream().filter((s) -> !s.contains("Stock")).toList();
        System.out.println("List of external suppliers: " + externalSuppliers);
    }

    public static void getGoodsInStock(ArrayList<GoodsReceivedNote> goodsReceivedNoteList){
        //Поиск товаров на складе по названию
        Scanner in = new Scanner(System.in);
        System.out.println("Input product name: ");
        String productName = in.nextLine();

        ArrayList<GoodsReceivedNote> goodsInStock = (ArrayList<GoodsReceivedNote>) goodsReceivedNoteList
                .stream().filter(g -> (g.getProductName().equalsIgnoreCase(productName))&&
                        (g.getSupplier().equalsIgnoreCase("Stock")||
                        g.getSupplier().equalsIgnoreCase("Stock 1")||
                        g.getSupplier().equalsIgnoreCase("Stock 2")))
                .collect(Collectors.toList());

        System.out.println("Goods in stock: ");
        goodsInStock.forEach(System.out::println);
    }
}

