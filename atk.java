import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build.VERSION;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import jeb.synthetic.FIN;

final class atk implements atl {
    final Object a;
    public final List b;
    bmb c;
    List d;
    gmcd e;
    jqt f;
    int g;
    int h;
    avp i;
    avp j;
    private final atj k;
    private final Map l;
    private Map m;
    private final ayp n;
    private final ays o;
    private final aym p;
    private final axc q;
    private final ayr r;
    private final boolean s;
    private final aze t;

    public atk(axc axc0, blp blp0, boolean z, aze aze0) {
        this.a = new Object();
        this.b = new ArrayList();
        this.l = new HashMap();
        this.d = Collections.EMPTY_LIST;
        this.g = 1;
        this.h = 1;
        this.m = new HashMap();
        this.n = new ayp();
        this.o = new ays();
        this.l(3);
        this.q = axc0;
        this.k = new atj(this);
        this.p = new aym(blp0.c(CaptureNoResponseQuirk.class));
        this.r = new ayr(blp0);
        this.s = z;
        this.t = aze0;
    }

    @Override  // atl
    public final bmb a() {
        synchronized(this.a) {
        }
        return this.c;
    }

    // Detected as a lambda impl.
    public final gmcd b(List list0, bmb bmb0, CameraDevice cameraDevice0) {
        gmcd gmcd0;
        CaptureRequest captureRequest0;
        String s1;
        Map map1;
        bjm bjm1;
        ant ant1;
        CameraCaptureSession.StateCallback cameraCaptureSession$StateCallback0;
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = this.h - 1;
        if(this.h == 0) {
            throw null;
        }
        if(v1 != 0) {
            switch(v1) {
                case 3: {
                    Map map0 = this.l;
                    map0.clear();
                    for(int v2 = 0; v2 < list0.size(); ++v2) {
                        map0.put(((bka)this.d.get(v2)), ((Surface)list0.get(v2)));
                    }
                    this.l(7);
                    bcs.h("CaptureSession");
                    avh[] arr_avh = {this.k, null};
                    List list1 = bmb0.d;
                    if(list1.isEmpty()) {
                        cameraCaptureSession$StateCallback0 = new ast();
                    }
                    else if(list1.size() == 1) {
                        cameraCaptureSession$StateCallback0 = (CameraCaptureSession.StateCallback)list1.get(0);
                    }
                    else {
                        cameraCaptureSession$StateCallback0 = new ass(list1);
                    }
                    arr_avh[1] = new avt(cameraCaptureSession$StateCallback0);
                    avu avu0 = new avu(Arrays.asList(arr_avh));
                    ant ant0 = new ant(bmb0.d());
                    bjm bjm0 = new bjm(bmb0.g);
                    HashMap hashMap0 = new HashMap();
                    boolean z = this.s;
                    if(z && Build.VERSION.SDK_INT >= 35) {
                        HashMap hashMap1 = new HashMap();
                        for(Object object1: bmb0.a) {
                            bly bly0 = (bly)object1;
                        }
                        HashMap hashMap2 = new HashMap();
                        for(Object object2: hashMap1.keySet()) {
                            Integer integer0 = (Integer)object2;
                            if(((List)hashMap1.get(integer0)).size() >= 2) {
                                hashMap2.put(integer0, ((List)hashMap1.get(integer0)));
                            }
                        }
                        HashMap hashMap3 = new HashMap();
                        for(Object object3: hashMap2.keySet()) {
                            Integer integer1 = (Integer)object3;
                            ArrayList arrayList0 = new ArrayList();
                            int v3 = 0;
                            for(Object object4: ((List)hashMap2.get(integer1))) {
                                int[] arr_v = SurfaceUtil.nativeGetSurfaceInfo(((Surface)map0.get(((bly)object4).a)));
                                int v4 = arr_v[0];
                                int v5 = arr_v[1];
                                int v6 = arr_v[2];
                                if(v3 != 0) {
                                    v4 = v3;
                                }
                                arrayList0.add(new MultiResolutionStreamInfo(v5, v6, ((String)Objects.requireNonNull(null))));
                                v3 = v4;
                                ant0 = ant0;
                                bjm0 = bjm0;
                            }
                            if(v3 != 0 && !arrayList0.isEmpty()) {
                                List list2 = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList0, v3);
                                if(list2 != null) {
                                    for(Object object5: ((List)hashMap2.get(integer1))) {
                                        OutputConfiguration outputConfiguration0 = (OutputConfiguration)list2.remove(0);
                                        outputConfiguration0.addSurface(((Surface)map0.get(((bly)object5).a)));
                                        hashMap3.put(((bly)object5), new axh(outputConfiguration0));
                                    }
                                }
                            }
                            else {
                                bcs.a("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + v3 + ", streamInfos size: " + arrayList0.size());
                            }
                            ant0 = ant0;
                            bjm0 = bjm0;
                        }
                        ant1 = ant0;
                        bjm1 = bjm0;
                        hashMap0 = hashMap3;
                    }
                    else {
                        ant1 = ant0;
                        bjm1 = bjm0;
                    }
                    ArrayList arrayList1 = new ArrayList();
                    String s = ant1.e();
                    for(Object object6: bmb0.a) {
                        bly bly1 = (bly)object6;
                        axh axh0 = !z || Build.VERSION.SDK_INT < 35 ? null : ((axh)hashMap0.get(bly1));
                        if(axh0 == null) {
                            bka bka0 = bly1.a;
                            Surface surface0 = (Surface)map0.get(bka0);
                            kay.j(surface0, "Surface in OutputConfig not found in configuredSurfaceMap.");
                            axh axh1 = new axh(bly1.d, surface0);
                            if(s == null) {
                                axh1.c(null);
                            }
                            else {
                                axh1.c(s);
                            }
                            int v7 = bly1.c;
                            if(v7 == 0) {
                                axh1.b(1);
                            }
                            else if(v7 == 1) {
                                axh1.b(2);
                            }
                            List list3 = bly1.b;
                            if(!list3.isEmpty()) {
                                axp axp0 = axh1.a;
                                axp0.d();
                                for(Object object7: list3) {
                                    Surface surface1 = (Surface)map0.get(((bka)object7));
                                    kay.j(surface1, "Surface in OutputConfig not found in configuredSurfaceMap.");
                                    axp0.c(surface1);
                                    map0 = map0;
                                    s = s;
                                }
                            }
                            map1 = map0;
                            s1 = s;
                            long v8 = 1L;
                            if(Build.VERSION.SDK_INT >= 33) {
                                DynamicRangeProfiles dynamicRangeProfiles0 = this.q.a();
                                if(dynamicRangeProfiles0 != null) {
                                    bat bat0 = bly1.e;
                                    Long long0 = axa.b(bat0, dynamicRangeProfiles0);
                                    if(long0 == null) {
                                        java.util.Objects.toString(bat0);
                                        bcs.a("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + bat0);
                                    }
                                    else {
                                        v8 = (long)long0;
                                    }
                                }
                            }
                            axp axp1 = axh1.a;
                            axp1.e(v8);
                            if(this.m.containsKey(bka0)) {
                                axp1.h(((Long)this.m.get(bka0)).longValue());
                            }
                            axh0 = axh1;
                        }
                        else {
                            map1 = map0;
                            s1 = s;
                        }
                        arrayList1.add(axh0);
                        map0 = map1;
                        s = s1;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for(Object object8: arrayList1) {
                        axh axh2 = (axh)object8;
                        if(!arrayList2.contains(axh2.a())) {
                            arrayList2.add(axh2.a());
                            arrayList3.add(axh2);
                        }
                    }
                    this.i.e = avu0;
                    Executor executor0 = this.i.c;
                    avo avo0 = new avo(this.i);
                    axr axr0 = new axr(bmb0.h, arrayList3, executor0, avo0);
                    if(bmb0.b() == 5) {
                        InputConfiguration inputConfiguration0 = bmb0.i;
                        if(inputConfiguration0 != null) {
                            axg axg0 = new axg(new axf(inputConfiguration0));
                            axr0.a.a.setInputConfiguration(axg0.a.a);
                        }
                    }
                    try {
                        bjo bjo0 = bjm1.b();
                        ayr ayr0 = this.r;
                        if(cameraDevice0 == null) {
                            captureRequest0 = null;
                        }
                        else {
                            bcs.h("Camera2CaptureRequestBuilder");
                            CaptureRequest.Builder captureRequest$Builder0 = cameraDevice0.createCaptureRequest(bjo0.f);
                            asg.e(captureRequest$Builder0, bjo0.f, ayr0);
                            asg.c(bjo0, captureRequest$Builder0);
                            asg.d(captureRequest$Builder0, bjo0.e);
                            captureRequest0 = captureRequest$Builder0.build();
                        }
                        if(captureRequest0 != null) {
                            aze aze0 = this.t;
                            if(aze0 != null) {
                                aze0.a();
                            }
                            axr0.a.a.setSessionParameters(captureRequest0);
                        }
                    }
                    catch(CameraAccessException cameraAccessException0) {
                        __monitor_exit(object0);
                        return new bpu(cameraAccessException0);
                    }
                    avp avp0 = this.i;
                    List list4 = this.d;
                    Object object9 = ((avs)avp0).l;
                    synchronized(object9) {
                        List list5 = ((avs)avp0).b.a();
                        ArrayList arrayList4 = new ArrayList();
                        for(Object object10: list5) {
                            arrayList4.add(((avp)object10).k());
                        }
                        ((avs)avp0).n = bpt.e(arrayList4);
                        gmcd0 = bpt.d(bpt.g(bpf.a(((avs)avp0).n), new avr(((avs)avp0), cameraDevice0, axr0, list4), avp0.c));
                    }
                    FIN.finallyExec$NT(v);
                    return gmcd0;
                }
                case 2: 
                case 7: {
                    break;
                }
                default: {
                    FIN.finallyCodeBegin$NT(v);
                    return new bpu(new CancellationException(aox.f(this, "openCaptureSession() not execute in state: ")));
                }
            }
        }
        FIN.finallyExec$NT(v);
        return new bpu(new IllegalStateException(aox.f(this, "openCaptureSession() should not be possible in state: ")));
    }

    @Override  // atl
    public final List c() {
        synchronized(this.a) {
        }
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override  // atl
    public final void d() {
        ArrayList arrayList0;
        synchronized(this.a) {
            List list0 = this.b;
            if(list0.isEmpty()) {
                arrayList0 = null;
            }
            else {
                arrayList0 = new ArrayList(list0);
                list0.clear();
            }
        }
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                bjo bjo0 = (bjo)arrayList0.get(v2);
                for(Object object1: bjo0.h) {
                    ((bhl)object1).a(bjo0.a());
                }
            }
        }
    }

    @Override  // atl
    public final void e() {
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = this.h - 1;
        if(this.h != 0) {
            switch(v1) {
                case 0: {
                    throw new IllegalStateException(aox.f(this, "close() should not be possible in state: "));
                }
                case 2: {
                    this.l(2);
                    break;
                }
                case 3: {
                    kay.j(this.i, aox.f(this, "The Opener shouldn\'t null in state:"));
                    this.i.t();
                    this.l(2);
                    break;
                }
                case 6: 
                case 7: {
                    kay.j(this.i, aox.f(this, "The Opener shouldn\'t null in state:"));
                    this.i.t();
                    this.l(6);
                    this.p.c();
                    this.c = null;
                }
            }
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw null;
    }

    final void f() {
        if(this.h == 2) {
            bcs.h("CaptureSession");
            return;
        }
        this.l(2);
        this.j = null;
        jqt jqt0 = this.f;
        if(jqt0 != null) {
            jqt0.b(null);
            this.f = null;
        }
    }

    @Override  // atl
    public final void g(List list0) {
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = this.h - 1;
        if(this.h != 0) {
            switch(v1) {
                case 0: {
                    throw new IllegalStateException(aox.f(this, "issueCaptureRequests() should not be possible in state: "));
                }
                case 1: 
                case 4: 
                case 5: {
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
                case 2: 
                case 3: 
                case 6: {
                    this.b.addAll(list0);
                    break;
                }
                case 7: {
                    this.b.addAll(list0);
                    this.h();
                }
            }
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw null;
    }

    final void h() {
        this.p.b().hB(new atf(this), bol.a());
    }

    @Override  // atl
    public final void i(bmb bmb0) {
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = this.h - 1;
        if(this.h != 0) {
            switch(v1) {
                case 0: {
                    throw new IllegalStateException(aox.f(this, "setSessionConfig() should not be possible in state: "));
                }
                case 1: 
                case 4: 
                case 5: {
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
                case 2: 
                case 3: 
                case 6: {
                    this.c = bmb0;
                    break;
                }
                case 7: {
                    this.c = bmb0;
                    if(bmb0 == null) {
                        FIN.finallyCodeBegin$NT(v);
                        return;
                    }
                    if(!this.l.keySet().containsAll(bmb0.g())) {
                        bcs.a("CaptureSession", "Does not have the proper configured lists");
                        FIN.finallyExec$NT(v);
                        return;
                    }
                    bcs.h("CaptureSession");
                    this.o(this.c);
                }
            }
            FIN.finallyExec$NT(v);
            return;
        }
        throw null;
    }

    @Override  // atl
    public final void j(Map map0) {
        synchronized(this.a) {
            this.m = map0;
        }
    }

    @Override  // atl
    public final boolean k() {
        boolean z = true;
        synchronized(this.a) {
            if(this.h != 7 && this.h != 8) {
                z = false;
            }
        }
        return z;
    }

    public final void l(int v) {
        int v1 = this.g - 1;
        if(this.g == 0) {
            throw null;
        }
        if(v - 1 > v1) {
            this.g = v;
        }
        this.h = v;
        if(Trace.isEnabled()) {
            int v2 = this.g - 1;
            if(this.g == 0) {
                throw null;
            }
            if(v2 >= 3) {
                oyn.c(("CX:C2State[" + String.format("CaptureSession@%x", this.hashCode()) + "]"), v - 1);
            }
        }
    }

    @Override  // atl
    public final gmcd m(bmb bmb0, CameraDevice cameraDevice0, avp avp0) {
        gmcd gmcd0;
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = this.h - 1;
        if(this.h != 0) {
            if(v1 != 2) {
                bcs.a("CaptureSession", aox.f(this, "Open not allowed in state: "));
                FIN.finallyExec$NT(v);
                return new bpu(new IllegalStateException(aox.f(this, "open() should not allow the state: ")));
            }
            this.l(4);
            ArrayList arrayList0 = new ArrayList(bmb0.g());
            this.d = arrayList0;
            this.i = avp0;
            Object object1 = ((avs)avp0).l;
            __monitor_enter(object1);
            int v2 = FIN.finallyOpen$NT();
            ((avs)avp0).m = arrayList0;
            Object object2 = avp0.a;
            __monitor_enter(object2);
            int v3 = FIN.finallyOpen$NT();
            if(avp0.k) {
                gmcd0 = new bpu(new CancellationException("Opener is disabled"));
            }
            else {
                avp0.i = bpt.g(bpf.a(bke.c(arrayList0, avp0.c, avp0.d)), new avm(avp0, arrayList0), avp0.c);
                gmcd0 = bpt.d(avp0.i);
            }
            FIN.finallyCodeBegin$NT(v3);
            __monitor_exit(object2);
            FIN.finallyCodeEnd$NT(v3);
            FIN.finallyCodeBegin$NT(v2);
            __monitor_exit(object1);
            FIN.finallyCodeEnd$NT(v2);
            gmcd gmcd1 = bpt.g(bpf.a(gmcd0), (List list0) -> {
                gmcd gmcd0;
                CaptureRequest captureRequest0;
                String s1;
                Map map1;
                bjm bjm1;
                ant ant1;
                CameraCaptureSession.StateCallback cameraCaptureSession$StateCallback0;
                Object object0 = this.a;
                __monitor_enter(object0);
                int v = FIN.finallyOpen$NT();
                int v1 = this.h - 1;
                if(this.h == 0) {
                    throw null;
                }
                if(v1 != 0) {
                    switch(v1) {
                        case 3: {
                            Map map0 = this.l;
                            map0.clear();
                            for(int v2 = 0; v2 < list0.size(); ++v2) {
                                map0.put(((bka)this.d.get(v2)), ((Surface)list0.get(v2)));
                            }
                            this.l(7);
                            bcs.h("CaptureSession");
                            avh[] arr_avh = {this.k, null};
                            List list1 = bmb0.d;
                            if(list1.isEmpty()) {
                                cameraCaptureSession$StateCallback0 = new ast();
                            }
                            else if(list1.size() == 1) {
                                cameraCaptureSession$StateCallback0 = (CameraCaptureSession.StateCallback)list1.get(0);
                            }
                            else {
                                cameraCaptureSession$StateCallback0 = new ass(list1);
                            }
                            arr_avh[1] = new avt(cameraCaptureSession$StateCallback0);
                            avu avu0 = new avu(Arrays.asList(arr_avh));
                            ant ant0 = new ant(bmb0.d());
                            bjm bjm0 = new bjm(bmb0.g);
                            HashMap hashMap0 = new HashMap();
                            boolean z = this.s;
                            if(z && Build.VERSION.SDK_INT >= 35) {
                                HashMap hashMap1 = new HashMap();
                                for(Object object1: bmb0.a) {
                                    bly bly0 = (bly)object1;
                                }
                                HashMap hashMap2 = new HashMap();
                                for(Object object2: hashMap1.keySet()) {
                                    Integer integer0 = (Integer)object2;
                                    if(((List)hashMap1.get(integer0)).size() >= 2) {
                                        hashMap2.put(integer0, ((List)hashMap1.get(integer0)));
                                    }
                                }
                                HashMap hashMap3 = new HashMap();
                                for(Object object3: hashMap2.keySet()) {
                                    Integer integer1 = (Integer)object3;
                                    ArrayList arrayList0 = new ArrayList();
                                    int v3 = 0;
                                    for(Object object4: ((List)hashMap2.get(integer1))) {
                                        int[] arr_v = SurfaceUtil.nativeGetSurfaceInfo(((Surface)map0.get(((bly)object4).a)));
                                        int v4 = arr_v[0];
                                        int v5 = arr_v[1];
                                        int v6 = arr_v[2];
                                        if(v3 != 0) {
                                            v4 = v3;
                                        }
                                        arrayList0.add(new MultiResolutionStreamInfo(v5, v6, ((String)Objects.requireNonNull(null))));
                                        v3 = v4;
                                        ant0 = ant0;
                                        bjm0 = bjm0;
                                    }
                                    if(v3 != 0 && !arrayList0.isEmpty()) {
                                        List list2 = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList0, v3);
                                        if(list2 != null) {
                                            for(Object object5: ((List)hashMap2.get(integer1))) {
                                                OutputConfiguration outputConfiguration0 = (OutputConfiguration)list2.remove(0);
                                                outputConfiguration0.addSurface(((Surface)map0.get(((bly)object5).a)));
                                                hashMap3.put(((bly)object5), new axh(outputConfiguration0));
                                            }
                                        }
                                    }
                                    else {
                                        bcs.a("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + v3 + ", streamInfos size: " + arrayList0.size());
                                    }
                                    ant0 = ant0;
                                    bjm0 = bjm0;
                                }
                                ant1 = ant0;
                                bjm1 = bjm0;
                                hashMap0 = hashMap3;
                            }
                            else {
                                ant1 = ant0;
                                bjm1 = bjm0;
                            }
                            ArrayList arrayList1 = new ArrayList();
                            String s = ant1.e();
                            for(Object object6: bmb0.a) {
                                bly bly1 = (bly)object6;
                                axh axh0 = !z || Build.VERSION.SDK_INT < 35 ? null : ((axh)hashMap0.get(bly1));
                                if(axh0 == null) {
                                    bka bka0 = bly1.a;
                                    Surface surface0 = (Surface)map0.get(bka0);
                                    kay.j(surface0, "Surface in OutputConfig not found in configuredSurfaceMap.");
                                    axh axh1 = new axh(bly1.d, surface0);
                                    if(s == null) {
                                        axh1.c(null);
                                    }
                                    else {
                                        axh1.c(s);
                                    }
                                    int v7 = bly1.c;
                                    if(v7 == 0) {
                                        axh1.b(1);
                                    }
                                    else if(v7 == 1) {
                                        axh1.b(2);
                                    }
                                    List list3 = bly1.b;
                                    if(!list3.isEmpty()) {
                                        axp axp0 = axh1.a;
                                        axp0.d();
                                        for(Object object7: list3) {
                                            Surface surface1 = (Surface)map0.get(((bka)object7));
                                            kay.j(surface1, "Surface in OutputConfig not found in configuredSurfaceMap.");
                                            axp0.c(surface1);
                                            map0 = map0;
                                            s = s;
                                        }
                                    }
                                    map1 = map0;
                                    s1 = s;
                                    long v8 = 1L;
                                    if(Build.VERSION.SDK_INT >= 33) {
                                        DynamicRangeProfiles dynamicRangeProfiles0 = this.q.a();
                                        if(dynamicRangeProfiles0 != null) {
                                            bat bat0 = bly1.e;
                                            Long long0 = axa.b(bat0, dynamicRangeProfiles0);
                                            if(long0 == null) {
                                                java.util.Objects.toString(bat0);
                                                bcs.a("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + bat0);
                                            }
                                            else {
                                                v8 = (long)long0;
                                            }
                                        }
                                    }
                                    axp axp1 = axh1.a;
                                    axp1.e(v8);
                                    if(this.m.containsKey(bka0)) {
                                        axp1.h(((Long)this.m.get(bka0)).longValue());
                                    }
                                    axh0 = axh1;
                                }
                                else {
                                    map1 = map0;
                                    s1 = s;
                                }
                                arrayList1.add(axh0);
                                map0 = map1;
                                s = s1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            for(Object object8: arrayList1) {
                                axh axh2 = (axh)object8;
                                if(!arrayList2.contains(axh2.a())) {
                                    arrayList2.add(axh2.a());
                                    arrayList3.add(axh2);
                                }
                            }
                            this.i.e = avu0;
                            Executor executor0 = this.i.c;
                            avo avo0 = new avo(this.i);
                            axr axr0 = new axr(bmb0.h, arrayList3, executor0, avo0);
                            if(bmb0.b() == 5) {
                                InputConfiguration inputConfiguration0 = bmb0.i;
                                if(inputConfiguration0 != null) {
                                    axg axg0 = new axg(new axf(inputConfiguration0));
                                    axr0.a.a.setInputConfiguration(axg0.a.a);
                                }
                            }
                            try {
                                bjo bjo0 = bjm1.b();
                                ayr ayr0 = this.r;
                                if(cameraDevice0 == null) {
                                    captureRequest0 = null;
                                }
                                else {
                                    bcs.h("Camera2CaptureRequestBuilder");
                                    CaptureRequest.Builder captureRequest$Builder0 = cameraDevice0.createCaptureRequest(bjo0.f);
                                    asg.e(captureRequest$Builder0, bjo0.f, ayr0);
                                    asg.c(bjo0, captureRequest$Builder0);
                                    asg.d(captureRequest$Builder0, bjo0.e);
                                    captureRequest0 = captureRequest$Builder0.build();
                                }
                                if(captureRequest0 != null) {
                                    aze aze0 = this.t;
                                    if(aze0 != null) {
                                        aze0.a();
                                    }
                                    axr0.a.a.setSessionParameters(captureRequest0);
                                }
                            }
                            catch(CameraAccessException cameraAccessException0) {
                                __monitor_exit(object0);
                                return new bpu(cameraAccessException0);
                            }
                            avp avp0 = this.i;
                            List list4 = this.d;
                            Object object9 = ((avs)avp0).l;
                            synchronized(object9) {
                                List list5 = ((avs)avp0).b.a();
                                ArrayList arrayList4 = new ArrayList();
                                for(Object object10: list5) {
                                    arrayList4.add(((avp)object10).k());
                                }
                                ((avs)avp0).n = bpt.e(arrayList4);
                                gmcd0 = bpt.d(bpt.g(bpf.a(((avs)avp0).n), new avr(((avs)avp0), cameraDevice0, axr0, list4), avp0.c));
                            }
                            FIN.finallyExec$NT(v);
                            return gmcd0;
                        }
                        case 2: 
                        case 7: {
                            break;
                        }
                        default: {
                            FIN.finallyCodeBegin$NT(v);
                            return new bpu(new CancellationException(aox.f(this, "openCaptureSession() not execute in state: ")));
                        }
                    }
                }
                FIN.finallyExec$NT(v);
                return new bpu(new IllegalStateException(aox.f(this, "openCaptureSession() should not be possible in state: ")));
            }, this.i.c);
            bpt.j(gmcd1, new atg(this), this.i.c);
            gmcd gmcd2 = bpt.d(gmcd1);
            FIN.finallyCodeBegin$NT(v);
            return gmcd2;
        }
        throw null;
    }

    final void n(List list0) {
        bka bka0;
        synchronized(this.a) {
            if(this.h != 8) {
                bcs.h("CaptureSession");
                return;
            }
            if(list0.isEmpty()) {
                return;
            }
            try {
                asr asr0 = new asr();
                ArrayList arrayList0 = new ArrayList();
                bcs.h("CaptureSession");
                int v1 = 0;
                Iterator iterator0 = list0.iterator();
            label_17:
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    bjo bjo0 = (bjo)object1;
                    if(!bjo0.e().isEmpty()) {
                        Iterator iterator1 = bjo0.e().iterator();
                        do {
                            if(!iterator1.hasNext()) {
                                v1 |= 1 ^ (bjo0.f == 2 ? 0 : 1);
                                bjm bjm0 = new bjm(bjo0);
                                if(bjo0.f == 5) {
                                    bhv bhv0 = bjo0.k;
                                    if(bhv0 != null) {
                                        bjm0.d = bhv0;
                                    }
                                }
                                bmb bmb0 = this.c;
                                if(bmb0 != null) {
                                    bjm0.f(bmb0.g.e);
                                }
                                bjm0.f(bjo0.e);
                                CaptureRequest captureRequest0 = asg.a(bjm0.b(), this.j.i(), this.l, false, this.r);
                                if(captureRequest0 == null) {
                                    bcs.h("CaptureSession");
                                    return;
                                }
                                ArrayList arrayList1 = new ArrayList();
                                for(Object object2: bjo0.h) {
                                    atb.a(((bhl)object2), arrayList1);
                                }
                                asr0.a(captureRequest0, arrayList1);
                                arrayList0.add(captureRequest0);
                                continue label_17;
                            }
                            Object object3 = iterator1.next();
                            bka0 = (bka)object3;
                        }
                        while(this.l.containsKey(bka0));
                        java.util.Objects.toString(bka0);
                    }
                    bcs.h("CaptureSession");
                }
                if(!arrayList0.isEmpty()) {
                    if(this.n.a && v1 != 0) {
                    alab1:
                        for(Object object4: arrayList0) {
                            switch(((int)(((Integer)((CaptureRequest)object4).get(CaptureRequest.CONTROL_AE_MODE))))) {
                                case 2: 
                                case 3: {
                                    this.j.r();
                                    asr0.b = new atc(this);
                                    break alab1;
                                }
                            }
                        }
                    }
                    if(this.o.a && v1 != 0) {
                        for(Object object5: arrayList0) {
                            Integer integer0 = (Integer)((CaptureRequest)object5).get(CaptureRequest.FLASH_MODE);
                            if(integer0 != null && ((int)integer0) == 2) {
                                List list1 = Collections.singletonList(new ath(this));
                                asr0.a(((CaptureRequest)arrayList0.get(arrayList0.size() - 1)), list1);
                                break;
                            }
                        }
                    }
                    aze aze0 = this.t;
                    if(aze0 != null) {
                        for(Object object6: arrayList0) {
                            CaptureRequest captureRequest1 = (CaptureRequest)object6;
                            aze0.a();
                        }
                    }
                    if(this.c == null || this.c.h != 1) {
                        this.j.u(arrayList0, asr0);
                        return;
                    }
                    asr asr1 = new asr();
                    for(Object object7: arrayList0) {
                        CaptureRequest captureRequest2 = (CaptureRequest)object7;
                        List list2 = ((avp)Objects.requireNonNull(this.j)).l(captureRequest2);
                        for(Object object8: list2) {
                            asr1.a(((CaptureRequest)object8), Collections.singletonList(new auz(captureRequest2, asr0)));
                        }
                        this.j.u(list2, asr1);
                    }
                    return;
                }
                bcs.h("CaptureSession");
            }
            catch(CameraAccessException cameraAccessException0) {
                bcs.a("CaptureSession", "Unable to access camera: " + cameraAccessException0.getMessage());
                Thread.dumpStack();
            }
        }
    }

    final void o(bmb bmb0) {
        Object object2;
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(bmb0 == null) {
            bcs.h("CaptureSession");
            FIN.finallyExec$NT(v);
            return;
        }
        if(this.h != 8) {
            bcs.h("CaptureSession");
            FIN.finallyExec$NT(v);
            return;
        }
        bjo bjo0 = bmb0.g;
        if(bjo0.e().isEmpty()) {
            bcs.h("CaptureSession");
            try {
                this.j.r();
            }
            catch(CameraAccessException cameraAccessException0) {
                bcs.a("CaptureSession", "Unable to access camera: " + cameraAccessException0.getMessage());
                Thread.dumpStack();
            }
            FIN.finallyExec$NT(v);
            return;
        }
        try {
            bcs.h("CaptureSession");
            CaptureRequest captureRequest0 = asg.a(bjo0, this.j.i(), this.l, true, this.r);
            if(captureRequest0 == null) {
                bcs.h("CaptureSession");
                FIN.finallyExec$NT(v);
                return;
            }
            aym aym0 = this.p;
            ArrayList arrayList0 = new ArrayList(bjo0.h.size());
            for(Object object1: bjo0.h) {
                bhl bhl0 = (bhl)object1;
                if(bhl0 == null) {
                    object2 = null;
                }
                else {
                    ArrayList arrayList1 = new ArrayList();
                    atb.a(bhl0, arrayList1);
                    object2 = arrayList1.size() == 1 ? ((CameraCaptureSession.CaptureCallback)arrayList1.get(0)) : new aqk(arrayList1);
                }
                arrayList0.add(object2);
            }
            Collections.addAll(arrayList0, new CameraCaptureSession.CaptureCallback[0]);
            CameraCaptureSession.CaptureCallback cameraCaptureSession$CaptureCallback0 = aym0.a(new aqk(arrayList0));
            aze aze0 = this.t;
            if(aze0 != null) {
                aze0.a();
            }
            if(bmb0.h == 1) {
                List list0 = this.j.l(captureRequest0);
                avp avp0 = this.j;
                kay.j(avp0.f, "Need to call openCaptureSession before using this API.");
                avp0.f.a.a.setRepeatingBurstRequests(list0, avp0.c, cameraCaptureSession$CaptureCallback0);
                FIN.finallyExec$NT(v);
                return;
            }
            avp avp1 = this.j;
            CameraCaptureSession.CaptureCallback cameraCaptureSession$CaptureCallback1 = ((avs)avp1).o.a(cameraCaptureSession$CaptureCallback0);
            kay.j(avp1.f, "Need to call openCaptureSession before using this API.");
            avp1.f.a.a.setSingleRepeatingRequest(captureRequest0, avp1.c, cameraCaptureSession$CaptureCallback1);
            FIN.finallyExec$NT(v);
        }
        catch(CameraAccessException cameraAccessException1) {
            bcs.a("CaptureSession", "Unable to access camera: " + cameraAccessException1.getMessage());
            Thread.dumpStack();
            FIN.finallyCodeBegin$NT(v);
        }
    }

    @Override  // atl
    public final gmcd p() {
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = this.h - 1;
        if(this.h != 0) {
            if(v1 != 0) {
                switch(v1) {
                    case 2: {
                        this.l(2);
                        goto label_22;
                    }
                    case 3: {
                        kay.j(this.i, aox.f(this, "The Opener shouldn\'t null in state:"));
                        this.i.t();
                        this.l(2);
                        goto label_22;
                    }
                    case 4: {
                        break;
                    }
                    case 6: {
                    label_17:
                        this.l(5);
                        this.p.c();
                        kay.j(this.i, aox.f(this, "The Opener shouldn\'t null in state:"));
                        if(this.i.t()) {
                            this.f();
                        label_22:
                            FIN.finallyCodeBegin$NT(v);
                            return bpt.b(null);
                        }
                        break;
                    }
                    case 5: 
                    case 7: {
                        avp avp0 = this.j;
                        if(avp0 != null) {
                            avp0.m();
                        }
                        goto label_17;
                    }
                    default: {
                        goto label_22;
                    }
                }
                if(this.e == null) {
                    this.e = jqy.a(new atd(this));
                }
                FIN.finallyExec$NT(v);
                return this.e;
            }
            throw new IllegalStateException(aox.f(this, "release() should not be possible in state: "));
        }
        throw null;
    }
}

