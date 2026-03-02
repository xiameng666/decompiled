import com.google.android.gms.pay.pass.valuable.view.detail.ValuableDetailUnifiedFragment;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvvw implements evqc {
    public final Valuable a;
    public final fshh b;
    public final boolean c;

    public dvvw(Valuable valuable0, fshh fshh0, boolean z) {
        this.a = valuable0;
        this.b = fshh0;
        this.c = z;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)ValuableDetailUnifiedFragment.a.i()).s(exception0)).B("Failed to update smart tap toggle for valuable ID: %s", this.a.b);
        this.b.f(this.c);
    }
}

