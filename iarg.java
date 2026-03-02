import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.UserHandle;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class iarg implements Runnable {
    public final iarl a;

    public iarg(iarl iarl0) {
        this.a = iarl0;
    }

    @Override
    public final void run() {
        ResolveInfo resolveInfo0;
        iarl iarl0 = this.a;
        synchronized(iarl0) {
            if(iarl0.y(1)) {
                iarl0.x(2);
                try {
                    if(iarl0.f) {
                        iara iara0 = iarl0.c;
                        gftb.q(((iasv)iara0).c != null);
                        PackageManager packageManager0 = ((iasv)iara0).c.getPackageManager();
                        UserHandle userHandle0 = ((iasv)iara0).b;
                        if(userHandle0 == null) {
                            resolveInfo0 = packageManager0.resolveService(((iasv)iara0).a, 0x10000000);
                        }
                        else {
                            List list0 = iasv.d(packageManager0, ((iasv)iara0).a, userHandle0);
                            resolveInfo0 = null;
                            if(list0 != null && !list0.isEmpty()) {
                                resolveInfo0 = (ResolveInfo)list0.get(0);
                            }
                        }
                        if(resolveInfo0 == null) {
                            throw new iapl(iapk.o.f("resolveService(" + ((iasv)iara0).a + " / " + userHandle0 + ") was null"));
                        }
                        iarl0.i = iarl0.a(resolveInfo0.serviceInfo.applicationInfo.uid);
                        gmbu.t(iarl0.i, new iarj(iarl0), iarl0.a);
                    }
                    else {
                        iarl0.c.a();
                    }
                }
                catch(iapl iapl0) {
                    iarl0.u(iapl0.a, true);
                    return;
                }
                iarh iarh0 = new iarh(iarl0);
                iarl0.h = iarl0.n.schedule(iarh0, iarl0.e, TimeUnit.MILLISECONDS);
            }
        }
    }
}

