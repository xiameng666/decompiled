import com.google.android.gms.pay.hce.service.PayHceChimeraService;

public final class dnri implements Runnable {
    public final PayHceChimeraService a;
    public final byte[] b;

    public dnri(PayHceChimeraService payHceChimeraService0, byte[] arr_b) {
        this.a = payHceChimeraService0;
        this.b = arr_b;
    }

    @Override
    public final void run() {
        PayHceChimeraService payHceChimeraService0 = this.a;
        byte[] arr_b = this.b;
        dnqw dnqw0 = payHceChimeraService0.g;
        if(dnqw0 != null) {
            dnqw0.a(-1, arr_b);
            payHceChimeraService0.g = null;
        }
        payHceChimeraService0.b(arr_b);
        dnqw dnqw1 = payHceChimeraService0.g;
        if(dnqw1 != null) {
            dnqw1.c(arr_b, payHceChimeraService0.e, payHceChimeraService0.f);
        }
    }
}

