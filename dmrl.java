import com.google.android.gms.pay.PayIntentArgs;

public final class dmrl extends dmqc {
    private final dllp b;

    public dmrl() {
        super("com.google.android.gms.pay.wear.MFI_ACQUIRE_USER_CONSENT");
        this.b = new dllp();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        batl.s(payIntentArgs0.O);
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.O = this.b.a;
    }
}

