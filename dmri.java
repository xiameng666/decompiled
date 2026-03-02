import android.text.TextUtils;
import com.google.android.gms.pay.PayIntentArgs;

public final class dmri extends dmqc {
    public final dlll b;
    private String c;

    public dmri() {
        super("com.google.android.gms.pay.wear.VIEW_CARDS");
        this.b = new dlll();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        this.c = payIntentArgs0.b;
        batl.b(payIntentArgs0.x != null && !TextUtils.isEmpty(payIntentArgs0.b));
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.x = this.b.a;
    }
}

