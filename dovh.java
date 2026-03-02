import com.google.android.gms.pay.main.PayChimeraActivity;
import j..util.Objects;

public final class dovh extends aaw {
    final PayChimeraActivity a;

    public dovh(PayChimeraActivity payChimeraActivity0) {
        Objects.requireNonNull(payChimeraActivity0);
        this.a = payChimeraActivity0;
        super(false);
    }

    @Override  // aaw
    public final void b() {
        PayChimeraActivity payChimeraActivity0 = this.a;
        du du0 = payChimeraActivity0.m();
        if((du0 instanceof doky) && !((doky)du0).G()) {
            payChimeraActivity0.E.g(false);
            payChimeraActivity0.onBackPressed();
            payChimeraActivity0.E.g(true);
        }
    }
}

