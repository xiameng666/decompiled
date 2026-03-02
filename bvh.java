import android.content.Context;
import android.os.Build.VERSION;
import android.os.Trace;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import jeb.synthetic.FIN;

public final class bvh {
    public static final bvh a;
    public final bvb b;

    static {
        bvh.a = new bvh(new bvb());
    }

    private bvh(bvb bvb0) {
        this.b = bvb0;
    }

    public static final gmcd a(Context context0) {
        Object object1;
        gmcd gmcd0;
        bvb bvb0 = bvh.a.b;
        synchronized(bvb0.a) {
            int v1 = Build.VERSION.SDK_INT < 34 ? 0 : context0.getDeviceId();
            Map map0 = bvc.a;
            synchronized(map0) {
                Integer integer0 = v1;
                object1 = map0.get(integer0);
                if(object1 == null) {
                    object1 = new bve(null);
                    map0.put(integer0, object1);
                }
            }
            bvb0.f = (bve)object1;
            gmcd0 = bvb0.c;
            if(gmcd0 != null) {
                return bpt.f(gmcd0, new bvg(new bvf()), bol.a());
            }
            bam bam0 = new bam(context0, bvb0.b);
            gmcd gmcd1 = bpt.g(bpf.a(bvb0.d), new buz(new buy(bam0)), bol.a());
            bvb0.c = gmcd1;
            bpt.j(gmcd1, new bva(bvb0, bam0, context0), bol.a());
            gmcd0 = bpt.d(gmcd1);
            ibuq.e(gmcd0, "nonCancellationPropagating(...)");
        }
        return bpt.f(gmcd0, new bvg(new bvf()), bol.a());
    }

    public static final void b(bap bap0) {
        oyn.a("CX:configureInstance");
        try {
            oyn.a("CX:configureInstanceInternal");
            try {
                synchronized(bvh.a.b.a) {
                    kay.d(bvh.a.b.b == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                    bvh.a.b.b = new bux(bap0);
                }
            }
            finally {
                Trace.endSection();
            }
        }
        finally {
            Trace.endSection();
        }
    }

    public final void c(lps lps0, bab bab0, ben[] arr_ben) {
        LifecycleCamera lifecycleCamera2;
        ben[] arr_ben1 = (ben[])Arrays.copyOf(arr_ben, arr_ben.length);
        ibuq.f(arr_ben1, "useCases");
        oyn.a("CX:bindToLifecycle");
        bvb bvb0 = this.b;
        try {
            if(bvb0.d()) {
                bam bam0 = bvb0.e;
                ibuq.c(bam0);
                bam0.d().c.b();
            }
            bvb0.b(1);
            bdn bdn0 = new bdn(ibpg.H(arr_ben1), ibps.a);
            bas bas0 = bas.a;
            ibuq.e(bas0, "DEFAULT");
            ibuq.e(bas0, "DEFAULT");
            oyn.a("CX:bindToLifecycle-internal");
            try {
                boj.b();
                bam bam1 = bvb0.e;
                ibuq.c(bam1);
                bin bin0 = bab0.a(bam1.c.c());
                ibuq.e(bin0, "select(...)");
                bin0.P();
                oyn.a("CX:getCameraInfo");
                try {
                    bam bam2 = bvb0.e;
                    ibuq.c(bam2);
                    bik bik0 = bab0.a(bam2.c.c()).e();
                    ibuq.e(bik0, "getCameraInfoInternal(...)");
                    Iterator iterator0 = bab0.c.iterator();
                    ibuq.e(iterator0, "iterator(...)");
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        ibuq.e(object0, "next(...)");
                        azw azw0 = (azw)object0;
                        if(ibuq.m(azw0.a(), azw.a)) {
                            continue;
                        }
                        bki bki0 = azw0.a();
                        __monitor_enter(bkf.a);
                        int v1 = FIN.finallyOpen$NT();
                        bib bib0 = (bib)bkf.b.get(bki0);
                        FIN.finallyCodeBegin$NT(v1);
                        __monitor_exit(bkf.a);
                        FIN.finallyCodeEnd$NT(v1);
                        ibuq.c(bvb0.g);
                    }
                    bia bia0 = bid.a;
                    azy azy0 = azx.c(bik0.j(), ((bic)bia0).h);
                    Object object1 = bvb0.a;
                    __monitor_enter(object1);
                    int v2 = FIN.finallyOpen$NT();
                    Map map0 = bvb0.h;
                    Object object2 = map0.get(azy0);
                    if(object2 == null) {
                        object2 = new bhi(bik0, bia0);
                        map0.put(azy0, object2);
                    }
                    FIN.finallyCodeBegin$NT(v2);
                    __monitor_exit(object1);
                    FIN.finallyCodeEnd$NT(v2);
                }
                finally {
                    Trace.endSection();
                }
                azy azy1 = azx.b(((bhi)object2));
                bve bve0 = bvb0.f;
                ibuq.c(bve0);
                __monitor_enter(bve0.a);
                try {
                    bvd bvd0 = bvd.a(lps0, azy1);
                    LifecycleCamera lifecycleCamera0 = (LifecycleCamera)bve0.b.get(bvd0);
                }
                finally {
                    __monitor_exit(bve0.a);
                }
                bve bve1 = bvb0.f;
                ibuq.c(bve1);
                __monitor_enter(bve1.a);
                try {
                    Collection collection0 = DesugarCollections.unmodifiableCollection(bve1.b.values());
                }
                finally {
                    __monitor_exit(bve1.a);
                }
                for(Object object3: bdn0.c) {
                    ben ben0 = (ben)object3;
                    for(Object object4: collection0) {
                        ibuq.e(object4, "next(...)");
                        LifecycleCamera lifecycleCamera1 = (LifecycleCamera)object4;
                        Object object5 = lifecycleCamera1.a;
                        try {
                            if(!lifecycleCamera1.c.a().contains(ben0)) {
                                continue;
                            }
                        }
                        catch(Throwable throwable2) {
                            __monitor_exit(object5);
                            throw throwable2;
                        }
                        if(!ibuq.m(lifecycleCamera1.a(), lps0)) {
                            String s = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{ben0}, 1));
                            ibuq.e(s, "format(...)");
                            throw new IllegalStateException(s);
                        }
                    }
                }
                if(lifecycleCamera0 == null) {
                    bve bve2 = bvb0.f;
                    ibuq.c(bve2);
                    bam bam3 = bvb0.e;
                    ibuq.c(bam3);
                    bag bag0 = bam3.r;
                    if(bag0 == null) {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                    ibuq.f(bin0, "camera");
                    ibuq.f(bas0, "compositionSettings");
                    ibuq.f(bas0, "secondaryCompositionSettings");
                    bqi bqi0 = new bqi(bin0, ((bhi)object2), bas0, bas0, bag0.b, bag0.c, bag0.a);
                    Object object6 = bve2.a;
                    __monitor_enter(object6);
                    try {
                        bvd bvd1 = bvd.a(lps0, bqi0.b);
                        Map map1 = bve2.b;
                        kay.b(map1.get(bvd1) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                        lifecycleCamera2 = new LifecycleCamera(lps0, bqi0);
                        if(bqi0.a().isEmpty()) {
                            lifecycleCamera2.d();
                        }
                        if(lps0.getLifecycle().a() != lpf.a) {
                            __monitor_enter(object6);
                            try {
                                lps lps1 = lifecycleCamera2.a();
                                bvd bvd2 = bvd.a(lps1, lifecycleCamera2.c.b);
                                LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 = bve2.a(lps1);
                                Set set0 = lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 == null ? new HashSet() : ((Set)bve2.c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0));
                                set0.add(bvd2);
                                map1.put(bvd2, lifecycleCamera2);
                                if(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 == null) {
                                    LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver1 = new LifecycleCameraRepository.LifecycleCameraRepositoryObserver(lps1, bve2);
                                    bve2.c.put(lifecycleCameraRepository$LifecycleCameraRepositoryObserver1, set0);
                                    lps1.getLifecycle().c(lifecycleCameraRepository$LifecycleCameraRepositoryObserver1);
                                }
                                goto label_139;
                            }
                            catch(Throwable throwable4) {
                                __monitor_exit(object6);
                                throw throwable4;
                            }
                        }
                        goto label_140;
                    }
                    catch(Throwable throwable3) {
                        __monitor_exit(object6);
                        throw throwable3;
                    }
                label_139:
                    __monitor_exit(object6);
                label_140:
                    __monitor_exit(object6);
                    lifecycleCamera0 = lifecycleCamera2;
                }
                List list0 = bdn0.c;
                if(!list0.isEmpty()) {
                    bve bve3 = bvb0.f;
                    ibuq.c(bve3);
                    bam bam4 = bvb0.e;
                    ibuq.c(bam4);
                    ayv ayv0 = bam4.d().c;
                    Object object7 = bve3.a;
                    __monitor_enter(object7);
                    int v5 = FIN.finallyOpen$NT();
                    kay.a(((boolean)(1 ^ list0.isEmpty())));
                    bve3.d = ayv0;
                    lps lps2 = lifecycleCamera0.a();
                    LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver2 = bve3.a(lps2);
                    if(lifecycleCameraRepository$LifecycleCameraRepositoryObserver2 == null) {
                        FIN.finallyExec$NT(v5);
                    }
                    else {
                        for(Object object8: ((Set)bve3.c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserver2))) {
                            LifecycleCamera lifecycleCamera3 = (LifecycleCamera)bve3.b.get(((bvd)object8));
                            kay.i(lifecycleCamera3);
                            if(!lifecycleCamera3.equals(lifecycleCamera0) && !lifecycleCamera3.c().isEmpty()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                        }
                        try {
                            Object object9 = lifecycleCamera0.a;
                            __monitor_enter(object9);
                            int v6 = FIN.finallyOpen$NT();
                            bdn bdn1 = lifecycleCamera0.e;
                            if(bdn1 == null) {
                                lifecycleCamera0.e = bdn0;
                            }
                            else {
                                ArrayList arrayList0 = new ArrayList(bdn1.c);
                                arrayList0.addAll(list0);
                                lifecycleCamera0.e = new bdn(arrayList0, bdn0.a);
                            }
                            bqi bqi1 = lifecycleCamera0.c;
                            __monitor_enter(bqi1.g);
                            bqi1.d = bdn0.a;
                            __monitor_exit(bqi1.g);
                            __monitor_enter(bqi1.g);
                            bqi1.e = bdn0.b;
                            __monitor_exit(bqi1.g);
                            bqi1.a.a.a();
                            bcs.h("ResolvedFeatureGroup");
                            bdn0.d.execute(new buv());
                            Objects.toString(list0);
                            bcs.h("CameraUseCaseAdapter");
                            Object object10 = bqi1.g;
                            __monitor_enter(object10);
                            int v7 = FIN.finallyOpen$NT();
                            bqi1.a.z(bqi1.f);
                            LinkedHashSet linkedHashSet0 = new LinkedHashSet(bqi1.c);
                            linkedHashSet0.addAll(list0);
                            HashMap hashMap0 = new HashMap();
                            for(Object object11: linkedHashSet0) {
                                hashMap0.put(((ben)object11), ((ben)object11).h);
                                ((ben)object11).N(null);
                            }
                            try {
                                bqi1.c(bqi1.j(linkedHashSet0, false));
                            }
                            catch(IllegalArgumentException illegalArgumentException0) {
                                for(Object object12: hashMap0.entrySet()) {
                                    ((ben)((Map.Entry)object12).getKey()).N(((Set)((Map.Entry)object12).getValue()));
                                }
                                throw new bqg(illegalArgumentException0);
                            }
                            FIN.finallyCodeBegin$NT(v7);
                            __monitor_exit(object10);
                            FIN.finallyCodeEnd$NT(v7);
                            FIN.finallyCodeBegin$NT(v6);
                            __monitor_exit(object9);
                            FIN.finallyCodeEnd$NT(v6);
                        }
                        catch(bqg bqg0) {
                            throw new IllegalArgumentException(bqg0);
                        }
                        if(lps2.getLifecycle().a().a(lpf.d)) {
                            bve3.b(lps2);
                        }
                        FIN.finallyCodeBegin$NT(v5);
                    }
                    bvd bvd3 = bvd.a(lps0, azy1);
                    bvb0.i.add(bvd3);
                }
            }
            catch(Throwable throwable1) {
                Trace.endSection();
                throw throwable1;
            }
            Trace.endSection();
        }
        catch(Throwable throwable0) {
            Trace.endSection();
            throw throwable0;
        }
        Trace.endSection();
    }
}

