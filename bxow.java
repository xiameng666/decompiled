public final class bxow implements lqj {
    public final bxox a;
    public final lqj b;

    public bxow(bxox bxox0, lqj lqj0) {
        this.a = bxox0;
        this.b = lqj0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(this.a.a.compareAndSet(true, false)) {
            this.b.jS(object0);
        }
    }
}

