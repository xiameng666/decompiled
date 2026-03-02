import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j..util.Objects;

final class crng implements Runnable {
    final boolean a;
    final Uri b;
    final String c;
    final String d;
    final crnh e;

    public crng(crnh crnh0, boolean z, Uri uri0, String s, String s1) {
        this.a = z;
        this.b = uri0;
        this.c = s;
        this.d = s1;
        Objects.requireNonNull(crnh0);
        this.e = crnh0;
        super();
    }

    @Override
    public final void run() {
        Bundle bundle0;
        crnh crnh0 = this.e;
        crni crni0 = crnh0.a;
        crni0.n();
        Uri uri0 = this.b;
        String s = this.d;
        try {
            crqx crqx0 = crni0.aq();
            if(TextUtils.isEmpty(s)) {
                bundle0 = null;
            }
            else if(!s.contains("gclid") && !s.contains("gbraid") && !s.contains("utm_campaign") && !s.contains("utm_source") && !s.contains("utm_medium") && !s.contains("utm_id") && !s.contains("dclid") && !s.contains("srsltid") && !s.contains("sfmc_id")) {
                crqx0.aJ().j.a("Activity created with data \'referrer\' without required params");
                bundle0 = null;
            }
            else {
                bundle0 = crqx0.v(Uri.parse(("https://google.com/search?" + s)));
                if(bundle0 != null) {
                    bundle0.putString("_cis", "referrer");
                }
            }
            String s1 = this.c;
            if(this.a) {
                Bundle bundle1 = crni0.aq().v(uri0);
                if(bundle1 != null) {
                    bundle1.putString("_cis", "intent");
                    if(!bundle1.containsKey("gclid") && bundle0 != null && bundle0.containsKey("gclid")) {
                        bundle1.putString("_cer", String.format("gclid=%s", bundle0.getString("gclid")));
                    }
                    crni0.w(s1, "_cmp", bundle1);
                    crni0.g.a(s1, bundle1);
                }
            }
            if(!TextUtils.isEmpty(s)) {
                crni0.aJ().j.b("Activity created with referrer", s);
                if(crni0.am().t(crif.aw)) {
                    if(bundle0 == null) {
                        crni0.aJ().j.b("Referrer does not contain valid parameters", s);
                    }
                    else {
                        crni0.w(s1, "_cmp", bundle0);
                        crni0.g.a(s1, bundle0);
                    }
                    crni0.H(null);
                    return;
                }
                if(!s.contains("gclid") || !s.contains("utm_campaign") && !s.contains("utm_source") && !s.contains("utm_medium") && !s.contains("utm_term") && !s.contains("utm_content")) {
                    goto label_38;
                }
                if(!TextUtils.isEmpty(s)) {
                    crni0.H(s);
                    return;
                label_38:
                    crni0.aJ().j.a("Activity created with data \'referrer\' without required params");
                }
            }
        }
        catch(RuntimeException runtimeException0) {
            crnh0.a.aJ().c.b("Throwable caught in handleReferrerForOnActivityCreated", runtimeException0);
        }
    }
}

