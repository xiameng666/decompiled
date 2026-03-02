import com.google.android.gms.pay.AutoloadSettingsIntentArgs;
import com.google.android.gms.pay.PayIntentArgs;

public final class dmqv extends dmqc {
    public final dlbs b;

    public dmqv() {
        super("com.google.android.gms.payprocesspayment.view.VIEW_PROCESSPAYMENT_AUTOLOAD_SETTINGS");
        this.b = new dlbs();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        AutoloadSettingsIntentArgs autoloadSettingsIntentArgs0 = payIntentArgs0.q;
        batl.s(autoloadSettingsIntentArgs0);
        batl.t(autoloadSettingsIntentArgs0.a, "Must set a google payment method id");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.q = this.b.a;
    }
}

