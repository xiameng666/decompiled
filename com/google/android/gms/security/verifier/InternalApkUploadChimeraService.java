package com.google.android.gms.security.verifier;

import ByteString;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import bbfw;
import bbmq;
import ccsb;
import com.google.android.chimera.Service;
import ekpv;
import elhb;
import eltp;
import eltq;
import eltt;
import elty;
import elua;
import elub;
import eluc;
import elue;
import eluh;
import elui;
import eluj;
import elul;
import elum;
import eluo;
import ggtj;
import hrnt;
import hxvy;
import hxwd;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jwe;

public class InternalApkUploadChimeraService extends Service {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    protected eluj e;
    public elty f;
    protected HandlerThread g;
    public elui h;
    protected elul i;
    private static final long j;
    private static final int k;
    private boolean l;
    private final BroadcastReceiver m;
    private final BroadcastReceiver n;
    private final Object o;
    private ekpv p;

    static {
        InternalApkUploadChimeraService.a = 60000;
        InternalApkUploadChimeraService.b = 15000;
        InternalApkUploadChimeraService.j = 86400000L;
        InternalApkUploadChimeraService.k = 1200000;
        InternalApkUploadChimeraService.c = 86400000;
        InternalApkUploadChimeraService.d = 7200000;
    }

    public InternalApkUploadChimeraService() {
        this.l = false;
        this.m = new InternalApkUploadChimeraService.NetworkChangeBroadcastReceiver(this);
        this.n = new InternalApkUploadChimeraService.PackageChangeBroadcastReceiver(this);
        this.o = new Object();
    }

    public final void a(boolean z) {
        synchronized(this) {
            if(z) {
                if(!this.l) {
                    IntentFilter intentFilter0 = new IntentFilter();
                    intentFilter0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter0.addAction("android.net.conn.BACKGROUND_DATA_SETTING_CHANGED");
                    if(Build.VERSION.SDK_INT >= 33) {
                        this.registerReceiver(this.m, intentFilter0, 4);
                    }
                    else {
                        jwe.b(this, this.m, intentFilter0, 2);
                    }
                    IntentFilter intentFilter1 = new IntentFilter();
                    intentFilter1.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter1.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter1.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter1.addDataScheme("package");
                    if(Build.VERSION.SDK_INT >= 33) {
                        this.registerReceiver(this.n, intentFilter1, 4);
                    }
                    else {
                        jwe.b(this, this.n, intentFilter1, 2);
                    }
                    this.l = true;
                    return;
                }
                return;
            }
            if(this.l) {
                this.unregisterReceiver(this.m);
                this.unregisterReceiver(this.n);
                this.l = false;
            }
        }
    }

    public static void b(Context context0, long v) {
        Intent intent0 = elhb.b(context0, InternalApkUploadChimeraService.class);
        intent0.setAction("com.google.android.gms.security.verifyapps.PROCESS_QUEUE");
        intent0.putExtra("delay", v);
        context0.startService(intent0);
    }

    protected final boolean c() {
        return this.p.j();
    }

    public static boolean d(ApkUploadEntry apkUploadEntry0) {
        long v = apkUploadEntry0.f;
        long v1 = System.currentTimeMillis() - v;
        int v2 = apkUploadEntry0.g;
        if(v2 == 0) {
            return v1 > ((long)InternalApkUploadChimeraService.d) || v - System.currentTimeMillis() > InternalApkUploadChimeraService.j;
        }
        if(v2 == 1) {
            return v1 > ((long)InternalApkUploadChimeraService.c) || v - System.currentTimeMillis() > InternalApkUploadChimeraService.j;
        }
        eluo.a("Invalid entry state for entry id=%d: %d.", new Object[]{((long)apkUploadEntry0.a), v2});
        return true;
    }

    public final boolean e(PackageInfo packageInfo0, byte[] arr_b) {
        if(packageInfo0.applicationInfo.sourceDir.equals(packageInfo0.applicationInfo.publicSourceDir)) {
            File file0 = hrnt.i() ? new File(ccsb.a.a(packageInfo0.applicationInfo.sourceDir)) : new File(packageInfo0.applicationInfo.sourceDir);
            try {
                byte[] arr_b1 = this.i.a(packageInfo0.packageName, packageInfo0.lastUpdateTime, file0);
                return arr_b1 == null ? false : Arrays.equals(arr_b1, arr_b);
            }
            catch(IOException iOException0) {
                eluo.b(iOException0, "exception while reading apk", new Object[0]);
            }
        }
        return false;
    }

    public final boolean f() {
        if(this.c()) {
            return hxwd.d() ? this.e.b() : false;
        }
        return false;
    }

    public final boolean g(int v) {
        if(this.c() && hxwd.d()) {
            Object object0 = this.o;
            synchronized(object0) {
                if(this.f.g()) {
                    this.stopSelf(v);
                    return true;
                }
            }
            return false;
        }
        this.stopSelf(v);
        return true;
    }

    public final int h(File file0, byte[] arr_b, byte[] arr_b1, int v) {
        Integer integer1;
        eltt eltt0 = new eltt(this, file0, arr_b, arr_b1, v);
        File file1 = eltt0.b;
        long v1 = file1.length();
        int v2 = 0;
        Integer integer0 = (int)1;
        if(Long.compare(v1, 0L) != 0 && v1 <= hxwd.b()) {
            try {
                eltt0.i = (int)v1;
                eltt0.j = new FileInputStream(file1);
                eltt0.k = 0;
            }
            catch(IOException unused_ex) {
                eltt0.e.add(integer0);
                goto label_92;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)elua.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((elua)hftp0.b_message).c = 0;
            ((elua)hftp0.b_message).b |= 1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)eluc.a).v_newBuilder();
            elub elub0 = elub.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            elub0.getClass();
            ((eluc)hftv0).d = elub0;
            ((eluc)hftv0).b |= 2;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((eluc)hftv1).b |= 1;
            ((eluc)hftv1).c = "";
            long v3 = (long)eltt0.i;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            eluc eluc0 = (eluc)hftp1.b_message;
            eluc0.b |= 4;
            eluc0.e = v3;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)elub0).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(eltt0.c);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            elub elub1 = (elub)hftp2.b_message;
            elub1.b |= 1;
            elub1.c = hfsf0;
            elub elub2 = (elub)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            eluc eluc1 = (eluc)hftp1.b_message;
            elub2.getClass();
            eluc1.d = elub2;
            eluc1.b |= 2;
            long v4 = bbmq.d(eltt0.a);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            eluc eluc2 = (eluc)hftp1.b_message;
            eluc2.b |= 8;
            eluc2.f = v4;
            if(hxvy.t()) {
                int v5 = eltt0.l;
                if(v5 != 0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((elua)hftp0.b_message).f = v5 - 1;
                    ((elua)hftp0.b_message).b |= 8;
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            elua elua0 = (elua)hftp0.b_message;
            eluc eluc3 = (eluc)hftp1.N_build();
            eluc3.getClass();
            elua0.d = eluc3;
            elua0.b |= 2;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)elue.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((elue)hftp3.b_message).c = 0;
            ((elue)hftp3.b_message).b |= 1;
            ByteString hfsf1 = ByteString.copyFrom(eltt0.d);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            elue elue0 = (elue)hftp3.b_message;
            elue0.b |= 2;
            elue0.d = hfsf1;
            elue elue1 = (elue)hftp3.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            elua elua1 = (elua)hftp0.b_message;
            elue1.getClass();
            elua1.e = elue1;
            elua1.b |= 4;
            eltt0.g = bbfw.b();
            eltt0.g.add(new elum(new eltp(eltt0), new eltq(eltt0), ((elua)hftp0.N_build()), eltt0.i));
        }
        else {
            eltt0.e.add(integer0);
        }
    label_92:
        long v6 = System.nanoTime() + ((long)InternalApkUploadChimeraService.k) * 1000000L;
        try {
        label_93:
            long v8 = System.nanoTime();
            if(v8 > v6) {
                throw new TimeoutException();
            }
            integer1 = (Integer)eltt0.e.poll(v6 - v8, TimeUnit.NANOSECONDS);
            if(integer1 == null) {
                throw new TimeoutException();
            }
            return (int)integer1;
        }
        catch(InterruptedException unused_ex) {
            goto label_93;
        }
        catch(TimeoutException unused_ex) {
        }
        finally {
            eltt0.a();
        }
        eluo.c("Upload timed out. Canceling upload", new Object[0]);
        eltt0.f = true;
        return v2;
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.e = new eluj(((ConnectivityManager)this.getSystemService("connectivity")));
        this.i = new elul();
        this.p = new ekpv(this);
        HandlerThread handlerThread0 = new HandlerThread("apk_upload_thread");
        this.g = handlerThread0;
        handlerThread0.start();
        this.h = new elui(this, this.g.getLooper());
        this.f = new elty(this);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        this.a(false);
        this.g.quit();
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        if(intent0 != null) {
            intent0.getAction();
        }
        if(this.c()) {
            if(hxwd.d()) {
                if(!ekpv.e(this)) {
                    this.stopSelf(v1);
                    return 2;
                }
                String s = intent0 == null ? null : intent0.getAction();
                if(s == null) {
                    Message message0 = this.h.obtainMessage(1, v1, 0);
                    this.h.sendMessage(message0);
                    return 1;
                }
                if(s.equals("com.google.android.gms.security.verifyapps.UPLOAD_APK")) {
                    new eluh(this, intent0, v1).execute(new Void[0]);
                    return 1;
                }
                if(s.equals("com.google.android.gms.security.verifyapps.PROCESS_QUEUE")) {
                    Message message1 = this.h.obtainMessage(0, v1, 0);
                    long v2 = intent0.getLongExtra("delay", -1L);
                    this.h.removeMessages(0);
                    if(v2 != -1L) {
                        this.h.sendMessageDelayed(message1, v2);
                        return 1;
                    }
                    this.h.sendMessage(message1);
                    return 1;
                }
                if(s.equals("com.google.android.gms.security.verifyapps.BOOT_COMPLETE")) {
                    Message message2 = this.h.obtainMessage(1, v1, 0);
                    this.h.sendMessage(message2);
                    return 1;
                }
                ((ggtj)((ggtj)eluo.a.j()).ar(0x363A)).af("Unknown action: %s", new Object[]{s});
                Message message3 = this.h.obtainMessage(2, v1, 0);
                this.h.sendMessage(message3);
                return 1;
            }
            this.stopSelf(v1);
            return 2;
        }
        this.stopSelf(v1);
        return 2;
    }
}

