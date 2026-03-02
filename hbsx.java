public final class hbsx implements hbqx {
    public final hbsz a;
    public final long b;
    public final hbkn c;
    public final ggdy d;
    public final ggdy e;
    public final hbtp f;

    public hbsx(hbsz hbsz0, long v, hbkn hbkn0, ggdy ggdy0, ggdy ggdy1, hbtp hbtp0) {
        this.a = hbsz0;
        this.b = v;
        this.c = hbkn0;
        this.d = ggdy0;
        this.e = ggdy1;
        this.f = hbtp0;
    }

    @Override  // hbqx
    public final hbrb a() {
        hbla hbla0 = new hbla();
        hbjz hbjz0 = new hbjz();
        hbjz0.a(Long.valueOf(this.b));
        hbjz0.b = this.c;
        hbjz0.c = Boolean.valueOf(hbsz.e);
        Boolean boolean0 = Boolean.valueOf(true);
        hbjz0.d = boolean0;
        hbjz0.e = boolean0;
        hbla0.a = new hbka(hbjz0);
        hbla0.b = hbsq.a(this.a.f);
        hbla0.c = this.d.h();
        hbla0.d = this.e.h();
        int v = hbsz.d.a(this.f);
        hbla0.e = hbrk.b(this.f.g, v);
        hbkp hbkp0 = new hbkp();
        hbkp0.c = this.a.g ? hbkm.c : hbkm.b;
        hbkp0.f = new hblb(hbla0);
        return new hbrb(hbkp0, 0);
    }
}

