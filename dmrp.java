import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.ValuableDetailIntentArgs;

public final class dmrp extends dmqc {
    public final dlky b;

    public dmrp() {
        super("com.google.android.gms.pay.pass.valuable.view.detail.VIEW_VALUABLE_GROUP");
        this.b = new dlky();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        ValuableDetailIntentArgs valuableDetailIntentArgs0 = payIntentArgs0.m;
        boolean z = true;
        batl.c(payIntentArgs0.a != null, "account required");
        batl.s(valuableDetailIntentArgs0);
        if(valuableDetailIntentArgs0.b == null) {
            z = false;
        }
        batl.c(z, "ValuableGroupId required");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.c(this.b.a);
    }
}

