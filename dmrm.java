import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.WearPrepaidCardDetailIntentArgs;

public final class dmrm extends dmqc {
    public final dllr b;

    public dmrm() {
        super("com.google.android.gms.pay.wear.VIEW_PREPAID");
        this.b = new dllr();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        WearPrepaidCardDetailIntentArgs wearPrepaidCardDetailIntentArgs0 = payIntentArgs0.N;
        batl.s(wearPrepaidCardDetailIntentArgs0);
        boolean z = true;
        batl.b(wearPrepaidCardDetailIntentArgs0.b != 0);
        if(wearPrepaidCardDetailIntentArgs0.a == null) {
            z = false;
        }
        batl.c(z, "Must specify a wear payment method.");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.N = this.b.a;
    }

    public final void h(int v) {
        this.b.a.b = v;
    }

    public final void i(ProtoSafeParcelable protoSafeParcelable0) {
        this.b.a.a = protoSafeParcelable0;
    }
}

