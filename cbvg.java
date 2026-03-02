import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;

public final class cbvg {
    public final Context a;
    public static final int b;
    private static final bboh c;
    private final ibrt d;

    static {
        cbvg.c = bboh.b("DeviceSupervisionOptInWebViewFragment", bbcu.ac);
    }

    public cbvg(Context context0, ibrt ibrt0) {
        ibuq.f(context0, "applicationContext");
        ibuq.f(ibrt0, "highSpeedCoroutineScope");
        super();
        this.a = context0;
        this.d = ibrt0;
    }

    public final Object a(String s, String s1, gvku gvku0, String s2, ibrl ibrl0) {
        String s4;
        Uri.Builder uri$Builder1;
        Uri.Builder uri$Builder0;
        cbvf cbvf0;
        if((ibrl0 instanceof cbvf)) {
            cbvf0 = (cbvf)ibrl0;
            int v = cbvf0.c;
            if((v & 0x80000000) == 0) {
                cbvf0 = new cbvf(this, ibrl0);
            }
            else {
                cbvf0.c = v - 0x80000000;
            }
        }
        else {
            cbvf0 = new cbvf(this, ibrl0);
        }
        Object object0 = cbvf0.a;
        Object object1 = ibrx.a;
        String s3 = null;
        switch(cbvf0.c) {
            case 0: {
                ibnx.b(object0);
                uri$Builder0 = Uri.parse(s).buildUpon();
                ibuq.c(uri$Builder0);
                if(s1.length() > 0) {
                    uri$Builder0.appendQueryParameter("session_id", s1);
                }
                if(hukf.f()) {
                    Context context0 = this.a;
                    if(gaec.t(context0)) {
                        cbgg.a(context0).a(uri$Builder0, 0, 1);
                    }
                    else {
                        cbgh.b(cbgg.a(this.a), uri$Builder0, 0, 6);
                    }
                }
                else {
                    cbgh.b(cbgg.a(this.a), uri$Builder0, 0, 6);
                }
                cbvf0.d = gvku0;
                cbvf0.e = s2;
                cbvf0.f = uri$Builder0;
                cbvf0.g = uri$Builder0;
                cbvf0.c = 1;
                cbve cbve0 = new cbve(uri$Builder0, this, null);
                Object object2 = icbd.a(this.d, cbve0, cbvf0);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                if(object2 != object1) {
                    uri$Builder1 = uri$Builder0;
                    break;
                }
                return object1;
            }
            case 1: {
                uri$Builder0 = cbvf0.g;
                uri$Builder1 = cbvf0.f;
                s2 = cbvf0.e;
                gvku0 = cbvf0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(uri$Builder0);
        uri$Builder0.appendQueryParameter("utm_medium", "android");
        switch(gvku0.ordinal()) {
            case 1: {
                s4 = "family_link";
                break;
            }
            case 2: {
                s4 = "sunshine";
                break;
            }
            case 3: {
                s4 = "play_store";
                break;
            }
            case 4: {
                s4 = "grifin_conversion";
                break;
            }
            case 5: {
                s4 = "google_fi";
                break;
            }
            case 6: {
                s4 = "google_settings";
                break;
            }
            case 7: {
                s4 = "supervision_upgrade";
                break;
            }
            default: {
                s4 = "unknown";
            }
        }
        uri$Builder0.appendQueryParameter("utm_source", s4);
        if(hukf.h()) {
            cbgj cbgj0 = cbgi.b(this.a);
            if(cbgj0 != null) {
                s3 = cbgj0.a();
            }
            uri$Builder0.appendQueryParameter("palette_colors", s3);
        }
        if(hukf.i() && s2 != null) {
            uri$Builder0.appendQueryParameter("vp", s2);
        }
        Object object3 = uri$Builder1.build();
        ((ggtj)cbvg.c.h()).B("Created device supervision opt-in flow URL: %s", object3);
        ibuq.c(object3);
        return object3;
    }
}

