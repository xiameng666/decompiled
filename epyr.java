import android.telephony.SubscriptionInfo;
import android.text.TextUtils;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigResponse;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;

public final class epyr implements evqk {
    public final epys a;
    public final EsimActivationInfo b;
    public final SubscriptionInfo c;

    public epyr(epys epys0, EsimActivationInfo esimActivationInfo0, SubscriptionInfo subscriptionInfo0) {
        this.a = epys0;
        this.b = esimActivationInfo0;
        this.c = subscriptionInfo0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        if(((GetEsimConfigResponse)object0) == null) {
            return evrg.c(new NullPointerException("esimConfigResponse is null"));
        }
        String s = ((GetEsimConfigResponse)object0).e;
        return TextUtils.isEmpty(s) ? evrg.c(new Exception("empty activation code")) : evrg.d(new EsimActivationPayload(s, this.a.a, this.b.d, this.c.isEmbedded()));
    }
}

