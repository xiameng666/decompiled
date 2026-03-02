import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

public final class fdqb implements Runnable {
    public final fdqk a;
    public final CountDownLatch b;
    public final Set c;
    public final CountDownLatch d;

    public fdqb(fdqk fdqk0, CountDownLatch countDownLatch0, Set set0, CountDownLatch countDownLatch1) {
        this.a = fdqk0;
        this.b = countDownLatch0;
        this.c = set0;
        this.d = countDownLatch1;
    }

    @Override
    public final void run() {
        int v1;
        fdpl fdpl0;
        int v2;
        fesq fesq1;
        fesq fesq0;
        Process.setThreadPriority(9);
        fdqk fdqk0 = this.a;
        fdwp fdwp0 = fdqk0.i;
        Set set0 = this.c;
        synchronized(fdwp0) {
            v1 = 3;
            this.b.countDown();
            Log.i("CapabilityService", "CapabilityService init start");
            if(fdqk0.B()) {
                try {
                    fesq0 = (fesq)fdqk0.l.a().get();
                }
                catch(ExecutionException | InterruptedException exception0) {
                    Log.w("CapabilityService", "Failed to retrieve capability service initialization state", exception0);
                    fesq0 = null;
                }
                if(fesq0 != null && (fesp.a(fesq0.c) == 3 || fesp.a(fesq0.c) == 4) && fesq0.d.equals(Build.FINGERPRINT)) {
                    Log.i("CapabilityService", a.a(fesq0.d, "CapabilityService already initialized on ", ", not reading capabilities this init"));
                    fesq1 = fesq0;
                    v2 = 4;
                }
                else {
                    fesq1 = fesq0;
                    v2 = 2;
                }
            }
            else {
                fesq1 = null;
                v2 = 2;
            }
            if(v2 == 4) {
                v1 = 4;
            }
            else {
                Log.i("CapabilityService", "CapabilityService reading all app capabilities");
                boolean z = fdqk0.e && Build.VERSION.SDK_INT == 33 && hzut.c();
                fdqj fdqj0 = fdqk0.d;
                fdqj0.c = 0;
                fdqj0.d = 0;
                if(z) {
                    fdqj0.b = fdqk.G(set0);
                }
                List list0 = fdqk0.c.getInstalledPackages(0x40);
                Map map0 = fdqk0.D(2);
                HashSet hashSet0 = new HashSet(map0.keySet());
                HashSet hashSet1 = new HashSet();
                HashMap hashMap0 = new HashMap();
                for(Object object0: list0) {
                    PackageInfo packageInfo0 = (PackageInfo)object0;
                    String s = packageInfo0.packageName;
                    try {
                        fdpl0 = fdpn.b(fdqk0.b, s, packageInfo0);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        Log.e("CapabilityService", dlbc.c(s, "Could not generate AppKey for package \"", "\""), illegalArgumentException0);
                        Iterator iterator1 = hashSet0.iterator();
                        while(iterator1.hasNext()) {
                            Object object1 = iterator1.next();
                            if(((fdpl)object1).b.equals(s)) {
                                iterator1.remove();
                            }
                        }
                        continue;
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        Log.e("CapabilityService", dlbc.c(s, "Could not find package \"", "\""));
                        continue;
                    }
                    hashSet0.remove(fdpl0);
                    hashSet1.add(fdpl0);
                    if(z && packageInfo0.applicationInfo != null) {
                        hashMap0.put(fdpl0, packageInfo0.applicationInfo);
                    }
                }
                for(Object object2: hashSet0) {
                    fdqk0.x(((fdpl)object2).b);
                    map0.remove(((fdpl)object2));
                }
                ArrayList arrayList0 = new ArrayList();
                boolean z1 = false;
                for(Object object3: hashSet1) {
                    fdpl fdpl1 = (fdpl)object3;
                    if(fdqk0.f.j(fdpl1.b)) {
                        if(z1) {
                            continue;
                        }
                        z1 = true;
                    }
                    arrayList0.addAll(fdqk0.t(fdpl1, map0, gfsx.l(((ApplicationInfo)hashMap0.get(fdpl1)))));
                }
                try {
                    ((glyq)gmbu.e(arrayList0)).u();
                }
                catch(ExecutionException | InterruptedException exception1) {
                    Log.w("CapabilityService", "handleAppAddedOrChangedAsync: failed with unexpected exception, ", exception1);
                }
                if(z) {
                    if(Log.isLoggable("CapabilityService", 3)) {
                        Log.d("CapabilityService", "All static capabilities initialized. Among " + list0.size() + " installed packages, " + fdqk0.d.c + " read capabilities from framework config files; " + fdqk0.d.d + " read capabilities from resources.");
                    }
                    fdqk0.d.b = null;
                }
            }
            Log.i("CapabilityService", "CapabilityService init end");
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fesq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fesq)hftp0.b_message).c = v1 - 1;
        ((fesq)hftp0.b_message).b |= 1;
        String s1 = Build.FINGERPRINT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesq fesq2 = (fesq)hftp0.b_message;
        s1.getClass();
        fesq2.b |= 2;
        fesq2.d = s1;
        fesq fesq3 = (fesq)hftp0.N_build();
        if(fdqk0.B() && (fesq1 == null || !((ProtoLiteMessage)fesq1).equals(fesq3))) {
            try {
                fdqa fdqa0 = new fdqa(fesq3);
                ((glyq)fdqk0.l.b(fdqa0, gmap.a)).u();
            }
            catch(ExecutionException | InterruptedException exception2) {
                Log.e("CapabilityService", "Failed to store current successful init on build " + Build.FINGERPRINT, exception2);
            }
        }
        this.d.countDown();
    }
}

