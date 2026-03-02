import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import android.service.notification.StatusBarNotification;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import jeb.synthetic.TWR;

public final class almk {
    private static final baun a;
    private static almk b;
    private final almg c;
    private final alnb d;
    private final alnf e;

    static {
        almk.a = new baun("ProximityAuth", new String[]{"AppInfoMediator"});
    }

    public almk(Context context0, alnb alnb0) {
        this.c = almg.a(context0);
        this.e = new alnf(alnb0);
        this.d = alnb0;
    }

    public static almk a(Context context0) {
        synchronized(almk.class) {
            if(almk.b == null) {
                almk.b = new almk(context0, alna.b(context0));
            }
        }
        return almk.b;
    }

    public final alsw b(String s, UserHandle userHandle0, StatusBarNotification statusBarNotification0) {
        alsw alsw0;
        if(hpzm.s()) {
            alnf alnf0 = this.e;
            if(userHandle0.getIdentifier() != Process.myUserHandle().getIdentifier()) {
                try {
                    ywg ywg0 = alna.a(this.d);
                    if(ywg0 != null) {
                        try {
                            gfsx gfsx0 = gfsx.l(statusBarNotification0);
                            Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
                            BundlerType bundlerType0 = BundlerType.a("java.lang.String");
                            almj.b.c(bundle0, "packageName", s, bundlerType0);
                            BundlerType bundlerType1 = BundlerType.a("android.os.UserHandle");
                            almj.b.c(bundle0, "user", userHandle0, bundlerType1);
                            BundlerType bundlerType2 = BundlerType.b("com.google.common.base.Optional", new BundlerType[]{BundlerType.a("android.service.notification.StatusBarNotification")});
                            almj.b.c(bundle0, "sbn", gfsx0, bundlerType2);
                            Bundle bundle1 = alnf0.a.b().a(0xDB8F1B443A993C95L, 0, bundle0);
                            BundlerType bundlerType3 = BundlerType.a("com.google.android.gms.auth.proximity.phonehub.proto.App");
                            alsw0 = (alsw)almj.b.a(bundle1, "return", bundlerType3);
                        }
                        catch(Throwable throwable0) {
                            TWR.safeClose$NT(ywg0, throwable0);
                            throw throwable0;
                        }
                        ywg0.close();
                        return alsw0;
                    }
                }
                catch(ywm ywm0) {
                    almk.a.g("Profile unavailable", ywm0, new Object[0]);
                }
            }
        }
        gfsx gfsx1 = gfsx.l(statusBarNotification0);
        return this.c.c(s, userHandle0, gfsx1);
    }
}

