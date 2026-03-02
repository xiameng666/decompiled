import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.WearClosedLoopCardIntentArgs;

public final class dmrj extends dmqc {
    private final dlln b;

    public dmrj() {
        super("com.google.android.gms.pay.wear.VIEW_CLOSED_LOOP");
        this.b = new dlln();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        WearClosedLoopCardIntentArgs wearClosedLoopCardIntentArgs0 = payIntentArgs0.y;
        batl.s(wearClosedLoopCardIntentArgs0);
        batl.c(wearClosedLoopCardIntentArgs0.b != null || wearClosedLoopCardIntentArgs0.c != null, "must specify closed loop card");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.d(this.b.a);
    }

    public final void h(ProtoSafeParcelable protoSafeParcelable0) {
        this.b.a(protoSafeParcelable0);
    }

    public final void i(GooglePaymentMethodId googlePaymentMethodId0) {
        this.b.a.c = googlePaymentMethodId0;
    }

    public final void j(ProtoSafeParcelable protoSafeParcelable0) {
        this.b.b(protoSafeParcelable0);
    }
}

