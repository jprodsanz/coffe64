public class Item {
    // Below are our variables
        private String name;
        private double price;
        private int  index; 

    // Constructor takes name and price as parameters
        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    // Getter and Setters zone (name and price)
        public String getName() {
            return this.name;
        }
            public void setName(String name) {
                this.name = name;
            }
        public double getPrice() {
            return this.price; 
        }
            public void setPrice(double price) {
                this.price = price;
            }
        public int getIndex() {
            return this.index; 
        }
            public void setIndex(int  index) {
                this.index = index;
            }

}