import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest.Builder;
import android.net.Uri;
import com.google.android.gms.mobiledataplan.service.background.GetCpidBackgroundTask.GetCpidCallback;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class cryw implements Callable {
    public static final bboh a;
    public final Context b;
    public final int c;
    public final gmcg d;
    public String e;
    public Long f;
    private final ccmg g;
    private final long h;

    static {
        cryw.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public cryw(Context context0, Integer integer0) {
        this.b = context0;
        this.c = (int)integer0;
        this.h = crxn.b();
        this.d = new bblp(1, 10);
        this.g = new ccmp();
    }

    public final void a(long v) {
        crxn.c().E(v, 0L, this.c, this.h, 16);
    }

    @Override
    public final Object call() {
        boolean z;
        GetCpidBackgroundTask.GetCpidCallback getCpidBackgroundTask$GetCpidCallback0;
        ConnectivityManager connectivityManager0;
        this.g.a(bbdg.pQ);
        if(!hvlb.d() && !csli.u(this.b)) {
            return Boolean.valueOf(false);
        }
        bboh bboh0 = cryw.a;
        bboh0.g(cslm.h()).B("%s runHttpCpidFetch called.", "BgTaskGetCpid:");
        Context context0 = this.b;
        String s = null;
        for(Object object0: csli.A(context0, 2)) {
            cslv cslv0 = (cslv)object0;
            if(cslv0.d) {
                s = cslv0.a;
            }
        }
        if(s == null) {
            this.a(27019L);
            return Boolean.valueOf(false);
        }
        this.e = s;
        Long long0 = crvw.c().p(s);
        this.f = long0;
        if(long0 == null) {
            this.a(27048L);
            return Boolean.valueOf(false);
        }
        gspd gspd0 = crvw.c().g(s);
        if(gspd0 != null && !gspd0.b.isEmpty() && gspd0.b.get(0) != null) {
            String s1 = (String)gspd0.b.get(0);
            if(hvlb.d()) {
                s1 = Uri.parse(s1).buildUpon().appendQueryParameter("hashedImsi", csli.f(this.e, context0)).build().toString();
                bboh0.g(cslm.h()).B("cpidv2 enabled, updated path: %s", s1);
            }
            bboh0.g(cslm.h()).B("%s connectAndFetchCpid called.", "BgTaskGetCpid:");
            try {
                bboh0.g(cslm.h()).B("%s force fetch CPID through cellular when wifi is connected as well", "BgTaskGetCpid:");
                connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
                if(connectivityManager0 == null) {
                    this.a(27049L);
                    return Boolean.valueOf(false);
                }
                NetworkRequest.Builder networkRequest$Builder0 = new NetworkRequest.Builder();
                networkRequest$Builder0.addCapability(12);
                if(!hvlb.d() && !csli.x(context0)) {
                    networkRequest$Builder0.addTransportType(0);
                }
                getCpidBackgroundTask$GetCpidCallback0 = new GetCpidBackgroundTask.GetCpidCallback(this, s1);
                try {
                    connectivityManager0.requestNetwork(networkRequest$Builder0.build(), getCpidBackgroundTask$GetCpidCallback0, ((int)TimeUnit.SECONDS.toMillis(hvko.e() + 1L)));
                }
                catch(SecurityException securityException0) {
                    a.e(cryw.a.j(), "%s Permission denied while querying CPID endpoint", "BgTaskGetCpid:", securityException0);
                    this.a(27047L);
                    return Boolean.valueOf(false);
                }
            }
            catch(IOException iOException0) {
                goto label_66;
            }
            try {
                try {
                    hvko.e();
                    getCpidBackgroundTask$GetCpidCallback0.b.await();
                    Boolean boolean0 = getCpidBackgroundTask$GetCpidCallback0.c;
                    goto label_56;
                }
                catch(InterruptedException unused_ex) {
                }
                this.a(27045L);
            }
            catch(Throwable throwable0) {
                goto label_54;
            }
            try {
                connectivityManager0.unregisterNetworkCallback(getCpidBackgroundTask$GetCpidCallback0);
                return Boolean.valueOf(false);
            label_54:
                connectivityManager0.unregisterNetworkCallback(getCpidBackgroundTask$GetCpidCallback0);
                throw throwable0;
            label_56:
                if(boolean0 == null) {
                    z = false;
                }
                else if(boolean0.booleanValue()) {
                    z = true;
                }
                else {
                    z = false;
                }
                connectivityManager0.unregisterNetworkCallback(getCpidBackgroundTask$GetCpidCallback0);
                return Boolean.valueOf(z);
            }
            catch(IOException iOException0) {
            label_66:
                ggtj ggtj0 = (ggtj)((ggtj)cryw.a.j()).s(iOException0);
                gpnd gpnd0 = new gpnd(gpnc.b, s1);
                ggtj0.X("%s Error connecting CPID endpoint. Message: %s\nURL: %s", "BgTaskGetCpid:", new gpnd(gpnc.a, iOException0.getMessage()), gpnd0);
                this.a(27007L);
                return Boolean.valueOf(false);
            }
        }
        this.a(27006L);
        return Boolean.valueOf(false);
    }
}

