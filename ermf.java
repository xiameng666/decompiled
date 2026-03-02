public final class ermf implements Runnable {
    public final ermn a;

    public ermf(ermn ermn0) {
        this.a = ermn0;
    }

    @Override
    public final void run() {
        this.a.ai = false;
        this.a.z();
    }
}

