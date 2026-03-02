public final class gbie implements gbhm {
    private final gctm a;

    public gbie(gctm gctm0) {
        ibuq.f(gctm0, "paySeApiCaller");
        super();
        this.a = gctm0;
    }

    @Override  // gbhm
    public final int a() {
        return 5;
    }

    @Override  // gbhm
    public final long b() {
        return 0L;
    }

    @Override  // gbhm
    public final Object c() {
        gaxl.a();
        if(!hzng.c()) {
            return new gbid(hcjd.a);
        }
        return this.a.i() ? new gbid(hcjd.c) : new gbid(hcjd.b);
    }

    @Override  // gbhm
    public final void d(Object object0, Object object1) {
        ibuq.f(object0, "setter");
        ((gbif)object0).O(((gbid)object1).a);
    }
}

