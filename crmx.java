import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.c;
import com.google.android.gms.ads.identifier.d;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConsentParcel;
import j..util.Objects;
import java.net.URL;

final class crmx extends crdj {
    final crni b;

    public crmx(crni crni0, crlw crlw0) {
        Objects.requireNonNull(crni0);
        this.b = crni0;
        super(crlw0);
    }

    @Override  // crdj
    public final void b() {
        ConsentParcel consentParcel0;
        Pair pair0;
        crkt crkt0 = this.b.y;
        crkt0.s();
        crkt.y(crkt0.k());
        String s = crkt0.d().u();
        if(!crkt0.d.s()) {
            crkt0.aJ().k.a("ADID collection is disabled from Manifest. Skipping");
            return;
        }
        crjx crjx0 = crkt0.g();
        crjx0.n();
        if(crjx0.f().o()) {
            long v = SystemClock.elapsedRealtime();
            String s1 = crjx0.g;
            if(s1 != null && v < crjx0.i) {
                pair0 = new Pair(s1, Boolean.valueOf(crjx0.h));
            }
            else {
                crjx0.i = v + crjx0.am().h(s);
                try {
                    c c0 = d.a(crjx0.aj());
                    crjx0.g = "";
                    String s2 = c0.a;
                    if(s2 != null) {
                        crjx0.g = s2;
                    }
                    crjx0.h = c0.b;
                }
                catch(Exception exception0) {
                    crjx0.aJ().j.b("Unable to get advertising id", exception0);
                    crjx0.g = "";
                }
                pair0 = new Pair(crjx0.g, Boolean.valueOf(crjx0.h));
            }
        }
        else {
            pair0 = new Pair("", Boolean.valueOf(false));
        }
        if(!((Boolean)pair0.second).booleanValue() && !TextUtils.isEmpty(((CharSequence)pair0.first))) {
            crnm crnm0 = crkt0.k();
            crnm0.l();
            ConnectivityManager connectivityManager0 = (ConnectivityManager)crnm0.aj().getSystemService("connectivity");
            Bundle bundle0 = null;
            NetworkInfo networkInfo0 = null;
            if(connectivityManager0 != null) {
                try {
                    networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                }
                catch(SecurityException unused_ex) {
                }
            }
            if(networkInfo0 != null && networkInfo0.isConnected()) {
                StringBuilder stringBuilder0 = new StringBuilder();
                croz croz0 = crkt0.n();
                croz0.n();
                croz0.a();
                if(!croz0.F() || croz0.aq().k() >= 234200) {
                    crni crni0 = crkt0.j();
                    crni0.m();
                    crni0.n();
                    croz croz1 = crni0.k();
                    croz1.n();
                    croz1.a();
                    crii crii0 = croz1.b;
                    if(crii0 == null) {
                        croz1.r();
                        croz1.aJ().j.a("Failed to get consents; not connected to service yet.");
                        goto label_62;
                    }
                    else {
                        AppMetadata appMetadata0 = croz1.q(false);
                        batl.s(appMetadata0);
                        try {
                            consentParcel0 = crii0.a(appMetadata0);
                            croz1.w();
                            goto label_63;
                        }
                        catch(RemoteException remoteException0) {
                            croz1.aJ().c.b("Failed to get consents; remote exception", remoteException0);
                        }
                    label_62:
                        consentParcel0 = null;
                    }
                label_63:
                    if(consentParcel0 != null) {
                        bundle0 = consentParcel0.a;
                    }
                    if(bundle0 == null) {
                        int v1 = crkt0.u;
                        crkt0.u = v1 + 1;
                        crkt0.aJ().j.b("Failed to retrieve DMA consent from the service, " + (v1 >= 10 ? "Skipping." : "Retrying.") + " retryCount", Integer.valueOf(crkt0.u));
                        if(v1 < 10) {
                            this.b.i.c(2000L);
                            return;
                        }
                    }
                    else {
                        crmb crmb0 = crmb.g(bundle0, 100);
                        stringBuilder0.append("&gcs=");
                        stringBuilder0.append(crmb0.m());
                        crdk crdk0 = crdk.a(bundle0, 100);
                        stringBuilder0.append("&dma=");
                        stringBuilder0.append(Objects.equals(crdk0.d, Boolean.valueOf(false)) ^ 1);
                        String s3 = crdk0.e;
                        if(!TextUtils.isEmpty(s3)) {
                            stringBuilder0.append("&dma_cps=");
                            stringBuilder0.append(s3);
                        }
                        int v2 = Objects.equals(crdk.d(bundle0), Boolean.valueOf(true)) ^ 1;
                        stringBuilder0.append("&npa=");
                        stringBuilder0.append(v2);
                        crkt0.aJ().k.b("Consent query parameters to Bow", stringBuilder0);
                        goto label_86;
                    }
                }
                else {
                label_86:
                    URL uRL0 = crkt0.p().C(crkt0.d().s(), s, ((String)pair0.first), crkt0.g().t.a() - 1L, stringBuilder0.toString());
                    if(uRL0 != null) {
                        crnm crnm1 = crkt0.k();
                        crkr crkr0 = new crkr(crkt0);
                        crnm1.l();
                        crnm1.aK().d(new crnl(crnm1, s, uRL0, crkr0));
                    }
                }
                return;
            }
            crkt0.aJ().f.a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        crkt0.aJ().k.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }
}

