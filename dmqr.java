import com.google.android.gms.pay.PayIntentArgs;

public final class dmqr extends dmqc {
    public final dlcj b;

    public dmqr(String s) {
        super(s);
        this.b = new dlcj();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        batl.s(payIntentArgs0.M);
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.M = this.b.a;
    }
}

