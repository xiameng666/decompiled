public final class bekg implements ibth {
    public final lqd a;
    public final lqd b;
    public final lqd c;
    public final lqd d;
    public final lqd e;
    public final lqh f;

    public bekg(lqd lqd0, lqd lqd1, lqd lqd2, lqd lqd3, lqd lqd4, lqh lqh0) {
        this.a = lqd0;
        this.b = lqd1;
        this.c = lqd2;
        this.d = lqd3;
        this.e = lqd4;
        this.f = lqh0;
    }

    @Override  // ibth
    public final Object a() {
        beku beku0 = (beku)this.a.ij();
        if(beku0 == null) {
            return ibom.a;
        }
        String s = (String)this.b.ij();
        if(s == null) {
            return ibom.a;
        }
        bglj bglj0 = (bglj)this.c.ij();
        String s1 = (String)this.d.ij();
        if(s1 == null) {
            return ibom.a;
        }
        bekt bekt0 = (bekt)this.e.ij();
        if(bekt0 == null) {
            return ibom.a;
        }
        beko beko0 = bekp.h(beku0, s, bglj0);
        if(beko0 == null) {
            return ibom.a;
        }
        bekq bekq0 = bekt0.a(beko0, s1);
        this.f.l(bekq0);
        return ibom.a;
    }
}

