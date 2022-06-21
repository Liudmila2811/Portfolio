public class GoodsReceivedNote {
    String supplier;
    String receiving;
    double orderNo;
    String date;
    String productName;
    String unit;
    double qtyOrdered;
    double qtyReceived;
    double unitCost;
    double totalValue;


    public GoodsReceivedNote(String supplier, String receiving, double orderNo, String date, String productName,
                             String unit, double qtyOrdered, double qtyReceived, double unitCost,
                             double totalValue) {
        this.supplier = supplier;
        this.receiving = receiving;
        this.orderNo = orderNo;
        this.date = date;
        this.productName = productName;
        this.unit = unit;
        this.qtyOrdered = qtyOrdered;
        this.qtyReceived = qtyReceived;
        this.unitCost = unitCost;
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "GoodsReceivedNote{" +
                "supplier='" + supplier + '\'' +
                ", receiving='" + receiving + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", date='" + date + '\'' +
                ", productName='" + productName + '\'' +
                ", unit='" + unit + '\'' +
                ", qtyOrdered='" + qtyOrdered + '\'' +
                ", qtyReceived='" + qtyReceived + '\'' +
                ", unitCost='" + unitCost + '\'' +
                ", totalValue='" + totalValue + '\'' +
                '}';
    }
    
    public String toString2() {
        return "Goods in stock:{" +
                "supplier='" + supplier + '\'' +
                ", productName='" + productName + '\'' +
                ", unit='" + unit + '\'' +
                ", qtyReceived='" + qtyReceived + '\'' +
                '}';
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getReceiving() {
        return receiving;
    }

    public void setReceiving(String receiving) {
        this.receiving = receiving;
    }

    public double getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(double orderNo) {
        this.orderNo = orderNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(double qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public double getQtyReceived() {
        return qtyReceived;
    }

    public void setQtyReceived(double qtyReceived) {
        this.qtyReceived = qtyReceived;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
