import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.WearClosedLoopCardIntentArgs;

public final class dmrh extends dmqc {
    private final dlln b;

    public dmrh() {
        super("com.google.android.gms.pay.wear.VIEW_ACCESS_CARD");
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

    public final void i(ProtoSafeParcelable protoSafeParcelable0) {
        this.b.b(protoSafeParcelable0);
    }
}

