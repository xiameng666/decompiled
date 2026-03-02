import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.firstparty.SendTransmissionEventRequest;

public final class eteb implements azys {
    public final etgl a;
    public final SendTransmissionEventRequest b;

    public eteb(etgl etgl0, SendTransmissionEventRequest sendTransmissionEventRequest0) {
        this.a = etgl0;
        this.b = sendTransmissionEventRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etez etez0 = new etez(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.ab(this.b, etez0, apiMetadata0);
    }
}

