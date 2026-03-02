public final class dgea implements ibts {
    public final dgqm a;
    public final dgeg b;

    public dgea(dgqm dgqm0, dgeg dgeg0) {
        this.a = dgqm0;
        this.b = dgeg0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dcnn)object0), "it");
        dgqj dgqj0 = (dgqj)this.a;
        ((dcnn)object0).e(dgqj0.b);
        ((dcnn)object0).s = dgqj0.d;
        ((dcnn)object0).c(dgqj0.c);
        ((dcnn)object0).q = dgqj0.e;
        if(hvqz.ag()) {
            dged dged0 = (dged)this.b.a.get(Long.valueOf(dgqj0.a));
            ((dcnn)object0).m = dged0 == null ? 0 : dged0.f;
        }
        return ibom.a;
    }
}

