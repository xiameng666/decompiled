public class ttv {
    private final ttq a;
    public final tkj b;
    public final twj c;
    public final tto d;
    public ttw e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ttl j;
    public final ttt k;
    public final ttt l;

    static {
    }

    protected ttv(ttq ttq0, tto tto0, tkj tkj0, ttt ttt0, ttt ttt1) {
        this.e = ttw.a;
        this.a = ttq0;
        this.d = tto0;
        this.k = ttt0;
        this.l = ttt1;
        this.c = tto0 == null ? null : tto0.c;
        this.b = tkj0;
    }

    public final boolean d() {
        return this.e.d;
    }

    public final tnm e() {
        return this.j == null ? null : this.j.a;
    }

    public final void f() {
        this.f = true;
    }

    @Override
    public final String toString() {
        two two0 = twp.a(this);
        two0.b();
        two0.a("cvmData", this.b);
        two0.a("card", this.d);
        two0.a("terminalData", this.k);
        two0.a("transactionState", this.e);
        two0.a("paymentType", this.a);
        two0.a("path", null);
        two0.a("transientApplicationData", this.l);
        two0.c("ppseIsPerformed", this.f);
        two0.c("selectIsPerformed", this.g);
        two0.c("gpoIsPerformed", this.h);
        two0.c("readRecordIsPerformed", this.i);
        two0.d("completeProcessingTime");
        two0.d("transactionCardProcessingTime");
        return two0.toString();
    }
}

