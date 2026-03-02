public final class hbtm implements Runnable {
    public final hbtn a;
    public final Runnable b;

    public hbtm(hbtn hbtn0, Runnable runnable0) {
        this.a = hbtn0;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        if(this.a.a.get()) {
            return;
        }
        this.b.run();
    }
}

