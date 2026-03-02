public final class hbxq implements hbqx {
    public final hbxs a;
    public final long b;
    public final hbkn c;
    public final hbtp d;

    public hbxq(hbxs hbxs0, long v, hbkn hbkn0, hbtp hbtp0) {
        this.a = hbxs0;
        this.b = v;
        this.c = hbkn0;
        this.d = hbtp0;
    }

    @Override  // hbqx
    public final hbrb a() {
        hbnx hbnx0 = new hbnx();
        hbjz hbjz0 = new hbjz();
        hbjz0.a(Long.valueOf(this.b));
        hbjz0.b = this.c;
        hbjz0.c = Boolean.valueOf(hbxs.d);
        Boolean boolean0 = Boolean.valueOf(true);
        hbjz0.d = boolean0;
        hbjz0.e = boolean0;
        hbnx0.a = new hbka(hbjz0);
        int v = hbxs.e.a(this.d);
        hbnx0.b = hbrk.b(this.d.g, v);
        hbnz hbnz0 = new hbnz();
        hbnz0.a = hbxj.a(this.a.f.b());
        hbnx0.c = new hbob(hbnz0);
        hbny hbny0 = new hbny(hbnx0);
        hbkp hbkp0 = new hbkp();
        hbkp0.c = this.a.f.h() ? hbkm.c : hbkm.b;
        hbkp0.d = hbny0;
        return new hbrb(hbkp0, 0);
    }
}

