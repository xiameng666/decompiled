import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.internal.PerformEapAkaResponse;
import j..util.Objects;

final class ffjz extends ffee {
    final fdiy c;
    final int d;
    final String e;
    final fflv f;

    public ffjz(fflv fflv0, fdiy fdiy0, int v, String s) {
        this.c = fdiy0;
        this.d = v;
        this.e = s;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("performEapAka");
    }

    @Override  // ffee
    public final void a() {
        String s;
        rgx rgx0;
        ffdo ffdo0 = this.f.z;
        if(ffdo0 == null) {
            PerformEapAkaResponse performEapAkaResponse0 = new PerformEapAkaResponse(10, "");
            this.c.O(performEapAkaResponse0);
            return;
        }
        try {
            rhl rhl0 = rhl.a(this.e);
            rhm rhm0 = rhm.a(ffdo0.a, this.d, rhl0, "nai.epc");
            rgx0 = new rgx(rhm0.a, rhm0.b);
        }
        catch(rhb rhb0) {
            Log.i("ServiceEntitlement", "Failed to generate EAP-AKA response", rhb0);
            rgx0 = null;
        }
        if(rgx0 == null) {
            Log.e("CarrierAuth", "EAP-AKA challenge failed.");
            s = "";
        }
        else {
            s = rgx0.a;
            if(s == null) {
                s = rgx0.b;
                if(s == null) {
                    Log.e("CarrierAuth", "EAP-AKA challenge failed.");
                    s = "";
                }
                else {
                    Log.d("CarrierAuth", "synchronization failure");
                }
            }
        }
        if(TextUtils.isEmpty(s)) {
            PerformEapAkaResponse performEapAkaResponse1 = new PerformEapAkaResponse(13, "");
            this.c.O(performEapAkaResponse1);
            return;
        }
        PerformEapAkaResponse performEapAkaResponse2 = new PerformEapAkaResponse(0, s);
        this.c.O(performEapAkaResponse2);
    }
}

