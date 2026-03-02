public final class gplg implements Runnable {
    public final gplt a;
    public final Object b;

    public gplg(gplt gplt0, Object object0) {
        this.a = gplt0;
        this.b = object0;
    }

    @Override
    public final void run() {
        gplq gplq0 = new gplq(this.a, this.b);
        this.a.c.add(gplq0);
        this.a.i();
    }
}

