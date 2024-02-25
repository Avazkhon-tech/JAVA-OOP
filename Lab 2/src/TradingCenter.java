public class TradingCenter {
    Floor[] floors = new Floor[3];

    public TradingCenter() {
        for (int i = 0; i < 3; i++) {
            floors[i] = new Floor();
        }
    }

    public void addStore(String id, String name, String type) {
        if (type.equals("baby")) {
            floors[0].addStore(id, name, type);
        } else if (type.equals("men")) {
            floors[1].addStore(id, name, type);
        } else if (type.equals("women")) {
            floors[2].addStore(id, name, type);
        }
    }

    public void addStore(String id, String name, String type,) {
        if (type.equals("baby")) {
            floors[0].addStore(id, name, type);
        } else if (type.equals("men")) {
            floors[1].addStore(id, name, type);
        } else if (type.equals("women")) {
            floors[2].addStore(id, name, type);
        }
    }
}



