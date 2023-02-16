import java.util.ArrayList; 

public class Order {
    // variables 
        private String name;  // null is default
        private boolean ready; // false is default
        private ArrayList<Item> items;
    
    // constructor
    // without arguments "Guest" starts off as empty array
        public Order() {
            this.name = "Guest";
            this.items = new ArrayList<Item>(); 
        }
    
    // overload the constructor 
    // name is the argument 
        public Order(String name) {
            this.name = name; 
            this.items = new ArrayList<Item>(); 
        }
    //Getters and setters
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public boolean getReady() {
            return this.ready;
        }
        public void isReady(boolean ready) {
            this.ready = ready; 
        }
        public ArrayList<Item> getItems() {
            return this.items;
        }
        public void setItems(ArrayList<Item> items) {
            this.items = items; 
        }

        public void addItem(Item item) {
            items.add(item);
        }
        public String getStatusMessage() {
            if (this.ready == true){
                return 
                ("Dear costumer, your order is ready, enjoy!");
            } else {
                return
                ("Please wait");
            }
        }
        public double getOrderTotal() {
            double total = 0.00;
            for (Item item: items) {
                total += item.getPrice();
            }
            return total; 
        }
        public void display() {
            System.out.printf
            ("\n Costumer Name: %s \n", this.name);
            for (Item item : this.items) {
                System.out.printf(item.getName() + " - $" + item.getPrice() + "\n");
            }
            System.out.printf
            ("Your total is: $%s", this.getOrderTotal());
        }

}