import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.io.IOException;
import java.net.InetAddress;

public final class czvb extends czus {
    private final dacl d;

    public czvb(Context context0, czvk czvk0) {
        super(context0, czvk0, gyxl.f);
        this.d = dack.a(context0);
    }

    @Override  // czus
    public final int a() {
        return 42;
    }

    @Override  // czus
    public final int b() {
        return 41;
    }

    @Override  // czus
    public final void e(String s) {
        synchronized(this) {
            super.e(s);
        }
    }

    @Override  // czus
    public final void f(String s) {
        synchronized(this) {
            super.f(s);
        }
    }

    @Override  // czus
    public final czle i(String s, String s1, int v, Network network0, czlb czlb0) {
        czle czle3;
        Throwable throwable2;
        czle czle2;
        czvb czvb0;
        czle czle1;
        czle czle0;
        __monitor_enter(this);
        try {
            if(this.h(s)) {
                goto label_2;
            }
            goto label_6;
        }
        catch(Throwable throwable0) {
            czvb0 = this;
            goto label_30;
        }
        try {
        label_2:
            czke.m(gyxl.f, s, 2, gymp.c, gymd.cn);
            czle0 = new czle(Boolean.valueOf(false), gyxo.aY);
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            czvb0 = this;
            goto label_31;
        }
        __monitor_exit(this);
        return czle0;
    label_6:
        if(v <= 0) {
            try {
                czke.m(gyxl.f, s, 2, gymp.l, gymd.cn);
                czle1 = new czle(Boolean.valueOf(false), gyxo.ay);
            }
            catch(Throwable throwable1) {
                throwable2 = throwable1;
                czvb0 = this;
                goto label_31;
            }
            __monitor_exit(this);
            return czle1;
        }
        try {
            if(!this.k()) {
                goto label_16;
            }
            czvb0 = this;
            czle3 = czvb0.super.i(s, s1, v, network0, czlb0);
            goto label_33;
        }
        catch(Throwable throwable0) {
            czvb0 = this;
            goto label_30;
        }
        try {
        label_16:
            if(!czvb.l(this.b)) {
                czke.m(gyxl.f, s, 2, gylz.c, gymd.H);
                czle2 = new czle(Boolean.valueOf(false), gyxo.U);
                goto label_24;
            }
            czvb0 = this;
            czle3 = czvb0.super.i(s, s1, v, network0, czlb0);
            goto label_33;
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            czvb0 = this;
            goto label_31;
        }
    label_24:
        __monitor_exit(this);
        return czle2;
        try {
            czvb0 = this;
            czle3 = czvb0.super.i(s, s1, v, network0, czlb0);
            goto label_33;
        label_30:
            throwable2 = throwable0;
        label_31:
            __monitor_exit(czvb0);
        }
        catch(Throwable throwable0) {
            goto label_30;
        }
        throw throwable2;
    label_33:
        __monitor_exit(czvb0);
        return czle3;
    }

    public final czle j(String s, Network network0, czkv czkv0) {
        czle czle0;
        InetAddress inetAddress0;
        synchronized(this) {
            if(this.g(s)) {
                czke.m(gyxl.f, s, 6, gymr.a, gymd.cn);
                return new czle(Boolean.valueOf(false), gyxo.bd);
            }
            if(!this.k() && !czvb.l(this.b)) {
                czke.m(gyxl.f, s, 6, gylz.c, gymd.H);
                return new czle(Boolean.valueOf(false), gyxo.U);
            }
            try {
                inetAddress0 = this.d.m();
                if(inetAddress0 == null) {
                    throw new IOException("Failed to find my own ip address.");
                }
            }
            catch(IOException unused_ex) {
                inetAddress0 = null;
            }
            czle0 = super.c(s, network0, czkv0, inetAddress0);
        }
        return czle0;
    }

    final boolean k() {
        return this.d.y();
    }

    static final boolean l(ConnectivityManager connectivityManager0) {
        if(connectivityManager0 != null) {
            Network network0 = connectivityManager0.getActiveNetwork();
            if(network0 != null) {
                NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(network0);
                return networkCapabilities0 != null && networkCapabilities0.hasTransport(3);
            }
        }
        return false;
    }
}

