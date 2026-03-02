public final class gp implements Runnable {
    public final gx a;
    public final gs b;

    public gp(gx gx0, gs gs0) {
        this.a = gx0;
        this.b = gs0;
    }

    @Override
    public final void run() {
        this.a.b.remove(this.b);
        this.a.c.remove(this.b);
    }
}

