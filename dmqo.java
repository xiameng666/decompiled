import com.google.android.gms.pay.MdocIntentArgs;
import com.google.android.gms.pay.PayIntentArgs;

public final class dmqo extends dmqc {
    private final dlge b;

    public dmqo(String s) {
        super(s);
        this.b = new dlge();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        MdocIntentArgs mdocIntentArgs0 = payIntentArgs0.K;
        batl.s(mdocIntentArgs0);
        batl.c(mdocIntentArgs0.a != null, "Provisioning Id is missing.");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.K = this.b.a;
    }

    public final void h(String s) {
        this.b.a.a = s;
    }

    public final void i(int v) {
        this.b.a.b = v;
    }
}

