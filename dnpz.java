import com.google.android.gms.pay.gcmtask.PayGcmTaskChimeraService;

public final class dnpz implements Runnable {
    public final PayGcmTaskChimeraService a;

    public dnpz(PayGcmTaskChimeraService payGcmTaskChimeraService0) {
        this.a = payGcmTaskChimeraService0;
    }

    @Override
    public final void run() {
        PayGcmTaskChimeraService.d(this.a.getApplicationContext());
    }
}

