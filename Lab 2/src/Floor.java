public class Floor {
    Store[] stores = new Store[10];

    public void addStore(String id, String name, String type) {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] == null) {
                stores[i] = new Store(id, name, type);
                break;
            }
        }
    }
}
