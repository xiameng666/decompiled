public final class cykw implements kba {
    public final cylw a;
    public final String b;

    public cykw(cylw cylw0, String s) {
        this.a = cylw0;
        this.b = s;
    }

    @Override  // kba
    public final Object a() {
        bbng bbng0 = this.a.p.a;
        long v = bbng0.b();
        Object object0 = this.a.p.h(this.b);
        if(hvpg.bJ()) {
            cwfa.a.d().A("CacheManager: get additional address list look %sms", bbng0.b() - v);
        }
        return object0 == null ? ggna.a : object0;
    }
}

