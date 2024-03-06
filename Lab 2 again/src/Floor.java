public class Floor {
    Store[] stores =  new Store[10];


    public void addStore(String id, String name, String type) {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] == null) {
                stores[i] = new Store(id, name, type, i);
                break;
            }

        }
    }

    public void addStore(String id, String name, String type, int positionId) {
        stores[positionId] = new Store(id, name, type, positionId);
    }

    public void print() {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] != null) {
                System.out.println(stores[i]);
            }
        }
    }

    public void search(String id) {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] != null) {
                if (stores[i].id.equals(id)) {
                    System.out.println("Found it!");
                    System.out.println(stores[i]);
                    break;
                }
            }
        }
        System.out.println("Does not exist");
    }
}





























