import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.PayIntentArgs;

public final class dmqm extends dmqc {
    public final dlfr b;

    public dmqm() {
        super("com.google.android.gms.pay.homescreen.VIEW_HOME");
        this.b = new dlfr();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.n = this.b.a;
    }

    public final void h(int v) {
        IntentSource intentSource0 = new IntentSource();
        intentSource0.a = v;
        this.b.a(intentSource0);
    }

    public final void i(boolean z) {
        this.b.a.a = z;
    }
}

