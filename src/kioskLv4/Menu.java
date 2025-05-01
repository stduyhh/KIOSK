    package kioskLv4;


    import java.util.ArrayList;

    public class Menu {
        public String name;
        ArrayList<MenuItem> menuItems;

        public Menu(String name){
            this.name = name;
            this.menuItems = new ArrayList<>();
        }
        public String getName() {
            return name;
        }
    }
