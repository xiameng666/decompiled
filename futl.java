import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.location.collectionlib.RealCollectorConfig;
import j..util.Objects;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;

public final class futl implements fxbx {
    public final futd a;
    public final fuvy b;
    public final fuvs c;
    public final fuyw d;
    private final fuzs e;
    private final fuuz f;
    private final fwxz g;
    private final futq h;
    private final fuzu i;
    private final fuzw j;
    private fuuy k;
    private final ConnectivityManager l;
    private final List m;
    private final fwvh n;

    public futl(fyar fyar0, fwze fwze0, fwvc fwvc0, fvsu fvsu0, futh futh0, fwxt fwxt0, fwvn fwvn0, fuyw fuyw0, ConnectivityManager connectivityManager0) {
        fuzs fuzs0;
        fuzn fuzn0;
        futd futd1;
        fuzn fuzn1;
        this.k = null;
        this.m = new ArrayList();
        this.l = connectivityManager0;
        this.d = fuyw0;
        this.b = new fuvy(fwvc0);
        fwxk fwxk0 = fwxk.l(fwvn0.a, fwvn0.k, fwvn0.b);
        if(fwxk0 == null) {
            if(humf.a.b().d()) {
                fwxk0 = new fxae();
            }
            else {
                try {
                    fwxk0 = new fwui(fwvn0.k, fwvn0.b);
                }
                catch(Exception unused_ex) {
                    fwxk0 = new fxae();
                }
            }
        }
        fwxk0.a();
        huou huou0 = huou.a;
        if(huou0.c().s()) {
            futi futi0 = new futi(this, fwxk0);
            this.b.b(futi0);
        }
        if(huou0.c().t()) {
            futj futj0 = new futj(this, fwxk0);
            this.m.add(futj0);
        }
        fxbg fxbg0 = new fxbg(((fwvn)fwxt0).l, ((fwvn)fwxt0).k, ((fwvn)fwxt0).b, 55);
        fxan fxan0 = new fxan();
        fwvq fwvq0 = fwxt0.mX();
        futd futd0 = new futd(futh0, fwxt0, fyar0, ((fwvn)fwze0).e, ((fwvn)fwze0).n, ((fwvn)fwze0).b, ((fwvn)fwze0).h, ((fwvn)fwze0).o, ((fwvn)fwze0).k, fxbg0, fxan0, fwvq0, fwxk0, this.b);
        this.a = futd0;
        fwxk0.c(futd0);
        if(humr.s()) {
            this.m.add(futd0);
        }
        fwyd fwyd0 = ((fwvn)fwze0).e;
        fvwz fvwz0 = ((fwvn)fwze0).b;
        synchronized(fuzn.a) {
            if(fuzn.b == null) {
                fuzn.b = new fuzn(fwyd0, fvsu0, fvwz0);
            }
            fuzn0 = fuzn.b;
        }
        fwyd fwyd1 = ((fwvn)fwze0).e;
        fwvb fwvb0 = new fwvb(((fwvn)fwxt0).a);
        synchronized(fuzs.class) {
            if(fuzs.a == null) {
                fuzn1 = fuzn0;
                futd1 = futd0;
                fuzs.a = new fuzs(fwyd1, futh0, fwvb0, futd0, fuzn0);
            }
            else {
                fuzn1 = fuzn0;
                futd1 = futd0;
            }
            fuzs0 = fuzs.a;
        }
        this.e = fuzs0;
        this.m.add(fuzs0);
        this.b.b(fuzn1);
        futd1.W.add(fuzs0);
        fwxk0.c(fuzs0);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new futk(this));
        fuvs fuvs0 = new fuvs(futh0, ((fwvn)fwze0).e, ((fwvn)fwze0).b, ((fwvn)fwze0).k, futd1, arrayList0);
        this.c = fuvs0;
        this.b.b(fuvs0);
        fuuz fuuz0 = futd1.k;
        this.f = fuuz0;
        fwwy fwwy0 = fwwy.i(fwvn0.a);
        this.g = fwwy0;
        if(fwwy0 == null) {
            this.h = null;
            this.i = null;
            this.j = null;
        }
        else {
            futq futq0 = new futq(((fwvn)fwze0).b);
            this.h = futq0;
            fuzu fuzu0 = new fuzu(futh0, ((fwvn)fwze0).e);
            this.i = fuzu0;
            fwwy0.c(futq0);
            fwwy0.c(fuzu0);
            fuzw fuzw0 = new fuzw(fwwy0, fwze0.w());
            this.j = fuzw0;
            fuzw0.a();
        }
        fwvh fwvh0 = fwvh.f(fwvn0.a, fwvn0.k);
        this.n = fwvh0;
        if(fwvh0 != null) {
            fuuy fuuy0 = new fuuy(((fwvn)fwze0).e, ((fwvn)fwze0).b, futd1, fuuz0);
            this.k = fuuy0;
            fwvh0.e(fuuy0);
            futd1.ac = fwvh0;
        }
    }

    @Override  // fxbx
    public final void A(boolean z, boolean z1) {
    }

    @Override  // fxbx
    public final void B(cjds cjds0) {
    }

    @Override  // fxbx
    public final void C(long[] arr_v, long[] arr_v1, fwpb fwpb0, fwyc fwyc0) {
    }

    @Override  // fxbx
    public final void D(fvtm fvtm0) {
    }

    @Override  // fxbx
    public final void E(Object object0) {
    }

    @Override  // fxbx
    public final void a(boolean z) {
    }

    @Override  // fxbx
    public final void b(fwzf fwzf0) {
        if(fwzf0.ordinal() == 11) {
            fuvs fuvs0 = this.c;
            if(fuvs0 != null && fuvs0.f != -1L) {
                long v = SystemClock.elapsedRealtime() + 4000L;
                long v1 = fuvs0.f;
                if(v < v1) {
                    fuvs0.f = -1L;
                    fuvs0.b(v1);
                }
                else {
                    fuvs0.f = -1L;
                    fuvs0.e.f();
                }
            }
        }
        fwxz fwxz0 = this.g;
        if(fwxz0 != null) {
            fwxz0.d();
        }
        futd futd0 = this.a;
        if(futd0.G() && futd0.I()) {
            futd0.l.Y();
            fwyt fwyt0 = futd0.u;
            if(fwyt0.h()) {
                fwyt0.j();
            }
            futd0.n = null;
            futd0.l.w();
        }
        if(futd0.n != null) {
            long v2 = SystemClock.elapsedRealtime();
            fvsx fvsx0 = futd0.n;
            if(v2 + 4000L >= fvsx0.a) {
                goto label_30;
            }
            if(fwzf0 == fwzf.i) {
                futd0.n = null;
                futd0.v(fvsx0);
                return;
            label_30:
                if(fwzf0 == fwzf.i) {
                    futd0.n = null;
                }
                else {
                    futd0.h();
                }
                fwyt fwyt1 = futd0.u;
                if(fwyt1.h()) {
                    fwyt1.j();
                }
                futd0.l.Y();
                futd0.l.w();
            }
        }
    }

    @Override  // fxbx
    public final void c(int v, int v1, boolean z) {
        fwxz fwxz0 = this.g;
        if(fwxz0 != null) {
            ((fwwy)fwxz0).g(v, v1, z);
        }
    }

    @Override  // fxbx
    public final void d(boolean z, boolean z1, boolean z2, int v, String s) {
        boolean z3 = true;
        if(z) {
            ConnectivityManager connectivityManager0 = this.l;
            if(connectivityManager0 != null) {
                NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(connectivityManager0.getActiveNetwork());
                if(networkCapabilities0 == null || !networkCapabilities0.hasTransport(1) || !networkCapabilities0.hasCapability(11)) {
                    z3 = false;
                }
            }
        }
        for(Object object0: this.m) {
            ((fuvt)object0).L(z, z3);
        }
    }

    @Override  // fxbx
    public final void e(boolean z) {
        this.a.l.a(z);
    }

    @Override  // fxbx
    public final void f(PrintWriter printWriter0) {
        printWriter0.println("####ActivityDetectionScheduler Start");
        futd futd0 = this.a;
        printWriter0.println("os.hasAccelerometer()=" + futd0.g.a());
        printWriter0.println("significantMotionDetector.isSupported()=" + ((fxbg)futd0.s).c);
        printWriter0.println("significantMotionDetector.isEnabled()=" + futd0.s.b());
        printWriter0.println("wristTiltSensor.isSupported()=false");
        printWriter0.println("wristTiltSensor.isEnabled()=false");
        printWriter0.println("wakeUpTiltDetector.isSupported()=" + futd0.af.a);
        printWriter0.println("os.isSensorBatchingSupported(ACCELEROMETER)=" + futd0.g.d(fvns.d));
        Integer integer0 = (Integer)RealCollectorConfig.a.get(fvns.d);
        printWriter0.println("os.getSensorBatchingFifoMaxSize(ACCELEROMETER)=" + (integer0 == null ? 0 : fwvo.f(((fwvo)futd0.g).d, integer0.intValue())));
        printWriter0.println("accelBatchingManager.isEnabled()=" + futd0.m.a);
        printWriter0.println("hardwareArDetector.areAllActivitiesSupported()=" + futd0.u.f());
        printWriter0.println("hardwareArDetector.isEnabled()=" + futd0.u.h());
        printWriter0.println("Current state: " + futd0.l.Y());
        Map map0 = futd0.w;
        for(Object object0: map0.keySet()) {
            printWriter0.printf("Entered %s %d times.\n", new Object[]{((String)object0), map0.get(((String)object0))});
        }
        fuuz fuuz0 = futd0.k;
        if(fuuz0 != null) {
            fuuz0.b(printWriter0, true);
            futd0.k.b(printWriter0, false);
        }
        printWriter0.println("minPeriodMillis: " + futd0.H);
        printWriter0.println("####ActivityDetectionScheduler End");
        fuvs fuvs0 = this.c;
        if(fuvs0 != null) {
            printWriter0.println("####VehicleExitDetectorStats Start");
            fuvq fuvq0 = fuvs0.d;
            long v = SystemClock.elapsedRealtime();
            printWriter0.print("Current state: " + fuvq0.d.e.a() + "\n");
            for(Object object1: fuvq0.a.entrySet()) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(((String)((Map.Entry)object1).getKey()));
                fuvp fuvp0 = (fuvp)((Map.Entry)object1).getValue();
                long v1 = fuvp0.a / 1000L;
                int v2 = fuvp0.b;
                if(((String)((Map.Entry)object1).getKey()).equals(fuvq0.b)) {
                    v1 += (v - fuvq0.c) / 1000L;
                    ++v2;
                }
                stringBuilder0.append(" TimeInState: ");
                stringBuilder0.append(v1);
                stringBuilder0.append("sec StateEnteredCount: ");
                stringBuilder0.append(v2);
                stringBuilder0.append(" Avg: ");
                stringBuilder0.append(v1 / ((long)v2));
                stringBuilder0.append("sec/entry\n");
                printWriter0.print(stringBuilder0.toString());
            }
            printWriter0.println("####VehicleExitDetectorStats End");
        }
        printWriter0.println("ccAvailable=" + (this.g != null && this.g.h()));
        printWriter0.println("sleep chre available: " + (this.n != null && this.n.c()));
    }

    @Override  // fxbx
    public final void g() {
        futd futd0 = this.a;
        fwyt fwyt0 = futd0.u;
        if(fwyt0.h()) {
            fwyt0.j();
            return;
        }
        futd0.t(fvsr.b);
    }

    @Override  // fxbx
    public final void h() {
    }

    @Override  // fxbx
    public final void i() {
        this.d.a();
    }

    @Override  // fxbx
    public final void j() {
    }

    @Override  // fxbx
    public final void k() {
        this.a.l.N();
    }

    @Override  // fxbx
    public final void l(fuxg fuxg0) {
        Bundle bundle0;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: fuxg0.a) {
            arrayList0.add(fuxd.a(((fuxi)object0)));
        }
        long v = fuxg0.b;
        long v1 = fuxg0.c;
        int v2 = fuxg0.d;
        if(fuxg0.f == null && fuxg0.e == -1) {
            bundle0 = null;
        }
        else {
            bundle0 = new Bundle();
            int v4 = fuxg0.e;
            if(v4 != -1) {
                bundle0 = cmmq.d(bundle0, v4);
            }
            fuxf fuxf0 = fuxg0.f;
            if(fuxf0 != null) {
                long v5 = fuxf0.a;
                if(v5 != -1L) {
                    bundle0 = cmmq.b(bundle0, v5);
                }
                fuxe fuxe0 = fuxf0.b;
                if(fuxe0 != null) {
                    fuxe fuxe1 = fuxf0.c;
                    if(fuxe1 != null) {
                        ActivityRecognitionResult[][] arr2_activityRecognitionResult = {fuxb.b(fuxe0), fuxb.b(fuxe1)};
                        bundle0 = cmmq.a(bundle0, new String[]{"test_ar_model_1", "test_ar_model_2"}, arr2_activityRecognitionResult);
                    }
                }
            }
        }
        ActivityRecognitionResult activityRecognitionResult0 = new ActivityRecognitionResult(arrayList0, v, v1, v2, bundle0);
        fuvs fuvs0 = this.c;
        if(fuvs0 != null && activityRecognitionResult0.d().a() != 6) {
            fuvs0.e.b(activityRecognitionResult0);
        }
        fuuz fuuz0 = this.f;
        if(fuuz0 != null && this.a.F()) {
            DetectedActivity detectedActivity0 = activityRecognitionResult0.d();
            int[] arr_v = DetectedActivity.c;
            for(int v3 = 0; v3 < 15; ++v3) {
                if(detectedActivity0.a() == arr_v[v3]) {
                    fuuz0.d(activityRecognitionResult0.b);
                    return;
                }
            }
        }
    }

    @Override  // fxbx
    public final void m(fwzf fwzf0, fvsx fvsx0) {
        futd futd0 = this.a;
        if(fwzf0 == fwzf.a || fwzf0 == fwzf.v) {
            futd0.Q = fvsx0;
        }
        futd0.l.W(fwzf0);
    }

    @Override  // fxbx
    public final void n(boolean z) {
        fuzw fuzw0 = this.j;
        if(fuzw0 == null) {
            return;
        }
        Locale.getDefault();
        fuzw0.b = z;
        fuzw0.a();
    }

    @Override  // fxbx
    public final void o(long v) {
        fuuz fuuz0 = this.f;
        if(fuuz0 != null) {
            long v1 = fuuz0.a.d.c();
            long v2 = fuuz0.b;
            if(v2 > 0L && v2 <= v1) {
                fuuz0.c = v2;
            }
            fuuz0.b = v;
        }
    }

    @Override  // fxbx
    public final void p(long v) {
    }

    @Override  // fxbx
    public final void q(fvuu fvuu0) {
        if(fvuu0 == null) {
            return;
        }
        this.a.l.V(this.a.p, fvuu0);
        this.a.p = fvuu0;
        this.a.q = SystemClock.elapsedRealtime();
    }

    @Override  // fxbx
    public final void r(boolean z) {
        this.a.N = z;
        this.a.A(false, false);
        this.a.l.P();
    }

    @Override  // fxbx
    public final void s(boolean z) {
    }

    @Override  // fxbx
    public final void t(boolean z) {
        this.a.O = z;
        this.a.A(false, false);
        this.a.l.U();
    }

    @Override  // fxbx
    public final void u(int v, Object object0, fwyc fwyc0) {
        boolean z = true;
        if(v == 3) {
            futd futd0 = this.a;
            if(((SleepSegmentRequest)object0) == null) {
                z = false;
            }
            futd0.y = z;
            if(z) {
                futd0.l.x(false);
            }
            fwvh fwvh0 = futd0.ac;
            if(fwvh0 != null) {
                fwvh0.b = futd0.y;
                fwvh0.b();
            }
            if(huwz.a.h().C()) {
                futp futp0 = futd0.J;
                long v2 = futd0.y ? huwz.g() : 0x7FFFFFFFFFFFFFFFL;
                if(!Objects.equals(fwyc0, futp0.b) || v2 != futp0.e) {
                    futp0.b = fwyc0;
                    futp0.e = v2;
                    futp0.a();
                }
            }
        }
        else {
            ActivityTransitionRequest activityTransitionRequest0 = (ActivityTransitionRequest)object0;
            if(!huoo.c()) {
                goto label_31;
            }
            fuzw fuzw0 = this.j;
            fuzu fuzu0 = this.i;
            ArrayList arrayList0 = new ArrayList();
            if(activityTransitionRequest0 != null) {
                for(Object object1: activityTransitionRequest0.b) {
                    ActivityTransition activityTransition0 = (ActivityTransition)object1;
                    if(activityTransition0.a == 22) {
                        arrayList0.add(activityTransition0);
                    }
                }
            }
            if(fuzw0 != null) {
                fuzw0.a = arrayList0;
                fuzw0.a();
            }
            if(fuzu0 != null) {
                fuzu0.c(arrayList0);
            }
            if(!arrayList0.isEmpty()) {
                ArrayList arrayList1 = new ArrayList();
                for(Object object2: activityTransitionRequest0.b) {
                    ActivityTransition activityTransition1 = (ActivityTransition)object2;
                    if(activityTransition1.a != 22) {
                        arrayList1.add(activityTransition1);
                    }
                }
                activityTransitionRequest0 = arrayList1.isEmpty() ? null : new ActivityTransitionRequest(arrayList1, activityTransitionRequest0.c, activityTransitionRequest0.d);
            }
            if(activityTransitionRequest0 != null) {
            label_31:
                fuzs fuzs0 = this.e;
                if(fuzs0 != null) {
                    synchronized(fuzs0) {
                        if(activityTransitionRequest0 != null) {
                            List list0 = activityTransitionRequest0.b;
                            if(!list0.isEmpty()) {
                                fuzr fuzr0 = fuzs0.d;
                                if(fuzr0.H()) {
                                    fuzs0.h = activityTransitionRequest0;
                                    HashMap hashMap0 = new HashMap();
                                    for(Object object3: list0) {
                                        ActivityTransition activityTransition2 = (ActivityTransition)object3;
                                        if(fuzs.b.contains(activityTransition2)) {
                                            hashMap0.put(activityTransition2, Integer.valueOf(((int)huou.a.c().g())));
                                        }
                                        else {
                                            hashMap0.put(activityTransition2, Integer.valueOf(((int)huou.a.c().d())));
                                        }
                                    }
                                    if(humv.f()) {
                                        fuzs0.j.a();
                                        fuzs0.i = false;
                                    }
                                    fuzr0.y(hashMap0);
                                    return;
                                }
                                if(humv.g()) {
                                    fwvb fwvb0 = fuzs0.j;
                                    fuzs0.h = activityTransitionRequest0;
                                    if(!fuzs0.i) {
                                        fwvb0.b(humr.c());
                                        fuzs0.i = true;
                                    }
                                    if(humv.f()) {
                                        fuzr0.y(null);
                                    }
                                }
                                return;
                            }
                        }
                        fuzs0.h = null;
                        fuzr fuzr1 = fuzs0.d;
                        if(fuzr1.H()) {
                            fuzr1.y(null);
                        }
                        if(fuzs0.i) {
                            fuzs0.j.a();
                            fuzs0.i = false;
                        }
                    }
                }
            }
        }
    }

    @Override  // fxbx
    public final void v(fvtz fvtz0, boolean z) {
        this.a.P = fvtz0.a;
    }

    @Override  // fxbx
    public final void w() {
        this.a.l.R();
    }

    @Override  // fxbx
    public final void x() {
        this.a.l.S();
    }

    @Override  // fxbx
    public final void y() {
    }

    @Override  // fxbx
    public final void z(fvvj[] arr_fvvj, boolean z) {
    }
}

