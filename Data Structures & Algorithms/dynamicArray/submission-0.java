class DynamicArray {
    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return data[i];
    }

    public void set(int i, int n) {
        data[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity){
            resize();
        }
        data[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return data[size];
    }

    private void resize() {
        int newCap = capacity * 2;
        int[] newData = new int[newCap];
        for(int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
        capacity = newCap;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
