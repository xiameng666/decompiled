import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.SePrepaidCardDetailIntentArgs;
import com.google.android.gms.pay.SeServiceProvider;

public final class dmqy extends dmqc {
    private final dlij b;

    public dmqy() {
        super("com.google.android.gms.pay.secard.view.detail.VIEW_SE_PREPAID_CARD_DETAIL");
        this.b = new dlij();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        boolean z = true;
        batl.c(payIntentArgs0.a != null, "account required");
        SePrepaidCardDetailIntentArgs sePrepaidCardDetailIntentArgs0 = payIntentArgs0.s;
        batl.s(sePrepaidCardDetailIntentArgs0);
        if(sePrepaidCardDetailIntentArgs0.c == null) {
            SeServiceProvider seServiceProvider0 = sePrepaidCardDetailIntentArgs0.a;
            batl.t(seServiceProvider0, "either a known service provider with card ID or a Google payment method ID are required");
            if(seServiceProvider0.a == 0) {
                z = false;
            }
            batl.c(z, "either a known service provider with card ID or a Google payment method ID are required");
            batl.t(sePrepaidCardDetailIntentArgs0.b, "either a known service provider with card ID or a Google payment method ID are required");
        }
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.s = this.b.a;
    }

    public final void h(SeServiceProvider seServiceProvider0) {
        this.b.a.a = seServiceProvider0;
    }

    public final void i(String s) {
        this.b.a.b = s;
    }
}

