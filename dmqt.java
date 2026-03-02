import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.SelectPurchasablePassIntentArgs;
import j..util.Objects;

public final class dmqt extends dmqc {
    public final dliv b;

    public dmqt() {
        super("com.google.android.gms.pay.pass.common.purchase.SELECT_PURCHASABLE_PASS");
        this.b = new dliv();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        SelectPurchasablePassIntentArgs selectPurchasablePassIntentArgs0 = (SelectPurchasablePassIntentArgs)Objects.requireNonNull(payIntentArgs0.w);
        if(selectPurchasablePassIntentArgs0.a == null && payIntentArgs0.c == 0L && gfta.c(payIntentArgs0.b)) {
            return;
        }
        batl.t(selectPurchasablePassIntentArgs0.a, "clientCapabilities required");
        if(payIntentArgs0.c == 0L) {
            throw new IllegalArgumentException("wearAndroidId required");
        }
        batl.t(payIntentArgs0.b, "wearNodeId required");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.w = this.b.a;
    }
}

