import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import j..util.Objects;
import java.util.Arrays;
import java.util.List;

final class crjy implements Runnable {
    final ServiceConnection a;
    final crjz b;
    final yxg c;

    public crjy(crjz crjz0, yxg yxg0, ServiceConnection serviceConnection0) {
        this.c = yxg0;
        this.a = serviceConnection0;
        Objects.requireNonNull(crjz0);
        this.b = crjz0;
        super();
    }

    @Override
    public final void run() {
        crka crka0 = this.b.b;
        crkt crkt0 = crka0.a;
        crkt0.s();
        Bundle bundle0 = new Bundle();
        String s = this.b.a;
        bundle0.putString("package_name", s);
        Bundle bundle1 = null;
        try {
            Parcel parcel0 = this.c.jo();
            wbz.f(parcel0, bundle0);
            Parcel parcel1 = this.c.hM(1, parcel0);
            Bundle bundle2 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
            parcel1.recycle();
            if(bundle2 == null) {
                crkt0.aJ().c.a("Install Referrer Service returned a null response");
            }
            else {
                bundle1 = bundle2;
            }
        }
        catch(Exception exception0) {
            crka0.a.aJ().c.b("Exception occurred while retrieving the Install Referrer", exception0.getMessage());
        }
        crkt crkt1 = crka0.a;
        crkt1.s();
        crkt1.r();
        if(bundle1 != null) {
            long v = bundle1.getLong("install_begin_timestamp_seconds", 0L) * 1000L;
            if(v == 0L) {
                crkt1.aJ().f.a("Service response is missing Install Referrer install timestamp");
            }
            else {
                String s1 = bundle1.getString("install_referrer");
                if(s1 != null && !s1.isEmpty()) {
                    crkt1.aJ().k.b("InstallReferrer API result", s1);
                    Bundle bundle3 = crkt1.p().v(Uri.parse(("?" + s1)));
                    if(bundle3 == null) {
                        crkt1.aJ().c.a("No campaign params defined in Install Referrer result");
                    }
                    else {
                        List list0 = Arrays.asList(((String)crif.aQ.a()).split(","));
                        for(Object object0: bundle3.keySet()) {
                            if(list0.contains(((String)object0))) {
                                long v1 = bundle1.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000L;
                                if(v1 > 0L) {
                                    bundle3.putLong("click_timestamp", v1);
                                }
                                break;
                            }
                        }
                        if(v == crkt1.g().e.a()) {
                            crkt1.aJ().k.a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if(crkt1.v()) {
                            crkt1.g().e.b(v);
                            crkt1.aJ().k.b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundle3.putString("_cis", "referrer API v2");
                            crkt1.j().v("auto", "_cmp", bundle3, s);
                        }
                    }
                }
                else {
                    crkt1.aJ().c.a("No referrer defined in Install Referrer response");
                }
            }
        }
        bbic.a().b(crkt1.a, this.a);
    }
}

