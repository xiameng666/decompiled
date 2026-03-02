import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.wearable.internal.GetEapIdResponse;
import j..util.Objects;

final class ffjy extends ffee {
    final fdiy c;
    final int d;
    final fflv e;

    public ffjy(fflv fflv0, fdiy fdiy0, int v) {
        this.c = fdiy0;
        this.d = v;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getEapId");
    }

    @Override  // ffee
    public final void a() {
        String s;
        ffdo ffdo0 = this.e.z;
        if(ffdo0 == null) {
            GetEapIdResponse getEapIdResponse0 = new GetEapIdResponse(10, "");
            this.c.D(getEapIdResponse0);
            return;
        }
        try {
            TelephonyManager telephonyManager0 = ((TelephonyManager)ffdo0.a.getSystemService(TelephonyManager.class)).createForSubscriptionId(this.d);
            s = null;
            s = rhk.d(telephonyManager0.getSimOperator(), telephonyManager0.getSubscriberId(), "nai.epc");
        }
        catch(rhb unused_ex) {
        }
        if(TextUtils.isEmpty(s)) {
            GetEapIdResponse getEapIdResponse1 = new GetEapIdResponse(13, "");
            this.c.D(getEapIdResponse1);
            return;
        }
        GetEapIdResponse getEapIdResponse2 = new GetEapIdResponse(0, s);
        this.c.D(getEapIdResponse2);
    }
}

