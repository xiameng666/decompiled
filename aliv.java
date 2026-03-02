import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public final class aliv {
    public static final baun a;
    public final alja b;
    public String c;
    private static aliv d;

    static {
        aliv.a = new baun("ProximityAuth", new String[]{"PhoneHubEventsLogger"});
    }

    public aliv() {
        this.b = alja.a();
    }

    public static aliv a() {
        synchronized(aliv.class) {
            if(aliv.d == null) {
                aliv.d = new aliv();
            }
        }
        return aliv.d;
    }

    public final void b() {
        try {
            alja alja0 = this.b;
            if(!((String)((glyq)alja0.b()).u()).isEmpty() && System.currentTimeMillis() < ((long)(((Long)((glyq)alja0.c()).u())))) {
                return;
            }
            ((glyq)alja0.e(UUID.randomUUID().toString(), System.currentTimeMillis() + 7776000000L)).u();
            this.c = null;
        }
        catch(InterruptedException | ExecutionException exception0) {
            aliv.a.g("Failed to get or update PhoneHubEventsLoggerIdentifier", exception0, new Object[0]);
        }
    }

    public final void c(String s, int v, int v1) {
        if(!hpzm.B()) {
            return;
        }
        this.b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzzp.a).v_newBuilder();
        this.e(hftp0, "NearbySecureChannelEvent");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzzn.a).v_newBuilder();
        if(s != null && !s.isEmpty()) {
            try {
                alja alja0 = this.b;
                if(!((String)((glyq)alja0.d(s)).u()).isEmpty()) {
                    String s1 = (String)((glyq)alja0.d(s)).u();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gzzn gzzn0 = (gzzn)hftp1.b_message;
                    s1.getClass();
                    gzzn0.b |= 1;
                    gzzn0.c = s1;
                }
            }
            catch(InterruptedException | ExecutionException exception0) {
                aliv.a.g("Failed to get remote device PseudonymousId for logging NearbySecureChannelEvent", exception0, new Object[0]);
            }
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gzzn)hftv0).d = v - 1;
        ((gzzn)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gzzn)hftp1.b_message).e = v1 - 1;
        ((gzzn)hftp1.b_message).b |= 4;
        cdzd cdzd0 = cdzd.v();
        gzzn gzzn1 = (gzzn)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzzp gzzp0 = (gzzp)hftp0.b_message;
        gzzn1.getClass();
        gzzp0.d = gzzn1;
        gzzp0.c = 4;
        cdzd0.j(((ProtoLiteMessage)(((gzzp)hftp0.N_build()))));
    }

    public final void d(int v, int v1) {
        if(!hpzm.B()) {
            return;
        }
        this.b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzzp.a).v_newBuilder();
        this.e(hftp0, "PhoneHubMessageEvent");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzzo.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gzzo)hftv0).d = v - 1;
        ((gzzo)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gzzo gzzo0 = (gzzo)hftp1.b_message;
        gzzo0.e = aluc.a(v1);
        gzzo0.b |= 4;
        if(hpzm.H() && !gfta.c(this.c)) {
            String s = this.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzzo gzzo1 = (gzzo)hftp1.b_message;
            s.getClass();
            gzzo1.b |= 1;
            gzzo1.c = s;
        }
        gzzo gzzo2 = (gzzo)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzzp gzzp0 = (gzzp)hftp0.b_message;
        gzzo2.getClass();
        gzzp0.d = gzzo2;
        gzzp0.c = 5;
        cdzd.v().j(((ProtoLiteMessage)(((gzzp)hftp0.N_build()))));
    }

    public final void e(ProtoLiteBuilder hftp0, String s) {
        try {
            String s1 = (String)((glyq)this.b.b()).u();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzzp gzzp0 = (gzzp)hftp0.b_message;
            s1.getClass();
            gzzp0.b |= 1;
            gzzp0.e = s1;
        }
        catch(InterruptedException | ExecutionException exception0) {
            aliv.a.g("Failed to get PhoneHubEventsLoggerPseudonymousId for logging " + s, exception0, new Object[0]);
        }
        long v = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzzp gzzp1 = (gzzp)hftp0.b_message;
        int v1 = 2;
        gzzp1.b |= 2;
        gzzp1.f = v;
        if(!bbpj.a(AppContextProvider.a()).h()) {
            v1 = 1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gzzp)hftp0.b_message).g = v1 - 1;
        int v2 = 4;
        ((gzzp)hftp0.b_message).b |= 4;
        ConnectivityManager connectivityManager0 = (ConnectivityManager)AppContextProvider.a().getSystemService("connectivity");
        if(connectivityManager0 == null) {
            v2 = 3;
        }
        else {
            Network network0 = connectivityManager0.getActiveNetwork();
            if(network0 == null) {
                v2 = 3;
            }
            else {
                NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(network0);
                if(networkCapabilities0 != null && networkCapabilities0.hasTransport(1)) {
                    v2 = 5;
                }
                else if(networkCapabilities0 == null || !networkCapabilities0.hasTransport(0)) {
                    v2 = 3;
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzzp gzzp2 = (gzzp)hftp0.b_message;
        gzzp2.h = aluj.a(v2);
        gzzp2.b |= 8;
        String s2 = Locale.getDefault().toLanguageTag();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzzp gzzp3 = (gzzp)hftp0.b_message;
        s2.getClass();
        gzzp3.b |= 16;
        gzzp3.i = s2;
    }
}

