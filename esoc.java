import android.content.Context;
import com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskChimeraService;

public final class esoc implements Runnable {
    public final TapAndPayGcmTaskChimeraService a;

    public esoc(TapAndPayGcmTaskChimeraService tapAndPayGcmTaskChimeraService0) {
        this.a = tapAndPayGcmTaskChimeraService0;
    }

    @Override
    public final void run() {
        Context context0 = this.a.getApplicationContext();
        if(esgb.e(context0)) {
            TapAndPayGcmTaskChimeraService.d(context0);
        }
    }
}

