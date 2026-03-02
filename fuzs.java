import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.List;

public final class fuzs implements futm, fuvt, fwyn {
    public static fuzs a;
    public static final ggfp b;
    public final fwyd c;
    public final fuzr d;
    public boolean e;
    public long f;
    public long g;
    public ActivityTransitionRequest h;
    public boolean i;
    public final fwvb j;
    private final futh k;
    private final fuzn l;

    static {
        cmms cmms0 = new cmms();
        cmms0.a = 7;
        cmms0.b(0);
        ActivityTransition activityTransition0 = cmms0.a();
        cmms cmms1 = new cmms();
        cmms1.a = 7;
        cmms1.b(1);
        ActivityTransition activityTransition1 = cmms1.a();
        cmms cmms2 = new cmms();
        cmms2.a = 3;
        cmms2.b(0);
        ActivityTransition activityTransition2 = cmms2.a();
        cmms cmms3 = new cmms();
        cmms3.a = 3;
        cmms3.b(1);
        fuzs.b = ggfp.M(activityTransition0, activityTransition1, activityTransition2, cmms3.a());
    }

    public fuzs(fwyd fwyd0, futh futh0, fwvb fwvb0, fuzr fuzr0, fuzn fuzn0) {
        this.e = false;
        this.f = -1L;
        this.g = humr.c();
        this.i = false;
        this.c = fwyd0;
        this.k = futh0;
        this.j = fwvb0;
        this.d = fuzr0;
        this.l = fuzn0;
    }

    @Override  // fuvt
    public final void L(boolean z, boolean z1) {
        synchronized(this) {
            if(humv.a.d().T() && z && !z1) {
                z = false;
            }
            this.e = z;
            this.f = z ? this.c.c() : -1L;
        }
    }

    @Override  // futm
    public final void a(boolean z) {
        synchronized(this) {
            if(z && this.i && humv.a.d().I()) {
                ActivityRecognitionResult activityRecognitionResult0 = new ActivityRecognitionResult(new DetectedActivity(3, 100), this.c.c(), SystemClock.elapsedRealtime(), 0, null);
                if(this.h == null) {
                    return;
                }
                this.b(activityRecognitionResult0, true);
            }
        }
    }

    public final void b(ActivityRecognitionResult activityRecognitionResult0, boolean z) {
        synchronized(this) {
            if(!this.i) {
                return;
            }
            if(this.h == null) {
                return;
            }
            List list0 = this.l.e(activityRecognitionResult0, z, this.e);
            if(list0 != null && !list0.isEmpty()) {
                List list1 = fuzs.d(list0, this.h.b);
                if(!list1.isEmpty()) {
                    this.k.mO(list1, 2);
                }
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized(this) {
            z = this.g == humr.b();
        }
        return z;
    }

    private static List d(List list0, List list1) {
        List list2 = new ArrayList();
        if(list0 != null && list1 != null) {
            for(Object object0: list0) {
                ActivityTransitionEvent activityTransitionEvent0 = (ActivityTransitionEvent)object0;
                for(Object object1: list1) {
                    ActivityTransition activityTransition0 = (ActivityTransition)object1;
                    if(activityTransitionEvent0.a == activityTransition0.a && activityTransitionEvent0.b == activityTransition0.b) {
                        list2.add(activityTransitionEvent0);
                    }
                }
            }
        }
        return list2;
    }

    @Override  // fwyn
    public final void k(int v) {
    }

    @Override  // fwyn
    public final void l() {
    }

    @Override  // fwyn
    public final void m(List list0, int[] arr_v) {
    }

    @Override  // fwyn
    public final void n(List list0) {
        synchronized(this) {
            if(!this.d.H()) {
                return;
            }
            for(Object object0: list0) {
                fwyq fwyq0 = (fwyq)object0;
                SystemClock.elapsedRealtime();
            }
            if(this.h != null && !list0.isEmpty()) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: list0) {
                    fwyq fwyq1 = (fwyq)object1;
                    try {
                        arrayList0.add(new ActivityTransitionEvent(fwyq1.b, fwyq1.c, fwyq1.a * 1000000L));
                    }
                    catch(Exception unused_ex) {
                    }
                }
                if(!huml.c()) {
                    ggfp ggfp0 = ggfp.K(Integer.valueOf(16), Integer.valueOf(17));
                    gftb.check(ggfp0);
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object2: arrayList0) {
                        ActivityTransitionEvent activityTransitionEvent0 = (ActivityTransitionEvent)object2;
                        if(!ggfp0.contains(Integer.valueOf(activityTransitionEvent0.a))) {
                            arrayList1.add(activityTransitionEvent0);
                        }
                    }
                    arrayList0 = arrayList1;
                }
                List list1 = fuzs.d(this.l.f(arrayList0), this.h.b);
                if(!list1.isEmpty()) {
                    this.k.mO(list1, 1);
                }
            }
        }
    }

    @Override  // fwyn
    public final void o(fwys fwys0) {
    }

    @Override  // fwyn
    public final void p(fwyr fwyr0) {
        if(fwyr0.b == 0) {
            synchronized(this) {
                if(this.e && humy.a.b().H() && fwyr0.a == 0) {
                    return;
                }
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(new ActivityTransitionEvent(20, (fwyr0.a == 0 ? 0 : 1), fwyr0.c * 1000000L));
            this.k.mO(arrayList0, 3);
        }
    }
}

