import com.google.android.gms.pay.main.PayChimeraActivity;

public final class doun {
    public final PayChimeraActivity a;

    public doun(PayChimeraActivity payChimeraActivity0) {
        this.a = payChimeraActivity0;
    }

    public final void a(int v) {
        int v1 = Long.compare(v, hwey.b());
        PayChimeraActivity payChimeraActivity0 = this.a;
        if(v1 <= 0) {
            du du0 = payChimeraActivity0.m();
            if(du0 != null) {
                payChimeraActivity0.B(du0);
            }
            payChimeraActivity0.getSupportFragmentManager().q(payChimeraActivity0);
            return;
        }
        if(((long)v) > hwey.b()) {
            payChimeraActivity0.getSupportFragmentManager().o.remove(payChimeraActivity0);
            payChimeraActivity0.A(-1);
        }
    }
}

