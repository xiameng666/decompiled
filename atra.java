import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.carrierauth.EapInfoRequest;
import com.google.android.gms.carrierauth.EapInfoResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.UUID;

public final class atra extends cjtm {
    private final atqq a;
    private final atqu b;
    private final EapInfoRequest c;
    private final bcqx d;
    private final UUID e;

    public atra(Context context0, atqq atqq0, atqu atqu0, EapInfoRequest eapInfoRequest0, azug azug0) {
        super(0xBF, "getEapInfo", azug0);
        this.a = atqq0;
        this.b = atqu0;
        this.c = eapInfoRequest0;
        this.d = bcqx.a(context0);
        this.e = UUID.randomUUID();
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        EapInfoResponse eapInfoResponse0;
        this.d.L(this.e, 16);
        if(hrde.f()) {
            try {
                atqq atqq0 = this.a;
                baun baun0 = atqq0.a;
                int v = this.c.a;
                baun0.d("getRootNai req.subscriptionId: " + v, new Object[0]);
                if(!hrde.e()) {
                    baun0.m("Received a TS.43 auth request, but TS.43 is not enabled", new Object[0]);
                    throw new UnsupportedOperationException("TS.43 authentication is not enabled on this device");
                }
                TelephonyManager telephonyManager0 = v == -1 ? atqq0.b : atqq0.b.createForSubscriptionId(v);
                String s = telephonyManager0.getSubscriberId();
                String s1 = telephonyManager0.getSimOperator();
                if(TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || s1.length() < 5) {
                    throw new UnsupportedOperationException("No supported SIM card found");
                }
                String s2 = s1.substring(0, 3);
                String s3;
                for(s3 = s1.substring(3); s3.length() < 3; s3 = "0" + s3) {
                }
                eapInfoResponse0 = new EapInfoResponse(a.ak(s2, s3, new StringBuilder(), s, "0", "@nai.epc.mnc", ".mcc", ".3gppnetwork.org"));
            }
            catch(UnsupportedOperationException unused_ex) {
                this.d.f(this.e, gmfz.bd, gmfx.ae);
                this.j(new Status(33001));
                return;
            }
            catch(SecurityException unused_ex) {
                this.d.f(this.e, gmfz.bd, gmfx.aD);
                this.j(new Status(33002));
                return;
            }
            this.d.o(this.e, gmfz.bd, gmgd.h);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
            this.b.b(Status.b, eapInfoResponse0, apiMetadata0);
            return;
        }
        this.d.f(this.e, gmfz.bd, gmfx.ae);
        this.j(new Status(33001));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.b(status0, null, ApiMetadata.b);
    }
}

