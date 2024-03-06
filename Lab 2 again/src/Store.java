public class Store {
    public String id, name, type;
    int positionId;

    public Store (String id, String name, String type, int positionId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.positionId = positionId;
    }

    @Override
    public String toString() {
        return "Store {" +
                "id: " + id + '\'' +
                "name: " + name + '\'' +
                "type: " + type + '\'' +
                "positionId: " + positionId + '\'' +
                '}';
    }
}
