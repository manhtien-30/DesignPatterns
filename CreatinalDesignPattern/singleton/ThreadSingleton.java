package CreatinalDesignPattern.singleton;

public class ThreadSingleton {
    private static ThreadSingleton instance;

    private ThreadSingleton() {
    };

    public synchronized ThreadSingleton getInstance() {
        if (instance == null) 
            synchronized (ThreadSingleton.class) {
                if (instance == null)
                {
                    instance = new ThreadSingleton();
                }
            }
        return instance;
    }
}
