import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import j..time.Instant;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class bwmn extends bwzp {
    final boolean a;
    final bwmx b;

    public bwmn(bwmx bwmx0, gltq gltq0, boolean z) {
        this.a = z;
        Objects.requireNonNull(bwmx0);
        this.b = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final Object a() {
        return this.c();
    }

    public final Boolean c() {
        bwmv bwmv0;
        Boolean boolean0;
        Object object9;
        boolean z10;
        String s4;
        Object object7;
        bwjz bwjz0;
        bwqy bwqy0;
        Parser hfvs0;
        File file2;
        hubx hubx1;
        long v10;
        bxax bxax4;
        bwqf bwqf3;
        bwtl bwtl1;
        bwzn bwzn0;
        bwts bwts1;
        Context context3;
        bwuj bwuj1;
        bwqf bwqf4;
        NativeIndex nativeIndex4;
        bwuc bwuc2;
        hubx hubx0;
        Object object4;
        hfuo hfuo0;
        bwom bwom0;
        bwtl bwtl0;
        String s2;
        String s1;
        boolean z5;
        SharedPreferences sharedPreferences0;
        bxax bxax3;
        NativeIndex nativeIndex3;
        long v7;
        Object object2;
        Object object1;
        bwuc bwuc1;
        Object object0;
        bwur bwur0;
        int v6;
        long v5;
        boolean z4;
        bwmw bwmw2;
        bwts bwts0;
        ggfp ggfp0;
        bwmw bwmw1;
        bwuc bwuc0;
        Context context2;
        bwkp bwkp0;
        ghfz ghfz0;
        NativeIndex nativeIndex1;
        NativeIndex nativeIndex0;
        bwop bwop0;
        bxax bxax0;
        File file0;
        Context context1;
        bwqf bwqf1;
        bwqf bwqf0;
        long v1;
        long v;
        Context context0;
        bwmx bwmx0;
        bwmw bwmw0;
        bwmn bwmn0 = this;
        try {
            bwmw0 = new bwmw();
            bwmw0.a = bwmn0.a;
            bwmx0 = bwmn0.b;
            bwmx0.c.c(2);
            bwmx.a = SystemClock.elapsedRealtime();
            huar huar0 = huar.a;
            boolean z = huar0.d().S();
        }
        catch(Exception exception0) {
            goto label_519;
        }
        catch(Error error0) {
            goto label_526;
        }
        catch(Throwable throwable0) {
            bwmn0 = this;
            bwmn0.b.e.release();
            throw throwable0;
        }
        if(z) {
            try {
            label_13:
                context0 = bwmx0.b;
                ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
                if(activityManager0 == null) {
                    goto label_23;
                }
                else {
                    ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
                    activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
                    goto label_18;
                }
                goto label_492;
            }
            catch(Exception exception0) {
                goto label_519;
            }
            catch(Error error0) {
                goto label_526;
            }
            catch(Throwable throwable0) {
                bwmn0 = this;
                bwmn0.b.e.release();
                throw throwable0;
            }
        label_18:
            if(activityManager$MemoryInfo0.lowMemory) {
                try {
                    bwmx0.r.p(6002);
                    if(huar0.d().ad()) {
                        bwmv0 = bwmv.c;
                        bwmw1 = bwmw0;
                        ggfp0 = null;
                    }
                    else {
                        goto label_23;
                    }
                    goto label_492;
                }
                catch(Exception exception0) {
                    goto label_520;
                }
                catch(Error error0) {
                    goto label_527;
                }
                catch(Throwable throwable0) {
                    bwmn0.b.e.release();
                    throw throwable0;
                }
                bwmw1 = bwmw0;
                ggfp0 = null;
            }
            else {
                try {
                label_23:
                    if(bwmw0.a) {
                        goto label_34;
                    }
                    else {
                        boolean z1 = bwmx0.I();
                        goto label_25;
                    }
                    goto label_492;
                }
                catch(Exception exception0) {
                    goto label_519;
                }
                catch(Error error0) {
                    goto label_526;
                }
                catch(Throwable throwable0) {
                    bwmn0 = this;
                    bwmn0.b.e.release();
                    throw throwable0;
                }
            label_25:
                if(z1) {
                    try {
                        if(hubu.f()) {
                            bwmx0.j();
                        }
                        bwmv0 = bwmv.b;
                    }
                    catch(Exception exception0) {
                        goto label_520;
                    }
                    catch(Error error0) {
                        goto label_527;
                    }
                    catch(Throwable throwable0) {
                        bwmn0.b.e.release();
                        throw throwable0;
                    }
                    bwmw1 = bwmw0;
                    ggfp0 = null;
                }
                else {
                    try {
                        v = SystemClock.elapsedRealtime();
                        v1 = Debug.threadCpuTimeNanos();
                    }
                    catch(Exception exception0) {
                        goto label_519;
                    }
                    catch(Error error0) {
                        goto label_526;
                    }
                    catch(Throwable throwable0) {
                        bwmn0 = this;
                        bwmn0.b.e.release();
                        throw throwable0;
                    }
                    try {
                        bwqf0 = new bwqf(context0, context0.getFilesDir(), bwmx0.d);
                    }
                    catch(IOException iOException0) {
                        goto label_40;
                    }
                    catch(Exception exception0) {
                        goto label_520;
                    }
                    catch(Error error0) {
                        goto label_527;
                    }
                    catch(Throwable throwable0) {
                        bwmn0.b.e.release();
                        throw throwable0;
                    }
                    goto label_42;
                    try {
                    label_34:
                        bwmx0.r();
                    }
                    catch(Exception exception0) {
                        goto label_520;
                    }
                    catch(Error error0) {
                        goto label_527;
                    }
                    catch(Throwable throwable0) {
                        bwmn0.b.e.release();
                        throw throwable0;
                    }
                    try {
                        v = SystemClock.elapsedRealtime();
                        v1 = Debug.threadCpuTimeNanos();
                    }
                    catch(Exception exception0) {
                        goto label_519;
                    }
                    catch(Error error0) {
                        goto label_526;
                    }
                    catch(Throwable throwable0) {
                        bwmn0 = this;
                        bwmn0.b.e.release();
                        throw throwable0;
                    }
                    try {
                        bwqf0 = new bwqf(context0, context0.getFilesDir(), bwmx0.d);
                        goto label_42;
                    }
                    catch(IOException iOException0) {
                    }
                    catch(Exception exception0) {
                        goto label_520;
                    }
                    catch(Error error0) {
                        goto label_527;
                    }
                    catch(Throwable throwable0) {
                        bwmn0.b.e.release();
                        throw throwable0;
                    }
                    try {
                    label_40:
                        bwne.j(iOException0, "Unable to create storage", new Object[0]);
                        bwqf0 = null;
                    label_42:
                        bwmx0.h = bwqf0;
                        bwqf1 = bwmx0.h;
                    }
                    catch(Exception exception0) {
                        goto label_519;
                    }
                    catch(Error error0) {
                        goto label_526;
                    }
                    catch(Throwable throwable0) {
                        bwmn0 = this;
                        bwmn0.b.e.release();
                        throw throwable0;
                    }
                    if(bwqf1 == null) {
                        try {
                            bwne.f("Unable to create storage monitor.");
                            bwmv0 = bwmv.c;
                        }
                        catch(Exception exception0) {
                            goto label_520;
                        }
                        catch(Error error0) {
                            goto label_527;
                        }
                        catch(Throwable throwable0) {
                            bwmn0.b.e.release();
                            throw throwable0;
                        }
                        bwmw1 = bwmw0;
                        ggfp0 = null;
                    }
                    else {
                        try {
                            bwne.m("Storage manager: low %s usage %s avail %s capacity %s", new Object[]{Boolean.valueOf(bwqf1.f()), bwwh.f(bwqf1.d()), bwwh.f(bwqf1.c()), bwwh.f(bwqf1.b)});
                            context1 = bwmx0.b;
                            int v2 = azqk.e(context1) ^ 1;
                            file0 = bwqf1.a;
                            bwmx0.u = new bxgq(file0, ((boolean)v2));
                            bwmx0.f = bxax.m(context1, "AppDataSearch-".concat(String.valueOf(bwmx0.d)));
                            bxax0 = bwmx0.f;
                        }
                        catch(Exception exception0) {
                            goto label_519;
                        }
                        catch(Error error0) {
                            goto label_526;
                        }
                        catch(Throwable throwable0) {
                            bwmn0 = this;
                            bwmn0.b.e.release();
                            throw throwable0;
                        }
                        if(bxax0 == null) {
                            try {
                                bwne.f("Unable to create settings.");
                                bwmv0 = bwmv.c;
                                bwmw1 = bwmw0;
                                ggfp0 = null;
                            }
                            catch(Exception exception0) {
                                goto label_520;
                            }
                            catch(Error error0) {
                                goto label_527;
                            }
                            catch(Throwable throwable0) {
                                bwmn0.b.e.release();
                                throw throwable0;
                            }
                        }
                        else {
                            try {
                                bwmx0.g = new bwng(context1, bwmx0.r);
                                boolean z2 = hubn.f();
                            }
                            catch(Exception exception0) {
                                goto label_519;
                            }
                            catch(Error error0) {
                                goto label_526;
                            }
                            catch(Throwable throwable0) {
                                bwmn0 = this;
                                bwmn0.b.e.release();
                                throw throwable0;
                            }
                            if(z2) {
                                try {
                                    File file1 = hrnt.i() ? new File(ccsb.a.b(context1.getFilesDir(), "unpacked/shared/cld3model/cld3-model-0001")) : new File(context1.getFilesDir(), "unpacked/shared/cld3model/cld3-model-0001");
                                    if(bwmx0.w == null && file1.exists()) {
                                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwkh.a).v_newBuilder();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        bwkh bwkh0 = (bwkh)hftp0.b_message;
                                        bwkh0.b |= 1;
                                        bwkh0.c = "cld3-model";
                                        frce frce0 = new frce(context1);
                                        frce0.g(file1);
                                        String s = frce0.a().toString();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        bwkh bwkh1 = (bwkh)hftp0.b_message;
                                        s.getClass();
                                        bwkh1.b |= 2;
                                        bwkh1.d = s;
                                        bwkh bwkh2 = (bwkh)hftp0.N_build();
                                        bwkg bwkg0 = (bwkg)((ProtoLiteMessage)bwki.a).v_newBuilder();
                                        if(!bwkg0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)bwkg0).ensureMutable();
                                        }
                                        bwki bwki0 = (bwki)bwkg0.b_message;
                                        bwki0.b |= 1;
                                        bwki0.c = "cld3-model";
                                        bwkg0.a(bwkh2);
                                        bwmx0.w = (bwki)((ProtoLiteBuilder)bwkg0).N_build();
                                    }
                                }
                                catch(Exception exception0) {
                                    goto label_520;
                                }
                                catch(Error error0) {
                                    goto label_527;
                                }
                                catch(Throwable throwable0) {
                                    bwmn0.b.e.release();
                                    throw throwable0;
                                }
                            }
                            try {
                                bwop0 = bwmx0.c();
                            }
                            catch(Exception exception0) {
                                goto label_519;
                            }
                            catch(Error error0) {
                                goto label_526;
                            }
                            catch(Throwable throwable0) {
                                bwmn0 = this;
                                bwmn0.b.e.release();
                                throw throwable0;
                            }
                            if(NativeIndex.a) {
                                try {
                                    nativeIndex0 = new NativeIndex(file0, bwop0);
                                    bwmx0.m = nativeIndex0;
                                    nativeIndex1 = bwmx0.m;
                                    goto label_100;
                                }
                                catch(IOException iOException1) {
                                }
                                catch(Exception exception0) {
                                    goto label_520;
                                }
                                catch(Error error0) {
                                    goto label_527;
                                }
                                catch(Throwable throwable0) {
                                    bwmn0.b.e.release();
                                    throw throwable0;
                                }
                                try {
                                    bwne.g("Error creating native index: %s", iOException1.getMessage());
                                    nativeIndex0 = null;
                                    bwmx0.m = nativeIndex0;
                                    nativeIndex1 = bwmx0.m;
                                    goto label_100;
                                }
                                catch(Exception exception0) {
                                    goto label_519;
                                }
                                catch(Error error0) {
                                    goto label_526;
                                }
                                catch(Throwable throwable0) {
                                    bwmn0 = this;
                                    bwmn0.b.e.release();
                                    throw throwable0;
                                }
                            }
                            else {
                                nativeIndex0 = null;
                                bwmx0.m = nativeIndex0;
                                nativeIndex1 = bwmx0.m;
                                goto label_100;
                            }
                            bwmx0.m = nativeIndex0;
                            nativeIndex1 = bwmx0.m;
                        label_100:
                            if(nativeIndex1 == null) {
                                try {
                                    bwne.f("Unable to create native index.");
                                    bwmx0.r();
                                    bwmv0 = bwmv.c;
                                }
                                catch(Exception exception0) {
                                    goto label_520;
                                }
                                catch(Error error0) {
                                    goto label_527;
                                }
                                catch(Throwable throwable0) {
                                    bwmn0.b.e.release();
                                    throw throwable0;
                                }
                                bwmw1 = bwmw0;
                                ggfp0 = null;
                            }
                            else {
                                try {
                                    ghfz0 = ghgz.a;
                                    bwkp0 = bwop0.i;
                                }
                                catch(Exception exception0) {
                                    goto label_519;
                                }
                                catch(Error error0) {
                                    goto label_526;
                                }
                                catch(Throwable throwable0) {
                                    bwmn0 = this;
                                    bwmn0.b.e.release();
                                    throw throwable0;
                                }
                                if(bwkp0 == null) {
                                    try {
                                        bwkp0 = bwkp.a;
                                    }
                                    catch(Exception exception0) {
                                        goto label_520;
                                    }
                                    catch(Error error0) {
                                        goto label_527;
                                    }
                                    catch(Throwable throwable0) {
                                        bwmn0.b.e.release();
                                        throw throwable0;
                                    }
                                }
                                try {
                                    bwmx0.v = ghfz0.a(bwkp0.toBytesArray()).toString();
                                    context2 = bwmx0.b;
                                    bwmx0.l = new bwuc(new bwub(bxax0, context2, context2.getPackageManager(), bwmx0.z));
                                    bwuc0 = bwmx0.l;
                                }
                                catch(Exception exception0) {
                                    goto label_519;
                                }
                                catch(Error error0) {
                                    goto label_526;
                                }
                                catch(Throwable throwable0) {
                                    bwmn0 = this;
                                    bwmn0.b.e.release();
                                    throw throwable0;
                                }
                                if(bwuc0 == null) {
                                    try {
                                        bwne.f("Unable to create client registry.");
                                        bwmv0 = bwmv.c;
                                    }
                                    catch(Exception exception0) {
                                        goto label_520;
                                    }
                                    catch(Error error0) {
                                        goto label_527;
                                    }
                                    catch(Throwable throwable0) {
                                        bwmn0.b.e.release();
                                        throw throwable0;
                                    }
                                    bwmw1 = bwmw0;
                                    ggfp0 = null;
                                }
                                else {
                                    try {
                                        bwts0 = bwmx0.r;
                                        bwmx0.i = new bwuj(new bwur(bwuc0, context2, bwmx0.d, bwqf1.a, bwts0), new bwlx(bwmx0));
                                        boolean z3 = htzv.e();
                                    }
                                    catch(Exception exception0) {
                                        goto label_519;
                                    }
                                    catch(Error error0) {
                                        goto label_526;
                                    }
                                    catch(Throwable throwable0) {
                                        bwmn0 = this;
                                        bwmn0.b.e.release();
                                        throw throwable0;
                                    }
                                    if(z3) {
                                        try {
                                            bwmx0.j = new bxgu(context2, "useractions_usage");
                                        }
                                        catch(Exception exception0) {
                                            goto label_520;
                                        }
                                        catch(Error error0) {
                                            goto label_527;
                                        }
                                        catch(Throwable throwable0) {
                                            bwmn0.b.e.release();
                                            throw throwable0;
                                        }
                                    }
                                    try {
                                        bwmx0.k = new bxgy(context2, bwmx0.j, bwmx0.f(), bwuc0, bwts0);
                                        bwmx0.z(glro.d, v);
                                    }
                                    catch(Exception exception0) {
                                        goto label_519;
                                    }
                                    catch(Error error0) {
                                        goto label_526;
                                    }
                                    catch(Throwable throwable0) {
                                        bwmn0 = this;
                                        bwmn0.b.e.release();
                                        throw throwable0;
                                    }
                                    if(!bwmw0.a) {
                                        try {
                                            if(bxax0.c.getBoolean("enabled-corpus-schema-store-as-ground-truth", false)) {
                                                bwmw0.a = true;
                                            }
                                        label_129:
                                            if(bwmw0.a) {
                                                v5 = v;
                                                bwmw2 = bwmw0;
                                                goto label_185;
                                            }
                                            else {
                                                bwmx0.c.c(2);
                                                bxax bxax1 = bwmx0.f;
                                                if(bxax1 == null) {
                                                    bwne.k("\'settings\' is null while checking version");
                                                    bwmw2 = bwmw0;
                                                    z4 = true;
                                                    v5 = v;
                                                }
                                                else {
                                                    int v3 = bxax1.b();
                                                    if(v3 == -1) {
                                                        bwne.k("Version not set, assuming clear data.");
                                                        bwmw2 = bwmw0;
                                                        z4 = true;
                                                        v5 = v;
                                                    }
                                                    else if(v3 > 0x3F) {
                                                        bwne.i("Version going backward from %d to %d", Integer.valueOf(v3), Integer.valueOf(0x3F));
                                                        bwmw2 = bwmw0;
                                                        z4 = true;
                                                        v5 = v;
                                                    }
                                                    else if(v3 == 0x3F) {
                                                        z4 = false;
                                                        bwmw2 = bwmw0;
                                                        v5 = v;
                                                    }
                                                    else if(v3 >= 58) {
                                                        long v4 = SystemClock.elapsedRealtime();
                                                        Integer integer0 = v3;
                                                        Integer integer1 = (int)0x3F;
                                                        bwne.n("Upgrading from version %d to %d", integer0, integer1);
                                                        NativeIndex nativeIndex2 = bwmx0.m;
                                                        if(nativeIndex2 == null) {
                                                            v5 = v;
                                                            v6 = 0;
                                                        }
                                                        else {
                                                            v5 = v;
                                                            v6 = NativeIndex.nativeUpgrade(nativeIndex2.b, v3, 0x3F) ? 1 : 0;
                                                        }
                                                        if(v6 == 0) {
                                                            bwne.i("Couldn\'t upgrade native from version %d to %d", integer0, integer1);
                                                        }
                                                        else {
                                                            bwne.n("Successfully upgraded native from version %d to %d", integer0, integer1);
                                                            bxax1.G();
                                                        }
                                                        if(v6 == 0) {
                                                            bwts0.d("upgrade_failed");
                                                        }
                                                        bwmx0.z(glro.e, v4);
                                                        bwmw2 = bwmw0;
                                                        if(v6 == 0) {
                                                            goto label_185;
                                                        }
                                                        else {
                                                            z4 = false;
                                                        }
                                                    }
                                                    else {
                                                        bwts0.d("upgrade_unsupported_version");
                                                        bwne.g("Upgrade from version %d is not supported. Clearing data.", Integer.valueOf(v3));
                                                        bwmw2 = bwmw0;
                                                        z4 = true;
                                                        v5 = v;
                                                    }
                                                }
                                            }
                                            goto label_186;
                                        }
                                        catch(Exception exception0) {
                                            goto label_520;
                                        }
                                        catch(Error error0) {
                                            goto label_527;
                                        }
                                        catch(Throwable throwable0) {
                                            bwmn0.b.e.release();
                                            throw throwable0;
                                        }
                                    }
                                    goto label_129;
                                label_185:
                                    z4 = true;
                                    try {
                                    label_186:
                                        bwmw2.a = z4;
                                    }
                                    catch(Exception exception0) {
                                        goto label_519;
                                    }
                                    catch(Error error0) {
                                        goto label_526;
                                    }
                                    catch(Throwable throwable0) {
                                        bwmn0 = this;
                                        bwmn0.b.e.release();
                                        throw throwable0;
                                    }
                                    if(z4) {
                                        try {
                                            bwne.k("Clearing storage");
                                            bwqf bwqf2 = bwmx0.h;
                                            if(bwqf2 == null) {
                                                goto label_249;
                                            }
                                            else {
                                                bboc.e(bwqf2.a);
                                                if(bwqf2.a.mkdirs()) {
                                                    bwne.k("Clearing CorpusMap, ClientRegistry, Setting");
                                                    bwuj bwuj0 = bwmx0.i;
                                                    if(bwuj0 != null) {
                                                        bwur0 = bwuj0.a();
                                                        object0 = bwur0.p();
                                                        __monitor_enter(object0);
                                                        goto label_199;
                                                    }
                                                    goto label_211;
                                                }
                                                else {
                                                    goto label_249;
                                                }
                                            }
                                            goto label_492;
                                        }
                                        catch(Exception exception0) {
                                            goto label_520;
                                        }
                                        catch(Error error0) {
                                            goto label_527;
                                        }
                                        catch(Throwable throwable0) {
                                            bwmn0.b.e.release();
                                            throw throwable0;
                                        }
                                        try {
                                        label_199:
                                            bwur0.h.a.edit().clear().putLong("created", System.currentTimeMillis()).commit();
                                            bwur0.h.c();
                                            bxgp bxgp0 = bwur0.h.b;
                                            if(bxgp0.b() && !bxgp0.a()) {
                                                bwne.f("Failed to delete stale scratch file.");
                                            }
                                            bwur0.g = false;
                                            bwur0.f.clear();
                                            goto label_210;
                                        }
                                        catch(Throwable throwable1) {
                                            try {
                                                __monitor_exit(object0);
                                                throw throwable1;
                                            label_210:
                                                __monitor_exit(object0);
                                            label_211:
                                                bwuc1 = bwmx0.l;
                                                if(bwuc1 != null) {
                                                    object1 = bwuc1.b;
                                                    __monitor_enter(object1);
                                                    goto label_215;
                                                }
                                                goto label_243;
                                            }
                                            catch(Exception exception0) {
                                                goto label_520;
                                            }
                                            catch(Error error0) {
                                                goto label_527;
                                            }
                                            catch(Throwable throwable0) {
                                                bwmn0.b.e.release();
                                                throw throwable0;
                                            }
                                        }
                                        try {
                                        label_215:
                                            object2 = bwuc1.a.a.h;
                                            __monitor_enter(object2);
                                        }
                                        catch(Throwable throwable2) {
                                            goto label_240;
                                        }
                                        try {
                                            SharedPreferences.Editor sharedPreferences$Editor0 = bwuc1.a.a.c.edit();
                                            Iterator iterator0 = bwuc1.a.a.d.entrySet().iterator();
                                            while(iterator0.hasNext()) {
                                                Object object3 = iterator0.next();
                                                bwpo bwpo0 = (bwpo)((Map.Entry)object3).getValue();
                                                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
                                                hftp1.X(((ProtoLiteMessage)bwpo0));
                                                if(hftp1.a_defaultInstance.isImmutable()) {
                                                    throw new IllegalArgumentException("Default instance must be immutable.");
                                                }
                                                hftp1.b_message = hftp1.P_newInstance();
                                                bwpo bwpo1 = (bwpo)hftp1.N_build();
                                                bxaz.b(sharedPreferences$Editor0, ((String)((Map.Entry)object3).getKey()), bwpo1);
                                                iterator0.remove();
                                            }
                                            sharedPreferences$Editor0.commit();
                                            goto label_236;
                                        }
                                        catch(Throwable throwable3) {
                                            try {
                                                __monitor_exit(object2);
                                                throw throwable3;
                                            label_236:
                                                __monitor_exit(object2);
                                                bwuc1.c.clear();
                                                goto label_242;
                                            }
                                            catch(Throwable throwable2) {
                                            }
                                        }
                                        try {
                                        label_240:
                                            __monitor_exit(object1);
                                            throw throwable2;
                                        label_242:
                                            __monitor_exit(object1);
                                        label_243:
                                            bxax bxax2 = bwmx0.f;
                                            if(bxax2 != null) {
                                                bxax2.c.edit().clear().putInt("settings-version", 7).putLong("last-maintenance", System.currentTimeMillis()).commit();
                                                bxax2.t();
                                                bxax2.G();
                                                goto label_256;
                                            label_249:
                                                bwne.f("Unable to clear storage, can\'t init index");
                                                bwts0.d("clear_storage_failed");
                                                bwmx0.r();
                                            }
                                            bwmv0 = bwmv.c;
                                            bwmw1 = bwmw2;
                                            ggfp0 = null;
                                            goto label_492;
                                        }
                                        catch(Exception exception0) {
                                            goto label_520;
                                        }
                                        catch(Error error0) {
                                            goto label_527;
                                        }
                                        catch(Throwable throwable0) {
                                            bwmn0.b.e.release();
                                            throw throwable0;
                                        }
                                        bwmw1 = bwmw2;
                                        ggfp0 = null;
                                    }
                                    else {
                                        try {
                                        label_256:
                                            v7 = SystemClock.elapsedRealtime();
                                            nativeIndex3 = bwmx0.m;
                                        }
                                        catch(Exception exception0) {
                                            goto label_519;
                                        }
                                        catch(Error error0) {
                                            goto label_526;
                                        }
                                        catch(Throwable throwable0) {
                                            bwmn0 = this;
                                            bwmn0.b.e.release();
                                            throw throwable0;
                                        }
                                        if(nativeIndex3 == null) {
                                            try {
                                                bwne.f("Null \'index\', index init failed.");
                                            }
                                            catch(Exception exception0) {
                                                goto label_520;
                                            }
                                            catch(Error error0) {
                                                goto label_527;
                                            }
                                            catch(Throwable throwable0) {
                                                bwmn0.b.e.release();
                                                throw throwable0;
                                            }
                                        }
                                        else {
                                            try {
                                                if(huar.a.d().E()) {
                                                    bxax3 = bwmx0.f;
                                                    goto label_263;
                                                }
                                                else {
                                                    bwom0 = nativeIndex3.g();
                                                    goto label_280;
                                                }
                                                goto label_311;
                                            }
                                            catch(Exception exception0) {
                                                goto label_519;
                                            }
                                            catch(Error error0) {
                                                goto label_526;
                                            }
                                            catch(Throwable throwable0) {
                                                bwmn0 = this;
                                                bwmn0.b.e.release();
                                                throw throwable0;
                                            }
                                        label_263:
                                            if(bxax3 == null) {
                                                try {
                                                    bwne.s("Null \'settings\', unable to check if ground truth is invalidated");
                                                }
                                                catch(Exception exception0) {
                                                    goto label_520;
                                                }
                                                catch(Error error0) {
                                                    goto label_527;
                                                }
                                                catch(Throwable throwable0) {
                                                    bwmn0.b.e.release();
                                                    throw throwable0;
                                                }
                                                bwom0 = nativeIndex3.g();
                                                goto label_280;
                                            }
                                            else {
                                                try {
                                                    sharedPreferences0 = bxax3.c;
                                                    z5 = bwvu.d();
                                                    boolean z6 = sharedPreferences0.getBoolean("enable-patch-overlays", false);
                                                }
                                                catch(Exception exception0) {
                                                    goto label_519;
                                                }
                                                catch(Error error0) {
                                                    goto label_526;
                                                }
                                                catch(Throwable throwable0) {
                                                    bwmn0 = this;
                                                    bwmn0.b.e.release();
                                                    throw throwable0;
                                                }
                                                if(z6 == z5) {
                                                    bwom0 = nativeIndex3.g();
                                                    try {
                                                    label_280:
                                                        if(bwom0 != null && bwol.b(bwom0.c) == 2) {
                                                            bwmx0.A(bwom0);
                                                            bwmx0.n(bwmw2, bwom0);
                                                        }
                                                        else {
                                                            if(bwom0 == null) {
                                                                s1 = "init_failed";
                                                            }
                                                            else {
                                                                goto label_287;
                                                            }
                                                            goto label_291;
                                                        }
                                                        goto label_311;
                                                    }
                                                    catch(Exception exception0) {
                                                        goto label_520;
                                                    }
                                                    catch(Error error0) {
                                                        goto label_527;
                                                    }
                                                    catch(Throwable throwable0) {
                                                        bwmn0.b.e.release();
                                                        throw throwable0;
                                                    }
                                                    goto label_291;
                                                    try {
                                                    label_287:
                                                        int v8 = bwol.b(bwom0.c);
                                                        if(v8 == 0) {
                                                            v8 = 1;
                                                        }
                                                        s1 = bwol.a(v8);
                                                    label_291:
                                                        bwmx0.r.d(s1);
                                                        bwne.f("Index init failed, resetting corpora");
                                                    label_293:
                                                        if(!NativeIndex.nativeClear(nativeIndex3.b)) {
                                                            bwmx0.r.d("clear_failed");
                                                            throw new IOException("Index clear failed");
                                                        }
                                                        bwmw2.b = true;
                                                        bwmw2.c = true;
                                                        bwom bwom1 = nativeIndex3.g();
                                                        if(bwom1 == null || bwol.b(bwom1.c) != 2) {
                                                            if(bwom1 == null) {
                                                                s2 = "second_init_failed";
                                                            }
                                                            else {
                                                                int v9 = bwol.b(bwom1.c);
                                                                if(v9 == 0) {
                                                                    v9 = 1;
                                                                }
                                                                s2 = "second_init_failed_".concat(bwol.a(v9));
                                                            }
                                                            bwmx0.r.d(s2);
                                                            throw new IOException("Second try index init failed");
                                                        }
                                                        bwmx0.A(bwom1);
                                                        bwmx0.n(bwmw2, bwom1);
                                                    label_311:
                                                        bwmx0.z(glro.f, v7);
                                                        bwtl0 = new bwtl(bwmx0.b);
                                                        goto label_313;
                                                    }
                                                    catch(Exception exception0) {
                                                        goto label_519;
                                                    }
                                                    catch(Error error0) {
                                                        goto label_526;
                                                    }
                                                    catch(Throwable throwable0) {
                                                        bwmn0 = this;
                                                        bwmn0.b.e.release();
                                                        throw throwable0;
                                                    }
                                                }
                                                else {
                                                    try {
                                                        sharedPreferences0.edit().putBoolean("enable-patch-overlays", z5).commit();
                                                        if(z5) {
                                                            bwom0 = nativeIndex3.g();
                                                            goto label_280;
                                                        }
                                                        else {
                                                            bwmx0.r.p(6008);
                                                            bwne.f("Ground truth invalid because of patch flag changing, resetting corpora");
                                                            goto label_293;
                                                        }
                                                        goto label_311;
                                                    }
                                                    catch(Exception exception0) {
                                                        goto label_520;
                                                    }
                                                    catch(Error error0) {
                                                        goto label_527;
                                                    }
                                                    catch(Throwable throwable0) {
                                                        bwmn0.b.e.release();
                                                        throw throwable0;
                                                    }
                                                    goto label_293;
                                                }
                                            }
                                        }
                                        goto label_311;
                                        try {
                                            try {
                                            label_313:
                                                bwla bwla0 = (bwla)gmbs.b(bwtl0.a.a.a(), IOException.class);
                                                bwne.b("Read %d client cache records", Integer.valueOf(bwla0.b.size()));
                                                hfuo0 = bwla0.b;
                                            }
                                            catch(IOException unused_ex) {
                                                goto label_335;
                                            }
                                            object4 = bwtl0.b;
                                            __monitor_enter(object4);
                                        }
                                        catch(Exception exception0) {
                                            goto label_520;
                                        }
                                        catch(Error error0) {
                                            goto label_527;
                                        }
                                        catch(Throwable throwable0) {
                                            bwmn0.b.e.release();
                                            throw throwable0;
                                        }
                                        try {
                                            Iterator iterator1 = hfuo0.iterator();
                                            while(true) {
                                                if(!iterator1.hasNext()) {
                                                    goto label_334;
                                                }
                                                Object object5 = iterator1.next();
                                                bwky bwky0 = (bwky)object5;
                                                String s3 = bwtl.a(bwky0.c, bwky0.b);
                                                bwtl0.c.put(s3, bwky0);
                                                for(Object object6: bwky0.d) {
                                                    bwtl0.d.v(((bwkz)object6), bwky0);
                                                }
                                                bwtl0.e.add(bwky0);
                                            }
                                        }
                                        catch(Throwable throwable4) {
                                            try {
                                                __monitor_exit(object4);
                                                throw throwable4;
                                            label_334:
                                                __monitor_exit(object4);
                                            }
                                            catch(Exception exception0) {
                                                goto label_520;
                                            }
                                            catch(Error error0) {
                                                goto label_527;
                                            }
                                            catch(Throwable throwable0) {
                                                bwmn0.b.e.release();
                                                throw throwable0;
                                            }
                                        }
                                        try {
                                        label_335:
                                            bwmx0.q = bwtl0;
                                            hubx0 = hubx.a;
                                            if(hubx0.c().g()) {
                                                bwuc2 = bwmx0.l;
                                                batl.s(bwuc2);
                                                nativeIndex4 = bwmx0.m;
                                                batl.s(nativeIndex4);
                                                bwqf4 = bwmx0.h;
                                                batl.s(bwqf4);
                                                bwuj1 = bwmx0.i;
                                                batl.s(bwuj1);
                                                context3 = bwmx0.b;
                                                bwts1 = bwmx0.r;
                                                bwzn0 = bwmx0.c;
                                                bwtl1 = bwmx0.q;
                                                boolean z7 = hrnt.i();
                                                goto label_356;
                                            }
                                            else {
                                                bwmw1 = bwmw2;
                                                bwqf3 = bwqf1;
                                                bxax4 = bxax0;
                                                v10 = v5;
                                            }
                                            goto label_383;
                                        }
                                        catch(Exception exception0) {
                                            goto label_519;
                                        }
                                        catch(Error error0) {
                                            goto label_526;
                                        }
                                        catch(Throwable throwable0) {
                                            bwmn0 = this;
                                            bwmn0.b.e.release();
                                            throw throwable0;
                                        }
                                    label_356:
                                        if(z7) {
                                            try {
                                                hubx1 = hubx0;
                                                bwqf3 = bwqf1;
                                                file2 = new File(ccsb.a.b(bwqf4.a, "rq"));
                                            }
                                            catch(Exception exception0) {
                                                goto label_520;
                                            }
                                            catch(Error error0) {
                                                goto label_527;
                                            }
                                            catch(Throwable throwable0) {
                                                bwmn0.b.e.release();
                                                throw throwable0;
                                            }
                                        }
                                        else {
                                            hubx1 = hubx0;
                                            bwqf3 = bwqf1;
                                            try {
                                                file2 = new File(bwqf4.a, "rq");
                                            label_364:
                                                hfvs0 = (Parser)((ProtoLiteMessage)bwlq.a).jf(7, null);
                                                bwqy0 = new bwqy(hubx1.c().e());
                                                boolean z8 = file2.isFile();
                                                goto label_367;
                                            }
                                            catch(Exception exception0) {
                                                goto label_519;
                                            }
                                            catch(Error error0) {
                                                goto label_526;
                                            }
                                            catch(Throwable throwable0) {
                                                bwmn0 = this;
                                                bwmn0.b.e.release();
                                                throw throwable0;
                                            }
                                        }
                                        goto label_364;
                                    label_367:
                                        if(z8) {
                                            try {
                                                if(!file2.delete()) {
                                                    throw new IOException(a.b(file2, "Request queue work dir \"", "\" is a file and cannot be deleted"));
                                                }
                                            }
                                            catch(Exception exception0) {
                                                goto label_520;
                                            }
                                            catch(Error error0) {
                                                goto label_527;
                                            }
                                            catch(Throwable throwable0) {
                                                bwmn0.b.e.release();
                                                throw throwable0;
                                            }
                                        }
                                        try {
                                            boolean z9 = file2.exists();
                                        }
                                        catch(Exception exception0) {
                                            goto label_519;
                                        }
                                        catch(Error error0) {
                                            goto label_526;
                                        }
                                        catch(Throwable throwable0) {
                                            bwmn0 = this;
                                            bwmn0.b.e.release();
                                            throw throwable0;
                                        }
                                        if(!z9) {
                                            try {
                                                try {
                                                    if(!file2.mkdirs()) {
                                                        throw new IOException(a.b(file2, "Request queue work dir \"", "\" could not be created"));
                                                    }
                                                    goto label_378;
                                                }
                                                catch(Exception exception0) {
                                                }
                                                catch(Error error0) {
                                                    goto label_527;
                                                }
                                                goto label_520;
                                            }
                                            catch(Throwable throwable0) {
                                                bwmn0.b.e.release();
                                                throw throwable0;
                                            }
                                            goto label_527;
                                        }
                                        try {
                                        label_378:
                                            bwmx0 = bwmx0;
                                            bxax4 = bxax0;
                                            bwmw1 = bwmw2;
                                            v10 = v5;
                                            bwmx0.p = new bwrc(context3, bwmx0, bwzn0, new bwrb(file2, hfvs0, bwqy0), bwuj1, bwuc2, nativeIndex4, bwts1, bwtl1);
                                        label_383:
                                            bwuc bwuc3 = bwmx0.l;
                                            batl.s(bwuc3);
                                            NativeIndex nativeIndex5 = bwmx0.m;
                                            batl.s(nativeIndex5);
                                            bwqf bwqf5 = bwmx0.h;
                                            batl.s(bwqf5);
                                            bwuj bwuj2 = bwmx0.i;
                                            batl.s(bwuj2);
                                            bwmx0.n = new bwvg(bwmx0.b, bwmx0, bwmx0.c, bwuj2, bwuc3, bwmx0.r, bwmx0.q, nativeIndex5, bwqf5);
                                            batl.s(bwmx0.m);
                                            bwmx0.f();
                                            bwmx0.o = new bwjz(bwmx0.b, bwmx0.c, bwmx0);
                                            bwjz0 = bwmx0.o;
                                            if(bwjz0 == null) {
                                                goto label_489;
                                            }
                                            else {
                                                if(hubu.f()) {
                                                    gmcd gmcd0 = bwmx0.j();
                                                    if(hubu.a.b().j()) {
                                                        glzd.g(gmcd0, new bwlv(bwmx0, gged_interceptors.p("Message", "Conversation", "Person", "DigitalDocument", "LocalBusiness"), Instant.now().toEpochMilli()), gmap.a);
                                                    }
                                                }
                                                bwuc0.e("com.google.android.gms").k();
                                                object7 = bxax4.h;
                                                __monitor_enter(object7);
                                                goto label_404;
                                            }
                                            goto label_492;
                                        }
                                        catch(Exception exception0) {
                                            goto label_519;
                                        }
                                        catch(Error error0) {
                                            goto label_526;
                                        }
                                        catch(Throwable throwable0) {
                                            bwmn0 = this;
                                            bwmn0.b.e.release();
                                            throw throwable0;
                                        }
                                        try {
                                        label_404:
                                            s4 = bxax4.c.getString("current-os-build-id", null);
                                            if(s4 == null) {
                                                bxax4.s();
                                                __monitor_exit(object7);
                                                z10 = true;
                                            }
                                            else {
                                                goto label_413;
                                            }
                                            goto label_415;
                                        }
                                        catch(Throwable throwable5) {
                                            try {
                                                __monitor_exit(object7);
                                                throw throwable5;
                                            label_413:
                                                __monitor_exit(object7);
                                                z10 = Build.ID.equals(s4);
                                            label_415:
                                                long v11 = SystemClock.elapsedRealtime();
                                                for(Object object8: bwuc0.k()) {
                                                    bwua bwua0 = (bwua)object8;
                                                    String s5 = bwua0.b;
                                                    String s6 = bwua0.d.o(s5);
                                                    String s7 = bwua0.f();
                                                    if(s7 == null || s6 == null) {
                                                        bwne.t("Fail to authenticate package: %s, fingerprint is null.", s5);
                                                        goto label_428;
                                                    }
                                                    else if(TextUtils.equals(s7, s6)) {
                                                        if(z10) {
                                                            continue;
                                                        }
                                                        bwuc0.n(s5);
                                                        continue;
                                                    }
                                                    else {
                                                        bwne.u("Fail to authenticate package: %s, fingerprint mismatch (%s != %s)", new Object[]{s5, s6, s7});
                                                    label_428:
                                                        bwmx0.K(bwua0);
                                                        if(htzv.d()) {
                                                            bwmx0.t.add(s5);
                                                        }
                                                        else {
                                                            bwmx0.E(new String[]{s5});
                                                        }
                                                        continue;
                                                    }
                                                    break;
                                                }
                                                if(!z10) {
                                                    bwne.b("Committed os upgrade: %s", Build.ID);
                                                    bxax4.s();
                                                }
                                                bwmx0.z(glro.g, v11);
                                                bwur bwur1 = bwmx0.e();
                                                object9 = bwur1.p();
                                                __monitor_enter(object9);
                                            }
                                            catch(Exception exception0) {
                                                goto label_519;
                                            }
                                            catch(Error error0) {
                                                goto label_526;
                                            }
                                            catch(Throwable throwable0) {
                                                bwmn0 = this;
                                                bwmn0.b.e.release();
                                                throw throwable0;
                                            }
                                        }
                                        try {
                                            HashMap hashMap0 = new HashMap();
                                            for(Object object10: bwur1.f.entrySet()) {
                                                Map.Entry map$Entry0 = (Map.Entry)object10;
                                                bwny bwny0 = ((bwnr)map$Entry0.getValue()).d;
                                                if(bwny0 == null) {
                                                    bwny0 = bwny.a;
                                                }
                                                if(bwnx.a(bwny0.d) == 2) {
                                                    bwnq bwnq0 = ((bwnr)map$Entry0.getValue()).c;
                                                    if(bwnq0 == null) {
                                                        bwnq0 = bwnq.a;
                                                    }
                                                    hashMap0.put(((bwvl)map$Entry0.getKey()), bwnq0);
                                                }
                                            }
                                            Iterator iterator5 = hashMap0.entrySet().iterator();
                                            while(true) {
                                                if(!iterator5.hasNext()) {
                                                    goto label_466;
                                                }
                                                Object object11 = iterator5.next();
                                                hashMap0.put(((bwvl)((Map.Entry)object11).getKey()), ((bwnq)((Map.Entry)object11).getValue()));
                                            }
                                        }
                                        catch(Throwable throwable6) {
                                            try {
                                                __monitor_exit(object9);
                                                throw throwable6;
                                            label_466:
                                                __monitor_exit(object9);
                                                for(Object object12: hashMap0.entrySet()) {
                                                    bwne.b("Found corpus [%s] in limbo", ((bwnq)((Map.Entry)object12).getValue()).d);
                                                    bwua bwua1 = bwuc0.e(((bwnq)((Map.Entry)object12).getValue()).f);
                                                    bwmx0.L(((bwvl)((Map.Entry)object12).getKey()), bwua1);
                                                }
                                                bxax4.c.edit().putBoolean("enabled-corpus-schema-store-as-ground-truth", false).commit();
                                                long v12 = SystemClock.elapsedRealtime();
                                                ggfp0 = null;
                                                bwjz0.a.g(bwjz0, null, false);
                                                bwmx0.B(bwjz0.a.o());
                                                bwuc0.p();
                                                bwuc0.o();
                                                bwwy.c(bwmx0.b);
                                                bwmx0.z(glro.h, v12);
                                                bwne.l("Internal init done: storage state %d", Integer.valueOf(glrm.a(bwqf3.h(nativeIndex1.a()))));
                                                bwmx0.z(glro.a, v10);
                                                int v13 = (int)((Debug.threadCpuTimeNanos() - v1) / 1000000L);
                                                bwmx0.r.j(glro.c, v13);
                                                bwmv0 = bwmv.a;
                                                goto label_492;
                                            label_489:
                                                bwne.f("Unable to create account updates handler.");
                                                bwmv0 = bwmv.c;
                                                ggfp0 = null;
                                            label_492:
                                                if(bwmv0 == bwmv.a) {
                                                    if(bwmw1.b) {
                                                        ggfp0 = bwmx0.e().n();
                                                    }
                                                    bwmk bwmk0 = new bwmk(bwmx0, gltq.L, bwmw1.a, bwmw1.c, ggfp0);
                                                    bwmx0.c.h(bwmk0);
                                                    if(htzv.d()) {
                                                        List list0 = bwmx0.t;
                                                        if(!list0.isEmpty()) {
                                                            bwmx0.E(((String[])list0.toArray(new String[0])));
                                                            list0.clear();
                                                        }
                                                    }
                                                    bxax bxax5 = bwmx0.f;
                                                    if(bwmx0.p != null && bxax5 != null) {
                                                        SharedPreferences sharedPreferences1 = bxax5.c;
                                                        if(!sharedPreferences1.getBoolean("unified-indexing-request-queue-status", false) || !sharedPreferences1.getString("request-queue-whitelist", "").equals(hubx.d())) {
                                                            bwmx0.t();
                                                            sharedPreferences1.edit().putBoolean("unified-indexing-request-queue-status", true).commit();
                                                            String s8 = hubx.d();
                                                            sharedPreferences1.edit().putString("request-queue-whitelist", s8).commit();
                                                        }
                                                    }
                                                }
                                                else {
                                                    bwne.g("Unable to initialize index manager: %s", bwmv0);
                                                }
                                                boolean z11 = bwmv0 != bwmv.c;
                                                boolean0 = Boolean.valueOf(z11);
                                                goto label_535;
                                            }
                                            catch(Exception exception0) {
                                                goto label_519;
                                            }
                                            catch(Error error0) {
                                                goto label_526;
                                            }
                                            catch(Throwable throwable0) {
                                                bwmn0 = this;
                                                bwmn0.b.e.release();
                                                throw throwable0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            try {
                if(bbnp.j(bwmx0.b)) {
                    bwmx0.r.p(6005);
                    bwmv0 = bwmv.c;
                    bwmw1 = bwmw0;
                    ggfp0 = null;
                }
                else {
                    goto label_13;
                }
                goto label_492;
            }
            catch(Exception exception0) {
                goto label_520;
            }
            catch(Error error0) {
                goto label_527;
            }
            catch(Throwable throwable0) {
                bwmn0.b.e.release();
                throw throwable0;
            }
            bwmw1 = bwmw0;
            ggfp0 = null;
        }
        goto label_492;
    label_519:
        bwmn0 = this;
        try {
        label_520:
            bwne.j(exception0, "Unable to initialize index manager %s", new Object[]{exception0.getMessage()});
            bwmn0.b.r.d("init_index_manager_failed");
            bwmn0.b.r();
            boolean0 = Boolean.valueOf(false);
            goto label_536;
        label_526:
            bwmn0 = this;
        label_527:
            bwmn0.b.r();
            throw error0;
        }
        catch(Throwable throwable0) {
            bwmn0.b.e.release();
            throw throwable0;
        }
        bwmn0 = this;
        bwmn0.b.e.release();
        throw throwable0;
    label_535:
        bwmn0 = this;
    label_536:
        bwmn0.b.e.release();
        return boolean0;
    }
}

