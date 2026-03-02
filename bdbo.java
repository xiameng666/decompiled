public final class bdbo implements bdbm {
    private final aysr a;

    public bdbo(aysr aysr0) {
        this.a = aysr0;
    }

    @Override  // bdbm
    public final evql a(MessageLite hfvm0) {
        return this.a.b(hfvm0, null);
    }

    @Override  // bdbm
    public final evql b(ggds ggds0) {
        ggdy ggdy0 = new ggdy();
        ggqj ggqj0 = ggds0.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            ggdy0.i(this.a(((MessageLite)object0)));
        }
        return evrg.e(ggdy0.h());
    }

    @Override  // bdbm
    public final evql c() {
        return this.a.c(null);
    }

    @Override  // bdbm
    public final evql d() {
        return this.a.c(null);
    }

    @Override  // bdbm
    public final evql e(MessageLite hfvm0) {
        return this.a.f(hfvm0, null);
    }
}

