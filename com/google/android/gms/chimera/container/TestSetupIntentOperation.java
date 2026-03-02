package com.google.android.gms.chimera.container;

import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import awbn;
import aztb;
import bajy;
import bbcu;
import bboh;
import brwz;
import brxa;
import bxe;
import bxf;
import ccjs;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import einq;
import evql;
import evrg;
import fhcd;
import gged_interceptors;
import ggfn;
import ggfp;
import ggia;
import ggnj;
import ggog;
import ggtj;
import hftc;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReadWriteLock;
import wxp;
import wxs;
import wyc;
import wzg;
import xep;
import xeu;
import xev;

public final class TestSetupIntentOperation extends IntentOperation {
    private static final bboh a;

    static {
        TestSetupIntentOperation.a = bboh.b("TestIntentOp", bbcu.ef);
    }

    private static void a(String s) {
        Log.i("TestIntentOp", s);
    }

    private static void b(Context context0, boolean z) {
        File file0 = wxs.c(context0);
        wxs.a(new byte[]{(z ? 49 : 0x30)}, new File(file0, ".tmp-.config_updated"), new File(file0, ".config_updated"), true);
    }

    private final boolean c(int v, long v1, long v2, Set set0) {
        for(int v3 = 0; v3 < v && SystemClock.elapsedRealtime() < v2; ++v3) {
            if(v3 > 0) {
                SystemClock.sleep(v1);
            }
            TestSetupIntentOperation.a(("TEST SETUP (Phenotype): " + v3 + " of " + v + " - " + TimeUnit.MILLISECONDS.toSeconds(v2 - SystemClock.elapsedRealtime())));
            ArrayList arrayList0 = ggia.e(((bxf)set0).c);
            einq einq0 = new einq(this);
            bxe bxe0 = new bxe(((bxf)set0));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                arrayList0.add(einq0.l(((String)object0)));
            }
            evql evql0 = evrg.i(arrayList0);
            try {
                evrg.o(evql0, 30L, TimeUnit.SECONDS);
                return true;
            }
            catch(ExecutionException executionException0) {
                ((ggtj)TestSetupIntentOperation.a.i()).B("Failed to get P/H config from required packages: %s", executionException0.getMessage());
                Throwable throwable0 = executionException0.getCause();
                if((throwable0 instanceof aztb) && ((aztb)throwable0).b() == 0x733F) {
                    Intent intent0 = IntentOperation.getStartIntent(this, "com.google.android.gms.common.config.PhenotypeRegistrationOperation", "com.google.android.chimera.MODULE_CONFIGURATION_CHANGED");
                    if(intent0 != null) {
                        this.startService(intent0);
                    }
                }
            }
            catch(InterruptedException | TimeoutException exception0) {
                ((ggtj)((ggtj)TestSetupIntentOperation.a.i()).s(exception0)).B("Something went wrong when getting P/H config:%s", exception0);
            }
        }
        return false;
    }

    private final boolean d(Set set0, Set set1, Set set2) {
        set1.add("com.google.android.gms");
        if(!set0.isEmpty()) {
            ModuleManager moduleManager0 = ModuleManager.get(this);
            try {
                Collection collection0 = moduleManager0.getAllModules();
            }
            catch(InvalidConfigException invalidConfigException0) {
                ((ggtj)((ggtj)TestSetupIntentOperation.a.i()).s(invalidConfigException0)).B("Unable to get Chimera module info collection:%s", invalidConfigException0);
                return false;
            }
            Set set3 = ccjs.c();
            for(Object object0: collection0) {
                set3.add(((ModuleManager.ModuleInfo)object0).moduleApk.apkPackageName);
            }
            if(set3.containsAll(set0)) {
                for(Object object1: collection0) {
                    byte[] arr_b = ((ModuleManager.ModuleInfo)object1).getMetadata(this).getByteArray("com.google.android.gms.phenotype.registration.proto");
                    if(arr_b != null && arr_b.length > 0) {
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)brxa.a), arr_b, 0, arr_b.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        for(Object object2: ((brxa)hftv0).b) {
                            String s = bajy.b(this, ((brwz)object2));
                            if(!((brwz)object2).g) {
                                set1.add(s);
                            }
                        }
                    }
                }
                return true;
            }
            set2.addAll(ggog.d(set0, set3));
            return false;
        }
        return true;
    }

    private static final boolean e() {
        return xep.d(wyc.f().a);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        boolean z6;
        wzg wzg1;
        boolean z4;
        long v4;
        boolean z;
        String s = intent0.getAction();
        if("com.google.android.gms.chimera.container.UPDATE_CONFIG_FOR_TESTING".equals(s)) {
            String s1 = intent0.getStringExtra("required_packages");
            ggfp ggfp0 = s1 != null && !s1.isEmpty() ? ggfp.H(s1.split(",")) : ggnj.a;
            int v = intent0.getIntExtra("max_scans", 22);
            long v1 = TimeUnit.SECONDS.toMillis(((long)intent0.getIntExtra("scan_interval_sec", 5)));
            if(intent0.getBooleanExtra("optimization_required", true)) {
                z = true;
            }
            else {
                wxp.b();
                z = false;
            }
            boolean z1 = intent0.getBooleanExtra("chimera_check", true);
            boolean z2 = intent0.getBooleanExtra("ph_check", true);
            long v2 = SystemClock.elapsedRealtime() + ((long)v) * v1;
            bxf bxf0 = new bxf(16);
            Set set0 = ccjs.c();
            if(z1) {
                awbn awbn0 = awbn.c();
                wzg wzg0 = wzg.e();
                int v3 = 0;
                boolean z3 = false;
                while(v3 < v && SystemClock.elapsedRealtime() < v2) {
                    if(v3 > 0) {
                        SystemClock.sleep(v1);
                    }
                    v4 = v1;
                    TestSetupIntentOperation.a(("TEST SETUP (Chimera): " + v3 + " of " + v + " - " + TimeUnit.MILLISECONDS.toSeconds(v2 - SystemClock.elapsedRealtime())));
                    if(TestSetupIntentOperation.e()) {
                        if(z3) {
                            TestSetupIntentOperation.a("Modules are ready");
                            z4 = true;
                            goto label_105;
                        }
                        Set set1 = awbn0.e();
                        Set set2 = awbn.o();
                        ggfn ggfn0 = new ggfn();
                        Set set3 = ccjs.c();
                        if(awbn0.l(set1, set2, set1, true, ggfn0)) {
                            ggfn0.h();
                            wzg0.w(ggfn0.h(), null, false);
                            if(z && wzg0.a()) {
                                File file0 = wzg0.i();
                                if(file0 != null && file0.isDirectory()) {
                                    synchronized(wzg.g) {
                                        ReadWriteLock readWriteLock0 = wzg.e;
                                        readWriteLock0.readLock().lock();
                                        try {
                                            xeu xeu0 = wzg0.d().c;
                                        }
                                        catch(Throwable throwable0) {
                                            wzg.e.readLock().unlock();
                                            throw throwable0;
                                        }
                                        readWriteLock0.readLock().unlock();
                                        for(Object object1: xeu0.e) {
                                            wzg.q(file0, ((xev)object1));
                                            wzg0 = wzg0;
                                        }
                                        wzg1 = wzg0;
                                    }
                                }
                                else {
                                    wzg1 = wzg0;
                                    Log.e("FileApkMgr", "Failed to get module files directory");
                                }
                            }
                            else {
                                wzg1 = wzg0;
                            }
                            awbn.c().h(true);
                            bxf0.clear();
                            set3.clear();
                            try {
                                boolean z5 = this.d(ggfp0, bxf0, set3);
                                if(z5 && TestSetupIntentOperation.e()) {
                                    TestSetupIntentOperation.a("Modules are ready");
                                    z4 = true;
                                }
                                else {
                                    z3 = z5;
                                    goto label_87;
                                }
                            }
                            catch(IOException | InvalidConfigException exception0) {
                                ((ggtj)((ggtj)TestSetupIntentOperation.a.i()).s(exception0)).B("Failed to read Chimera config:%s", exception0);
                                z4 = false;
                            }
                            goto label_105;
                        }
                        wzg1 = wzg0;
                    label_87:
                        if(z3) {
                            TestSetupIntentOperation.a("Modules initializing");
                        }
                        else {
                            TestSetupIntentOperation.a(("Modules not ready: " + gged_interceptors.C(set3)));
                        }
                    }
                    else {
                        TestSetupIntentOperation.a("Modules initializing");
                        wzg1 = wzg0;
                    }
                    ++v3;
                    wzg0 = wzg1;
                    v1 = v4;
                }
                v4 = v1;
                z4 = false;
            }
            else {
                try {
                    v4 = v1;
                    z6 = this.d(ggfp0, bxf0, set0);
                }
                catch(IOException | InvalidConfigException exception1) {
                    ((ggtj)((ggtj)TestSetupIntentOperation.a.i()).s(exception1)).B("Failed to read Chimera config:%s", exception1);
                    z4 = false;
                    goto label_105;
                }
                z4 = z6;
            }
        label_105:
            if(!z4 || !z2) {
                if(!z4) {
                    TestSetupIntentOperation.a(("Required module packages are not installed: " + gged_interceptors.C(set0)));
                }
            }
            else if(!fhcd.g(this)) {
                z4 = this.c(v, v4, v2, bxf0);
            }
            TestSetupIntentOperation.b(this.createDeviceProtectedStorageContext(), z4);
            if(fhcd.h(this)) {
                TestSetupIntentOperation.b(this, z4);
            }
            TestSetupIntentOperation.a(("UPDATE_CONFIG_FOR_TESTING completed: success=" + z4));
            return;
        }
        ((ggtj)TestSetupIntentOperation.a.i()).B("Unknown action: %s", s);
    }
}

