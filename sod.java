import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jeb.synthetic.FIN;

public final class sod {
    public final Handler a;
    ExecutorService b;
    public soq c;
    public boolean d;
    public soa e;
    private final Context f;

    public sod() {
        throw null;
    }

    public sod(Context context0) {
        Context context1 = context0.getApplicationContext();
        this.f = context1;
        this.a = new Handler(context1.getMainLooper());
    }

    public final sot a(String[] arr_s) {
        ByteString hfsf1;
        String s1;
        sou sou0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)sot.a).v_newBuilder();
        int v = 0;
        while(v < arr_s.length) {
            File file0 = new File(arr_s[v]);
            Context context0 = this.f;
            Uri uri0 = jwg.a(context0, "com.google.android.gms.play-p2p-fileprovider", file0);
            context0.grantUriPermission("com.android.vending", uri0, 1);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)sos.a).v_newBuilder();
            String s = uri0.toString();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            sos sos0 = (sos)hftp1.b_message;
            s.getClass();
            sos0.c = s;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)sou.a).v_newBuilder();
            try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "r")) {
                Pair pair0 = sgm.c(randomAccessFile0);
                if(pair0 == null) {
                    throw new sgl("Not an APK file: ZIP End of Central Directory record not found");
                }
                kau kau0 = new kau(((ByteBuffer)pair0.first), ((Long)pair0.second));
                long v1 = (long)(((Long)kau0.b));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((sou)hftp2.b_message).f = v1;
                long v2 = sgm.b(((ByteBuffer)kau0.a));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((sou)hftp2.b_message).e = v2;
                if(v2 < 0x20L) {
                    throw new sgl(a.u(v2, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
                }
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(24);
                byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
                randomAccessFile0.seek(v2 - ((long)byteBuffer0.capacity()));
                randomAccessFile0.readFully(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
                if(byteBuffer0.getLong(8) != 0x20676953204B5041L || byteBuffer0.getLong(16) != 0x3234206B636F6C42L) {
                    throw new sgl("No APK Signing Block before ZIP Central Directory");
                }
                long v3 = byteBuffer0.getLong(0);
                if(v3 < ((long)byteBuffer0.capacity()) || v3 > 0x7FFFFFF7L) {
                    throw new sgl(a.u(v3, "APK Signing Block size out of range: "));
                }
                long v4 = v2 - ((long)(((int)(v3 + 8L))));
                if(v4 < 0L) {
                    throw new sgl(a.u(v4, "APK Signing Block offset out of range: "));
                }
                ByteBuffer byteBuffer1 = ByteBuffer.allocate(((int)(v3 + 8L)));
                byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
                randomAccessFile0.seek(v4);
                randomAccessFile0.readFully(byteBuffer1.array(), byteBuffer1.arrayOffset(), byteBuffer1.capacity());
                long v5 = byteBuffer1.getLong(0);
                if(v5 != v3) {
                    throw new sgl(a.J(v3, v5, "APK Signing Block sizes in header and footer do not match: ", " vs "));
                }
                kau kau1 = new kau(byteBuffer1, v4);
                long v6 = (long)(((Long)kau1.b));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((sou)hftp2.b_message).d = v6;
                ByteString hfsf0 = ByteString.v(((ByteBuffer)kau1.a));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((sou)hftp2.b_message).g = hfsf0;
            }
            catch(sgl unused_ex) {
                sou0 = (sou)hftp2.N_build();
                goto label_120;
            }
            PackageInfo packageInfo0 = context0.getPackageManager().getPackageArchiveInfo(file0.getAbsolutePath(), 0x50C0);
            if(packageInfo0 != null && packageInfo0.applicationInfo != null) {
                ApplicationInfo applicationInfo0 = packageInfo0.applicationInfo;
                applicationInfo0.sourceDir = file0.getAbsolutePath();
                ApplicationInfo applicationInfo1 = packageInfo0.applicationInfo;
                applicationInfo1.publicSourceDir = file0.getAbsolutePath();
            }
            if(packageInfo0 == null) {
                Log.e("P2pEvaluationSupportLib", String.format("Unable to parse valid PackageInfo for file: %s", file0));
            }
            else {
                if(TextUtils.isEmpty(packageInfo0.packageName)) {
                    Log.e("P2pEvaluationSupportLib", String.format("No package name for file: %s", file0));
                }
                Parcel parcel0 = Parcel.obtain();
                try {
                    packageInfo0.writeToParcel(parcel0, 0);
                    hfsf1 = ByteString.copyFrom(parcel0.marshall());
                }
                finally {
                    parcel0.recycle();
                }
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                sou sou1 = (sou)hftp2.b_message;
                sou1.b = 5;
                sou1.c = hfsf1;
                CharSequence charSequence0 = context0.getPackageManager().getApplicationLabel(packageInfo0.applicationInfo);
                if(charSequence0 == null) {
                    Log.e("P2pEvaluationSupportLib", String.format("Unable to get application label for: %s", packageInfo0.packageName));
                    s1 = "";
                }
                else {
                    s1 = charSequence0.toString();
                }
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                sou sou2 = (sou)hftp2.b_message;
                s1.getClass();
                sou2.h = s1;
                Log.i("P2pEvaluationSupportLib", String.format("Parsed apk info for file %s", file0));
            }
            sou0 = (sou)hftp2.N_build();
        label_120:
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            sos sos1 = (sos)hftp1.b_message;
            sou0.getClass();
            sos1.d = sou0;
            sos1.b |= 1;
            String s2 = file0.getAbsolutePath();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            sos sos2 = (sos)hftp1.b_message;
            s2.getClass();
            sos2.e = s2;
            long v8 = file0.length();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((sos)hftp1.b_message).f = v8;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            sot sot0 = (sot)hftp0.b_message;
            sos sos3 = (sos)hftp1.N_build();
            sos3.getClass();
            hfuo hfuo0 = sot0.b;
            if(!hfuo0.c()) {
                sot0.b = ProtoLiteMessage.E(hfuo0);
            }
            sot0.b.add(sos3);
            ++v;
        }
        return (sot)hftp0.N_build();
    }

    public final void b() {
        synchronized(this) {
            this.d = false;
            soq soq0 = this.c;
            if(soq0 != null) {
                this.f.unbindService(soq0);
                soq soq1 = this.c;
                if(soq1 != null) {
                    soq1.onServiceDisconnected(null);
                }
            }
            ExecutorService executorService0 = this.b;
            if(executorService0 != null) {
                executorService0.shutdownNow();
            }
        }
    }

    public final void c(Runnable runnable0) {
        if(this.b == null || this.b.isShutdown()) {
            this.b = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        }
        this.b.execute(runnable0);
    }

    public final void d(Runnable runnable0) {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            runnable0.run();
            return;
        }
        this.a.post(runnable0);
    }

    public final boolean e() {
        synchronized(this) {
            if(this.e != null && this.c != null && this.d) {
                return true;
            }
        }
        return false;
    }

    public final void f(dcqo dcqo0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.e()) {
            Log.w("P2pClient.Impl", "connect() called after Play P2P service was already connected. Ignored.");
            FIN.finallyExec$NT(v);
            return;
        }
        this.c = new soq(this, dcqo0);
        Intent intent0 = new Intent();
        intent0.setPackage("com.android.vending");
        intent0.setAction("com.android.vending.p2p.IPeerAppSharingService.BIND");
        sor sor0 = new sor(4);
        try {
            if(!this.f.bindService(intent0, this.c, 1)) {
                this.d(new sog(this, dcqo0, sor0));
                this.b();
                FIN.finallyExec$NT(v);
                return;
            }
            FIN.finallyExec$NT(v);
        }
        catch(SecurityException securityException0) {
            Log.e("P2pClient.Impl", "Security exception occurred connecting to P2P Service.", securityException0);
            this.d(new soh(this, dcqo0, sor0));
            this.b();
            FIN.finallyCodeBegin$NT(v);
        }
    }

    public final boolean g() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        soq soq0 = this.c;
        if(soq0 != null) {
            Serializable serializable0 = (long)0L;
            HashMap hashMap0 = soq0.a;
            if(hashMap0 != null) {
                Serializable serializable1 = (Serializable)hashMap0.get("target_api_version");
                if(serializable1 != null) {
                    serializable0 = serializable1;
                }
            }
            FIN.finallyCodeBegin$NT(v);
            return Long.compare(((Long)serializable0).longValue(), 2L) < 0;
        }
        throw new IllegalStateException("API version check done before isReady.");
    }

    public final void h(dcqm dcqm0) {
        this.d(new soe(this, dcqm0));
    }

    public final void i(dcqn dcqn0) {
        this.d(new sof(this, dcqn0));
    }
}

