public enum BedroomType {
    QUAD(4),
    TRIPLE(3),
    DOUBLE(2),
    SINGLE(1);

    private final int capacity;

    BedroomType (int capacity){

        this.capacity = capacity;
    }

    public int getCapacity(){

        return this.capacity;
    }

}