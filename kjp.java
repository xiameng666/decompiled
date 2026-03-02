import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class kjp {
    private final Context a;

    public kjp(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
    }

    public final kjo a(boolean z) {
        Context context0 = this.a;
        ibuq.f(context0, "ctx");
        if(!context0.getPackageManager().hasSystemFeature("android.software.leanback")) {
            kjo kjo0 = null;
            ibuq.f(context0, "ctx");
            if(!context0.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                if(Build.VERSION.SDK_INT >= 34) {
                    kjw kjw0 = new kjw(context0);
                    if(kjw0.isAvailableOnDevice()) {
                        kjo0 = kjw0;
                    }
                    return kjo0 != null || !z ? kjo0 : this.c();
                }
                return Build.VERSION.SDK_INT > 33 ? null : this.c();
            }
        }
        return this.c();
    }

    public static kjo b(kjp kjp0, Object object0) {
        ibuq.f(object0, "request");
        if(!(object0 instanceof kjc) && !ibuq.m(object0, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            if((object0 instanceof kka)) {
                for(Object object1: ((kka)object0).a) {
                    if((((kjn)object1) instanceof kkh) || (((kjn)object1) instanceof kkc)) {
                        return kjp0.c();
                    }
                }
                return kjp0.a(true);
            }
            if(!(object0 instanceof kkr) && (!(object0 instanceof kja) || !((kja)object0).k)) {
                return (object0 instanceof kiw) ? kjp0.c() : kjp0.a(true);
            }
            return kjp0.c();
        }
        return kjp0.c();
    }

    private final kjo c() {
        kjo kjo1;
        Context context0 = this.a;
        PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo("com.google.android.gms", 0x84);
        ArrayList arrayList0 = new ArrayList();
        if(packageInfo0.services != null) {
            ServiceInfo[] arr_serviceInfo = packageInfo0.services;
            ibuq.c(arr_serviceInfo);
            for(int v = 0; v < arr_serviceInfo.length; ++v) {
                ServiceInfo serviceInfo0 = arr_serviceInfo[v];
                if(serviceInfo0.metaData != null) {
                    String s = serviceInfo0.metaData.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY");
                    if(s != null) {
                        arrayList0.add(s);
                    }
                }
            }
        }
        List list0 = ibpo.ar(arrayList0);
        if(list0.isEmpty()) {
            return null;
        }
        kjo kjo0 = null;
        for(Object object0: list0) {
            String s1 = (String)object0;
            try {
                Object object1 = Class.forName(s1).getConstructor(Context.class).newInstance(context0);
                ibuq.d(object1, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                kjo1 = (kjo)object1;
                if(!kjo1.isAvailableOnDevice()) {
                    continue;
                }
                if(kjo0 != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                }
            }
            catch(Throwable unused_ex) {
                continue;
            }
            kjo0 = kjo1;
        }
        return kjo0;
    }
}

