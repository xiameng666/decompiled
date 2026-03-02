public final class cykn implements Runnable {
    public final cylw a;
    public final String b;
    public final String c;
    public final float d;
    public final String e;

    public cykn(cylw cylw0, String s, String s1, float f, String s2) {
        this.a = cylw0;
        this.b = s;
        this.c = s1;
        this.d = f;
        this.e = s2;
    }

    @Override
    public final void run() {
        String s = this.b;
        cylw cylw0 = this.a;
        String s1 = this.c;
        double f = (double)this.d;
        if(!hvpp.bq()) {
            cylw0.i.c(s, s1, cusm.a.name(), f);
            return;
        }
        cyna cyna0 = cylw0.n(this.e);
        if(cyna0 == null) {
            cylw0.i.c(s, s1, cusm.b.name(), f);
            return;
        }
        cylw0.i.c(s, s1, cusm.e.name(), f);
        if(cyna0.c.c(cyna0.c().a())) {
            if(hvpg.bJ()) {
                ((ggtj)cyna0.o.d().ar(7904)).x("SassDevice: onSightForDefaultKey called.");
            }
            if(hvpp.bf()) {
                cyna0.m();
            }
        }
    }
}

