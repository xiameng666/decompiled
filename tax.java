public abstract class tax {
    public tad a;
    public tdu b;
    public tao c;
    public tay d;
    public taq e;
    public tdb f;
    public taz g;
    public boolean h;
    public boolean i;
    public boolean j;
    public tal k;
    public tau l;

    static {
    }

    protected tax(taq taq0, tao tao0, tad tad0, tau tau0, taz taz0) {
        this.d = tay.a;
        this.e = taq0;
        this.c = tao0;
        this.l = tau0;
        this.g = taz0;
        this.b = tao0 == null ? null : tao0.b;
        this.a = tad0;
    }

    public final void a() {
        this.getClass();
        this.k = this.c.a();
        tkm tkm0 = this.c();
        if(tkm0 != null) {
            tba tba0 = tkm0.a == null ? null : new tba(tkm0.a);
            this.g.c(tba0);
        }
        this.f(this.a);
    }

    public abstract byte[] b();

    public final tkm c() {
        return this.k == null ? null : this.k.a;
    }

    public final void d() {
        this.h = true;
    }

    public final void e() {
        this.i = true;
    }

    protected void f(tad tad0) {
        throw null;
    }

    @Override
    public final String toString() {
        tea tea0 = teb.a(this);
        tea0.b();
        tea0.a("cvmData", this.a);
        tea0.a("card", this.c);
        tea0.a("terminalData", this.l);
        tea0.a("transactionState", this.d);
        tea0.a("paymentType", this.e);
        tea0.a("path", this.f);
        tea0.a("transientApplicationData", this.g);
        tea0.c("ppseIsPerformed", this.h);
        tea0.c("selectIsPerformed", this.i);
        tea0.c("gpoIsPerformed", this.j);
        tea0.c("readRecordIsPerformed", false);
        tea0.d("completeProcessingTime");
        tea0.d("transactionCardProcessingTime");
        return tea0.toString();
    }
}

