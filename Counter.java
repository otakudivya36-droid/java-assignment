class Counter {
    static int count = 0;
    int id;

    // Runs once when the class is loaded
    static {
        System.out.println("Static block");
    }

    // Runs every time an object is created, before the constructor
    {
        count++;
        id = count;
        System.out.println("Instance block: " + id);
    }

    // Runs after the instance block
    Counter() {
        System.out.println("Constructor: " + id);
    }
}

class MainCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.count);
    } // Closes main method
} // <-- Added missing brace to close MainCounter class
