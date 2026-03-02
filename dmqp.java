import android.text.TextUtils;
import com.google.android.gms.pay.AddValuableIntentArgs;
import com.google.android.gms.pay.PayIntentArgs;

public final class dmqp extends dmqc {
    private final dlbn b;

    public dmqp() {
        super("com.google.android.gms.pay.pass.valuable.view.mutate.add.ADD_GIFT_CARD");
        dlbn dlbn0 = new dlbn();
        this.b = dlbn0;
        dlbn0.c(true);
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        AddValuableIntentArgs addValuableIntentArgs0 = payIntentArgs0.p;
        batl.s(addValuableIntentArgs0);
        batl.c(Long.compare(addValuableIntentArgs0.a, 0L) != 0 && !TextUtils.isEmpty(addValuableIntentArgs0.b) || !TextUtils.isEmpty(addValuableIntentArgs0.e), "External class ID or issuer ID and issuer class ID are required");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a(this.b.a);
    }

    public final void h(String s) {
        this.b.a(s);
    }

    public final void i(long v) {
        this.b.b(v);
    }

    public final void j(boolean z) {
        this.b.c(z);
    }
}

