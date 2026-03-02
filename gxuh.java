public final class gxuh implements Runnable {
    public final gxuk a;
    public final gxum b;

    public gxuh(gxuk gxuk0, gxum gxum0) {
        this.a = gxuk0;
        this.b = gxum0;
    }

    @Override
    public final void run() {
        this.a.c.getLooper().getQueue().addIdleHandler(new gxug(this.a, this.b));
    }
}

