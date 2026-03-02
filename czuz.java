import android.content.Context;
import android.hardware.usb.UsbPort;
import android.hardware.usb.UsbPortStatus;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import android.net.TetheringManager.TetheringRequest.Builder;
import android.net.TetheringManager.TetheringRequest;
import android.net.TetheringManager;
import android.os.Looper;
import android.os.SystemProperties;
import com.google.android.gms.nearby.mediums.dct.UsbNcm.1;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class czuz extends czus {
    public Network d;
    public boolean e;
    private final cuqy f;
    private ConnectivityManager.NetworkCallback g;
    private final TetheringManager h;
    private final gmcg i;

    public czuz(Context context0, czvk czvk0) {
        super(context0, czvk0, gyxl.l);
        this.e = false;
        this.i = cuui.d();
        this.f = new cuqy(context0);
        this.h = bbqa.c() ? an..ExternalSyntheticApiModelOutline0.m(context0.getSystemService(TetheringManager.class)) : null;
    }

    @Override  // czus
    public final int a() {
        return 92;
    }

    @Override  // czus
    public final int b() {
        return 91;
    }

    @Override  // czus
    public final void d() {
        synchronized(this) {
            this.n();
            cuui.h(this.i, "UsbNcm.singleThreadOffloader");
            super.d();
        }
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
        czuz czuz0;
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
            czuz0 = this;
            goto label_29;
        }
        try {
        label_2:
            czke.m(gyxl.l, s, 2, gymp.c, gymd.cn);
            czle0 = new czle(Boolean.valueOf(false), gyxo.aZ);
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            czuz0 = this;
            goto label_30;
        }
        __monitor_exit(this);
        return czle0;
    label_6:
        if(v <= 0) {
            try {
                czke.m(gyxl.l, s, 2, gymp.k, gymd.cn);
                czle1 = new czle(Boolean.valueOf(false), gyxo.ay);
            }
            catch(Throwable throwable1) {
                throwable2 = throwable1;
                czuz0 = this;
                goto label_30;
            }
            __monitor_exit(this);
            return czle1;
        }
        try {
            if(!this.u()) {
                goto label_16;
            }
            czuz0 = this;
            czle3 = czuz0.super.i(s, s1, v, network0, czlb0);
            goto label_32;
        }
        catch(Throwable throwable0) {
            czuz0 = this;
            goto label_29;
        }
        try {
        label_16:
            czke.m(gyxl.l, s, 2, gylz.c, gymd.cv);
            czle2 = new czle(Boolean.valueOf(false), gyxo.V);
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            czuz0 = this;
            goto label_30;
        }
        __monitor_exit(this);
        return czle2;
        try {
            czuz0 = this;
            czle3 = czuz0.super.i(s, s1, v, network0, czlb0);
            goto label_32;
        label_29:
            throwable2 = throwable0;
        label_30:
            __monitor_exit(czuz0);
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
        throw throwable2;
    label_32:
        __monitor_exit(czuz0);
        return czle3;
    }

    public static int j() {
        return SystemProperties.getInt("ro.vendor.api_level", 0);
    }

    public final Network k() {
        synchronized(this) {
            czkq.a.b().i("%s: getNetwork: %s", "[UsbNcm]", this.d);
        }
        return this.d;
    }

    public final czle l(String s, Network network0, czkv czkv0) {
        czle czle0;
        synchronized(this) {
            if(this.g(s)) {
                czke.m(gyxl.l, s, 6, gymr.a, gymd.cn);
                return new czle(Boolean.valueOf(false), gyxo.be);
            }
            if(!this.u()) {
                czke.m(gyxl.l, s, 6, gylz.c, gymd.cv);
                return new czle(Boolean.valueOf(false), gyxo.V);
            }
            czle0 = super.c(s, network0, czkv0, null);
        }
        return czle0;
    }

    public final void m(Runnable runnable0) {
        this.i.execute(runnable0);
    }

    public final void n() {
        if(this.g != null) {
            czkq.a.b().h("%s: stopHost: unregister networkCallback", "[UsbNcm]");
            this.t();
        }
        this.d = null;
        TetheringManager tetheringManager0 = this.h;
        if(tetheringManager0 != null) {
            tetheringManager0.stopTethering(1);
        }
        synchronized(this) {
            this.e = false;
        }
    }

    public final boolean o() {
        UsbPort usbPort0 = this.s();
        if(usbPort0 != null) {
            UsbPortStatus usbPortStatus0 = this.f.a(usbPort0);
            return usbPortStatus0 != null && usbPortStatus0.getCurrentDataRole() == 2;
        }
        return false;
    }

    public final boolean p() {
        UsbPort usbPort0 = this.s();
        if(usbPort0 != null) {
            UsbPortStatus usbPortStatus0 = this.f.a(usbPort0);
            return usbPortStatus0 != null && usbPortStatus0.getCurrentDataRole() == 1;
        }
        return false;
    }

    public final boolean q() {
        TetheringManager.TetheringRequest tetheringManager$TetheringRequest0 = new TetheringManager.TetheringRequest.Builder(1).setConnectivityScope(2).build();
        gmcu gmcu0 = new gmcu();
        TetheringManager tetheringManager0 = this.h;
        if(tetheringManager0 != null) {
            tetheringManager0.startTethering(tetheringManager$TetheringRequest0, new czuu(), new czuy(this, gmcu0));
            try {
                if(!((Boolean)gmcu0.v(hvog.H(), TimeUnit.MILLISECONDS)).booleanValue()) {
                    czkq.a.b().h("%s Failed to start USB device network with false future result or timeout.", "[UsbNcm]");
                    return false;
                }
            }
            catch(InterruptedException interruptedException0) {
                czkq.a.e().f(interruptedException0).h("%s Failed to start USB device network with InterruptedException.", "[UsbNcm]");
                return false;
            }
            catch(ExecutionException executionException0) {
                czkq.a.e().f(executionException0).h("%s Failed to start USB device network with ExecutionException.", "[UsbNcm]");
                return false;
            }
            catch(TimeoutException timeoutException0) {
                czkq.a.e().f(timeoutException0).h("%s Failed to start USB device network with TimeoutException.", "[UsbNcm]");
                return false;
            }
            czkq.a.b().h("%s Successfully started USB device network", "[UsbNcm]");
            return true;
        }
        czkq.a.e().h("%s TetheringManager is null", "[UsbNcm]");
        return false;
    }

    public final boolean r() {
        ConnectivityManager connectivityManager0 = this.b;
        if(connectivityManager0 != null) {
            if(this.g != null) {
                czkq.a.e().h("%s: networkCallback is already registered and unregister it.", "[UsbNcm]");
                this.t();
            }
            gmcu gmcu0 = new gmcu();
            NetworkRequest networkRequest0 = new NetworkRequest.Builder().addTransportType(8).removeCapability(14).removeCapability(13).build();
            UsbNcm.1 usbNcm$10 = new UsbNcm.1(this, gmcu0);
            this.g = usbNcm$10;
            connectivityManager0.requestNetwork(networkRequest0, usbNcm$10, new clht(Looper.getMainLooper()), ((int)hvog.H()));
            try {
                if(!((Boolean)gmcu0.v(hvog.H(), TimeUnit.MILLISECONDS)).booleanValue()) {
                    czkq.a.b().h("%s Failed to start USB host network with false future result or timeout.", "[UsbNcm]");
                    this.g = null;
                    return false;
                }
            }
            catch(InterruptedException interruptedException0) {
                czkq.a.e().f(interruptedException0).h("%s Failed to start USB host network with InterruptedException.", "[UsbNcm]");
                this.g = null;
                return false;
            }
            catch(ExecutionException executionException0) {
                czkq.a.e().f(executionException0).h("%s Failed to start USB host network with ExecutionException.", "[UsbNcm]");
                this.g = null;
                return false;
            }
            catch(TimeoutException timeoutException0) {
                czkq.a.e().f(timeoutException0).h("%s Failed to start USB host network with TimeoutException.", "[UsbNcm]");
                this.g = null;
                return false;
            }
            czkq.a.b().h("%s Successfully started USB host network", "[UsbNcm]");
            return true;
        }
        return false;
    }

    private final UsbPort s() {
        List list0 = this.f.b();
        if(list0.isEmpty()) {
            czkq.a.b().h("%s: ports is empty", "[UsbNcm]");
            return null;
        }
        return (UsbPort)list0.get(0);
    }

    private final void t() {
        ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0 = this.g;
        if(connectivityManager$NetworkCallback0 != null) {
            ConnectivityManager connectivityManager0 = this.b;
            if(connectivityManager0 != null) {
                connectivityManager0.unregisterNetworkCallback(connectivityManager$NetworkCallback0);
                this.g = null;
            }
        }
    }

    private final boolean u() {
        return !this.p() || this.d == null ? this.o() && this.e : true;
    }
}

