import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.concurrent.Callable;

public final class rbv implements Callable {
    public final rbx a;

    public rbv(rbx rbx0) {
        this.a = rbx0;
    }

    @Override
    public final Object call() {
        snw snw0;
        boolean z1;
        int v;
        boolean z;
        int v4;
        int v3;
        int v2;
        rbo rbo1;
        int v1;
        Bundle bundle0;
        rbx rbx0 = this.a;
        rbo rbo0 = rbx0.c;
        Object object0 = rbo0.a;
        synchronized(object0) {
            if(rbo0.b == 3) {
                return null;
            }
            z = false;
            v = 1;
            z1 = rbo0.b == 1;
            String s = rbo0.m;
            if(TextUtils.isEmpty(s)) {
                bundle0 = null;
            }
            else {
                bundle0 = new Bundle();
                bundle0.putString("accountName", s);
                rdk.j(bundle0, rbo0.d, rbo0.n.longValue());
            }
            __monitor_enter(object0);
            snw0 = rbo0.q;
        }
        if(snw0 == null) {
            rbo.o(rbx0.c);
            rbx0.c.s(0x77, rcn.g);
            rbx0.b(rcn.g);
            return null;
        }
        try {
            v1 = 27;
            rbo1 = rbx0.c;
            if(!rde.a(rbo1.g) || snw0.a(25, "com.google.android.gms", "inapp") != 0) {
                v2 = 3;
                v3 = 27;
                goto label_35;
            }
            goto label_71;
        }
        catch(Exception exception0) {
            rbx0.c(exception0, z1);
            return null;
        }
        try {
            while(true) {
            label_35:
                if(v3 < 3) {
                    v3 = 0;
                    break;
                }
                v2 = bundle0 == null ? snw0.a(v3, "com.google.android.gms", "subs") : snw0.b(v3, "com.google.android.gms", "subs", bundle0);
                if(v2 == 0) {
                    break;
                }
                --v3;
            }
            rbo rbo2 = rbx0.c;
            if(v3 >= 3) {
                z = true;
            }
            rbo2.i = z;
            if(v3 < 3) {
                v = 9;
            }
            while(v1 >= 3) {
                v2 = bundle0 == null ? snw0.a(v1, "com.google.android.gms", "inapp") : snw0.b(v1, "com.google.android.gms", "inapp", bundle0);
                if(v2 == 0) {
                    rbo2.j = v1;
                    break;
                }
                --v1;
            }
            rbo2.i(rbo2.j);
            if(rbo2.j < 3) {
                rdk.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                v = 36;
            }
            rbo2.j(v2);
        }
        catch(Exception exception1) {
            rbx0.c(exception1, z1);
            return null;
        }
        if(v2 == 0) {
            rbx0.a(z1);
            rbx0.b(rcn.f);
            return null;
        }
        rbx0.d(rcn.a, v, null, z1);
        rbx0.b(rcn.a);
        return null;
        try {
        label_71:
            Boolean boolean0 = Boolean.valueOf(z1);
            Bundle bundle1 = new Bundle();
            bundle1.putString("callingPackage", "com.google.android.gms");
            rdk.j(bundle1, rbo1.d, rbo1.n.longValue());
            if(rbo1.l != null) {
                bundle1.putBoolean("enablePendingPurchases", true);
            }
            snv snv0 = new snv(rbo1, rbx0, boolean0);
            Parcel parcel0 = snw0.jo();
            parcel0.writeInt(25);
            parcel0.writeString("com.google.android.gms");
            wbz.f(parcel0, bundle1);
            wbz.h(parcel0, snv0);
            snw0.jq(2101, parcel0);
        }
        catch(Exception exception2) {
            rdk.i("BillingClient", "Exception while invoking initialize AIDL method", exception2);
            String s1 = rcj.a(exception2);
            rbo.o(rbx0.c);
            rcm rcm0 = rbo.b(exception2);
            if((exception2 instanceof DeadObjectException)) {
                v4 = 0x8D;
            }
            else if((exception2 instanceof RemoteException)) {
                v4 = 0x8F;
            }
            else {
                v4 = (exception2 instanceof SecurityException) ? 0x8E : 140;
            }
            rbx0.d(rcm0, v4, s1, z1);
            rbx0.b(rbo.b(exception2));
        }
        return null;
    }
}

