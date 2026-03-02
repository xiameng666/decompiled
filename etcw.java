import android.app.Activity;
import com.google.android.gms.tapandpay.internal.firstparty.ShowSecurityPromptRequest;

public final class etcw implements azys {
    public final Activity a;
    public final int b;

    public etcw(Activity activity0, int v) {
        this.a = activity0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        evqp evqp0 = (evqp)object1;
        ((eszv)etau0.H()).ao(new ShowSecurityPromptRequest(), new etat(this.a, this.b), cclr.a(etau0.r));
    }
}

