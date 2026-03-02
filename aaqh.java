public final class aaqh {
    public final aaln a;
    public final aane b;
    public final lqh c;
    private final aamr d;
    private final lrf e;

    public aaqh(aane aane0, aaln aaln0, aamr aamr0, lrf lrf0) {
        this.d = aamr0;
        this.b = aane0;
        this.a = aaln0;
        lqh lqh0 = new lqh();
        this.c = lqh0;
        aaqg aaqg0 = aaqg.a;
        Integer integer0 = (Integer)lrf0.d("splashScreenUIState");
        if(integer0 != null) {
            aaqg0 = aaqg.values()[((int)integer0)];
        }
        lqh0.l(aaqg0);
        this.e = lrf0;
    }

    public final aaqg a() {
        aaqg aaqg0 = (aaqg)this.c.ij();
        gftb.check(aaqg0);
        return aaqg0;
    }

    public final void b() {
        fhru fhru0 = new fhru(fhry.a);
        this.d.a.l(fhru0);
    }

    public final void c(aaqg aaqg0) {
        this.c.l(aaqg0);
        this.e.e("splashScreenUIState", Integer.valueOf(aaqg0.ordinal()));
    }
}

