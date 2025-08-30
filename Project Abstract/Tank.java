interface Tank<E> {
    void fill(E amount);
    E drain(double amount);
    E getLevel();
    boolean isEmpty();  // Changed from int empty() to boolean isEmpty()
    boolean isFull();
}
