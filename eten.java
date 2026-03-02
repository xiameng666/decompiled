import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.AddOtherPaymentOptionRequest;

public final class eten implements azys {
    public final String a;
    public final Activity b;
    public final int c;

    public eten(String s, Activity activity0, int v) {
        this.a = s;
        this.b = activity0;
        this.c = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        AddOtherPaymentOptionRequest addOtherPaymentOptionRequest0 = new AddOtherPaymentOptionRequest(2, this.a);
        etat etat0 = new etat(this.b, this.c);
        ((eszv)etau0.H()).b(addOtherPaymentOptionRequest0, etat0, cclr.a(etau0.r));
        azzf.c(Status.b, null, ((evqp)object1));
    }
}

