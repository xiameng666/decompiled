public final class augs implements Runnable {
    public final auha a;

    public augs(auha auha0) {
        this.a = auha0;
    }

    @Override
    public final void run() {
        auha auha0 = this.a;
        cjpc cjpc0 = auha0.e;
        Long long0 = auha.f();
        long v = cjpd.b(cjpc0, "com.google.android.gms.PREF_DATABASE_CLEARED_TIME", 0L);
        Long.valueOf(v).getClass();
        if(((long)long0) - v >= ((long)(((Long)auha0.h.b.mr())))) {
            auha0.i.n(true);
            cjpa cjpa0 = cjpc0.c();
            cjpa0.g("com.google.android.gms.PREF_DATABASE_CLEARED_TIME", long0.longValue());
            cjpd.g(cjpa0);
            auha0.i.s();
        }
    }
}

