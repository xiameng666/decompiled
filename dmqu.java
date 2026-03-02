import android.text.TextUtils;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.ValuableDetailIntentArgs;

public final class dmqu extends dmqc {
    public final dlky b;

    public dmqu() {
        super("com.google.android.gms.pay.pass.valuable.view.detail.VIEW_VALUABLE_GROUP");
        this.b = new dlky();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        boolean z = false;
        batl.c(payIntentArgs0.a != null, "account required");
        ValuableDetailIntentArgs valuableDetailIntentArgs0 = payIntentArgs0.m;
        batl.s(valuableDetailIntentArgs0);
        if(!TextUtils.isEmpty(valuableDetailIntentArgs0.a) || !TextUtils.isEmpty(valuableDetailIntentArgs0.b) || !TextUtils.isEmpty(valuableDetailIntentArgs0.c)) {
            z = true;
        }
        batl.c(z, "valuableId, valuableGroupId, or valuableExternalObjectId required");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.c(this.b.a);
    }
}

