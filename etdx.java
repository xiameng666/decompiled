import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.firstparty.SetReceivesIneligibleCardNotificationRequest;

public final class etdx implements azys {
    public final etgl a;
    public final SetReceivesIneligibleCardNotificationRequest b;

    public etdx(etgl etgl0, SetReceivesIneligibleCardNotificationRequest setReceivesIneligibleCardNotificationRequest0) {
        this.a = etgl0;
        this.b = setReceivesIneligibleCardNotificationRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etge etge0 = new etge(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.ai(this.b, etge0, apiMetadata0);
    }
}

