import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import jeb.synthetic.FIN;

public final class aow implements bih {
    private final apx A;
    private final blt B;
    final aou a;
    final Executor b;
    public final aud c;
    public final avy d;
    public final asf e;
    public final avz f;
    public bcc g;
    public volatile boolean h;
    public final aos i;
    final awk j;
    private final Object l;
    private final awp m;
    private final awc n;
    private final aul o;
    private final atu p;
    private final azc q;
    private int r;
    private volatile int s;
    private volatile int t;
    private volatile int u;
    private final axw v;
    private final AtomicLong w;
    private volatile gmcd x;
    private int y;
    private long z;

    public aow(awp awp0, ScheduledExecutorService scheduledExecutorService0, Executor executor0, apx apx0, blp blp0) {
        this.l = new Object();
        blt blt0 = new blt();
        this.B = blt0;
        this.r = 0;
        this.s = 0;
        this.h = false;
        this.u = 2;
        this.w = new AtomicLong(0L);
        this.x = bpt.b(null);
        this.y = 1;
        this.z = 0L;
        aos aos0 = new aos();
        this.i = aos0;
        this.m = awp0;
        this.A = apx0;
        this.b = executor0;
        this.f = new avz(executor0);
        aou aou0 = new aou(executor0);
        this.a = aou0;
        blt0.q(1);
        blt0.j(new ata(aou0));
        blt0.j(aos0);
        this.p = new atu();
        this.c = new aud(this, executor0);
        this.n = new awc(this, awp0);
        this.d = new avy(this, awp0);
        this.t = awp0.a();
        this.o = new aul(this, awp0);
        this.j = new awk(awp0, executor0);
        this.v = new axw(blp0);
        this.q = new azc(this, executor0);
        this.e = new asf(this, awp0, blp0, executor0, scheduledExecutorService0);
    }

    @Override  // bih
    public final void A(blt blt0) {
        awk awk0 = this.j;
        awk0.b();
        if(awk0.c) {
            blt0.q(1);
            return;
        }
        if(awk0.f) {
            blt0.q(1);
            return;
        }
        awp awp0 = awk0.a;
        Map map0 = awk.d(awp0);
        if(awk0.e && !map0.isEmpty() && map0.containsKey(Integer.valueOf(34))) {
            StreamConfigurationMap streamConfigurationMap0 = (StreamConfigurationMap)awp0.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if(streamConfigurationMap0 != null) {
                int[] arr_v = streamConfigurationMap0.getValidOutputFormatsForInput(34);
                if(arr_v != null) {
                    for(int v = 0; v < arr_v.length; ++v) {
                        if(arr_v[v] == 0x100) {
                            Size size0 = (Size)map0.get(Integer.valueOf(34));
                            bcw bcw0 = new bcw(size0.getWidth(), size0.getHeight(), 34, 9);
                            bdm bdm0 = new bdm(bcw0);
                            bkr bkr0 = new bkr(((Surface)Objects.requireNonNull(bdm0.e())), new Size(bdm0.d(), bdm0.a()), 34);
                            awj awj0 = new awj(awk0.b);
                            awk0.g = bdm0;
                            awk0.h = bkr0;
                            awk0.i = awj0;
                            bdm0.j(new awe(awk0), bov.a());
                            bkr0.c().hB(new awf(bdm0, awj0), awk0.b);
                            blt0.l(bkr0);
                            blt0.f(bcw0.b);
                            blt0.k(new awh(awj0));
                            blt0.g = new InputConfiguration(bdm0.d(), bdm0.a(), bdm0.b());
                            return;
                        }
                    }
                }
            }
        }
        blt0.q(1);
    }

    @Override  // bih
    public final gmcd B(int v) {
        if(!this.C()) {
            bcs.d("Camera2CameraControlImp", "Camera is not active.");
            return new bpu(new azq("Camera is not active."));
        }
        int v1 = this.u;
        return bpt.g(bpf.a(bpt.d(this.x)), new aol(this, v, v1), this.b);
    }

    private final boolean C() {
        synchronized(this.l) {
        }
        return this.r > 0;
    }

    private static boolean D(int v, int[] arr_v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return true;
            }
        }
        return false;
    }

    final int a(int v) {
        return aow.b(this.m, v);
    }

    public static int b(awp awp0, int v) {
        int[] arr_v = (int[])awp0.c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if(arr_v == null) {
            return 0;
        }
        if(aow.D(v, arr_v)) {
            return v;
        }
        return aow.D(1, arr_v) ? 1 : 0;
    }

    final long c() {
        this.z = this.w.getAndIncrement();
        this.A.a.C();
        return this.z;
    }

    @Override  // bih
    public final bjt d() {
        synchronized(this.q.d) {
        }
        return this.q.e.a();
    }

    public final bmb e() {
        this.B.q(this.y);
        ans ans0 = new ans();
        int v = 1;
        bjs bjs0 = bjs.c;
        ans0.e(CaptureRequest.CONTROL_MODE, Integer.valueOf(1), bjs0);
        aud aud0 = this.c;
        int v1 = 4;
        int v2 = 3;
        int v3 = aud0.f == 3 ? 3 : 4;
        CaptureRequest.Key captureRequest$Key0 = CaptureRequest.CONTROL_AF_MODE;
        int[] arr_v = (int[])aud0.b.m.c(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if(arr_v == null) {
            v1 = 0;
        }
        else if(aow.D(v3, arr_v)) {
            v1 = v3;
        }
        else if(!aow.D(4, arr_v)) {
            v1 = aow.D(1, arr_v) ? 1 : 0;
        }
        ans0.e(captureRequest$Key0, Integer.valueOf(v1), bjs0);
        this.n.d.c(ans0);
        int v4 = aud0.k ? 5 : 1;
        if(this.z()) {
            ans0.e(CaptureRequest.FLASH_MODE, Integer.valueOf(2), bjs0);
            if(Build.VERSION.SDK_INT >= 35) {
                switch(this.s) {
                    case 1: {
                        ans0.e(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.t), bjs0);
                        break;
                    }
                    case 2: {
                        ans0.e(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.m.a()), bjs0);
                    }
                }
            }
            v2 = v4;
        }
        else {
            switch(this.u) {
                case 0: {
                    v2 = !this.v.a && !this.v.b ? 2 : 1;
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    v2 = 1;
                    break;
                }
                default: {
                    v2 = v4;
                }
            }
        }
        ans0.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.a(v2)), bjs0);
        CaptureRequest.Key captureRequest$Key1 = CaptureRequest.CONTROL_AWB_MODE;
        int[] arr_v1 = (int[])this.m.c(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if(arr_v1 == null) {
            v = 0;
        }
        else if(!aow.D(1, arr_v1) && !aow.D(1, arr_v1)) {
            v = 0;
        }
        ans0.e(captureRequest$Key1, Integer.valueOf(v), bjs0);
        ans0.e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(0), bjs.c);
        synchronized(this.q.d) {
            ans0.c(this.q.e.a, bjs.a);
        }
        ant ant0 = ans0.a();
        this.B.o(ant0);
        this.B.b.h("CameraControlSessionUpdateId", Long.valueOf(this.z));
        return this.B.a();
    }

    @Override  // bih
    public final gmcd f(List list0, int v, int v1) {
        if(!this.C()) {
            bcs.d("Camera2CameraControlImp", "Camera is not active.");
            return new bpu(new azq("Camera is not active."));
        }
        int v2 = this.u;
        return bpt.g(bpf.a(bpt.d(this.x)), new aoi(this, list0, v, v2, v1), this.b);
    }

    public final gmcd g() {
        return bpt.d(jqy.a(new aoo(this)));
    }

    final void h(aov aov0) {
        this.a.a.add(aov0);
    }

    @Override  // bih
    public final void i(bjt bjt0) {
        azi azi0 = azh.a(bjt0).b();
        synchronized(this.q.d) {
            this.q.e.b(azi0);
        }
        bpt.d(jqy.a(new ayx(this.q))).hB(new aok(), bol.a());
    }

    final void j(Executor executor0, bhl bhl0) {
        aoj aoj0 = new aoj(this, executor0, bhl0);
        this.b.execute(aoj0);
    }

    @Override  // bih
    public final void k() {
        synchronized(this.q.d) {
            this.q.e = new ans();
        }
        bpt.d(jqy.a(new aza(this.q))).hB(new aof(), bol.a());
    }

    @Override  // bih
    public final void l() {
        this.j.b();
    }

    final void m() {
        Object object0 = this.l;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = this.r;
        if(v1 != 0) {
            this.r = v1 - 1;
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
    }

    final void n(int v) {
        this.s = v;
        if(v == 0) {
            bjm bjm0 = new bjm();
            bjm0.b = this.y;
            bjm0.m();
            ans ans0 = new ans();
            ans0.d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.a(1)));
            ans0.d(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
            bjm0.f(ans0.a());
            this.x(Collections.singletonList(bjm0.b()));
        }
        this.c();
    }

    final void o() {
        synchronized(this.l) {
            ++this.r;
        }
    }

    final void p(aov aov0) {
        this.a.a.remove(aov0);
    }

    final void q(boolean z) {
        beo beo0;
        bcs.h("Camera2CameraControlImp");
        aud aud0 = this.c;
        if(z != aud0.d) {
            aud0.d = z;
            if(!aud0.d) {
                aud0.b.p(null);
                aud0.b.p(null);
                aud0.h = aud.a;
                aud0.i = aud.a;
                aud0.j = aud.a;
                aud0.b.c();
            }
        }
        awc awc0 = this.n;
        if(awc0.e != z) {
            awc0.e = z;
            if(!z) {
                synchronized(awc0.b) {
                    awc0.b.a();
                    beo0 = bqk.a(awc0.b);
                }
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    awc0.c.l(beo0);
                }
                else {
                    awc0.c.ii(beo0);
                }
                awc0.d.d();
                awc0.a.c();
            }
        }
        aul aul0 = this.o;
        if(aul0.c != z) {
            aul0.c = z;
        }
        avy avy0 = this.d;
        if(avy0.c != z) {
            avy0.c = z;
            if(!z) {
                if(avy0.f) {
                    avy0.f = false;
                    avy0.a.n(0);
                    avy0.b(0);
                    avy.c(avy0.b, Integer.valueOf(avy0.d));
                }
                jqt jqt0 = avy0.e;
                if(jqt0 != null) {
                    jqt0.c(new azq("Camera is not active."));
                    avy0.e = null;
                }
            }
        }
        atu atu0 = this.p;
        if(z != atu0.b) {
            atu0.b = z;
        }
        ayz ayz0 = new ayz(this.q, z);
        this.q.c.execute(ayz0);
        if(!z) {
            this.g = null;
            this.f.a.set(0);
            bcs.h("VideoUsageControl");
        }
    }

    @Override  // bih
    public final void r(int v) {
        if(!this.C()) {
            bcs.d("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.u = v;
        bcs.h("Camera2CameraControlImp");
        this.j.d = this.u == 0 || this.u == 1;
        this.x = this.g();
    }

    public final void s(boolean z) {
        synchronized(this.o.a) {
            this.o.b = z;
            if(!z) {
            }
        }
    }

    public final void t(Rational rational0) {
        this.c.e = rational0;
    }

    @Override  // bih
    public final void u(bcc bcc0) {
        this.g = bcc0;
    }

    final void v(int v) {
        this.y = v;
        this.c.f = v;
        this.e.b = this.y;
    }

    public final void w(boolean z) {
        awk awk0 = this.j;
        if(awk0.c != z && z) {
            awk0.c();
        }
        awk0.c = z;
    }

    final void x(List list0) {
        aqi aqi0;
        kay.i(list0);
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            aqi0 = this.A.a;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            bjo bjo0 = (bjo)object0;
            bjm bjm0 = new bjm(bjo0);
            if(bjo0.f == 5) {
                bhv bhv0 = bjo0.k;
                if(bhv0 != null) {
                    bjm0.d = bhv0;
                }
            }
            if(bjo0.e().isEmpty() && bjo0.i) {
                Set set0 = bjm0.a;
                if(set0.isEmpty()) {
                    bmv bmv0 = new bmv();
                    for(Object object1: DesugarCollections.unmodifiableCollection(aqi0.a.e(bmv0))) {
                        bjo bjo1 = ((bmb)object1).g;
                        List list1 = bjo1.e();
                        if(!list1.isEmpty()) {
                            if(bjo1.b() != 0) {
                                bjm0.k(bjo1.b());
                            }
                            if(bjo1.c() != 0) {
                                bjm0.l(bjo1.c());
                            }
                            for(Object object2: list1) {
                                bjm0.g(((bka)object2));
                            }
                        }
                    }
                    if(set0.isEmpty()) {
                        bcs.d("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                        continue;
                    }
                }
                else {
                    bcs.d("Camera2CameraImpl", "The capture config builder already has surface inside.");
                    continue;
                }
            }
            arrayList0.add(bjm0.b());
        }
        aqi0.O();
        aqi0.k.g(arrayList0);
    }

    static boolean y(TotalCaptureResult totalCaptureResult0, long v) {
        if(totalCaptureResult0.getRequest() == null) {
            return false;
        }
        Object object0 = totalCaptureResult0.getRequest().getTag();
        if((object0 instanceof bms)) {
            Long long0 = (Long)((bms)object0).a("CameraControlSessionUpdateId");
            return long0 == null ? false : ((long)long0) >= v;
        }
        return false;
    }

    final boolean z() {
        return this.s != 0;
    }
}

