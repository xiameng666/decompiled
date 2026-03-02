import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import android.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.appsearch.AppSearchSchema;
import com.google.android.gms.appsearch.GetSchemaResponse;
import com.google.android.gms.appsearch.InternalSetSchemaResponse;
import com.google.android.gms.appsearch.SearchSpec;
import com.google.android.gms.appsearch.SetSchemaResponse;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.appsearch.aidl.GetSchemaAidlRequest;
import com.google.android.gms.appsearch.aidl.PutDocumentsFromFileAidlRequest;
import com.google.android.gms.appsearch.aidl.SetSchemaAidlRequest;
import com.google.android.gms.appsearch.aidl.WriteSearchResultsToFileAidlRequest;
import com.google.android.gms.appsearch.stats.SchemaMigrationStats;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public final class acfs implements Runnable {
    public final acgm a;
    public final String b;
    public final acjz c;
    public final evqp d;
    public final acip e;
    public final List f;
    public final List g;
    public final long h;
    public final long i;

    public acfs(acgm acgm0, String s, acjz acjz0, evqp evqp0, acip acip0, List list0, List list1, long v, long v1) {
        this.a = acgm0;
        this.b = s;
        this.c = acjz0;
        this.d = evqp0;
        this.e = acip0;
        this.f = list0;
        this.g = list1;
        this.h = v;
        this.i = v1;
    }

    @Override
    public final void run() {
        int v18;
        acgs acgs8;
        acgs acgs7;
        acgs acgs6;
        ParcelFileDescriptor parcelFileDescriptor1;
        File file2;
        acgs acgs5;
        aciq aciq0;
        acgs acgs4;
        long v16;
        UserHandle userHandle3;
        AtomicReference atomicReference4;
        CountDownLatch countDownLatch4;
        ackk ackk1;
        acgq acgq3;
        boolean z3;
        long v15;
        long v14;
        acgs acgs3;
        acgo acgo0;
        WriteSearchResultsToFileAidlRequest writeSearchResultsToFileAidlRequest0;
        acjk acjk2;
        AtomicReference atomicReference3;
        CountDownLatch countDownLatch3;
        int v12;
        File file1;
        AppSearchAttributionSource appSearchAttributionSource2;
        ParcelFileDescriptor parcelFileDescriptor0;
        acgq acgq2;
        File file0;
        achs achs1;
        String s2;
        acgq acgq1;
        Iterator iterator2;
        long v11;
        acgq acgq0;
        boolean z;
        long v10;
        InternalSetSchemaResponse internalSetSchemaResponse1;
        int v9;
        long v8;
        List list1;
        List list0;
        long v6;
        Map map1;
        int v4;
        String s;
        long v3;
        long v1;
        ackk ackk0;
        AppSearchAttributionSource appSearchAttributionSource0;
        long v;
        acgm acgm0 = this.a;
        acjz acjz0 = this.c;
        evqp evqp0 = this.d;
        acip acip0 = this.e;
        try {
            v = SystemClock.elapsedRealtime();
            appSearchAttributionSource0 = acgm0.b;
            ackk0 = new ackk(appSearchAttributionSource0.c(), this.b);
            v1 = SystemClock.elapsedRealtime();
            CountDownLatch countDownLatch0 = new CountDownLatch(1);
            AtomicReference atomicReference0 = new AtomicReference();
            acjk acjk0 = (acjk)acjz0.H();
            UserHandle userHandle0 = Process.myUserHandle();
            long v2 = SystemClock.elapsedRealtime();
            v3 = this.i;
            GetSchemaAidlRequest getSchemaAidlRequest0 = new GetSchemaAidlRequest(appSearchAttributionSource0, acgm0.a, this.b, userHandle0, v2, false);
            s = this.b;
            acjk0.a(getSchemaAidlRequest0, new acgc(acgm0, atomicReference0, countDownLatch0));
            countDownLatch0.await();
            acgs acgs0 = (acgs)atomicReference0.get();
            if(!acgs0.b()) {
                evqp0.d(new acjx(acgs0.a, acgs0.b));
                return;
            }
            GetSchemaResponse getSchemaResponse0 = (GetSchemaResponse)Objects.requireNonNull(((GetSchemaResponse)acgs0.a()));
            v4 = getSchemaResponse0.a;
            int v5 = acip0.g;
            Set set0 = getSchemaResponse0.b();
            Map map0 = acip0.b();
            if(v4 == v5) {
                map1 = Collections.EMPTY_MAP;
            }
            else {
                bxf bxf0 = new bxf(set0.size());
                for(Object object0: set0) {
                    bxf0.add(((AppSearchSchema)object0).a);
                }
                map1 = new ArrayMap();
                for(Object object1: map0.entrySet()) {
                    String s1 = (String)((Map.Entry)object1).getKey();
                    achs achs0 = (achs)((Map.Entry)object1).getValue();
                    if(bxf0.contains(s1) && achs0.a.c()) {
                        map1.put(s1, achs0);
                    }
                }
            }
            v6 = SystemClock.elapsedRealtime();
            list0 = this.f;
            list1 = this.g;
            if(map1.isEmpty()) {
                CountDownLatch countDownLatch1 = new CountDownLatch(1);
                AtomicReference atomicReference1 = new AtomicReference();
                UserHandle userHandle1 = Process.myUserHandle();
                long v7 = SystemClock.elapsedRealtime();
                SetSchemaAidlRequest setSchemaAidlRequest0 = new SetSchemaAidlRequest(appSearchAttributionSource0, s, list0, list1, acip0.f, v5, userHandle1, v7, 0);
                ((acjk)acjz0.H()).b(setSchemaAidlRequest0, new acgd(acgm0, atomicReference1, countDownLatch1));
                countDownLatch1.await();
                acgs acgs1 = (acgs)atomicReference1.get();
                if(!acgs1.b()) {
                    evqp0.d(new acjx(acgs1.a, acgs1.b));
                    return;
                }
                InternalSetSchemaResponse internalSetSchemaResponse0 = (InternalSetSchemaResponse)acgs1.a();
                if(internalSetSchemaResponse0 != null) {
                    if(internalSetSchemaResponse0.a) {
                        evqp0.c(internalSetSchemaResponse0.b);
                        return;
                    }
                    evqp0.d(new acjx(7, internalSetSchemaResponse0.c));
                    return;
                }
            }
            else {
                v8 = SystemClock.elapsedRealtime();
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                AtomicReference atomicReference2 = new AtomicReference();
                SetSchemaAidlRequest setSchemaAidlRequest1 = new SetSchemaAidlRequest(appSearchAttributionSource0, s, list0, list1, false, v5, Process.myUserHandle(), SystemClock.elapsedRealtime(), 1);
                v9 = v5;
                ((acjk)acjz0.H()).b(setSchemaAidlRequest1, new acge(acgm0, atomicReference2, countDownLatch2));
                countDownLatch2.await();
                acgs acgs2 = (acgs)atomicReference2.get();
                if(!acgs2.b()) {
                    evqp0.d(new acjx(acgs2.a, acgs2.b));
                    return;
                }
                internalSetSchemaResponse1 = (InternalSetSchemaResponse)acgs2.a();
                if(internalSetSchemaResponse1 == null) {
                    evqp0.a(new acjx(2, "Received null InternalSetSchemaResponse during setSchema call"));
                    return;
                }
                v10 = SystemClock.elapsedRealtime();
                Set set1 = map1.keySet();
                z = internalSetSchemaResponse1.a;
                if(!z) {
                    bxf bxf1 = new bxf(internalSetSchemaResponse1.b.c());
                    bxf1.removeAll(set1);
                    bxf bxf2 = new bxf(internalSetSchemaResponse1.b.b());
                    bxf2.removeAll(set1);
                    if(!bxf1.isEmpty() || !bxf2.isEmpty()) {
                        throw new acjx(7, internalSetSchemaResponse1.c);
                    }
                }
                acjk acjk1 = (acjk)acjz0.H();
                UserHandle userHandle2 = Process.myUserHandle();
                Set set2 = acip0.c();
                acgn.a();
                acgq0 = new acgq(acjk1, userHandle2, appSearchAttributionSource0, s, set2, acgm0.c.getCacheDir());
                goto label_98;
            }
            return;
        }
        catch(InterruptedException | acjx | IOException | ExecutionException | RemoteException exception0) {
            goto label_340;
        }
    label_98:
        AppSearchAttributionSource appSearchAttributionSource1 = appSearchAttributionSource0;
        try {
            v11 = SystemClock.elapsedRealtime();
            iterator2 = map1.entrySet().iterator();
            while(true) {
            label_101:
                boolean z1 = iterator2.hasNext();
                break;
            }
        }
        catch(Throwable throwable0) {
            acgq1 = acgq0;
            goto label_331;
        }
        if(!z1) {
            goto label_198;
        }
        try {
            Object object2 = iterator2.next();
            s2 = (String)((Map.Entry)object2).getKey();
            achs1 = (achs)((Map.Entry)object2).getValue();
            file0 = File.createTempFile("appsearch", null, acgq0.d);
        }
        catch(Throwable throwable1) {
            acgq2 = acgq0;
            goto label_195;
        }
        try {
            parcelFileDescriptor0 = ParcelFileDescriptor.open(file0, 0x20000000);
        }
        catch(RemoteException remoteException0) {
            acgq2 = acgq0;
            appSearchAttributionSource2 = appSearchAttributionSource1;
            file1 = file0;
            v12 = v9;
            goto label_184;
        }
        catch(Throwable throwable2) {
            acgq2 = acgq0;
            file1 = file0;
            goto label_187;
        }
        try {
            countDownLatch3 = new CountDownLatch(1);
            atomicReference3 = new AtomicReference();
            acjk2 = acgq0.g;
        }
        catch(Throwable throwable3) {
            acgq2 = acgq0;
            appSearchAttributionSource2 = appSearchAttributionSource1;
            file1 = file0;
            goto label_172;
        }
        appSearchAttributionSource2 = appSearchAttributionSource1;
        try {
            acil acil0 = new acil();
            String[] arr_s = {s2};
            Objects.requireNonNull(arr_s);
            acil0.b();
            acil0.c(Arrays.asList(arr_s));
            acil0.e(1);
            SearchSpec searchSpec0 = acil0.a();
            long v13 = SystemClock.elapsedRealtime();
            writeSearchResultsToFileAidlRequest0 = new WriteSearchResultsToFileAidlRequest(acgq0.a, acgq0.b, parcelFileDescriptor0, "", searchSpec0, acgq0.c, v13);
            acgo0 = new acgo(acgq0, atomicReference3, countDownLatch3);
        }
        catch(Throwable throwable3) {
            acgq2 = acgq0;
            file1 = file0;
            goto label_172;
        }
        acgq2 = acgq0;
        try {
            Parcel parcel0 = acjk2.jo();
            wbz.f(parcel0, writeSearchResultsToFileAidlRequest0);
            wbz.h(parcel0, acgo0);
            acjk2.jp(11, parcel0);
            countDownLatch3.await();
            acgs3 = (acgs)atomicReference3.get();
            boolean z2 = acgs3.b();
        }
        catch(Throwable throwable3) {
            file1 = file0;
            goto label_172;
        }
        if(!z2) {
            try {
                file1 = file0;
                v12 = v9;
                throw new acjx(acgs3.a, acgs3.b);
            }
            catch(Throwable throwable3) {
                goto label_173;
            }
        }
        file1 = file0;
        try {
            acgq2.a(file1, achs1, v4, v9, ackk0);
            goto label_179;
        }
        catch(Throwable throwable3) {
        }
    label_172:
        v12 = v9;
    label_173:
        if(parcelFileDescriptor0 != null) {
            try {
                parcelFileDescriptor0.close();
            }
            catch(Throwable throwable4) {
                try {
                    throwable3.addSuppressed(throwable4);
                    throw throwable3;
                label_179:
                    v12 = v9;
                    if(parcelFileDescriptor0 != null) {
                        parcelFileDescriptor0.close();
                    }
                    goto label_189;
                }
                catch(RemoteException remoteException0) {
                    goto label_184;
                }
                catch(Throwable throwable2) {
                    goto label_187;
                }
            }
        }
        throw throwable3;
        try {
        label_184:
            ackn.a(remoteException0);
            goto label_189;
        }
        catch(Throwable throwable2) {
            try {
            label_187:
                file1.delete();
                throw throwable2;
            label_189:
                file1.delete();
                v9 = v12;
                acgq0 = acgq2;
                appSearchAttributionSource1 = appSearchAttributionSource2;
                goto label_101;
            }
            catch(Throwable throwable1) {
            }
        }
    label_195:
        Throwable throwable5 = throwable1;
        acgq1 = acgq2;
        goto label_332;
        try {
        label_198:
            v14 = SystemClock.elapsedRealtime();
            v15 = SystemClock.elapsedRealtime();
            if(z) {
                z3 = z;
                acgq3 = acgq0;
                ackk1 = ackk0;
            }
            else {
                countDownLatch4 = new CountDownLatch(1);
                atomicReference4 = new AtomicReference();
                userHandle3 = Process.myUserHandle();
                v16 = SystemClock.elapsedRealtime();
                goto label_213;
            }
            goto label_236;
        }
        catch(Throwable throwable0) {
            acgq1 = acgq0;
            goto label_331;
        }
    label_213:
        acgq3 = acgq0;
        ackk1 = ackk0;
        z3 = z;
        try {
            SetSchemaAidlRequest setSchemaAidlRequest2 = new SetSchemaAidlRequest(appSearchAttributionSource1, s, list0, list1, true, v9, userHandle3, v16, 2);
            ((acjk)acjz0.H()).b(setSchemaAidlRequest2, new acgf(acgm0, atomicReference4, countDownLatch4));
            countDownLatch4.await();
            acgs4 = (acgs)atomicReference4.get();
        }
        catch(Throwable throwable0) {
            acgq1 = acgq3;
            goto label_331;
        }
        if(!acgs4.b()) {
            try {
                evqp0.d(new acjx(acgs4.a, acgs4.b));
                goto label_234;
            }
            catch(Throwable throwable6) {
                throwable5 = throwable6;
                acgq1 = acgq3;
                goto label_332;
            }
        }
        try {
            internalSetSchemaResponse1 = (InternalSetSchemaResponse)acgs4.a();
        }
        catch(Throwable throwable0) {
            acgq1 = acgq3;
            goto label_331;
        }
        if(internalSetSchemaResponse1 == null) {
            try {
                evqp0.a(new acjx(2, "Received null InternalSetSchemaResponse during setSchema call"));
                goto label_234;
            label_227:
                if(!internalSetSchemaResponse1.a) {
                    evqp0.d(new acjx(2, internalSetSchemaResponse1.c));
                    goto label_234;
                }
                goto label_236;
            }
            catch(Throwable throwable6) {
                throwable5 = throwable6;
                acgq1 = acgq3;
                goto label_332;
            }
        }
        goto label_227;
        try {
        label_234:
            acgq3.close();
        }
        catch(InterruptedException | acjx | IOException | ExecutionException | RemoteException exception0) {
            goto label_340;
        }
        return;
        try {
        label_236:
            long v17 = SystemClock.elapsedRealtime();
            ackk1.c = (int)(v - this.h);
            ackk1.d = (int)(v6 - v1);
            ackk1.f = (int)(v10 - v8);
            ackk1.g = z3;
            ackk1.e = (int)(v14 - v11);
            ackk1.h = (int)(v17 - v15);
            aciq0 = new aciq(internalSetSchemaResponse1.b);
            Set set3 = map1.keySet();
            Objects.requireNonNull(set3);
            aciq0.b();
            aciq0.b.addAll(set3);
        }
        catch(Throwable throwable0) {
            acgq1 = acgq3;
            goto label_331;
        }
        acgq1 = acgq3;
        try {
            if(acgq1.f == 0) {
                acgs5 = new acgs(0, aciq0.a(), null);
            }
            else {
                goto label_256;
            }
        }
        catch(Throwable throwable0) {
            goto label_331;
        }
        goto label_325;
        try {
        label_256:
            file2 = acgq1.e;
            parcelFileDescriptor1 = ParcelFileDescriptor.open(file2, 0x10000000);
        }
        catch(RemoteException remoteException1) {
            goto label_292;
        }
        catch(InterruptedException | IOException | RuntimeException exception1) {
            goto label_295;
        }
        catch(Throwable throwable7) {
            goto label_321;
        }
        try {
            CountDownLatch countDownLatch5 = new CountDownLatch(1);
            AtomicReference atomicReference5 = new AtomicReference();
            PutDocumentsFromFileAidlRequest putDocumentsFromFileAidlRequest0 = new PutDocumentsFromFileAidlRequest(acgq1.a, acgq1.b, parcelFileDescriptor1, acgq1.c, new SchemaMigrationStats(ackk1.a, ackk1.b, 0, ackk1.c, 0, ackk1.d, ackk1.e, ackk1.f, ackk1.g, ackk1.h, 0, ackk1.i, 0, 0), v3, SystemClock.elapsedRealtime());
            acgp acgp0 = new acgp(acgq1, atomicReference5, countDownLatch5);
            Parcel parcel1 = acgq1.g.jo();
            wbz.f(parcel1, putDocumentsFromFileAidlRequest0);
            wbz.h(parcel1, acgp0);
            acgq1.g.jp(12, parcel1);
            countDownLatch5.await();
            acgs6 = (acgs)atomicReference5.get();
            if(acgs6.b()) {
                goto label_276;
            }
            else {
                batl.m(((boolean)(acgs6.b() ^ 1)), "Cannot convert a success result to a failed result");
                acgs7 = new acgs(acgs6.a, null, acgs6.b);
                goto label_271;
            }
            goto label_325;
        }
        catch(Throwable throwable8) {
            goto label_282;
        }
    label_271:
        if(parcelFileDescriptor1 != null) {
            try {
                parcelFileDescriptor1.close();
            }
            catch(RemoteException remoteException1) {
                goto label_292;
            }
            catch(InterruptedException | IOException | RuntimeException exception1) {
                goto label_295;
            }
            catch(Throwable throwable7) {
                goto label_321;
            }
        }
        try {
            file2.delete();
        }
        catch(Throwable throwable0) {
            goto label_331;
        }
        acgs5 = acgs7;
        goto label_325;
        try {
        label_276:
            List list2 = (List)Objects.requireNonNull(((List)acgs6.a()));
            Objects.requireNonNull(list2);
            aciq0.b();
            aciq0.a.addAll(list2);
        }
        catch(Throwable throwable8) {
        label_282:
            if(parcelFileDescriptor1 != null) {
                try {
                    parcelFileDescriptor1.close();
                }
                catch(Throwable throwable9) {
                    try {
                        throwable8.addSuppressed(throwable9);
                        throw throwable8;
                    }
                    catch(RemoteException remoteException1) {
                        goto label_292;
                    }
                    catch(InterruptedException | IOException | RuntimeException exception1) {
                        goto label_295;
                    }
                    catch(Throwable throwable7) {
                        goto label_321;
                    }
                }
            }
            throw throwable8;
        }
        if(parcelFileDescriptor1 != null) {
            try {
                try {
                    parcelFileDescriptor1.close();
                    goto label_323;
                }
                catch(RemoteException remoteException1) {
                }
                catch(InterruptedException | IOException | RuntimeException exception1) {
                    goto label_295;
                }
            label_292:
                ackn.a(remoteException1);
                goto label_323;
            label_295:
                if(!(exception1 instanceof acjx) || ((acjx)exception1).a != 6) {
                    Log.w("AppSearchResult", "Converting throwable to failed result.", exception1);
                    if((exception1 instanceof acjx)) {
                        acgs8 = new acgs(((acjx)exception1).a, null, ((acjx)exception1).getMessage());
                        goto label_317;
                    }
                    else {
                        String s3 = exception1.getClass().getSimpleName();
                        if((exception1 instanceof IllegalStateException) || (exception1 instanceof NullPointerException)) {
                            v18 = 2;
                        }
                        else if((exception1 instanceof IllegalArgumentException)) {
                            v18 = 3;
                        }
                        else if((exception1 instanceof IOException)) {
                            v18 = 4;
                        }
                        else if((exception1 instanceof SecurityException)) {
                            v18 = 8;
                        }
                        else {
                            v18 = 1;
                        }
                        acgs5 = new acgs(v18, null, s3 + ": " + exception1.getMessage());
                    }
                }
                else {
                    acgs8 = new acgs(((acjx)exception1).a, null, ((acjx)exception1).getMessage());
                    goto label_317;
                }
                goto label_318;
            }
            catch(Throwable throwable7) {
                goto label_321;
            }
        label_317:
            acgs5 = acgs8;
            try {
            label_318:
                acgq1.e.delete();
                goto label_325;
            label_321:
                acgq1.e.delete();
                throw throwable7;
            label_323:
                acgq1.e.delete();
                acgs5 = new acgs(0, aciq0.a(), null);
            label_325:
                if(acgs5.b()) {
                    evqp0.c(((SetSchemaResponse)acgs5.a()));
                }
                else {
                    evqp0.d(new acjx(acgs5.a, acgs5.b));
                }
                goto label_337;
            }
            catch(Throwable throwable0) {
                goto label_331;
            }
        }
        goto label_323;
    label_331:
        throwable5 = throwable0;
        try {
        label_332:
            acgq1.close();
            throw throwable5;
        }
        catch(Throwable throwable10) {
            try {
                throwable5.addSuppressed(throwable10);
                throw throwable5;
            label_337:
                acgq1.close();
                return;
            }
            catch(InterruptedException | acjx | IOException | ExecutionException | RemoteException exception0) {
            }
        }
    label_340:
        evqp0.d(exception0);
    }
}

