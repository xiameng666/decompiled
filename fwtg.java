public final class fwtg implements Runnable {
    public final fwtu a;
    public final Object b;

    public fwtg(fwtu fwtu0, Object object0) {
        this.a = fwtu0;
        this.b = object0;
    }

    @Override
    public final void run() {
        this.a.q.E(this.b);
    }
}

