import android.util.Log;
import java.util.Arrays;
import java.util.List;

public final class fczq {
    public static final ggfp a;
    public String b;
    public String c;
    public final int d;
    public final int e;
    public final boolean f;
    public boolean g;
    public volatile String h;
    public final boolean i;
    public String j;
    public String k;
    public int l;
    public final List m;
    public boolean n;
    public final boolean o;
    public final ffaz p;
    public final boolean q;
    public final feym r;
    public final int s;
    public final boolean t;
    public int u;
    public final boolean v;

    static {
        fczq.a = new ggoh(((int)6));
    }

    public fczq(String s, String s1, int v, int v1, boolean z, boolean z1, String s2, boolean z2, String s3, String s4, int v2, List list0, boolean z3, boolean z4, ffaz ffaz0, boolean z5, feym feym0, int v3, int v4, boolean z6, boolean z7) {
        this.u = 0;
        this.b = s;
        this.c = s1;
        this.d = v;
        this.e = v1;
        this.f = z;
        this.g = z1;
        this.h = s2;
        this.i = z2;
        this.j = s3;
        this.k = s4;
        this.l = v2;
        this.m = list0;
        this.n = z3;
        this.o = z4;
        this.p = ffaz0;
        this.q = z5;
        this.r = feym0;
        this.s = v3;
        this.u = v4;
        this.v = z6;
        this.t = z7;
    }

    public static fczp a() {
        fczp fczp0 = new fczp();
        fczp0.f(false);
        fczp0.c(true);
        fczp0.c = null;
        fczp0.b(true);
        fczp0.d = null;
        fczp0.e = null;
        fczp0.d(0);
        fczp0.f = null;
        fczp0.g(false);
        fczp0.e(true);
        fczp0.g = null;
        fczp0.j(false);
        fczp0.h = null;
        fczp0.h(0);
        fczp0.l(0);
        fczp0.i(false);
        fczp0.m(false);
        return fczp0;
    }

    public static String b(int v) {
        switch(v) {
            case 1: {
                return "BTC";
            }
            case 2: {
                return "Network";
            }
            case 3: {
                return "BLE";
            }
            case 4: {
                return "Cloud";
            }
            case 5: {
                return "BTD";
            }
            case 6: {
                return "BTO";
            }
            default: {
                return "Unknown";
            }
        }
    }

    public static String c(int v) {
        if(v == 0) {
            return "CONNECTION_RETRY_STRATEGY_DEFAULT";
        }
        switch(v) {
            case 1: {
                return "CONNECTION_RETRY_STRATEGY_LOW_LATENCY";
            }
            case 2: {
                return "CONNECTION_RETRY_STRATEGY_LOW_POWER";
            }
            case 3: {
                return "CONNECTION_RETRY_STRATEGY_OFF";
            }
            default: {
                return "CONNECTION_RETRY_STRATEGY_UNKNOWN";
            }
        }
    }

    public final void d(String s) {
        if(this.c == null) {
            this.c = s;
        }
    }

    public final void e(String s) {
        this.g = s != null;
        this.h = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fczq) ? bata.b(this.b, ((fczq)object0).b) && bata.b(this.c, ((fczq)object0).c) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((fczq)object0).d)) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((fczq)object0).e)) && bata.b(Boolean.valueOf(this.f), Boolean.valueOf(((fczq)object0).f)) && bata.b(Boolean.valueOf(this.i), Boolean.valueOf(((fczq)object0).i)) && bata.b(Boolean.valueOf(this.n), Boolean.valueOf(((fczq)object0).n)) && bata.b(Boolean.valueOf(this.o), Boolean.valueOf(((fczq)object0).o)) && bata.b(Integer.valueOf(this.u), Integer.valueOf(((fczq)object0).u)) && bata.b(Boolean.valueOf(this.v), Boolean.valueOf(((fczq)object0).v)) : false;
    }

    public final void f(String s) {
        if(this.b != null && !this.b.equals("server") && !this.b.equals("migrating_server")) {
            if(Log.isLoggable("ConnectionConfiguration", 6)) {
                Log.e("ConnectionConfiguration", "Cannot set name on this connectionConfig as it is already set to " + this.b);
            }
            return;
        }
        this.b = s;
    }

    public final boolean g() {
        return fczq.a.contains(Integer.valueOf(this.d));
    }

    public final boolean h() {
        return this.d == 3;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, ((int)this.d), ((int)this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.i), Boolean.valueOf(this.n), Boolean.valueOf(this.o), ((int)this.u), Boolean.valueOf(this.v)});
    }

    public final boolean i() {
        int v = this.d;
        switch(v) {
            case 1: {
                break;
            }
            case 5: {
                v = 5;
                break;
            }
            default: {
                return this.e > 0 && v > 0;
            }
        }
        return this.e != 1 || this.c != null && this.b != null ? this.e > 0 && v > 0 : false;
    }

    @Override
    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.b + ", Address=" + ffmo.b(this.c) + ", Type=" + fczq.b(this.d) + ", Role=" + this.e + ", Enabled=" + this.f + ", IsConnected=" + this.g + ", PeerNodeId=" + this.h + ", BtlePriority=" + this.i + ", NodeId=" + this.j + ", PackageName=" + this.k + ", ConnectionRetryStrategy=" + this.l + ", allowedConfigPackages=" + this.m + ", Migrating=" + this.n + ", DataItemSyncEnabled=" + this.o + ", NodeConnectionRestrictions=" + ffcz.b(this.p) + ", removeConnectionWhenBondRemovedByUser=" + this.q + ", maxSupportedRemoteAndroidSdkVersion=" + this.s + ", runtimeType=" + this.u + ", peerSupportsBle=" + this.v + ", skipConnectingIfDeviceNotBonded=" + this.t + "]";
    }
}

