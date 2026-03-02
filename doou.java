import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.PerformPaymentMethodServerActionRequest;

public final class doou implements azys {
    public final PerformPaymentMethodServerActionRequest a;

    public doou(PerformPaymentMethodServerActionRequest performPaymentMethodServerActionRequest0) {
        this.a = performPaymentMethodServerActionRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        dosm dosm0 = new dosm(((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(dota0.r);
        donm0.ak(this.a, dosm0, apiMetadata0);
    }
}

