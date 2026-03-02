public abstract class tgn {
    public final tfx a;
    public final tgg b;
    public tgo c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public tgd h;
    public final tgl i;
    public final tgl j;
    private static final String k = "tgn";
    private final tgi l;

    static {
    }

    protected tgn(tgi tgi0, tgg tgg0, tfx tfx0, tgl tgl0, tgl tgl1) {
        this.c = tgo.a;
        this.l = tgi0;
        this.b = tgg0;
        this.i = tgl0;
        this.j = tgl1;
        this.a = tfx0;
    }

    public final tgs a() {
        byte[] arr_b = this.d();
        tjk.f("calculateApplicationCryptogram()", new Object[0]);
        byte[] arr_b1 = this.c(new tgy(new byte[]{this.j.x().k()[2]}, true));
        byte[] arr_b2 = tjl.a(arr_b1, arr_b);
        tjk.f("calculateApplicationCryptogram() - ApplicationCryptogram: {} dataToSign: {}", new Object[]{arr_b2, arr_b1});
        return new tgs(arr_b2, false);
    }

    public final boolean b() {
        return this.c.d;
    }

    protected byte[] c(tgy tgy0) {
        throw null;
    }

    public abstract byte[] d();

    public final tql e() {
        return this.h == null ? null : this.h.a;
    }

    public final void f() {
        this.d = true;
    }

    @Override
    public final String toString() {
        tjg tjg0 = tjh.a(this);
        tjg0.b();
        tjg0.a("cvmData", this.a);
        tjg0.a("card", this.b);
        tjg0.a("terminalData", this.i);
        tjg0.a("transactionState", this.c);
        tjg0.a("paymentType", this.l);
        tjg0.a("path", null);
        tjg0.a("transientApplicationData", this.j);
        tjg0.c("ppseIsPerformed", this.d);
        tjg0.c("selectIsPerformed", this.e);
        tjg0.c("gpoIsPerformed", this.f);
        tjg0.c("readRecordIsPerformed", this.g);
        tjg0.d("completeProcessingTime");
        tjg0.d("transactionCardProcessingTime");
        return tjg0.toString();
    }
}

