class Water implements Tank<Double> {
    private final double capacity;
    private double currentLevel;
    
    public Water() {
        this.capacity = 1000.0; // Default capacity
        this.currentLevel = 0.0;
    }
    
    @Override
    public void fill(Double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Fill amount must be positive.");
        }
        
        if (currentLevel + amount <= capacity) {
            currentLevel += amount;
        } else {
            currentLevel = capacity;
            throw new IllegalArgumentException("Overflow! Tank is now full.");
        }
    }
    
    @Override
    public Double drain(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Drain amount must be positive.");
        }
        
        if (currentLevel - amount >= 0) {
            currentLevel -= amount;
            return amount;
        } else {
            double drained = currentLevel;
            currentLevel = 0;
            throw new IllegalArgumentException("Underflow! Only " + drained + " units drained. Tank is now empty.");
        }
    }
    
    @Override
    public Double getLevel() {
        return currentLevel;
    }
    
    @Override
    public boolean isEmpty() {
        return currentLevel == 0;
    }
    
    @Override
    public boolean isFull() {
        return currentLevel >= capacity;
    }
    
    public double getCapacity() {
        return capacity;
    }
}
