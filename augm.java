public final class augm implements Runnable {
    public final auha a;

    public augm(auha auha0) {
        this.a = auha0;
    }

    @Override
    public final void run() {
        auha auha0 = this.a;
        cjpc cjpc0 = auha0.e;
        long v = cjpd.b(cjpc0, "com.google.android.gms.cast_PREF_DATABASE_PURGED_TIME", 0L);
        Long.valueOf(v).getClass();
        if(((long)auha.f()) - v > ((long)(((Long)auha0.c.mr())))) {
            auha0.i.p();
            cjpa cjpa0 = cjpc0.c();
            cjpa0.g("com.google.android.gms.cast_PREF_DATABASE_PURGED_TIME", auha.f().longValue());
            cjpd.f(cjpa0);
            auha0.i.s();
        }
    }
}

