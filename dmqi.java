import com.google.android.gms.pay.PayIntentArgs;

public final class dmqi extends dmqc {
    private final dlbl b;

    public dmqi() {
        super("com.google.android.gms.pay.homescreen.additem.ADD_PAYMENT_METHOD");
        this.b = new dlbl();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.z = this.b.a;
    }

    public final void h(int v) {
        this.b.a.a = v;
    }
}

