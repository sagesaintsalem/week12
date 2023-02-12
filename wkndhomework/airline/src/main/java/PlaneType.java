public enum PlaneType {
    BOEING747(200, 20000),
    CONCORDE(150, 15000),
    MAGICTINCAN(1000, 200);

    private int capacity;
    private int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
