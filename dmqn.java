import android.content.Intent;
import com.google.android.gms.pay.PayIntentArgs;

public final class dmqn extends dmqc {
    public final dlga b;
    public long c;

    public dmqn() {
        super("com.google.android.gms.pay.mse.WALLET");
        this.b = new dlga();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.D = this.b.a;
    }

    @Override  // dmqc
    public final Intent c() {
        this.b.a.a = this.c;
        return super.c().putExtra("window_soft_input_mode", 16).putExtra("mse_device_id", this.c);
    }

    public final void h(String s) {
        this.b.a.h = s;
    }

    public final void i(String s) {
        this.b.a.e = s;
    }

    public final void j(String s) {
        this.b.a.c = s;
    }

    public final void k(String s) {
        this.b.a.d = s;
    }

    public final void l(String s) {
        this.b.a.b = s;
    }
}

