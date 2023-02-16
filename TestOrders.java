public class TestOrders {
    public static void main(String[] args) {
        BadOwl badOwl = new BadOwl(); 

        badOwl.addItem("banana -- $2.00");
        badOwl.addItem("coffee -- $1.50");
        badOwl.addItem("latte -- $4.50");
        badOwl.addItem("capuccino -- $3.00");
        badOwl.addItem("muffin -- $4.00");
        
        badOwl.newOrder();
    }
}