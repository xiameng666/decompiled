import android.content.Context;
import android.net.Network;

public final class czva extends czus {
    public czva(Context context0, czvk czvk0) {
        super(context0, czvk0, gyxl.g);
    }

    @Override  // czus
    public final int a() {
        return 52;
    }

    @Override  // czus
    public final int b() {
        return 51;
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
        czle czle2;
        Throwable throwable2;
        czle czle1;
        czle czle0;
        czva czva0;
        __monitor_enter(this);
        try {
            if(this.h(s)) {
                goto label_6;
            }
            goto label_10;
        }
        catch(Throwable throwable0) {
            czva0 = this;
            goto label_24;
        }
        try {
        label_6:
            czke.m(gyxl.g, s, 2, gymp.c, gymd.cn);
            czle0 = new czle(Boolean.valueOf(false), gyxo.aY);
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            czva0 = this;
            goto label_25;
        }
        __monitor_exit(this);
        return czle0;
    label_10:
        if(v <= 0) {
            try {
                czke.m(gyxl.g, s, 2, gymp.m, gymd.cn);
                czle1 = new czle(Boolean.valueOf(false), gyxo.ay);
            }
            catch(Throwable throwable1) {
                throwable2 = throwable1;
                czva0 = this;
                goto label_25;
            }
            __monitor_exit(this);
            return czle1;
        }
        try {
            czva0 = this;
            czle2 = czva0.super.i(s, s1, v, network0, czlb0);
            goto label_27;
        label_24:
            throwable2 = throwable0;
        label_25:
            __monitor_exit(czva0);
        }
        catch(Throwable throwable0) {
            goto label_24;
        }
        throw throwable2;
    label_27:
        __monitor_exit(czva0);
        return czle2;
    }

    public final czle j(String s, Network network0, czkv czkv0) {
        czle czle0;
        synchronized(this) {
            if(this.g(s)) {
                czke.m(gyxl.g, s, 6, gymr.a, gymd.cn);
                return new czle(Boolean.valueOf(false), gyxo.bd);
            }
            czle0 = super.c(s, network0, czkv0, null);
        }
        return czle0;
    }
}

