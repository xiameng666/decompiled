import android.text.TextUtils;
import com.google.android.gms.pay.CardRewardsDetailsIntentArgs;
import com.google.android.gms.pay.PayIntentArgs;

public final class dmqj extends dmqc {
    private final dlbx b;

    public dmqj() {
        super("com.google.android.gms.pay.fops.VIEW_CARD_REWARDS_DETAILS");
        this.b = new dlbx();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        boolean z = false;
        batl.c(payIntentArgs0.a != null, "account required");
        CardRewardsDetailsIntentArgs cardRewardsDetailsIntentArgs0 = payIntentArgs0.P;
        batl.s(cardRewardsDetailsIntentArgs0);
        if(!TextUtils.isEmpty(cardRewardsDetailsIntentArgs0.a) || !TextUtils.isEmpty(cardRewardsDetailsIntentArgs0.b)) {
            z = true;
        }
        batl.b(z);
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.P = this.b.a;
    }

    public final void h(String s) {
        this.b.a.b = s;
    }

    public final void i(String s) {
        this.b.a.a = s;
    }
}

