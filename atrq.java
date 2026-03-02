import android.net.Network;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.CastEurekaInfo;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public final class atrq {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public Integer g;
    public List h;
    public int i;
    public int j;
    public Boolean k;
    public String l;
    public String m;
    public int n;
    public String o;
    public byte[] p;
    public String q;
    public boolean r;
    public CastEurekaInfo s;
    public Network t;

    public atrq(CastDevice castDevice0) {
        this.e = "-1";
        this.f = 8009;
        this.h = new ArrayList();
        this.i = 0;
        this.j = -1;
        Boolean boolean0 = null;
        this.k = null;
        this.a = castDevice0.f();
        this.c = castDevice0.d;
        this.d = castDevice0.e;
        this.e = castDevice0.f;
        this.b = castDevice0.b;
        this.f = castDevice0.g;
        this.h = castDevice0.g();
        this.i = castDevice0.a();
        this.j = castDevice0.h;
        this.l = castDevice0.i;
        this.m = castDevice0.j;
        this.n = castDevice0.k;
        this.o = castDevice0.l;
        this.p = castDevice0.m;
        this.q = castDevice0.n;
        this.r = castDevice0.o;
        this.s = castDevice0.d();
        this.g = castDevice0.p;
        if(castDevice0.q != null) {
            boolean0 = Boolean.valueOf(castDevice0.r());
        }
        this.k = boolean0;
        this.t = castDevice0.r;
    }

    public atrq(String s) {
        this.e = "-1";
        this.f = 8009;
        this.h = new ArrayList();
        this.i = 0;
        this.j = -1;
        this.k = null;
        this.a = s;
        this.b = "0.0.0.0";
    }

    public atrq(String s, InetAddress inetAddress0) {
        this.e = "-1";
        this.f = 8009;
        this.h = new ArrayList();
        this.i = 0;
        this.j = -1;
        String s1 = null;
        this.k = null;
        if(inetAddress0 != null) {
            s1 = inetAddress0.getHostAddress();
        }
        this.b = s1;
        this.a = s;
    }

    public final CastDevice a() {
        return new CastDevice(this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.i, this.j, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.g, this.k, this.t);
    }
}

