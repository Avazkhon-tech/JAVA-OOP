public class TradingCenter {
    Floor[] floor = new Floor[3];

    public TradingCenter() {
        for (int i = 0; i < floor.length; i++) {
            floor[i] = new Floor();
        }
    }

    public void addStore(String id, String name, String type) {
        if (type.equals("baby"))
            floor[0].addStore(id, name, type);
        else if (type.equals("women"))
            floor[1].addStore(id, name, type);
        else
            floor[2].addStore(id, name, type);
    }

    public void addStore(String id, String name, String type, int positionId) {
        if (type.equals("baby"))
            floor[0].addStore(id, name, type, positionId);
        else if (type.equals("women"))
            floor[1].addStore(id, name, type, positionId);
        else
            floor[2].addStore(id, name, type, positionId);

    }

    public void print() {
        for (int i = 0; i < floor.length; i++) {
            floor[i].print();

        }
    }

    public void search(String id) {
        for (int i = 0; i < floor.length; i++) {
            floor[i].search(id);
        }
    }
}




























