import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import j..util.Objects;
import java.util.ArrayList;

final class atuq extends anm {
    final atus b;

    public atuq(atus atus0) {
        Objects.requireNonNull(atus0);
        this.b = atus0;
        super();
    }

    @Override  // anm
    public final void a(anj anj0) {
        atus atus0 = this.b;
        atus0.ak = anj0;
        if(!atus0.ak.c()) {
            atus0.ag.t("Failed to warmup browser process!");
        }
        avij avij0 = atus0.am;
        if(avij0.m()) {
            atus0.al = atus0.ak == null ? null : atus0.ak.a(new amy());
            if(atus0.al == null) {
                atus0.ag.t("CustomTabsSession creation failed unexpectedly! Will not pre-fetch ToS links.");
                return;
            }
        }
        else {
            anj anj1 = atus0.ak;
            batl.s(anj1);
            atus0.al = anj1.a(new amy());
        }
        ArrayList arrayList0 = new ArrayList(4);
        Bundle bundle0 = new Bundle(1);
        bundle0.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse("https://policies.google.com/terms"));
        arrayList0.add(bundle0);
        Bundle bundle1 = new Bundle(1);
        bundle1.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse("https://policies.google.com/privacy"));
        arrayList0.add(bundle1);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse("https://support.google.com/chromecast/answer/9001232"));
        arrayList0.add(bundle2);
        Bundle bundle3 = new Bundle(1);
        bundle3.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse("https://myaccount.google.com"));
        arrayList0.add(bundle3);
        if(avij0.m()) {
            if(atus0.al != null && atus0.al.a(arrayList0)) {
                return;
            }
            atus0.ag.t("CustomTabsSession failed to pre-fetch ToS links!");
            return;
        }
        ann ann0 = atus0.al;
        batl.s(ann0);
        if(!ann0.a(arrayList0)) {
            atus0.ag.t("CustomTabsSession failed to pre-fetch ToS links!");
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.b.ak = null;
        this.b.al = null;
    }
}

