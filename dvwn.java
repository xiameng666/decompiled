import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.pay.PayIntentArgs;

public final class dvwn implements View.OnClickListener {
    public final dvxj a;

    public dvwn(dvxj dvxj0) {
        this.a = dvxj0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dvxj dvxj0 = this.a;
        if(dvxj0.aL) {
            if(dvxj0.at.c() == edsd.b) {
                goto label_9;
            }
            PayIntentArgs payIntentArgs0 = ednn.b(dvxj0);
            if(payIntentArgs0 != null) {
                String s = payIntentArgs0.b;
                if(s != null) {
                    dvxj0.startActivity(dlnf.bt(s, 6, dvxj0.aE).addFlags(0x4000000));
                    return;
                label_9:
                    dmqm dmqm0 = new dmqm();
                    dmqm0.h(22);
                    dvxj0.startActivity(dmqm0.c().addFlags(0x4000000));
                    return;
                }
            }
        }
        PayIntentArgs payIntentArgs1 = ednn.b(dvxj0);
        if(hwhu.c() && payIntentArgs1 != null && (payIntentArgs1.d != null && payIntentArgs1.d.a == 33)) {
            dvxj0.startActivity(new dmqm().c().addFlags(0x4000000));
            return;
        }
        dvxj0.G();
    }
}

