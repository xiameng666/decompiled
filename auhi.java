import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class auhi {
    public final String a;
    public CastDevice b;
    public String c;
    public String d;
    public final Map e;
    public String f;
    private final avjh g;
    private final String h;
    private final Map i;
    private String j;
    private MdnsServiceInfo k;
    private final atxp l;
    private final avij m;

    public auhi(String s, Map map0, atxp atxp0) {
        this.g = new avjh("MdnsDeviceScannerEntry");
        this.a = s;
        this.e = new HashMap();
        this.h = "Cast Device";
        this.i = map0;
        this.l = atxp0;
        this.m = avij.e();
    }

    public final int a(MdnsServiceInfo mdnsServiceInfo0, long v, long v1) {
        int v6;
        boolean z2;
        boolean z1;
        boolean z;
        int v5;
        int v4;
        int v3;
        InetAddress inetAddress0;
        this.k = mdnsServiceInfo0;
        String s = mdnsServiceInfo0.a("id");
        int v2 = -1;
        if(s == null) {
            return -1;
        }
        String s1 = this.k.b();
        if(TextUtils.isEmpty(s1) && hqsw.d()) {
            s1 = this.k.c();
        }
        if(TextUtils.isEmpty(s1)) {
            return -1;
        }
        try {
            inetAddress0 = InetAddress.getByName(s1);
        }
        catch(UnknownHostException unused_ex) {
            return -1;
        }
        String s2 = this.k.a("fn");
        if(TextUtils.isEmpty(s2)) {
            s2 = this.k.c;
        }
        String s3 = this.k.a("md");
        String s4 = TextUtils.isEmpty(s3) ? this.h : s3.replaceAll("(Eureka|Chromekey)( Dongle)?", "Chromecast");
        String s5 = this.k.a("ve");
        if(s5 == null) {
            this.g.g("Device version is missing: %s", new Object[]{this.k});
            v3 = 0;
        }
        else {
            try {
                v3 = Integer.parseInt(s5);
            }
            catch(NumberFormatException unused_ex) {
                this.g.g("Invalid device version: %s", new Object[]{s5});
                v3 = 0;
            }
        }
        String s6 = this.k.a("st");
        if(s6 == null) {
            this.g.g("Device status is missing: %s", new Object[]{this.k});
        }
        else {
            try {
                switch(Integer.parseInt(s6)) {
                    case 0: {
                        v2 = 0;
                        goto label_42;
                    }
                    case 1: {
                        v2 = 1;
                        goto label_42;
                    }
                    case 3: {
                        if(this.m.l()) {
                            break;
                        }
                        goto label_42;
                    }
                    default: {
                        goto label_42;
                    }
                }
            }
            catch(NumberFormatException unused_ex) {
                this.g.g("Invalid receiver status: %s", new Object[]{s6});
                goto label_42;
            }
            v2 = 3;
        }
    label_42:
        this.g.c("Device status: %d", new Object[]{v2});
        String s7 = this.k.a("ca");
        if(s7 == null) {
            this.g.g("Capabilities is missing: %s", new Object[]{this.k});
            v4 = 0;
        }
        else {
            try {
                v4 = Integer.parseInt(s7);
            }
            catch(NumberFormatException unused_ex) {
                this.g.g("Invalid capabilities mask: %s", new Object[]{s7});
                v4 = 0;
            }
        }
        String s8 = this.k.a("rs");
        String s9 = this.k.a("rm");
        this.j = this.k.a("wp");
        this.d = this.m.g() ? this.k.a("ct") : null;
        ArrayList arrayList0 = new ArrayList();
        String s10 = this.k.a("ic");
        if(!TextUtils.isEmpty(s10)) {
            WebImage webImage0 = aurf.e(s10, inetAddress0);
            if(webImage0 != null) {
                arrayList0.add(webImage0);
            }
        }
        String s11 = this.k.a("nf");
        if(s11 == null) {
            v5 = 0;
        }
        else {
            try {
                v5 = Integer.parseInt(s11);
            }
            catch(NumberFormatException unused_ex) {
                this.g.g("Failed to parse RCN enabled status from %s", new Object[]{s11});
                v5 = 0;
            }
        }
        if(v5 != 1 && v5 != 2 && v5 != 3) {
            this.g.g("Invalid remote control notifications enabled status; %d", new Object[]{v5});
            v5 = 0;
        }
        if(v5 == 0) {
            v5 = (int)hqtr.b();
        }
        String s12 = this.k.a("bs");
        String s13 = hqsq.c() ? this.k.a("cd") : null;
        this.f = this.k.a("rr");
        atrq atrq0 = new atrq(s, inetAddress0);
        atrq0.c = s2;
        atrq0.d = s4;
        atrq0.e = String.valueOf(v3);
        atrq0.f = this.k.g;
        atrq0.i = v4;
        atrq0.h = arrayList0;
        atrq0.j = v2;
        atrq0.l = this.a;
        atrq0.m = s9;
        atrq0.n = v5;
        atrq0.o = s12;
        atrq0.p = ausg.m(inetAddress0);
        atrq0.q = s13;
        atrq0.t = mdnsServiceInfo0.m;
        if(this.m.F()) {
            atrq0.k = Boolean.valueOf(false);
        }
        String s14 = this.j;
        if(s14 != null) {
            try {
                atrq0.g = Integer.parseInt(s14);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        CastDevice castDevice0 = atrq0.a();
        CastDevice castDevice1 = this.b;
        if(castDevice1 == null) {
            this.b = castDevice0;
            z = false;
            z1 = true;
        }
        else if(!castDevice0.c.equals(castDevice1.c) || (castDevice0.g != this.b.g || castDevice0.a() != this.b.a())) {
            this.b = castDevice0;
            z1 = false;
            z = true;
        }
        else if(!castDevice0.equals(this.b)) {
            this.b = castDevice0;
            z = false;
            z1 = true;
        }
        else {
            z1 = false;
            z = false;
        }
        if(aurf.u(s8, this.c)) {
            z2 = false;
        }
        else {
            this.c = s8;
            z2 = true;
        }
        if(mdnsServiceInfo0.e.isEmpty()) {
        label_143:
            v6 = 0;
        }
        else {
            CastDevice castDevice2 = this.b;
            if(castDevice2 == null) {
                goto label_143;
            }
            else {
                try {
                    if(Integer.parseInt(castDevice2.f) >= 4) {
                        goto label_126;
                    }
                    else {
                        goto label_143;
                    }
                    goto label_144;
                }
                catch(NumberFormatException unused_ex) {
                    goto label_143;
                }
            label_126:
                v6 = 0;
                for(Object object0: mdnsServiceInfo0.g()) {
                    String s15 = (String)object0;
                    if(s15.startsWith("_")) {
                        s15 = s15.substring(1);
                    }
                    String s16 = (String)this.i.get(s15);
                    if(s16 == null) {
                        this.g.c("Unexpected subtype: %s; ignoring", new Object[]{s15});
                    }
                    else {
                        int v7 = this.e.put(s16, Long.valueOf(v)) == null ? 1 : 0;
                        this.g.c("Found matching criterion %s (subtype %s) for %s", new Object[]{s16, s15, this.b});
                        if(v7 != 0 && v1 != -1L) {
                            this.l.V(this.b, s16);
                        }
                        v6 |= v7;
                    }
                }
            }
        }
    label_144:
        if(this.b != null) {
            if(castDevice1 == null) {
                return 1;
            }
            if(z) {
                return 3;
            }
            return !z1 && !z2 && v6 == 0 ? 0 : 2;
        }
        return 0;
    }

    public static String b(int v) {
        switch(v) {
            case -1: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)-1), "Invalid data");
            }
            case 0: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)0), "No change");
            }
            case 1: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)1), "New device");
            }
            case 2: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)2), "Updated device");
            }
            default: {
                return String.format(Locale.ROOT, "\"%d %s\"", v, "Different device");
            }
        }
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        CastDevice castDevice0 = this.b;
        String s = TextUtils.join(",", this.e.keySet());
        return String.format(locale0, "MdnsDeviceScannerEntry(%s) %s %s", this.a, castDevice0, s);
    }
}

