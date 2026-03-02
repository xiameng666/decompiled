import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.SeCommuterPassDetailIntentArgs;
import com.google.android.gms.pay.SeServiceProvider;

public final class dmqx extends dmqc {
    private final dlih b;

    public dmqx() {
        super("com.google.android.gms.pay.secard.view.detail.VIEW_SE_COMMUTER_PASS_DETAIL");
        this.b = new dlih();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        SeCommuterPassDetailIntentArgs seCommuterPassDetailIntentArgs0 = payIntentArgs0.C;
        batl.s(seCommuterPassDetailIntentArgs0);
        batl.b(seCommuterPassDetailIntentArgs0.e != 0);
        if(seCommuterPassDetailIntentArgs0.a != null && seCommuterPassDetailIntentArgs0.a.a != 0 && !gfta.c(seCommuterPassDetailIntentArgs0.c) && seCommuterPassDetailIntentArgs0.d != null) {
            return;
        }
        throw new IllegalArgumentException("Invalid SE commuter pass detail view intent arguments");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.C = this.b.a;
    }

    public final void h(int v) {
        this.b.a.e = v;
    }

    public final void i(String s) {
        this.b.a.c = s;
    }

    public final void j(byte[] arr_b) {
        this.b.a.d = arr_b;
    }

    public final void k(GooglePaymentMethodId googlePaymentMethodId0) {
        this.b.a.b = googlePaymentMethodId0;
    }

    public final void l(SeServiceProvider seServiceProvider0) {
        this.b.a.a = seServiceProvider0;
    }
}

