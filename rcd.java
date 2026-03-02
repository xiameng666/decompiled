import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;

public final class rcd extends rbo {
    public final Context r;
    public volatile int s;
    public volatile wqs t;
    private volatile rcc u;
    private volatile ScheduledExecutorService v;

    public rcd(String s, rct rct0, Context context0, rbn rbn0) {
        super(s, rct0, context0, rbn0);
        this.s = 0;
        this.r = context0;
    }

    public rcd(String s, rct rct0, Context context0, rdd rdd0, rbn rbn0) {
        super(s, rct0, context0, rdd0, rbn0);
        this.s = 0;
        this.r = context0;
    }

    private final void A() {
        int v = 1;
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        if(this.v()) {
            this.x(26);
            FIN.finallyExec$NT(v1);
            return;
        }
        switch(this.s) {
            case 1: {
                rdk.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                FIN.finallyExec$NT(v1);
                return;
            }
            case 3: {
                rdk.h("BillingClientTesting", "Billing Override Service Client was already closed and can\'t be reused. Please create another instance.");
                this.w(38, 26, rcn.a(-1, "Billing Override Service connection is disconnected."));
                FIN.finallyExec$NT(v1);
                return;
            }
            default: {
                this.s = 1;
                this.u = new rcc(this);
                Intent intent0 = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                intent0.setPackage("com.google.android.apps.play.billingtestcompanion");
                Context context0 = this.r;
                List list0 = context0.getPackageManager().queryIntentServices(intent0, 0);
                if(list0 != null && !list0.isEmpty()) {
                    ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(0);
                    if(resolveInfo0.serviceInfo != null) {
                        String s = resolveInfo0.serviceInfo.packageName;
                        String s1 = resolveInfo0.serviceInfo.name;
                        if(Objects.equals(s, "com.google.android.apps.play.billingtestcompanion") && s1 != null) {
                            ComponentName componentName0 = new ComponentName(s, s1);
                            Intent intent1 = new Intent(intent0);
                            intent1.setComponent(componentName0);
                            if(context0.bindService(intent1, this.u, 1)) {
                                FIN.finallyCodeBegin$NT(v1);
                                return;
                            }
                            rdk.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                        }
                        else {
                            rdk.h("BillingClientTesting", "The device doesn\'t have valid Play Billing Lab.");
                        }
                        v = 39;
                    }
                }
                else {
                    v = 41;
                }
                this.s = 0;
                this.w(v, 26, rcn.a(2, "Billing Override Service unavailable on device."));
                FIN.finallyExec$NT(v1);
            }
        }
    }

    @Override  // rbo
    public final rcm c(Activity activity0, rci rci0) {
        gmcd gmcd0;
        rca rca0 = (rcm rcm0) -> super.p(rcm0);
        rcb rcb0 = () -> super.c(activity0, rci0);
        Integer integer0 = (int)0;
        if(this.v()) {
            rbz rbz0 = new rbz(this);
            rdw rdw0 = new rdw();
            rdz rdz0 = new rdz(rdw0);
            rdw0.b = rdz0;
            rdw0.a = rbz0.getClass();
            try {
                rcd rcd0 = rbz0.a;
                try {
                    gftb.check(rcd0.t);
                    wqs wqs0 = rcd0.t;
                    wqt wqt0 = new wqt(rdw0);
                    Parcel parcel0 = wqs0.jo();
                    parcel0.writeString("com.google.android.gms");
                    parcel0.writeString("LAUNCH_BILLING_FLOW");
                    wbz.h(parcel0, wqt0);
                    wqs0.jq(1, parcel0);
                }
                catch(Exception exception1) {
                    rcd0.w(107, 28, rcn.n);
                    rdk.i("BillingClientTesting", "An error occurred while retrieving billing override.", exception1);
                    rdw0.a(integer0);
                }
                rdw0.a = "billingOverrideService.getBillingOverride";
            }
            catch(Exception exception0) {
                rdz0.a(exception0);
            }
            gmcd0 = rdz0;
        }
        else {
            rdk.h("BillingClientTesting", "Billing Override Service is not ready.");
            this.w(106, 28, rcn.a(-1, "Billing Override Service connection is disconnected."));
            gmcd0 = gmbu.i(integer0);
        }
        int v = this.y(gmcd0);
        if(v > 0) {
            rcm rcm0 = rcn.a(v, "Billing override value was set by a license tester.");
            this.w(105, 2, rcm0);
            rca0.accept(rcm0);
            return rcm0;
        }
        try {
            return (rcm)rcb0.call();
        }
        catch(Exception exception2) {
            this.w(0x73, 2, rcn.e);
            rdk.i("BillingClientTesting", "An internal error occurred.", exception2);
            return rcn.e;
        }
    }

    @Override  // rbo
    public final void f() {
        this.z();
        super.f();
    }

    @Override  // rbo
    public final void k(rby rby0) {
        this.A();
        super.k(rby0);
    }

    public final boolean v() {
        synchronized(this) {
            if(this.s == 2 && this.t != null && this.u != null) {
                return true;
            }
        }
        return false;
    }

    public final void w(int v, int v1, rcm rcm0) {
        hgxx hgxx0 = (hgxx)Objects.requireNonNull(rcj.b(v, v1, rcm0), "ApiFailure should not be null");
        this.h.a(hgxx0);
    }

    public final void x(int v) {
        hgxz hgxz0 = (hgxz)Objects.requireNonNull(rcj.e(v), "ApiSuccess should not be null");
        this.h.c(hgxz0);
    }

    private final int y(gmcd gmcd0) {
        try {
            return (int)(((Integer)gmcd0.get(28500L, TimeUnit.MILLISECONDS)));
        }
        catch(TimeoutException timeoutException0) {
            this.w(0x72, 28, rcn.n);
            rdk.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", timeoutException0);
            return 0;
        }
        catch(Exception exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            this.w(107, 28, rcn.n);
            rdk.i("BillingClientTesting", "An error occurred while retrieving billing override.", exception0);
            return 0;
        }
    }

    private final void z() {
        synchronized(this) {
            this.x(27);
            try {
                if(this.u != null && this.t != null) {
                    this.r.unbindService(this.u);
                    this.u = new rcc(this);
                }
                this.t = null;
            }
            catch(RuntimeException runtimeException0) {
                rdk.i("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", runtimeException0);
            }
            finally {
                this.s = 3;
            }
        }
    }
}

