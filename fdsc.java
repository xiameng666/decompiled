import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.node.CloudNodeAdapter.NetworkEventHandler.1;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class fdsc extends clht {
    final fdsh a;
    private long c;

    public fdsc(fdsh fdsh0, Looper looper0) {
        Objects.requireNonNull(fdsh0);
        this.a = fdsh0;
        super(looper0);
        this.c = 0L;
    }

    // Detected as a lambda impl.
    public final fduq b(fduq fduq0) {
        if(fduq0 == null) {
            return null;
        }
        try {
            fdso fdso0 = this.a.m;
            String s = fduq0.a.b;
            String s1 = fduq0.b.b;
            hzvv.d();
            if(!hzvv.c()) {
                if(!s.equals("com.google.android.gms") || !s1.equals("/peers")) {
                label_10:
                    if(!fduq0.i) {
                        fduq fduq1 = new fduq(fduq0);
                        fduq1.i = true;
                        String s2 = fdso0.h(fduq0.b.b);
                        fdun fdun0 = new fdun(fduq0.b.a, s2, fduq0.b.f);
                        byte[] arr_b = fduq0.b.e;
                        if(arr_b != null) {
                            fdun0.e = fdso0.q(arr_b, fdun0.c.toString());
                        }
                        for(Object object0: fduq0.b.b().entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object0;
                            String s3 = ((fdpo)map$Entry0.getValue()).b;
                            if(TextUtils.isEmpty(s3)) {
                                Log.w("CloudNodeCrypto", "Expected to get a digest asset, but no digest present. Dropping asset.");
                            }
                            else {
                                fdun0.d(fdso0.i(((String)map$Entry0.getKey())), new fdpo(null, fdso0.g(s3), null));
                            }
                        }
                        fduq1.b = fdun0;
                        return fduq1;
                    }
                }
            }
            else if(!s.equals("com.google.android.gms") || !s1.equals("/peers") && !s1.equals("/wearable/app_catalog")) {
                goto label_10;
            }
            return fduq0;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            Log.w("CloudNode", "Encrypting DataItemRecord failed.", generalSecurityException0);
            return null;
        }
    }

    public final void c() {
        hzzi hzzi0 = hzzi.a;
        long v = hzzi0.i().L();
        for(int v1 = 0; Long.compare(v1, v) < 0; ++v1) {
            if(Log.isLoggable("CloudNode", 3)) {
                Log.d("CloudNode", "doCheckin: retries remaining - " + (v - ((long)v1)));
            }
            Semaphore semaphore0 = new Semaphore(1);
            semaphore0.acquireUninterruptibly();
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("com.google.android.checkin.CHECKIN_COMPLETE");
            CloudNodeAdapter.NetworkEventHandler.1 cloudNodeAdapter$NetworkEventHandler$10 = new CloudNodeAdapter.NetworkEventHandler.1(this, semaphore0);
            jwe.b(this.a.a, cloudNodeAdapter$NetworkEventHandler$10, intentFilter0, 2);
            Intent intent0 = new Intent("android.server.checkin.CHECKIN_NOW").setPackage("com.google.android.gms");
            this.a.a.sendBroadcast(intent0);
            try {
                if(Log.isLoggable("CloudNode", 3)) {
                    Log.d("CloudNode", "Blocking wait for CHECKIN_COMPLETE");
                }
                boolean z = semaphore0.tryAcquire(hzzi0.i().O(), TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException interruptedException0) {
                Log.w("CloudNode", "Interrupted while waiting for checkin response.", interruptedException0);
                continue;
            }
            finally {
                this.a.a.unregisterReceiver(cloudNodeAdapter$NetworkEventHandler$10);
            }
            if(z) {
                return;
            }
        }
        Log.w("CloudNode", "doCheckin ran out of retry attempts.");
    }

    public final void e(fdsj fdsj0, boolean z) {
        HashSet hashSet0 = fdsj0.c;
        if(!hashSet0.isEmpty()) {
            if(z) {
                this.a.p.a.clear();
                this.a.p.b.clear();
                this.a.p.a.addAll(hashSet0);
                return;
            }
            for(Object object0: hashSet0) {
                fdty fdty0 = (fdty)object0;
                ConcurrentLinkedQueue concurrentLinkedQueue0 = this.a.p.a;
                if(!concurrentLinkedQueue0.contains(fdty0) && !this.a.p.b.contains(fdty0)) {
                    concurrentLinkedQueue0.offer(fdty0);
                }
            }
        }
    }

    public final void f(int v) {
        switch(v) {
            case 1: {
                if(!this.a.s()) {
                    if(!Log.isLoggable("CloudNode", 2)) {
                        return;
                    }
                    Log.v("CloudNode", "cloud sync not enabled, abandoning sync");
                    return;
                }
            label_6:
                if(!this.i(SystemClock.elapsedRealtime())) {
                    return;
                }
                break;
            }
            case 3: 
            case 4: {
                break;
            }
            default: {
                goto label_6;
            }
        }
        synchronized(this.a.z) {
            fdsh.i(this.a.z);
            this.a.i.removeMessages(v);
            this.a.i.obtainMessage(v).sendToTarget();
        }
    }

    public final boolean g(String s) {
        fdtb fdtb0;
        fdta fdta0;
        fdsz fdsz0;
        hlar hlar0;
        ProtoLiteBuilder hftp0;
        String s10;
        fdtx fdtx0;
        String s9;
        SQLiteDatabase sQLiteDatabase1;
        long v4;
        String s8;
        fdvb fdvb0;
        String s6;
        long v3;
        boolean z2;
        SQLiteDatabase sQLiteDatabase0;
        String s4;
        Iterator iterator1;
        boolean z1;
        HashMap hashMap0;
        String s1 = s;
        fdsh fdsh0 = this.a;
        boolean z = false;
        if(fdsh0.b) {
            return false;
        }
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "doEnsureOtherNodesEnrolled: starting");
        }
        fdvl fdvl0 = (fdvl)fdsh0.c.d.get();
        hashMap0 = new HashMap();
        try(Cursor cursor0 = fdvl0.c(ffgp.a, new Uri.Builder().scheme("wear").path("/pairing/public_key").build())) {
            cursor0.moveToFirst();
            while(true) {
                if(cursor0.isAfterLast()) {
                    break;
                }
                fdun fdun0 = fdur.f(cursor0).b;
                fcez fcez0 = fcez.b(fdun0.c());
                hashMap0.put(fdun0.a, fcez0);
            }
        }
        Iterator iterator0 = hashMap0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s2 = (String)((Map.Entry)object0).getKey();
            fcez fcez1 = (fcez)((Map.Entry)object0).getValue();
            String s3 = String.valueOf(s2);
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "doEnsureOtherNodesEnrolled: found public key for node " + s2);
            }
            fdsh fdsh1 = this.a;
            int v = fdsh1.d.getInt("node_is_enrolled:" + s3, 1);
            if(hzyg.g()) {
                switch(v) {
                    case 2: {
                        fdxz fdxz0 = fdsh1.c;
                        fduq fduq0 = fdur.e(((fdvl)fdxz0.d.get()), s2, "/enrolled");
                        fcez fcez2 = fduq0 == null ? null : fdur.b(fduq0, s2, "/enrolled");
                        if(fcez2 == null) {
                            if(Log.isLoggable("CloudNode", 4)) {
                                Log.i("CloudNode", a.a(s2, "doEnsureOtherNodesEnrolled: node ", " has no enroll dataitem, rewriting enroll dataitem"));
                            }
                            fdxz0.h(s1, s2);
                        }
                        else if(Log.isLoggable("CloudNode", 2)) {
                            Log.v("CloudNode", a.q(s2, fcez2, "doEnsureOtherNodesEnrolled: node ", " already enrolled; it has an enrolled dataitem with dataMap:"));
                        }
                        z1 = z;
                        iterator1 = iterator0;
                        s4 = s1;
                        break;
                    }
                    case 3: {
                        if(Log.isLoggable("CloudNode", 2)) {
                            Log.v("CloudNode", a.a(s2, "doEnsureOtherNodesEnrolled: node ", " is already revoked, not enrolling or updating dataitem"));
                        }
                        z1 = z;
                        iterator1 = iterator0;
                        s4 = s1;
                        break;
                    }
                    default: {
                        goto label_51;
                    }
                }
            }
            else {
                switch(v) {
                    case 2: {
                    label_210:
                        z1 = z;
                        iterator1 = iterator0;
                        s4 = s1;
                        if(Log.isLoggable("CloudNode", 2)) {
                            Log.v("CloudNode", "doEnsureOtherNodesEnrolled: enrollment state for node " + s2 + " is already " + v + ", not enrolling");
                        }
                        break;
                    }
                    case 3: {
                        v = 3;
                        goto label_210;
                    }
                    default: {
                    label_51:
                        long v1 = fcez1.A("androidId");
                        if(v1 == 0L) {
                            if(Log.isLoggable("CloudNode", 2)) {
                                Log.v("CloudNode", a.a(s2, "doEnsureOtherNodesEnrolled: target node ", " has no androidId, not enrolling"));
                            }
                            z1 = z;
                            iterator1 = iterator0;
                            s4 = s1;
                            break;
                        }
                        else {
                            String s5 = fcez1.e("registrationId", "");
                            byte[] arr_b = fcez1.x("encodedPublicKey");
                            long v2 = SystemClock.elapsedRealtime();
                            try {
                                sQLiteDatabase0 = fdsh1.g.c.getWritableDatabase();
                            }
                            catch(SQLiteException sQLiteException0) {
                                z2 = z;
                                v3 = v1;
                                Log.w("DataItems", "DB Exception in renameAppKeyForNodeCapabilities", sQLiteException0);
                                s6 = null;
                                goto label_110;
                            }
                            sQLiteDatabase0.beginTransaction();
                            try {
                                fdvb0 = fdvl.k(sQLiteDatabase0, s2);
                                if(fdvb0.a) {
                                    goto label_99;
                                }
                                else {
                                    Log.w("DataItems", "Node not found while getting enrollment id: nodeId=" + s2);
                                    String s7 = UUID.randomUUID().toString();
                                    ContentValues contentValues0 = new ContentValues();
                                    contentValues0.put("node", s2);
                                    contentValues0.put("enrollmentId", s7);
                                    s8 = s7;
                                    z2 = z;
                                    v4 = sQLiteDatabase0.insertWithOnConflict("nodeinfo", null, contentValues0, 4);
                                    if(v4 == -1L) {
                                        Log.w("DataItems", "insert enrollment id failed: nodeId=" + s2);
                                    }
                                    else if(Log.isLoggable("DataItems", 2)) {
                                        goto label_85;
                                    }
                                    goto label_90;
                                }
                                goto label_110;
                            }
                            catch(Throwable throwable1) {
                                sQLiteDatabase1 = sQLiteDatabase0;
                                sQLiteDatabase1.endTransaction();
                                throw throwable1;
                            }
                            try {
                            label_85:
                                s6 = s8;
                                sQLiteDatabase1 = sQLiteDatabase0;
                                v3 = v1;
                                Log.v("DataItems", dlbc.d(v4, s6, s2, "inserted enrollment id: nodeId=", ", enrollmentId=", ", rowId="));
                                sQLiteDatabase1.setTransactionSuccessful();
                                sQLiteDatabase1.endTransaction();
                                goto label_110;
                            label_90:
                                v3 = v1;
                                s6 = s8;
                                sQLiteDatabase1 = sQLiteDatabase0;
                                sQLiteDatabase1.setTransactionSuccessful();
                            }
                            catch(Throwable throwable1) {
                                sQLiteDatabase1.endTransaction();
                                throw throwable1;
                            }
                            sQLiteDatabase1.endTransaction();
                            goto label_110;
                            try {
                            label_99:
                                sQLiteDatabase0.setTransactionSuccessful();
                                s9 = fdvb0.b;
                            }
                            catch(Throwable throwable1) {
                                sQLiteDatabase1 = sQLiteDatabase0;
                                sQLiteDatabase1.endTransaction();
                                throw throwable1;
                            }
                            sQLiteDatabase0.endTransaction();
                            z2 = z;
                            v3 = v1;
                            s6 = s9;
                            try {
                            label_110:
                                fdsh.i(this.a.z);
                                fdtx0 = this.a.H;
                                s10 = fdxz.b(arr_b);
                                fdtx0.b.a(":enrollNode");
                                goto label_118;
                            }
                            catch(fdsp fdsp0) {
                                String s11 = s;
                                goto label_191;
                                try {
                                label_118:
                                    hftp0 = ((ProtoLiteMessage)hlar.a).v_newBuilder();
                                }
                                catch(Throwable throwable2) {
                                    s11 = s;
                                    goto label_164;
                                }
                                try {
                                    long v5 = Long.parseLong(s);
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ((hlar)hftp0.b_message).d = v5;
                                    String s12 = fdtx0.f();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv0 = hftp0.b_message;
                                    s12.getClass();
                                    ((hlar)hftv0).e = s12;
                                    if(!hftv0.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv1 = hftp0.b_message;
                                    s2.getClass();
                                    ((hlar)hftv1).g = s2;
                                    if(!hftv1.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv2 = hftp0.b_message;
                                    ((hlar)hftv2).f = v3;
                                    if(!hftv2.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv3 = hftp0.b_message;
                                    s10.getClass();
                                    ((hlar)hftv3).h = s10;
                                    if(!hftv3.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv4 = hftp0.b_message;
                                    ((hlar)hftv4).i = s5;
                                    String s13 = gfta.b(s6);
                                    if(!hftv4.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ((hlar)hftp0.b_message).j = s13;
                                    hlar0 = (hlar)hftp0.N_build();
                                    fdsz0 = new fdsz();
                                    fdta0 = new fdta();
                                    hlan hlan0 = fdtx0.e(clai.b);
                                    Objects.requireNonNull(hlan0);
                                    fdtb0 = new fdtb(hlan0);
                                    goto label_166;
                                }
                                catch(Throwable throwable2) {
                                    s11 = s;
                                }
                            label_164:
                                fdtx fdtx1 = fdtx0;
                                goto label_171;
                                try {
                                label_166:
                                    fdtx0.c("EnrollNode", ((MessageLite)hlar0), fdsz0, fdta0, fdtb0);
                                    goto label_175;
                                }
                                catch(Throwable throwable2) {
                                    s11 = s;
                                    fdtx1 = fdtx0;
                                }
                                try {
                                label_171:
                                    fdtx1.b.b(":enrollNode");
                                    throw throwable2;
                                }
                                catch(fdsp fdsp0) {
                                }
                                catch(IOException iOException0) {
                                    fdsh.w(6, v2, iOException0);
                                    fdsh.u(s6, iOException0);
                                    throw iOException0;
                                }
                                goto label_191;
                                try {
                                label_175:
                                    fdtx0.b.b(":enrollNode");
                                    goto label_180;
                                }
                                catch(fdsp fdsp0) {
                                }
                                catch(IOException iOException0) {
                                    fdsh.w(6, v2, iOException0);
                                    fdsh.u(s6, iOException0);
                                    throw iOException0;
                                }
                                s11 = s;
                                goto label_191;
                                try {
                                label_180:
                                    fdsh.v(6, v2, 1);
                                    goto label_185;
                                }
                                catch(fdsp fdsp0) {
                                }
                                catch(IOException iOException0) {
                                    fdsh.w(6, v2, iOException0);
                                    fdsh.u(s6, iOException0);
                                    throw iOException0;
                                }
                                s11 = s;
                                goto label_190;
                                try {
                                label_185:
                                    if(Log.isLoggable("CloudNode", 2)) {
                                        Log.v("CloudNode", a.a(s6, "doEnsureOtherNodesEnrolled, enrollNode with enrollmentId", "success"));
                                    }
                                    goto label_201;
                                }
                                catch(fdsp fdsp0) {
                                }
                                catch(IOException iOException0) {
                                    fdsh.w(6, v2, iOException0);
                                    fdsh.u(s6, iOException0);
                                    throw iOException0;
                                }
                                s11 = s;
                            label_190:
                                z2 = true;
                            label_191:
                                fdsh.w(6, v2, fdsp0);
                                fdsh.u(s6, fdsp0);
                                s1 = s11;
                                z = z2;
                                iterator0 = iterator0;
                                continue;
                            }
                            catch(IOException iOException0) {
                                fdsh.w(6, v2, iOException0);
                                fdsh.u(s6, iOException0);
                                throw iOException0;
                            }
                        label_201:
                            this.a.c.h(s, s2);
                            this.a.d.edit().putInt("node_is_enrolled:" + s3, 2).commit();
                            if(Log.isLoggable("CloudNode", 2)) {
                                Log.v("CloudNode", "doEnsureOtherNodesEnrolled: successfully enrolled target node " + s2);
                            }
                            s1 = s;
                            iterator0 = iterator0;
                            z = true;
                            continue;
                        }
                        v = 3;
                        goto label_210;
                    }
                }
            }
            s1 = s4;
            z = z1;
            iterator0 = iterator1;
        }
        return z;
    }

    public final boolean h(String s) {
        fdsh fdsh1;
        boolean z1;
        String s5;
        String s4;
        fdun fdun1;
        Iterator iterator2;
        fdtx fdtx2;
        fduq fduq0;
        hlbi hlbi0;
        Iterator iterator1;
        ArrayList arrayList0;
        fdtx fdtx1;
        String s3;
        hlav hlav0;
        fdvl fdvl1;
        fdwc fdwc0;
        boolean z;
        long v1;
        fdtx fdtx0;
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "Fetching new data from cloud network " + s);
        }
        fdsh fdsh0 = this.a;
        fdvl fdvl0 = fdsh0.g;
        Map map0 = fdvl0.B();
        fdsh.i(fdsh0.z);
        long v = SystemClock.elapsedRealtime();
        try {
            fdtx0 = fdsh0.H;
            v1 = hzzi.a.i().p();
            z = fdsh0.p();
            fdwc0 = fdtx0.b;
            fdwc0.a(":getDataItems");
        }
        catch(fdsp | IOException exception0) {
            fdsh.w(3, v, exception0);
            throw exception0;
        }
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlau.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hlau)hftp0.b_message).h = 2;
            fdvl1 = fdvl0;
            long v2 = Long.parseLong(s);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hlau)hftp0.b_message).d = v2;
            String s1 = fdtx0.f();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s1.getClass();
            ((hlau)hftv0).e = s1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hlau)hftp0.b_message).g = v1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlbm.a).v_newBuilder();
            Iterator iterator0 = map0.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hlbk.a).v_newBuilder();
                String s2 = (String)((Map.Entry)object0).getKey();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hlbk hlbk0 = (hlbk)hftp2.b_message;
                s2.getClass();
                hlbk0.b = s2;
                long v3 = (long)(((Long)((Map.Entry)object0).getValue()));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((hlbk)hftp2.b_message).c = v3;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hlbm hlbm0 = (hlbm)hftp1.b_message;
                hlbk hlbk1 = (hlbk)hftp2.N_build();
                hlbk1.getClass();
                hfuo hfuo0 = hlbm0.b;
                if(!hfuo0.c()) {
                    hlbm0.b = ProtoLiteMessage.E(hfuo0);
                }
                hlbm0.b.add(hlbk1);
                iterator0 = iterator0;
                map0 = map0;
            }
            hlbm hlbm1 = (hlbm)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            hlbm1.getClass();
            ((hlau)hftv1).i = hlbm1;
            ((hlau)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hlau)hftp0.b_message).k = z;
            hlau hlau0 = (hlau)hftp0.N_build();
            fdsw fdsw0 = new fdsw();
            fdsx fdsx0 = new fdsx();
            hlan hlan0 = fdtx0.e(clak.b);
            Objects.requireNonNull(hlan0);
            hlav0 = (hlav)fdtx0.c("GetDataItems", ((MessageLite)hlau0), fdsw0, fdsx0, new fdsy(hlan0));
            s3 = String.format(Locale.US, "numItems: %d, hasMoreData: %b", hlav0.b.size(), Boolean.valueOf(Long.compare(hlav0.c, 0L) > 0));
        }
        catch(Throwable throwable0) {
            fdtx1 = fdtx0;
            s3 = "";
            goto label_124;
        }
        try {
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "getDataItems " + s3);
            }
            arrayList0 = new ArrayList();
            iterator1 = hlav0.b.iterator();
            while(true) {
            label_83:
                if(!iterator1.hasNext()) {
                    goto label_126;
                }
                Object object1 = iterator1.next();
                hlbi0 = (hlbi)object1;
                fduq0 = new fduq(fdpl.a((hlbi0.e == null ? hlbg.a : hlbi0.e).b, (hlbi0.e == null ? hlbg.a : hlbi0.e).c));
                fduq0.b = new fdun(hlbi0.c, hlbi0.d);
                fdtx2 = fdtx0;
                break;
            }
        }
        catch(Throwable throwable0) {
            fdtx1 = fdtx0;
            goto label_124;
        }
        try {
            fduq0.h = hlbi0.g;
            fduq0.f = hlbi0.h;
            fduq0.c = hlbi0.i;
            fduq0.i = hlbi0.l;
            if(!hlbi0.j.isEmpty()) {
                fduq0.e = hlbi0.j;
            }
            if(!hlbi0.f.isEmpty() || !hlbi0.i && !hlbi0.l) {
                fdun fdun0 = fduq0.b;
                fdun0.e = hlbi0.f.toByteArray();
            }
            iterator2 = hlbi0.k.iterator();
        label_103:
            if(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                fdun1 = fduq0.b;
                s4 = ((hlbj)object2).b;
                s5 = ((hlbj)object2).c;
                fdtx1 = fdtx2;
                goto label_113;
            }
            goto label_117;
        }
        catch(Throwable throwable0) {
            try {
                fdtx1 = fdtx2;
                goto label_124;
            label_113:
                fdun1.d(s4, new fdpo(null, s5, null));
                iterator2 = iterator2;
                fdtx2 = fdtx1;
                goto label_103;
            label_117:
                fdtx1 = fdtx2;
                arrayList0.add(fduq0);
                iterator1 = iterator1;
                fdtx0 = fdtx1;
                goto label_83;
            }
            catch(Throwable throwable0) {
            }
        }
        try {
        label_124:
            fdtx1.b.c(":getDataItems", s3);
            throw throwable0;
        label_126:
            z1 = hlav0.c > 0L;
            fdwc0.c(":getDataItems", s3);
            fdsh.v(3, v, arrayList0.size());
        }
        catch(fdsp | IOException exception0) {
            fdsh.w(3, v, exception0);
            throw exception0;
        }
        if(Log.isLoggable("CloudNode", 3)) {
            Log.d("CloudNode", "handleFetchNewDataFromCloud: fetched=" + arrayList0.size() + " for syncTable=" + map0.toString());
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        HashMap hashMap0 = new HashMap();
        int v4 = 0;
        while(v4 < arrayList0.size()) {
            fduq fduq1 = (fduq)arrayList0.get(v4);
            if(fdsh0.p()) {
                try {
                    if(fduq1.i) {
                        fdso fdso0 = fdsh0.m;
                        fduq fduq2 = new fduq(fduq1);
                        fduq2.i = false;
                        fdun fdun2 = new fdun(fduq1.b.a, fdso0.e(fduq1.b.b), fduq1.b.f);
                        fdun fdun3 = fduq1.b;
                        byte[] arr_b = fdun3.e;
                        if(arr_b != null) {
                            fdun2.e = arr_b.length == 0 ? new byte[0] : fdso0.p(arr_b, fdun3.c.toString());
                        }
                        for(Object object3: fduq1.b.b().entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object3;
                            String s6 = ((fdpo)map$Entry0.getValue()).b;
                            if(TextUtils.isEmpty(s6)) {
                                Log.w("CloudNodeCrypto", "Expected to get a digest asset, but no digest present. Dropping asset.");
                            }
                            else if(s6.startsWith("enc/")) {
                                fdun2.d(fdso0.f(((String)map$Entry0.getKey())), new fdpo(null, fdso0.d(s6), null));
                            }
                            else {
                                Log.w("CloudNodeCrypto", "Encrypted DataItem references an unencrypted asset.");
                                fdun2.d(((String)map$Entry0.getKey()), ((fdpo)map$Entry0.getValue()));
                            }
                            fdsh0 = fdsh0;
                        }
                        fdsh1 = fdsh0;
                        fduq2.b = fdun2;
                        for(Object object4: fduq1.b.b().values()) {
                            hashMap0.put(fdso0.d(((fdpo)object4).b), ((fdpo)object4).b);
                        }
                        fduq1 = fduq2;
                        goto label_181;
                    }
                    fdsh1 = fdsh0;
                    goto label_181;
                }
                catch(GeneralSecurityException generalSecurityException0) {
                }
            }
            else {
                fdsh1 = fdsh0;
                goto label_181;
            }
            throw new fdsp(2, "Failed to decrypt DataItem", generalSecurityException0);
        label_181:
            fdvl1.e.k(fduq1);
            String s7 = fduq1.b.a;
            if(fdvl1.u().equals(s7)) {
                s7 = fduq1.e;
                if(s7.equals("cloud")) {
                    Log.w("DataItems", "Received a DataItem from Cloud that has no usable sourceNode info.");
                }
            }
            fduq fduq3 = fdvl1.i(fduq1, s7);
            fdvl1.ai(3, fduq1);
            arrayList1.add(fdvl1.n(fduq3, false, "cloud"));
            ++v4;
            fdvl1 = fdvl1;
            fdsh0 = fdsh1;
        }
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        int v5 = arrayList1.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            Future future0 = (Future)arrayList1.get(v6);
            if(future0 != null) {
                try {
                    fdvi fdvi0 = (fdvi)future0.get();
                    fduq fduq4 = fdvi0.a;
                    if(Log.isLoggable("CloudNode", 2)) {
                        Log.v("CloudNode", a.ab(fduq4, "Data item set: "));
                    }
                    Set set0 = fdvi0.b;
                    if(set0 != null) {
                        for(Object object5: set0) {
                            String s8 = (String)object5;
                            if(hashMap0.containsKey(s8)) {
                                s8 = (String)hashMap0.get(s8);
                            }
                            hashSet0.add(s8);
                            hashSet1.remove(s8);
                        }
                    }
                    Set set1 = fdvi0.c;
                    if(set1 != null) {
                        for(Object object6: set1) {
                            String s9 = (String)object6;
                            if(!hashSet0.contains(s9)) {
                                if(hashMap0.containsKey(s9)) {
                                    s9 = (String)hashMap0.get(s9);
                                }
                                hashSet1.add(s9);
                            }
                        }
                    }
                    fdsh fdsh2 = this.a;
                    Long long0 = (Long)fdsh2.t.get(fduq4.e);
                    if(long0 == null || fduq4.f > ((long)long0)) {
                        fdsh2.t.put(fduq4.e, Long.valueOf(fduq4.f));
                    }
                }
                catch(InterruptedException interruptedException0) {
                    Log.w("CloudNode", "request was interrupted", interruptedException0);
                    Thread.currentThread().interrupt();
                }
                catch(ExecutionException executionException0) {
                    Log.w("CloudNode", "request failed", executionException0);
                }
            }
        }
        for(Object object7: hashSet0) {
            fdty fdty0 = new fdty(((String)object7), true);
            this.a.q.a(fdty0);
        }
        for(Object object8: hashSet1) {
            fdty fdty1 = new fdty(((String)object8), false);
            this.a.q.a(fdty1);
        }
        if(z1 && arrayList0.isEmpty()) {
            Log.w("CloudNode", "server said we have more work to do, but didn\'t give any more, stopping anyway");
            return false;
        }
        return z1;
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        fdsh fdsh8;
        fdvl fdvl3;
        Object object8;
        fdpl fdpl2;
        int v27;
        Iterator iterator7;
        ggfp ggfp1;
        fdvl fdvl2;
        int v24;
        int v22;
        int v21;
        int v18;
        int v17;
        fdry fdry0;
        int v16;
        esaa esaa1;
        fdsh fdsh7;
        fdsj fdsj0;
        fdtx fdtx2;
        fdtq fdtq0;
        fdtp fdtp0;
        fdto fdto0;
        hlbe hlbe2;
        boolean z1;
        fdtx fdtx1;
        long v14;
        String s10;
        int v13;
        String s9;
        fdsh fdsh6;
        fdsh fdsh5;
        fdsh fdsh4;
        int v10;
        HashSet hashSet2;
        Object object4;
        int v9;
        fdwc fdwc1;
        String s5;
        fdtx fdtx0;
        long v7;
        Iterator iterator2;
        long v6;
        long v5;
        String s4;
        int v4;
        int v3;
        fdsc fdsc0;
        String s3;
        fdxz fdxz0;
        fdsh fdsh2;
        fdwc fdwc0;
        fdsh fdsh0;
        int v = ffgp.k() || hzzi.m() ? 1 : 0;
        try {
            if(message0.what != 4) {
                long v1 = SystemClock.elapsedRealtime();
                fdsh0 = this.a;
                fdwc0 = fdsh0.k;
                fdwc0.a("*** Handler");
                fdsh0.B = v1;
                fdsh0.C = "setup";
                if(Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", "sync loop starting");
                }
                if(this.i(v1)) {
                    fdsh fdsh1 = this.a;
                    fdsh.i(fdsh1.z);
                    if(fdsh1.b) {
                        fdsh1.C = "revoking nodes from previous network";
                        HashMap hashMap0 = new HashMap();
                        Object object0 = fdsh1.D;
                        synchronized(object0) {
                            SharedPreferences sharedPreferences0 = fdsh1.d;
                            for(Object object1: sharedPreferences0.getStringSet("nodesToRevoke", ggnj.a)) {
                                String s = (String)object1;
                                String s1 = sharedPreferences0.getString("networkOfNodesToRevoke:" + s, null);
                                if(!TextUtils.isEmpty(s1)) {
                                    HashSet hashSet0 = (HashSet)hashMap0.get(s1);
                                    if(hashSet0 == null) {
                                        hashSet0 = new HashSet();
                                    }
                                    hashSet0.add(s);
                                    hashMap0.put(s1, hashSet0);
                                }
                            }
                            for(Object object2: hashMap0.entrySet()) {
                                String s2 = (String)((Map.Entry)object2).getKey();
                                HashSet hashSet1 = (HashSet)((Map.Entry)object2).getValue();
                                if(Log.isLoggable("CloudNode", 4)) {
                                    Log.i("CloudNode", String.format("found nodes to revoke from network, nodes: %s, network: %s", hashSet1, s2));
                                }
                                fdsh1.k(hashSet1, s2);
                            }
                        }
                    }
                    fdsh2 = this.a;
                    fdxz0 = fdsh2.c;
                    s3 = fdxz0.a();
                    if(s3 == null) {
                        goto label_48;
                    }
                    else {
                        goto label_147;
                    }
                    goto label_191;
                }
                goto label_552;
            }
            goto label_564;
        }
        catch(fdsp fdsp0) {
            goto label_567;
        }
        catch(IOException iOException0) {
            goto label_582;
        }
        catch(Throwable throwable0) {
            goto label_603;
        }
        try {
        label_48:
            if(fdsh2.b) {
                fdsc0 = this;
                v3 = v;
                v4 = 0;
            }
            else {
                fdsh2.C = "connect";
                s4 = ((fdrt)fdsh2.e).b();
                if(gfta.c(s4)) {
                    goto label_56;
                }
                goto label_59;
            }
            goto label_191;
        }
        catch(fdsp fdsp0) {
            v3 = v;
            fdsc0 = this;
            goto label_569;
        }
        catch(IOException iOException0) {
            v3 = v;
            fdsc0 = this;
            goto label_584;
        }
        catch(Throwable throwable0) {
            v3 = v;
            fdsc0 = this;
            goto label_605;
        }
        try {
        label_56:
            if(Log.isLoggable("CloudNode", 3)) {
                Log.d("CloudNode", "handleConnectToCloud: aborting since the regId isn\'t set");
            }
            throw new fdsp(3, "regId not set");
        label_59:
            if(s4.equals("null")) {
                if(Log.isLoggable("CloudNode", 3)) {
                    Log.d("CloudNode", "handleConnectToCloud: aborting since the regId is set to null");
                }
                throw new fdsp(3, "regId is null");
            }
        }
        catch(fdsp fdsp0) {
            goto label_567;
        }
        catch(IOException iOException0) {
            goto label_582;
        }
        catch(Throwable throwable0) {
            goto label_603;
        }
        try {
            v5 = (long)((fdru)fdsh2.f).b();
            if(v5 != 0L) {
                v6 = 0L;
                iterator2 = fdsh2.g.B().entrySet().iterator();
                while(true) {
                label_67:
                    if(!iterator2.hasNext()) {
                        goto label_72;
                    }
                    goto label_68;
                }
            }
            goto label_144;
        }
        catch(fdsp fdsp0) {
            v3 = v;
            fdsc0 = this;
            goto label_569;
        }
        catch(IOException iOException0) {
            v3 = v;
            fdsc0 = this;
            goto label_584;
        }
        catch(Throwable throwable0) {
            v3 = v;
            fdsc0 = this;
            goto label_605;
        }
        try {
        label_68:
            Object object3 = iterator2.next();
            Map.Entry map$Entry0 = (Map.Entry)object3;
            if(!((String)map$Entry0.getKey()).equals("cloud")) {
                goto label_67;
            }
            v6 = (long)(((Long)map$Entry0.getValue()));
        }
        catch(fdsp fdsp0) {
            goto label_567;
        }
        catch(IOException iOException0) {
            goto label_582;
        }
        catch(Throwable throwable0) {
            goto label_603;
        }
        try {
        label_72:
            if(Log.isLoggable("CloudNode", 2)) {
                goto label_73;
            }
            goto label_74;
        }
        catch(fdsp fdsp0) {
            v3 = v;
            fdsc0 = this;
            goto label_569;
        }
        catch(IOException iOException0) {
            v3 = v;
            fdsc0 = this;
            goto label_584;
        }
        catch(Throwable throwable0) {
            v3 = v;
            fdsc0 = this;
            goto label_605;
        }
        try {
        label_73:
            Log.v("CloudNode", a.u(v6, "handleConnectToCloud: requesting creation of a new network with initialCloudSequenceId="));
        }
        catch(fdsp fdsp0) {
            goto label_567;
        }
        catch(IOException iOException0) {
            goto label_582;
        }
        catch(Throwable throwable0) {
            goto label_603;
        }
        try {
        label_74:
            fdsh.i(fdsh2.z);
            v7 = SystemClock.elapsedRealtime();
            goto label_80;
        }
        catch(fdsp fdsp0) {
        }
        catch(IOException iOException0) {
            v3 = v;
            fdsc0 = this;
            goto label_584;
        }
        catch(Throwable throwable0) {
            v3 = v;
            fdsc0 = this;
            goto label_605;
        }
        try {
            v3 = v;
            fdsc0 = this;
            goto label_569;
        }
        catch(fdsp fdsp0) {
            fdsc0 = this;
            goto label_569;
        }
        catch(IOException iOException0) {
            fdsc0 = this;
            goto label_584;
        }
        catch(Throwable throwable0) {
            fdsc0 = this;
            goto label_605;
        }
        try {
        label_80:
            fdtx0 = fdsh2.H;
            s5 = fdxz.b(fdxz0.c().getPublic().getEncoded());
            fdwc1 = fdtx0.b;
            fdwc1.a(":createNetwork");
            goto label_94;
        }
        catch(fdsp fdsp1) {
        }
        catch(IOException iOException0) {
            v3 = v;
            fdsc0 = this;
            goto label_584;
        }
        catch(Throwable throwable0) {
            v3 = v;
            fdsc0 = this;
            goto label_605;
        }
        v3 = v;
        goto label_135;
        try {
            v3 = v;
            fdsc0 = this;
            goto label_584;
        }
        catch(fdsp fdsp0) {
            fdsc0 = this;
            goto label_569;
        }
        catch(IOException iOException0) {
            fdsc0 = this;
            goto label_584;
        }
        catch(Throwable throwable0) {
            fdsc0 = this;
            goto label_605;
        }
        try {
        label_94:
            v3 = v;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlap.a).v_newBuilder();
            v3 = v;
            String s6 = fdtx0.f();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s6.getClass();
            ((hlap)hftv0).b = s6;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((hlap)hftv1).c = v5;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            s4.getClass();
            ((hlap)hftv2).d = s4;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            s5.getClass();
            ((hlap)hftv3).e = s5;
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hlap)hftp0.b_message).f = v6;
            hlap hlap0 = (hlap)hftp0.N_build();
            hlan hlan0 = fdtx0.e(clah.b);
            Objects.requireNonNull(hlan0);
            long v8 = ((hlaq)fdtx0.d("CreateNetwork", ((MessageLite)hlap0), new fdtr(hlan0))).b;
            if(v8 == 0L) {
                throw new fdsp(3, "createNetwork error: networkId is empty");
            }
            s3 = Long.toString(v8);
            goto label_131;
        }
        catch(Throwable throwable1) {
            try {
                fdtx0.b.b(":createNetwork");
                throw throwable1;
            label_131:
                fdwc1.b(":createNetwork");
                fdsh.v(5, v7, 1);
                goto label_137;
            }
            catch(fdsp fdsp1) {
            }
            catch(IOException iOException0) {
                fdsc0 = this;
                goto label_584;
            }
            catch(Throwable throwable0) {
                fdsc0 = this;
                goto label_605;
            }
        }
        try {
        label_135:
            fdsh.w(5, v7, fdsp1);
            throw fdsp1;
        label_137:
            fdxz0.g(s3);
            this.c();
            ((fdue)fdsh2.G.get()).g();
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "handleConnectToCloud: connect complete");
            }
            v9 = 1;
            goto label_149;
        }
        catch(fdsp fdsp0) {
            fdsc0 = this;
            goto label_569;
        }
        catch(IOException iOException0) {
            fdsc0 = this;
            goto label_584;
        }
        catch(Throwable throwable0) {
            fdsc0 = this;
            goto label_605;
        }
        try {
        label_144:
            if(Log.isLoggable("CloudNode", 3)) {
                Log.d("CloudNode", "handleConnectToCloud: aborting since the androidId isn\'t set");
            }
            throw new fdsp(3, "androidId not set");
        }
        catch(fdsp fdsp0) {
            goto label_567;
        }
        catch(IOException iOException0) {
            goto label_582;
        }
        catch(Throwable throwable0) {
            goto label_603;
        }
        try {
        label_147:
            v3 = v;
            v9 = 0;
        label_149:
            fdsh2.C = "revoking nodes";
            object4 = fdsh2.D;
            __monitor_enter(object4);
        }
        catch(fdsp fdsp0) {
            fdsc0 = this;
            goto label_569;
        }
        catch(IOException iOException0) {
            fdsc0 = this;
            goto label_584;
        }
        catch(Throwable throwable0) {
            fdsc0 = this;
            goto label_605;
        }
        try {
            hashSet2 = new HashSet();
            SharedPreferences sharedPreferences1 = fdsh2.d;
            for(Object object5: sharedPreferences1.getStringSet("nodesToRevoke", ggnj.a)) {
                String s7 = (String)object5;
                String s8 = sharedPreferences1.getString("networkOfNodesToRevoke:" + s7, null);
                if(s8 == null || s8.equals(s3)) {
                    hashSet2.add(s7);
                }
            }
            __monitor_exit(object4);
        }
        catch(Throwable throwable2) {
            fdsc0 = this;
            while(true) {
                __monitor_exit(object4);
                break;
            }
            try {
                throw throwable2;
            }
            catch(fdsp fdsp0) {
                goto label_569;
            }
            catch(IOException iOException0) {
                goto label_584;
            }
            catch(Throwable throwable0) {
                goto label_605;
            }
        }
        try {
            if(!hashSet2.isEmpty() && Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "found nodes to revoke: " + hashSet2.toString());
            }
            fdsh2.k(hashSet2, s3);
            v10 = v9 | hashSet2.isEmpty() ^ 1;
            fdsc0 = this;
        }
        catch(fdsp fdsp0) {
            fdsc0 = this;
            goto label_569;
        }
        catch(IOException iOException0) {
            fdsc0 = this;
            goto label_584;
        }
        catch(Throwable throwable0) {
            fdsc0 = this;
            goto label_605;
        }
        try {
            fdsh fdsh3 = fdsc0.a;
            if(!s3.equals(fdsh3.c.a())) {
                throw new IOException("current network was revoked");
            }
            fdsh3.C = "ensure enrolled";
            v4 = v10 | fdsc0.g(s3);
        label_191:
            fdsh4 = fdsc0.a;
            if(fdsh4.b() != null) {
                if(v3 == 0) {
                    fdsh5 = fdsc0.a;
                    if(!fdsh5.s()) {
                        if(Log.isLoggable("CloudNode", 2)) {
                            Log.v("CloudNode", "cloud sync not enabled, abandoning sync");
                        }
                        fdsg fdsg0 = fdsh5.w;
                        if(!fdsg0.a.isEmpty()) {
                            fdsg0.b(fdsh5.z);
                        }
                        fdsh5.k.b("*** Handler");
                        goto label_202;
                    }
                    goto label_213;
                }
                goto label_521;
            }
            goto label_533;
        }
        catch(fdsp fdsp0) {
            goto label_569;
        }
        catch(IOException iOException0) {
            goto label_584;
        }
        catch(Throwable throwable0) {
            goto label_605;
        }
    label_202:
        fdsh5.B = 0L;
        fdsh5.k.d();
        esaa esaa0 = fdsh5.z;
        synchronized(esaa0) {
            if(!fdsc0.hasMessages(3) && !fdsc0.hasMessages(2) && !fdsc0.hasMessages(1) && !fdsc0.hasMessages(4)) {
                esaa0.g();
            }
        }
        return;
        try {
            try {
            label_213:
                int v12 = message0.what;
                fdsh6 = fdsc0.a;
                s9 = fdsh6.c.a();
                boolean z = fdsh6.y.getAndSet(false);
                if(fdsh6.t == null) {
                    fdsh6.C = "start sync";
                    goto label_223;
                }
                else if(!z) {
                    v13 = 0;
                }
                else {
                    z = true;
                    fdsh6.C = "start sync";
                    goto label_223;
                }
                goto label_295;
            }
            catch(fdsp fdsp0) {
                goto label_569;
            }
            catch(IOException iOException0) {
                goto label_584;
            }
            try {
            label_223:
                s10 = ((fdrt)fdsh6.e).b();
                if(Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", "doStartSync: Connect to previously paired network");
                }
                fdsh6.z.c(60000L);
                v14 = SystemClock.elapsedRealtime();
            }
            catch(IOException iOException1) {
                goto label_292;
            }
            catch(fdsp fdsp0) {
                goto label_569;
            }
            try {
                fdtx1 = fdsh6.H;
                z1 = fdsh6.p();
                fdtx1.b.a(":startSync");
            }
            catch(fdsp | IOException exception0) {
                goto label_281;
            }
        }
        catch(Throwable throwable0) {
            goto label_605;
        }
        try {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlbe.a).v_newBuilder();
            long v15 = Long.parseLong(s9);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hlbe)hftp1.b_message).d = v15;
            String s11 = fdtx1.f();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hlbe hlbe0 = (hlbe)hftp1.b_message;
            s11.getClass();
            hlbe0.e = s11;
            if(!gfta.c(s10) && !s10.equals("null")) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hlbe hlbe1 = (hlbe)hftp1.b_message;
                s10.getClass();
                hlbe1.f = s10;
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hlbe)hftp1.b_message).i = z1;
            hlbe2 = (hlbe)hftp1.N_build();
            fdto0 = new fdto();
            fdtp0 = new fdtp();
            hlan hlan1 = fdtx1.e(clap.b);
            Objects.requireNonNull(hlan1);
            fdtq0 = new fdtq(hlan1);
        }
        catch(Throwable throwable3) {
            fdtx2 = fdtx1;
            goto label_275;
        }
        try {
            fdtx2 = fdtx1;
            MessageLite hfvm0 = fdtx1.c("StartSync", ((MessageLite)hlbe2), fdto0, fdtp0, fdtq0);
            fdtx2 = fdtx1;
            fdsj0 = new fdsj();
            fdsj0.a = ((hlbf)hfvm0).c;
            if((((hlbf)hfvm0).b & 1) != 0) {
                hlbm hlbm0 = ((hlbf)hfvm0).e;
                if(hlbm0 == null) {
                    hlbm0 = hlbm.a;
                }
                fdsj0.b = fdtx.g(hlbm0);
            }
            if(((hlbf)hfvm0).d.size() > 0) {
                fdsj0.a(fdtx.h(((hlbf)hfvm0).d));
            }
            goto label_277;
        }
        catch(Throwable throwable3) {
        }
        try {
            try {
            label_275:
                fdtx2.b.b(":startSync");
                throw throwable3;
            label_277:
                fdtx2.b.b(":startSync");
                fdsh.v(4, v14, 1);
                goto label_283;
            }
            catch(fdsp | IOException exception0) {
                try {
                label_281:
                    fdsh.w(4, v14, exception0);
                    throw exception0;
                label_283:
                    if(Log.isLoggable("CloudNode", 2)) {
                        Log.v("CloudNode", "doStartSync: complete");
                    }
                    fdsc0.a.g(fdsj0);
                    fdsc0.e(fdsj0, true);
                    fdsc0.a.s = true;
                    fdsc0.a.u = true;
                    v13 = 1;
                    goto label_295;
                }
                catch(IOException iOException1) {
                }
                catch(fdsp fdsp0) {
                    goto label_569;
                }
            }
            try {
            label_292:
                if(z) {
                    fdsc0.a.y.set(true);
                }
                throw iOException1;
            label_295:
                fdsh7 = fdsc0.a;
                esaa1 = fdsh7.z;
                v16 = v13 | fdsh7.w.b(esaa1);
                if(fdsh7.s) {
                    fdry0 = fdsh7.o;
                    if(!fdry0.d() || !fdsh7.s()) {
                        v17 = v4;
                        v18 = v16;
                    }
                    else {
                        fdsh7.C = "send data since";
                        fdwc fdwc2 = fdsh7.k;
                        fdwc2.a("** SendData");
                        if(hzuz.q()) {
                            if(v12 == 1 && hzuz.q() && !fdsh7.b) {
                                if(fdsc0.c == 0L || fdsc0.c >= SystemClock.elapsedRealtime() - 1000L) {
                                    for(Object object6: fdsh7.l.b()) {
                                        fdyo fdyo0 = (fdyo)object6;
                                        fdxn fdxn0 = fdyo0.a;
                                        if(fdxn0.a.equals("cloud") || (fdyo0.c == null || !fdyo0.c.a.equals("cloud"))) {
                                            continue;
                                        }
                                        if(Log.isLoggable("CloudNode", 2)) {
                                            Log.v("CloudNode", a.O(fdxn0, "Best route to ", " is through cloud; not smearing."));
                                        }
                                        goto label_338;
                                    }
                                    if(fdsc0.c == 0L) {
                                        long v19 = hzuz.d() + ((long)(Math.random() * ((double)hzuz.e())));
                                        if(Log.isLoggable("CloudNode", 4)) {
                                            Log.i("CloudNode", a.D(v19, "Smearing upload. Delay: ", "ms."));
                                        }
                                        long v20 = SystemClock.elapsedRealtime() + v19;
                                        fdsc0.c = v20;
                                        fdsh7.l(v20, "cloud_node_sync");
                                        fdwc2.c("** SendData", a.D(v19, "smeared: rerun in ", "ms."));
                                    }
                                    else {
                                        if(Log.isLoggable("CloudNode", 4)) {
                                            Log.i("CloudNode", "Should smear, but an alarm is already scheduled. Doing nothing.");
                                        }
                                        fdwc2.c("** SendData", "deferring to smear wakeup scheduled in " + (fdsc0.c - SystemClock.elapsedRealtime()) + "ms");
                                    }
                                    v17 = v4;
                                    v21 = v16;
                                    v22 = 0;
                                    v18 = v21 | v22;
                                    goto label_484;
                                }
                                else {
                                    Log.w("CloudNode", "A smear alarm was scheduled for the past (" + (SystemClock.elapsedRealtime() - fdsc0.c) + "ms ago), but never ran. Running now.");
                                    fdwc2.a("** missed smear");
                                    fdwc2.c("** missed smear", "should\'ve run " + (SystemClock.elapsedRealtime() - fdsc0.c) + "ms ago");
                                }
                            }
                        label_338:
                            if(Log.isLoggable("CloudNode", 2)) {
                                Log.v("CloudNode", "Cancelling any pending wakeup and sending now.");
                            }
                            new bbib(fdsh7.a).a(fdsh7.a("cloud_node_sync"));
                            fdsc0.c = 0L;
                        }
                        goto label_342;
                    }
                }
                else {
                    goto label_482;
                }
                goto label_484;
            }
            catch(fdsp fdsp0) {
                goto label_569;
            }
            catch(IOException iOException0) {
                goto label_584;
            }
        }
        catch(Throwable throwable0) {
            goto label_605;
        }
        try {
        label_342:
            fdsh7.s = false;
            if(fdsh7.t == null) {
                goto label_468;
            }
            else {
                fdsh.i(esaa1);
                hzuz hzuz0 = hzuz.a;
                if(hzuz0.h().y() && SystemClock.elapsedRealtime() - fdsh7.E > hzuz0.h().e()) {
                    Iterator iterator5 = Collections.emptyIterator();
                    fdsh7.g(fdsh7.H.a(s9, iterator5, 0, fdsh7.p()));
                }
                Map map0 = fdsh7.t;
                batl.t(s9, "networkId is null");
                batl.t(map0, "syncTable is null");
                if(Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", a.Y(map0, s9, "sendAllDataSynced: networkId=", ", cloud syncTable="));
                }
                int v23 = (int)hzzi.a.i().q();
                fdvl fdvl0 = fdsh7.g;
                Map map1 = fdvl0.z(map0);
                if(fdsh7.b) {
                    String s12 = fdsh7.l.a().a;
                    HashMap hashMap1 = new HashMap();
                    if(map1.containsKey(s12)) {
                        hashMap1.put(s12, ((Long)map1.get(s12)));
                    }
                    map1 = hashMap1;
                }
                ArrayList arrayList0 = new ArrayList(v23);
                ggfp ggfp0 = hzys.c() ? fdsh7.n.d().w() : ggnj.a;
                v24 = 0;
                Iterator iterator6 = map1.entrySet().iterator();
                while(iterator6.hasNext()) {
                    Object object7 = iterator6.next();
                    String s13 = (String)((Map.Entry)object7).getKey();
                    if(ggfp0.contains(s13)) {
                        if(Log.isLoggable("CloudNode", 3)) {
                            Log.d("CloudNode", String.format("Not sending data items from this node since it is restricted. PeerId: %s", s13));
                        }
                        v4 = v4;
                        continue;
                    }
                    v17 = v4;
                label_379:
                    long v25 = (long)(((Long)map1.get(s13)));
                    fdsb fdsb0 = new fdsb(fdsc0, arrayList0);
                    fdvl0.R(s13, v25, v23 - arrayList0.size(), v25 == -1L, fdsb0, null);
                    fdvl fdvl1 = fdvl0;
                    if(fdsh7.s()) {
                        if(hzuz0.h().C()) {
                            int v26 = 0;
                            while(v26 < arrayList0.size()) {
                                fduq fduq0 = (fduq)arrayList0.get(v26);
                                if(fduq0 == null) {
                                    fdvl2 = fdvl1;
                                    ggfp1 = ggfp0;
                                    iterator7 = iterator6;
                                }
                                else {
                                    ggfp1 = ggfp0;
                                    ffew ffew0 = fdvl1.e;
                                    fdvl2 = fdvl1;
                                    iterator7 = iterator6;
                                    fdpl fdpl0 = fduq0.a;
                                    if(!ffew0.c.equals(fdpl0)) {
                                        v27 = v24;
                                        if(!fduq0.b.a.equals(fdvl2.u())) {
                                            ConcurrentHashMap concurrentHashMap0 = (ConcurrentHashMap)ffew0.k.get(fduq0.b.a);
                                            if(concurrentHashMap0 != null) {
                                                fdpl fdpl1 = (fdpl)concurrentHashMap0.get(fdpl0);
                                                if(fdpl1 != null) {
                                                    fdpl2 = fdpl1;
                                                    goto label_408;
                                                }
                                            }
                                            fdpl2 = fdpl0;
                                        label_408:
                                            if(!fdpl0.equals(fdpl2)) {
                                                object8 = new fduq(fduq0, fdpl2, null);
                                                goto label_415;
                                            }
                                        }
                                        object8 = null;
                                        goto label_415;
                                    }
                                }
                                v27 = v24;
                                object8 = null;
                            label_415:
                                if(object8 != null) {
                                    arrayList0.set(v26, object8);
                                }
                                ++v26;
                                ggfp0 = ggfp1;
                                fdvl1 = fdvl2;
                                iterator6 = iterator7;
                                v24 = v27;
                            }
                        }
                        map1.put(s13, Long.valueOf(fdsb0.b));
                        boolean z2 = arrayList0.size() >= v23;
                        if(z2) {
                            fdsc0.j(s9, arrayList0);
                            arrayList0.clear();
                            v24 = 1;
                        }
                        else {
                            v24 = v24;
                        }
                        if(z2) {
                            v16 = v16;
                            ggfp0 = ggfp0;
                            fdvl0 = fdvl1;
                            iterator6 = iterator6;
                            goto label_379;
                        }
                        else {
                            v4 = v17;
                            v16 = v16;
                            ggfp0 = ggfp0;
                            fdvl0 = fdvl1;
                            iterator6 = iterator6;
                            continue;
                        }
                    }
                    fdvl3 = fdvl1;
                    v21 = v16;
                    goto label_452;
                }
                v17 = v4;
                v21 = v16;
                fdvl3 = fdvl0;
                if(!arrayList0.isEmpty()) {
                    fdsc0.j(s9, arrayList0);
                    v24 = 1;
                }
            label_452:
                if(!fdsh7.u && hzuz0.h().r()) {
                    Map map2 = fdsh7.t;
                    Map map3 = fdvl3.B();
                    Iterator iterator8 = map2.keySet().iterator();
                    while(true) {
                    label_456:
                        if(!iterator8.hasNext()) {
                            break;
                        }
                        Object object9 = iterator8.next();
                        if(!map3.containsKey(((String)object9)) || ((long)(((Long)map2.get(((String)object9))))) > ((long)(((Long)map3.get(((String)object9)))))) {
                            if(Log.isLoggable("CloudNode", 3)) {
                                Log.d("CloudNode", "cloudSyncTable mismatch found after putDataItems. Setting tickle.");
                            }
                            fdsh7.u = true;
                            break;
                        }
                    }
                }
                goto label_464;
            }
            goto label_479;
        }
        catch(IOException iOException2) {
            fdsc0.a.s = true;
            throw iOException2;
        }
        catch(Throwable throwable4) {
            goto label_477;
        }
        goto label_456;
        try {
            try {
            label_464:
                fdry0.d = System.currentTimeMillis();
                fdry0.a();
                v22 = v24;
                goto label_479;
            label_468:
                Log.e("CloudNode", "performSyncWork: there is no cloud sync table, not pushing");
                v17 = v4;
                v21 = v16;
                v22 = 0;
                goto label_479;
            }
            catch(IOException iOException2) {
                fdsc0.a.s = true;
                throw iOException2;
            }
        }
        catch(Throwable throwable4) {
            try {
            label_477:
                fdsc0.a.k.b("** SendData");
                throw throwable4;
            label_479:
                fdsc0.a.k.b("** SendData");
            }
            catch(fdsp fdsp0) {
                goto label_569;
            }
            catch(IOException iOException0) {
                goto label_584;
            }
            catch(Throwable throwable0) {
                goto label_605;
            }
        }
        v18 = v21 | v22;
        goto label_484;
        try {
            try {
            label_482:
                v17 = v4;
                v18 = v16;
            label_484:
                fdsh8 = fdsc0.a;
                if(fdsh8.u) {
                    goto label_486;
                }
                goto label_501;
            }
            catch(fdsp fdsp0) {
                goto label_569;
            }
            catch(IOException iOException0) {
                goto label_584;
            }
            try {
            label_486:
                fdsh8.C = "fetch data";
                int v28 = 0;
                fdsh8.u = false;
                while(true) {
                    if(!fdsh8.s()) {
                        goto label_501;
                    }
                    if(fdsc0.h(s9)) {
                        ++v28;
                        if(Log.isLoggable("CloudNode", 2)) {
                            Log.v("CloudNode", "server said we have more work to do, fetch it, attempt " + v28);
                        }
                        v18 = 1;
                        continue;
                    }
                    v18 = 1;
                    goto label_501;
                }
            }
            catch(IOException iOException3) {
            }
            catch(fdsp fdsp0) {
                goto label_569;
            }
            try {
                fdsc0.a.u = true;
                throw iOException3;
            label_501:
                fdsh8.C = "download assets";
                int v29 = v18 | fdsh8.q.b(s9);
                fdsh8.C = "upload assets";
                int v30 = v17 | (v29 | fdsh8.p.a(s9));
                if(Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", "sync loop completed");
                }
                if(v30 != 0 && hzuz.i()) {
                    ((fdue)fdsh8.G.get()).v();
                }
                fdsh8.k.b("*** Handler");
            }
            catch(fdsp fdsp0) {
                goto label_569;
            }
            catch(IOException iOException0) {
                goto label_584;
            }
        }
        catch(Throwable throwable0) {
            goto label_605;
        }
        fdsh8.B = 0L;
        fdsh8.k.d();
        esaa esaa2 = fdsh8.z;
        synchronized(esaa2) {
            if(!fdsc0.hasMessages(3) && !fdsc0.hasMessages(2) && !fdsc0.hasMessages(1) && !fdsc0.hasMessages(4)) {
                esaa2.g();
            }
        }
        return;
        try {
        label_521:
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "cloud sync disabled via gservices, abandoning sync");
            }
            fdsc0.a.k.b("*** Handler");
        }
        catch(fdsp fdsp0) {
            goto label_569;
        }
        catch(IOException iOException0) {
            goto label_584;
        }
        catch(Throwable throwable0) {
            goto label_605;
        }
        fdsc0.a.B = 0L;
        fdsc0.a.k.d();
        synchronized(fdsc0.a.z) {
            fdsc0.a.z.g();
        }
        return;
        try {
        label_533:
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "not paired to a network, abandoning sync");
            }
            fdsh4.k.b("*** Handler");
        }
        catch(fdsp fdsp0) {
            goto label_569;
        }
        catch(IOException iOException0) {
            goto label_584;
        }
        catch(Throwable throwable0) {
            goto label_605;
        }
        fdsh4.B = 0L;
        fdsh4.k.d();
        esaa esaa3 = fdsh4.z;
        synchronized(esaa3) {
            if(v3 != 0 || !fdsc0.hasMessages(3) && !fdsc0.hasMessages(2) && !fdsc0.hasMessages(1) && !fdsc0.hasMessages(4)) {
                esaa3.g();
            }
        }
        return;
        try {
        label_552:
            fdwc0.b("*** Handler");
        }
        catch(fdsp fdsp0) {
            goto label_567;
        }
        catch(IOException iOException0) {
            goto label_582;
        }
        catch(Throwable throwable0) {
            goto label_603;
        }
        fdsh0.B = 0L;
        fdwc0.d();
        esaa esaa4 = fdsh0.z;
        synchronized(esaa4) {
            if(v != 0 || !this.hasMessages(3) && !this.hasMessages(2) && !this.hasMessages(1) && !this.hasMessages(4)) {
                esaa4.g();
            }
        }
        return;
        try {
        label_564:
            this.c();
            goto label_616;
        }
        catch(fdsp fdsp0) {
        label_567:
            fdsc0 = this;
            v3 = v;
            try {
            label_569:
                fdsc0.a.f(fdsp0, "NetworkEventHandler");
            }
            catch(Throwable throwable0) {
                goto label_605;
            }
            fdsc0.a.B = 0L;
            fdsc0.a.k.d();
            esaa esaa5 = fdsc0.a.z;
            synchronized(esaa5) {
                if(v3 != 0 || !fdsc0.hasMessages(3) && !fdsc0.hasMessages(2) && !fdsc0.hasMessages(1) && !fdsc0.hasMessages(4)) {
                    esaa5.g();
                }
            }
            return;
        }
        catch(IOException iOException0) {
        label_582:
            fdsc0 = this;
            v3 = v;
            try {
            label_584:
                fdsc0.a.v.c();
                Log.w("CloudNode", "caught IOException in NetworkEventHandler retrying in " + fdsc0.a.v.a() + " ms: " + iOException0.getMessage());
                long v36 = fdsc0.a.v.b();
                fdsc0.a.l(v36, "cloud_node_sync");
            }
            catch(Throwable throwable0) {
                goto label_605;
            }
            fdsc0.a.B = 0L;
            fdsc0.a.k.d();
            esaa esaa6 = fdsc0.a.z;
            synchronized(esaa6) {
                if(v3 != 0 || !fdsc0.hasMessages(3) && !fdsc0.hasMessages(2) && !fdsc0.hasMessages(1) && !fdsc0.hasMessages(4)) {
                    esaa6.g();
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        label_603:
            fdsc0 = this;
            v3 = v;
        }
    label_605:
        fdsc0.a.B = 0L;
        fdsc0.a.k.d();
        esaa esaa7 = fdsc0.a.z;
        synchronized(esaa7) {
            if(v3 != 0 || !fdsc0.hasMessages(3) && !fdsc0.hasMessages(2) && !fdsc0.hasMessages(1) && !fdsc0.hasMessages(4)) {
                esaa7.g();
            }
        }
        throw throwable0;
    label_616:
        this.a.B = 0L;
        this.a.k.d();
        esaa esaa8 = this.a.z;
        synchronized(esaa8) {
            if(v != 0 || !this.hasMessages(3) && !this.hasMessages(2) && !this.hasMessages(1) && !this.hasMessages(4)) {
                esaa8.g();
            }
        }
    }

    public final boolean i(long v) {
        fdsh fdsh0 = this.a;
        if(fdsh0.G.get() != null && ((fdue)fdsh0.G.get()).G()) {
            if(fdsh0.o.c()) {
                if(Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", "In error state, refusing to sync");
                }
                return false;
            }
            if(!fdsh0.q()) {
                if(Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", "not connected, abandoning sync");
                }
                return false;
            }
            ffmt ffmt0 = fdsh0.v;
            if(ffmt0.b() > v) {
                if(Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", "backed off, trying again in " + (ffmt0.b() - v) + " ms");
                }
                fdsh0.l(ffmt0.b(), "cloud_node_sync");
                return false;
            }
            return true;
        }
        Log.v("CloudNode", "CloudSyncManager not ready, not attempting to sync");
        return false;
    }

    private final void j(String s, List list0) {
        fdsh fdsh1;
        fdsj fdsj0;
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "sendAllDataSynced: sending batch");
        }
        HashSet hashSet0 = new HashSet();
        for(Object object0: list0) {
            hashSet0.add(((fduq)object0).a.b);
        }
        try {
            fdsh fdsh0 = this.a;
            esaa esaa0 = fdsh0.z;
            Context context0 = fdsh0.a;
            WorkSource workSource0 = new WorkSource();
            for(Object object1: hashSet0) {
                WorkSource workSource1 = bbrd.b(context0, ((String)object1));
                if(workSource1 != null) {
                    workSource0.add(workSource1);
                }
            }
            esaa0.k(workSource0);
            fdsh.i(esaa0);
            long v = SystemClock.elapsedRealtime();
            try {
                Iterator iterator2 = list0.iterator();
                if(fdsh0.p()) {
                    iterator2 = gghd.d(gghd.k(iterator2, (fduq fduq0) -> {
                        if(fduq0 == null) {
                            return null;
                        }
                        try {
                            fdso fdso0 = this.a.m;
                            String s = fduq0.a.b;
                            String s1 = fduq0.b.b;
                            hzvv.d();
                            if(!hzvv.c()) {
                                if(!s.equals("com.google.android.gms") || !s1.equals("/peers")) {
                                label_10:
                                    if(!fduq0.i) {
                                        fduq fduq1 = new fduq(fduq0);
                                        fduq1.i = true;
                                        String s2 = fdso0.h(fduq0.b.b);
                                        fdun fdun0 = new fdun(fduq0.b.a, s2, fduq0.b.f);
                                        byte[] arr_b = fduq0.b.e;
                                        if(arr_b != null) {
                                            fdun0.e = fdso0.q(arr_b, fdun0.c.toString());
                                        }
                                        for(Object object0: fduq0.b.b().entrySet()) {
                                            Map.Entry map$Entry0 = (Map.Entry)object0;
                                            String s3 = ((fdpo)map$Entry0.getValue()).b;
                                            if(TextUtils.isEmpty(s3)) {
                                                Log.w("CloudNodeCrypto", "Expected to get a digest asset, but no digest present. Dropping asset.");
                                            }
                                            else {
                                                fdun0.d(fdso0.i(((String)map$Entry0.getKey())), new fdpo(null, fdso0.g(s3), null));
                                            }
                                        }
                                        fduq1.b = fdun0;
                                        return fduq1;
                                    }
                                }
                            }
                            else if(!s.equals("com.google.android.gms") || !s1.equals("/peers") && !s1.equals("/wearable/app_catalog")) {
                                goto label_10;
                            }
                            return fduq0;
                        }
                        catch(GeneralSecurityException generalSecurityException0) {
                            Log.w("CloudNode", "Encrypting DataItemRecord failed.", generalSecurityException0);
                            return null;
                        }
                    }), new fdsa());
                }
                fdsj0 = fdsh0.H.a(s, iterator2, list0.size(), fdsh0.p());
                fdsh.v(2, v, 0);
            }
            catch(fdsp | IOException exception0) {
                fdsh.w(2, v, exception0);
                throw exception0;
            }
            if(hzxv.f()) {
                fdnd fdnd0 = fdob.b().c;
                if(fdnd0 != null) {
                    for(Object object2: list0) {
                        int v1 = ((fduq)object2).c ? 4 : 2;
                        fdnf fdnf0 = new fdnf();
                        fdnf0.b = v1;
                        fdnf0.a = 3;
                        fdnf0.c = 3;
                        fdnf0.b(((fduq)object2));
                        fdnd0.a(fdnf0.a());
                    }
                }
            }
            fdsh1 = this.a;
            fdsh1.g(fdsj0);
            this.e(fdsj0, false);
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "sendAllDataSynced: sent=" + 0 + " cloud syncTable=" + fdsj0.b);
            }
        }
        catch(Throwable throwable0) {
            this.a.c();
            throw throwable0;
        }
        fdsh1.c();
    }
}

