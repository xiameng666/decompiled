public final class aaj implements Runnable {
    public final aak a;

    public aaj(aak aak0) {
        this.a = aak0;
    }

    @Override
    public final void run() {
        aak aak0 = this.a;
        Runnable runnable0 = aak0.a;
        if(runnable0 != null) {
            runnable0.run();
            aak0.a = null;
        }
    }
}

