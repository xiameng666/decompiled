import com.google.android.gms.pay.FopDetailIntentArgs;
import com.google.android.gms.pay.PayIntentArgs;

public final class dmrk extends dmqc {
    private final dldg b;

    public dmrk() {
        super("com.google.android.gms.pay.wear.VIEW_FOP");
        this.b = new dldg();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        boolean z = false;
        batl.c(payIntentArgs0.a != null, "account required");
        FopDetailIntentArgs fopDetailIntentArgs0 = payIntentArgs0.e;
        batl.s(fopDetailIntentArgs0);
        if(fopDetailIntentArgs0.a != null || fopDetailIntentArgs0.b != null) {
            z = true;
        }
        batl.c(z, "devicePaymentMethodId or cloudPaymentMethodId required");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.b(this.b.a);
    }

    public final void h(String s) {
        this.b.a(s);
    }

    public final void i(String s) {
        this.b.b(s);
    }

    public final void j(boolean z) {
        this.b.a.d = z;
    }
}

