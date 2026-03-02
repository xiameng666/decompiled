import android.content.Context;
import android.hardware.camera2.CameraManager.AvailabilityCallback;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public final class baj implements Runnable {
    public final bam a;
    public final Context b;
    public final Executor c;
    public final int d;
    public final jqt e;
    public final long f;

    public baj(bam bam0, Context context0, Executor executor0, int v, jqt jqt0, long v1) {
        this.a = bam0;
        this.b = context0;
        this.c = executor0;
        this.d = v;
        this.e = jqt0;
        this.f = v1;
    }

    @Override
    public final void run() {
        Throwable throwable0;
        List list0;
        ThreadPoolExecutor threadPoolExecutor0;
        RuntimeException runtimeException1;
        bld bld1;
        bjb bjb0;
        Context context1;
        long v3;
        bjk bjk0;
        bab bab0;
        bjf bjf0;
        bij bij0;
        blf blf0;
        bap bap0;
        oyn.a("CX:initAndRetryRecursively");
        int v = this.d;
        Context context0 = bnm.a(this.b);
        bam bam0 = this.a;
        Executor executor0 = this.c;
        long v1 = this.f;
        jqt jqt0 = this.e;
        biv biv0 = null;
        try {
            bap0 = bam0.e;
            blf0 = bap0.m;
            bij0 = (bij)blf0.m(bap.a, null);
            if(bij0 != null) {
                bjf0 = new bjf(bam0.f, bam0.g);
                bab0 = (bab)blf0.m(bap.g, null);
                ibuq.f(context0, "context");
                bjk0 = new bjk(context0, bab0);
                v3 = (long)(((Long)blf0.m(bap.h, Long.valueOf(-1L))));
                bnf bnf0 = (bnf)blf0.m(bap.c, null);
                if(bnf0 != null) {
                    bam0.i = bnf0.a(context0);
                    bam0.s = new bqp(bam0.i);
                    context1 = context0;
                    goto label_27;
                }
                context1 = context0;
                throw new bcr(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            context1 = context0;
            throw new bcr(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        }
        catch(bjh | bcr | RuntimeException exception0) {
            context1 = context0;
            goto label_163;
        }
        finally {
            Trace.endSection();
        }
        try {
        label_27:
            bam0.p = bij0.a(context1, bjf0, bab0, v3, bap0);
            bii bii0 = (bii)blf0.m(bap.b, null);
            if(bii0 == null) {
                throw new bcr(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            bam0.q = bii0.a(context1, bam0.p.a, bam0.p.d());
            bqp bqp0 = bam0.s;
            asi asi0 = bam0.q;
            ibuq.f(asi0, "cameraDeviceSurfaceManager");
            bqp0.b = asi0;
            if((executor0 instanceof azv)) {
                aox aox0 = bam0.p;
                kay.i(aox0);
                synchronized(((azv)executor0).a) {
                    if(((azv)executor0).b.isShutdown()) {
                        ((azv)executor0).b = azv.a();
                    }
                    threadPoolExecutor0 = ((azv)executor0).b;
                }
                int v5 = Math.max(1, aox0.d().size());
                threadPoolExecutor0.setMaximumPoolSize(v5);
                threadPoolExecutor0.setCorePoolSize(v5);
            }
            bjb0 = bam0.c;
            aox aox1 = bam0.p;
            bjb0.f = aox1;
            synchronized(bjb0.a) {
                try {
                    for(Object object2: aox1.d()) {
                        String s = (String)object2;
                        bcs.h("CameraRepository");
                        bin bin0 = (bin)bjb0.b.put(s, aox1.b(s));
                        if(bin0 != null) {
                            bin0.g();
                        }
                        biv0 = biv0;
                    }
                }
                catch(baf baf0) {
                    throw new bcr(baf0);
                }
            }
            bam0.r = new bag(bam0.p.c, bam0.i, bam0.s);
            for(Object object3: bjb0.c()) {
                ((bin)object3).e().q(bam0.r);
            }
            biu biu0 = bam0.l;
            aox aox2 = bam0.p;
            ibuq.f(aox2, "cameraFactory");
            if(biu0.f.compareAndSet(false, true)) {
                bcs.c("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
                biu0.j = bjk0;
                Set set0 = aox2.d();
                ArrayList arrayList0 = new ArrayList(ibpo.q(set0, 10));
                for(Object object4: set0) {
                    ibuq.c(((String)object4));
                    arrayList0.add(azx.a(((String)object4)));
                }
                biu0.e = arrayList0;
                biu0.i = aox2;
                biu0.b = bjb0;
                biu0.c = aox2.b;
                bld bld0 = biu0.c;
                if(bld0 != null) {
                    boz boz0 = new boz(biu0.a);
                    bit bit0 = biu0.d;
                    kay.i(bit0);
                    bhg bhg0 = new bhg(boz0, bit0);
                    ((bhh)bld0).e.add(bhg0);
                    synchronized(((bhh)bld0).d) {
                        if(!((bhh)bld0).h && !((bhh)bld0).e.isEmpty()) {
                            Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                            ((bhh)bld0).h = true;
                            if(((asn)bld0).c != null) {
                                Log.w("Camera2PresenceSrc", "Monitoring already started. Unregistering existing callback.");
                                ((asn)bld0).c();
                            }
                            Log.i("Camera2PresenceSrc", "Starting system availability monitoring.");
                            ((asn)bld0).c = new asm(((asn)bld0));
                            bld1 = bld0;
                            CameraManager.AvailabilityCallback cameraManager$AvailabilityCallback0 = ((asn)bld1).c;
                            ibuq.c(cameraManager$AvailabilityCallback0);
                            ((asn)bld0).a.d(((asn)bld0).b, cameraManager$AvailabilityCallback0);
                            bpt.h(((asn)bld1).a());
                        }
                        else {
                            bld1 = bld0;
                        }
                        list0 = DesugarCollections.unmodifiableList(((bhh)bld1).f);
                        throwable0 = ((bhh)bld1).g;
                    }
                    bhh.e(new bhg(boz0, bit0), list0, throwable0);
                }
            }
            biu0.a(bam0.q);
            biu0.a(bam0.p.c);
            if(bjk0.a) {
                bjb0.c();
                bcs.h("CameraValidator");
            }
            else {
                bcs.h("CameraValidator");
                if(bjk0.b.a) {
                    goto label_135;
                }
                goto label_142;
            }
            goto label_153;
        }
        catch(bjh | bcr | RuntimeException exception0) {
            goto label_163;
        }
        try {
        label_135:
            LinkedHashSet linkedHashSet0 = bjb0.c();
            ibuq.c(bab.b.a(linkedHashSet0));
            goto label_142;
        }
        catch(RuntimeException runtimeException0) {
            try {
                bcs.e("CameraValidator", "Camera LENS_FACING_BACK verification failed", runtimeException0);
                runtimeException1 = runtimeException0;
                goto label_143;
            label_142:
                runtimeException1 = biv0;
            }
            catch(bjh | bcr | RuntimeException exception0) {
                goto label_163;
            }
        label_143:
            if(bjk0.b.b) {
                try {
                    LinkedHashSet linkedHashSet1 = bjb0.c();
                    ibuq.c(bab.a.a(linkedHashSet1));
                    goto label_151;
                }
                catch(RuntimeException runtimeException2) {
                }
                catch(bjh | bcr exception0) {
                    goto label_163;
                }
                try {
                    bcs.e("CameraValidator", "Camera LENS_FACING_FRONT verification failed", runtimeException2);
                    if(runtimeException1 == null) {
                        runtimeException1 = runtimeException2;
                    }
                label_151:
                    if(runtimeException1 != null) {
                        throw new bjh(bjb0.c().size(), runtimeException1);
                    }
                label_153:
                    if(v > 1) {
                        bam.e(biv0);
                    }
                    bam0.b();
                    jqt0.b(biv0);
                    return;
                }
                catch(bjh | bcr | RuntimeException exception0) {
                    goto label_163;
                }
            }
            goto label_151;
        }
        catch(bjh | bcr exception0) {
        }
    label_163:
        biv biv1 = new biv(v1, exception0);
        bdi bdi0 = bam0.j.a(biv1);
        bam.e(biv1);
        if(bdi0.e && v < 0x7FFFFFFF) {
            bcs.e("CameraX", "Retry init. Start time " + v1 + " current time " + SystemClock.elapsedRealtime(), exception0);
            bai bai0 = new bai(bam0, executor0, v1, v, context1, jqt0);
            bam0.g.postDelayed(bai0, "retry_token", bdi0.d);
            bam0.l.d();
        }
        else {
            synchronized(bam0.d) {
                bam0.o = 3;
            }
            if(bdi0.f) {
                bam0.b();
                jqt0.b(null);
            }
            else {
                if((exception0 instanceof bjh)) {
                    String s1 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((bjh)exception0).a;
                    bcs.b("CameraX", s1, exception0);
                    jqt0.c(new bcr(new baf(s1)));
                }
                else if((exception0 instanceof bcr)) {
                    jqt0.c(exception0);
                }
                else {
                    jqt0.c(new bcr(exception0));
                }
                bam0.l.d();
            }
        }
    }
}

