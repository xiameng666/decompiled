public final class ifzt implements igad {
    public final ifzz a;

    public ifzt(ifzz ifzz0) {
        this.a = ifzz0;
    }

    @Override  // igad
    public final void a() {
        ifzz ifzz0 = this.a;
        igac igac0 = ifzz0.d;
        if(igac0.g.compareAndSet(1, 4)) {
            ifzz0.a.onResponseStarted(igac0, igac0.o);
        }
    }
}

