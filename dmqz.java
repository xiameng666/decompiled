import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.SeServiceProvider;

public final class dmqz extends dmqc {
    private final dlil b;

    public dmqz() {
        super("com.google.android.gms.pay.secard.view.detail.VIEW_SE_MFI_PREPAID_CARD_DETAIL");
        this.b = new dlil();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        batl.t(payIntentArgs0.a, "account required");
        batl.t(payIntentArgs0.t, "mfi card detail intent args required");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.t = this.b.a;
    }

    public final void h(String s) {
        this.b.a.b = s;
    }

    public final void i(SeServiceProvider seServiceProvider0) {
        this.b.a.a = seServiceProvider0;
    }
}

