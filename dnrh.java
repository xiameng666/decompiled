import com.google.android.gms.pay.hce.service.PayHceChimeraService;

public final class dnrh implements Runnable {
    public final PayHceChimeraService a;
    public final int b;

    public dnrh(PayHceChimeraService payHceChimeraService0, int v) {
        this.a = payHceChimeraService0;
        this.b = v;
    }

    @Override
    public final void run() {
        PayHceChimeraService payHceChimeraService0 = this.a;
        dnqw dnqw0 = payHceChimeraService0.g;
        if(dnqw0 != null) {
            dnqw0.a(this.b, null);
            payHceChimeraService0.g = null;
        }
    }
}

