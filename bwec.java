public final class bwec implements lqj {
    public final bwed a;
    public final lqj b;

    public bwec(bwed bwed0, lqj lqj0) {
        this.a = bwed0;
        this.b = lqj0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(this.a.a.compareAndSet(true, false)) {
            this.b.jS(object0);
        }
    }
}

