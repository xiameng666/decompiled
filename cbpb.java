import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;

public class cbpb implements cbpi {
    public static final Intent a;
    public static final bboh b;
    public final Context c;
    public final String d;
    public final PackageInstaller e;
    private final ibrt g;
    private final bbic h;
    private final icck i;
    private final icig j;

    static {
        Intent intent0 = new Intent();
        intent0.setPackage("com.android.vending");
        intent0.setAction("com.google.android.finsky.BIND_PLAY_INSTALL_SERVICE");
        cbpb.a = intent0;
        cbpb.b = bboh.b("AppDownloadClient", bbcu.ac);
    }

    public cbpb(Context context0, ibrt ibrt0) {
        ibuq.f(context0, "context");
        ibuq.f(ibrt0, "highSpeedContext");
        super();
        this.c = context0;
        this.d = "com.google.android.gms.supervision";
        this.g = ibrt0;
        this.h = bbic.a();
        PackageInstaller packageInstaller0 = context0.getPackageManager().getPackageInstaller();
        ibuq.e(packageInstaller0, "getPackageInstaller(...)");
        this.e = packageInstaller0;
        this.i = iccl.d(iccl.b(ibrt0), new icfg(null));
        new ichv(new cbow(this, null));
        this.j = new ichv(new cboq(this, null));
    }

    public final Object a(ibrl ibrl0) {
        return icll.a(new icls(new cbot(this.j, this)), ibrl0);
    }

    @Override  // cbpi
    public final Object b(Context context0, String s, ibrl ibrl0) {
        return cbpb.c(this, context0, s, ibrl0);
    }

    static Object c(cbpb cbpb0, Context context0, String s, ibrl ibrl0) {
        cbou cbou0;
        if((ibrl0 instanceof cbou)) {
            cbou0 = (cbou)ibrl0;
            int v = cbou0.d;
            if((v & 0x80000000) == 0) {
                cbou0 = new cbou(cbpb0, ibrl0);
            }
            else {
                cbou0.d = v - 0x80000000;
            }
        }
        else {
            cbou0 = new cbou(cbpb0, ibrl0);
        }
        Object object0 = cbou0.b;
        Object object1 = ibrx.a;
        switch(cbou0.d) {
            case 0: {
                ibnx.b(object0);
                cbou0.a = cbpb0;
                cbou0.d = 1;
                object0 = cbpb0.g(context0, s, cbou0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                cbpb0 = cbou0.a;
                ibnx.b(object0);
            label_21:
                if(((cbpg)object0) == null) {
                    cbou0.a = null;
                    cbou0.d = 2;
                    Object object2 = cbpb0.a(cbou0);
                    return object2 == object1 ? object1 : object2;
                }
                return (cbpg)object0;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // cbpi
    public Object d(Context context0, ibrl ibrl0) {
        try {
            PackageManager packageManager0 = this.c.getPackageManager();
            PackageManager.PackageInfoFlags packageManager$PackageInfoFlags0 = PackageManager.PackageInfoFlags.of(0L);
            PackageInfo packageInfo0 = packageManager0.getPackageInfo(this.d, packageManager$PackageInfoFlags0);
            ibuq.e(packageInfo0, "getPackageInfo(...)");
            ApplicationInfo applicationInfo0 = packageInfo0.applicationInfo;
            if(applicationInfo0 != null) {
                return (applicationInfo0.flags & 4) == 0 ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
            return Boolean.valueOf(false);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            ((ggtj)((ggtj)cbpb.b.j()).s(packageManager$NameNotFoundException0)).B("Failed to get package info for %s. Package is not installed.", this.d);
            return Boolean.valueOf(false);
        }
    }

    @Override  // cbpi
    public final Object e(Context context0, String s, ibrl ibrl0) {
        return cbpb.f(this, context0, "recovery", ibrl0);
    }

    static Object f(cbpb cbpb0, Context context0, String s, ibrl ibrl0) {
        cbox cbox0;
        if((ibrl0 instanceof cbox)) {
            cbox0 = (cbox)ibrl0;
            int v = cbox0.d;
            if((v & 0x80000000) == 0) {
                cbox0 = new cbox(cbpb0, ibrl0);
            }
            else {
                cbox0.d = v - 0x80000000;
            }
        }
        else {
            cbox0 = new cbox(cbpb0, ibrl0);
        }
        Object object0 = cbox0.b;
        Object object1 = ibrx.a;
        switch(cbox0.d) {
            case 0: {
                ibnx.b(object0);
                cbox0.a = cbpb0;
                cbox0.d = 1;
                object0 = cbpb0.g(context0, s, cbox0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                cbpb0 = cbox0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(huld.a.b().f() && ((cbpg)object0) == null) {
            cboy cboy0 = new cboy(cbpb0, null);
            icbb.b(cbpb0.i, null, null, cboy0, 3);
        }
        return (cbpg)object0;
    }

    public final Object g(Context context0, String s, ibrl ibrl0) {
        int v1;
        Bundle bundle1;
        yxh yxh0;
        bbic bbic1;
        String s2;
        String s1;
        Object object3;
        cboz cboz0;
        if((ibrl0 instanceof cboz)) {
            cboz0 = (cboz)ibrl0;
            int v = cboz0.d;
            if((v & 0x80000000) == 0) {
                cboz0 = new cboz(this, ibrl0);
            }
            else {
                cboz0.d = v - 0x80000000;
            }
        }
        else {
            cboz0 = new cboz(this, ibrl0);
        }
        Object object0 = cboz0.b;
        Object object1 = ibrx.a;
        switch(cboz0.d) {
            case 0: {
                ibnx.b(object0);
                cbpa cbpa0 = new cbpa(this, null);
                cboz0.a = context0;
                cboz0.e = s;
                cboz0.d = 1;
                object0 = icbd.a(this.g, cbpa0, cboz0);
                if(object0 != object1) {
                    goto label_24;
                }
                return object1;
            }
            case 1: {
                s = cboz0.e;
                context0 = cboz0.a;
                ibnx.b(object0);
            label_24:
                bbic bbic0 = this.h;
                Intent intent0 = cbpb.a;
                cboz0.a = context0;
                cboz0.e = s;
                cboz0.f = (String)object0;
                cboz0.g = bbic0;
                cboz0.d = 2;
                icbk icbk0 = new icbk(ibsc.c(cboz0), 1);
                icbk0.z();
                cbpd cbpd0 = new cbpd(icbk0);
                icbk0.d(new cbpc(bbic0, context0, cbpd0));
                if(!bbic0.d(context0, intent0, cbpd0, 1)) {
                    icbk0.w(ibnx.a(new IllegalStateException(a.i(intent0, "No service found for ", "."))));
                }
                Object object2 = icbk0.k();
                if(object2 == object1) {
                    ibsi.b(cboz0);
                }
                if(object2 != object1) {
                    object3 = context0;
                    s1 = s;
                    s2 = (String)object0;
                    bbic1 = bbic0;
                    object0 = object2;
                    break;
                }
                return object1;
            }
            case 2: {
                bbic1 = cboz0.g;
                s2 = cboz0.f;
                s1 = cboz0.e;
                object3 = cboz0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        IBinder iBinder0 = (IBinder)((ibns)object0).a;
        ServiceConnection serviceConnection0 = (ServiceConnection)((ibns)object0).b;
        if(iBinder0 == null) {
            yxh0 = null;
        }
        else {
            try {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
                yxh0 = (iInterface0 instanceof yxh) ? ((yxh)iInterface0) : new yxh(iBinder0);
            label_60:
                ibns[] arr_ibns = new ibns[4];
                arr_ibns[0] = new ibns("network_type", new Integer(1));
                Boolean boolean0 = Boolean.valueOf(false);
                arr_ibns[1] = new ibns("charging", boolean0);
                arr_ibns[2] = new ibns("idle", boolean0);
                arr_ibns[3] = new ibns("account_name", s2);
                Bundle bundle0 = jyu.a(arr_ibns);
                bboh bboh0 = cbpb.b;
                ((ggtj)bboh0.h()).X("Requesting installation of %s with session %s for account %s", this.d, s1, s2);
                try {
                    bundle1 = yxh0.a("com.google.android.gms", this.d, bundle0);
                }
                catch(DeadObjectException unused_ex) {
                    cbfc.a(gvka.bV);
                    v1 = -1;
                    goto label_82;
                }
                String s3 = bundle1.getString("exception_type");
                if(s3 != null) {
                    ((ggtj)bboh0.j()).R("Install request for %s returned error of: %s", this.d, s3);
                }
                v1 = bundle1.getInt("status_code");
                goto label_82;
            }
            catch(Throwable throwable0) {
            }
            bbic1.b(((Context)object3), serviceConnection0);
            throw throwable0;
        }
        goto label_60;
    label_82:
        bbic1.b(((Context)object3), serviceConnection0);
        if(v1 == -5) {
            if(huld.c()) {
                cbfu.b(cbft.a(((Context)object3)), "AppDownloadClient");
                return cbpg.a;
            }
            try {
                ((Context)object3).getPackageManager().setApplicationEnabledSetting("com.google.android.gms.supervision", 0, 0);
            }
            catch(SecurityException securityException0) {
                if(!huld.a.b().d()) {
                    throw securityException0;
                }
                a.ae(cbpb.b.j(), "Failed to enable app, app is already not there.", securityException0);
            }
            return cbpg.a;
        }
        switch(v1) {
            case -5: {
                return cbpg.a;
            }
            case -4: {
                return cbpg.c;
            }
            case -8: 
            case -7: 
            case -6: 
            case -3: 
            case -2: 
            case -1: {
                return cbpg.b;
            }
            case 0: {
                return null;
            }
            default: {
                throw new IllegalArgumentException("Unknown result code: " + this.toString());
            }
        }
    }

    @Override  // cbpi
    public final cbpg h(Context context0) {
        return cbpe.a(this, context0);
    }

    @Override  // cbpi
    public final Object i(Context context0) {
        try {
            if(huld.c()) {
                cbfu.a(cbft.a(context0), "AppDownloadClient");
                return ibom.a;
            }
            cjmp.a(this.c, "com.google.android.gms.supervision", 2, 0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(cbpb.b.j(), "Failed to uninstall, app is already not here.", illegalArgumentException0);
        }
        return ibom.a;
    }
}

