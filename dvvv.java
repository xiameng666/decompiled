import com.google.android.gms.pay.pass.valuable.view.detail.ValuableDetailUnifiedFragment;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvvv implements evqf {
    public final ValuableDetailUnifiedFragment a;
    public final Valuable b;
    public final boolean c;
    public final fshh d;

    public dvvv(ValuableDetailUnifiedFragment valuableDetailUnifiedFragment0, Valuable valuable0, boolean z, fshh fshh0) {
        this.a = valuableDetailUnifiedFragment0;
        this.b = valuable0;
        this.c = z;
        this.d = fshh0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        this.b.F = this.c;
        this.d.f(this.c);
        this.a.ay.bw(this.c, this.d);
    }
}

