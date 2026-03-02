final class ifzo implements Runnable {
    final igac a;

    public ifzo(igac igac0) {
        this.a = igac0;
        super();
    }

    @Override
    public final void run() {
        this.a.m = this.a.p;
        this.a.p = null;
        this.a.h();
    }
}

