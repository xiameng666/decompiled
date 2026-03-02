import android.text.TextUtils;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.TransitDisplayCardIntentArgs;

public final class dmqg extends dmqc {
    public final dlkh b;

    public dmqg() {
        super("com.google.android.gms.pay.pass.closedloop.view.detail.VIEW_TRANSIT_CARD");
        this.b = new dlkh();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        boolean z = false;
        batl.c(payIntentArgs0.a != null, "account required");
        TransitDisplayCardIntentArgs transitDisplayCardIntentArgs0 = payIntentArgs0.i;
        batl.s(transitDisplayCardIntentArgs0);
        if(!TextUtils.isEmpty(transitDisplayCardIntentArgs0.a) || transitDisplayCardIntentArgs0.e != null) {
            z = true;
        }
        batl.c(z, "must have a card to display");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.i = this.b.a;
    }

    public final void h(String s) {
        this.b.a.a = s;
    }

    public final void i() {
        this.b.a.b = null;
    }

    public final void j(String s) {
        this.b.a.d = s;
    }
}

