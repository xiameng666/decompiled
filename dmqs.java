import android.text.TextUtils;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.ValuableSaveIntentArgs;

public final class dmqs extends dmqc {
    public final dlla b;

    public dmqs() {
        super("com.google.android.gms.pay.pass.valuable.view.save.SAVE_PASSES");
        dlla dlla0 = new dlla();
        dlla0.a(true);
        dlla0.b(4);
        this.b = dlla0;
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        boolean z = false;
        batl.c(payIntentArgs0.a == null, "SavePassesIntent must not have a specified account");
        ValuableSaveIntentArgs valuableSaveIntentArgs0 = payIntentArgs0.o;
        batl.s(valuableSaveIntentArgs0);
        batl.c(valuableSaveIntentArgs0.f != 0, "SaveIntentSource required");
        if(!TextUtils.isEmpty(valuableSaveIntentArgs0.a) || !TextUtils.isEmpty(valuableSaveIntentArgs0.b) || !TextUtils.isEmpty(valuableSaveIntentArgs0.c) || !TextUtils.isEmpty(valuableSaveIntentArgs0.d)) {
            z = true;
        }
        batl.c(z, "valuableJwt or valuableJson or contentUri is required");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.o = this.b.a;
    }

    public final void h(boolean z) {
        this.b.a(z);
    }

    public final void i(int v) {
        this.b.b(v);
    }
}

