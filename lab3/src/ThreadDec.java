public class ThreadDec extends Thread {
    private SharedObject sharedObject;

    public ThreadDec() {}

    public ThreadDec(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }


    @Override
    public void run() {
        sharedObject.dec();
    }

}
