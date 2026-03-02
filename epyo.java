import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersResponse;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;

public final class epyo implements evqk {
    public final epys a;
    public final EsimActivationInfo b;
    public final TelephonyManager c;
    public final csml d;

    public epyo(epys epys0, EsimActivationInfo esimActivationInfo0, TelephonyManager telephonyManager0, csml csml0) {
        this.a = epys0;
        this.b = esimActivationInfo0;
        this.c = telephonyManager0;
        this.d = csml0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        if(((GetPhoneNumbersResponse)object0) == null) {
            return evrg.c(new NullPointerException("phoneNumbersResponse is null"));
        }
        String s = ((GetPhoneNumbersResponse)object0).b[0];
        String s1 = ((GetPhoneNumbersResponse)object0).a;
        if(TextUtils.isEmpty(s)) {
            return evrg.c(new Exception("empty phone number"));
        }
        if(TextUtils.isEmpty(s1)) {
            return evrg.c(new Exception("empty request id"));
        }
        this.a.a = s;
        GetEsimConfigRequest getEsimConfigRequest0 = new GetEsimConfigRequest();
        getEsimConfigRequest0.a = s1;
        getEsimConfigRequest0.c = this.b.b;
        getEsimConfigRequest0.d = this.b.c;
        getEsimConfigRequest0.e = this.c.getSubscriberId();
        getEsimConfigRequest0.b = this.a.b;
        getEsimConfigRequest0.f = s;
        batl.c(getEsimConfigRequest0.a != null, "Need a non-null request_id.");
        azzc azzc0 = new azzc();
        azzc0.a = new csmf(this.d, getEsimConfigRequest0);
        azzc0.c = new Feature[]{csma.a};
        azzc0.d = 0x4077;
        return this.d.jn(azzc0.a());
    }
}

