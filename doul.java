import android.content.Intent;
import com.google.android.gms.pay.main.PayChimeraActivity;

public final class doul implements evqf {
    public final PayChimeraActivity a;

    public doul(PayChimeraActivity payChimeraActivity0) {
        this.a = payChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        PayChimeraActivity payChimeraActivity0 = this.a;
        if(edno.b(payChimeraActivity0, ((Intent)object0)) && payChimeraActivity0.w.b() == edsd.b) {
            payChimeraActivity0.startActivity(((Intent)object0));
            payChimeraActivity0.finishAndRemoveTask();
            return;
        }
        payChimeraActivity0.a(((Intent)object0));
    }
}

