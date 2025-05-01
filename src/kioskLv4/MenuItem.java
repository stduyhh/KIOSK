    package kioskLv4;

    public class MenuItem {
        String menu;
        double price;
        String information;

        public MenuItem(String menu, double price, String information){
            this.menu = menu;
            this.price = price;
            this.information = information;
        }

        public String getMenu() {
            return menu;
        }

        public double getPrice() {
            return price;
        }

        public String getInformation() {
            return information;
        }
    }
