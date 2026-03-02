import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.pay.PayIntentArgs;

public final class dvrr implements View.OnClickListener {
    public final dvsn a;

    public dvrr(dvsn dvsn0) {
        this.a = dvsn0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dvsn dvsn0 = this.a;
        if(dvsn0.aR) {
            if(dvsn0.av.c() == edsd.b) {
                dmqm dmqm0 = new dmqm();
                dmqm0.h(22);
                dvsn0.startActivity(dmqm0.c().addFlags(0x4000000));
                return;
            }
            PayIntentArgs payIntentArgs0 = ednn.a(dvsn0.aO.getExtras());
            if(payIntentArgs0 != null) {
                String s = payIntentArgs0.b;
                if(s != null) {
                    dvsn0.startActivity(dlnf.bt(s, 6, dvsn0.aC).addFlags(0x4000000));
                    return;
                }
            }
        }
        PayIntentArgs payIntentArgs1 = ednn.a(dvsn0.aO.getExtras());
        if(hwhu.c() && payIntentArgs1 != null && (payIntentArgs1.d != null && payIntentArgs1.d.a == 33)) {
            dvsn0.startActivity(new dmqm().c().addFlags(0x4000000));
            return;
        }
        dvsn0.G();
    }
}

