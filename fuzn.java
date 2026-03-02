import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class fuzn implements fvtn {
    public static final Object a;
    public static fuzn b;
    private static final gged_interceptors c;
    private final gwib d;
    private fuzq e;
    private fuzx f;
    private ActivityTransitionEvent g;
    private final fwyd h;
    private final fvsu i;
    private final fvwz j;
    private boolean k;

    static {
        fuzn.a = new Object();
        fuzn.c = gged_interceptors.m(Integer.valueOf(5), Integer.valueOf(4));
    }

    public fuzn(fwyd fwyd0, fvsu fvsu0, fvwz fvwz0) {
        this.d = new gwib();
        this.k = false;
        this.h = fwyd0;
        this.i = fvsu0;
        this.j = fvwz0;
    }

    @Override  // fvtn
    public final void K(boolean z, int v) {
        boolean z1 = false;
        synchronized(this) {
            if(humv.a.d().P() && v == 1 && z) {
                z1 = true;
            }
            this.k = z1;
        }
    }

    static int a(List list0, int v) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if(((ActivityTransitionEvent)list0.get(v1)).b == v) {
                return v1;
            }
        }
        return -1;
    }

    public static ActivityTransitionEvent b(List list0) {
        if(list0.isEmpty()) {
            return null;
        }
        if(list0.size() == 1) {
            return (ActivityTransitionEvent)list0.get(0);
        }
        for(Object object0: list0) {
            ActivityTransitionEvent activityTransitionEvent0 = (ActivityTransitionEvent)object0;
            if(DetectedActivity.c(activityTransitionEvent0.a)) {
                return activityTransitionEvent0;
            }
        }
        list0.get(0);
        return (ActivityTransitionEvent)list0.get(0);
    }

    final List c(ActivityTransitionEvent activityTransitionEvent0) {
        List list0 = new fuzm();
        if(activityTransitionEvent0 != null) {
            ActivityTransitionEvent activityTransitionEvent1 = this.g;
            if(activityTransitionEvent1 == null) {
                this.g = activityTransitionEvent0;
                list0.add(activityTransitionEvent0);
                return list0;
            }
            if(activityTransitionEvent1.a != activityTransitionEvent0.a) {
                ActivityTransitionEvent activityTransitionEvent2 = fuzn.g(activityTransitionEvent1, activityTransitionEvent0.c);
                this.g = activityTransitionEvent0;
                list0.add(activityTransitionEvent2);
                list0.add(activityTransitionEvent0);
            }
        }
        return list0;
    }

    public static List d(List list0) {
        List list1 = new ArrayList();
        if(!list0.isEmpty()) {
            int v = ((ActivityTransitionEvent)list0.get(list0.size() - 1)).b;
            int v1 = list0.size();
            while(true) {
                --v1;
                if(v1 < 0 || ((ActivityTransitionEvent)list0.get(v1)).b != v) {
                    break;
                }
                list1.add(((ActivityTransitionEvent)list0.get(v1)));
            }
        }
        return list1;
    }

    public final List e(ActivityRecognitionResult activityRecognitionResult0, boolean z, boolean z1) {
        ActivityTransitionEvent activityTransitionEvent1;
        List list3;
        gwhn gwhn0;
        List list0;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        this.i();
        if(this.e == null) {
            this.e = new fuzq((this.g == null ? -1 : this.g.a));
        }
        int v1 = 1;
        if(humv.a.d().N()) {
            fuzp fuzp0 = this.e.d(activityRecognitionResult0, z1, this.k, z);
            if(fuzp0.b == 1) {
                list0 = null;
                goto label_91;
            }
            long v2 = TimeUnit.MILLISECONDS.toNanos(activityRecognitionResult0.c);
            list0 = this.c(new ActivityTransitionEvent(fuzp0.a, 0, v2));
            goto label_91;
        }
        List list1 = activityRecognitionResult0.a;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list1) {
            arrayList0.add(new gwhx(((DetectedActivity)object0).a(), ((DetectedActivity)object0).e));
        }
        gwhz gwhz0 = new gwhz(new gwhy(arrayList0, activityRecognitionResult0.c), null);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(gwhz0);
        gwib gwib0 = this.d;
        boolean z2 = this.k;
        long v3 = SystemClock.elapsedRealtime();
        if(!arrayList1.isEmpty()) {
            if(z) {
                gwib0.a(arrayList1);
                gwhn0 = new gwhn(v3, 6, 100.0f);
                goto label_50;
            }
            if(z2) {
                gwhn0 = new gwhn(v3, 0, 100.0f);
                goto label_50;
            }
            if(!arrayList1.isEmpty()) {
                gwib0.a(arrayList1);
                List list2 = gwib0.b.a(gwib0.a);
                if(list2.isEmpty()) {
                    gwhn0 = null;
                }
                else {
                    Collections.sort(list2, Collections.reverseOrder(new gwia()));
                    gwhn0 = (gwhn)list2.get(0);
                    if(gwhn0.b == 7) {
                        gwhn0 = null;
                    }
                }
                if(gwhn0 == null) {
                    gwhn0 = null;
                }
                else if(z1 && gwhn0.b == 0) {
                    gwhn0 = null;
                }
            label_50:
                if(gwhn0 == null) {
                    list3 = null;
                }
                else {
                    switch(gwhn0.b) {
                        case 0: 
                        case 1: {
                            v1 = 0;
                            break;
                        }
                        case 2: 
                        case 3: {
                            break;
                        }
                        case 4: {
                            v1 = 7;
                            break;
                        }
                        case 5: {
                            v1 = 8;
                            break;
                        }
                        case 6: {
                            v1 = 3;
                            break;
                        }
                        case 7: {
                            v1 = 4;
                            break;
                        }
                        default: {
                            v1 = -1;
                        }
                    }
                    list3 = v1 != -1 && !fuzn.c.contains(Integer.valueOf(v1)) ? this.c(new ActivityTransitionEvent(v1, 0, TimeUnit.MILLISECONDS.toNanos(gwhn0.a))) : null;
                }
                if(list3 == null) {
                    DetectedActivity detectedActivity0 = activityRecognitionResult0.e();
                    int v4 = detectedActivity0.a();
                    int v5 = detectedActivity0.e;
                    if(v4 == 16 || v4 == 17) {
                        v4 = 0;
                    }
                    ActivityTransitionEvent activityTransitionEvent0 = new ActivityTransitionEvent(new DetectedActivity(v4, v5).a(), 0, TimeUnit.MILLISECONDS.toNanos(activityRecognitionResult0.c));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(activityTransitionEvent0);
                    int v6 = arrayList2.size() - 1;
                    while(true) {
                        activityTransitionEvent1 = null;
                        if(v6 >= 0) {
                            ActivityTransitionEvent activityTransitionEvent2 = (ActivityTransitionEvent)arrayList2.get(v6);
                            if(!fuzn.c.contains(Integer.valueOf(activityTransitionEvent2.a))) {
                                activityTransitionEvent1 = activityTransitionEvent2;
                                break;
                            }
                            --v6;
                            continue;
                        }
                        break;
                    }
                    list0 = this.c(activityTransitionEvent1);
                }
                else {
                    list0 = list3;
                }
            label_91:
                if(list0 != null && !list0.isEmpty()) {
                    ActivityTransitionEvent activityTransitionEvent3 = this.g;
                    if(activityTransitionEvent3 != null) {
                        this.j(activityTransitionEvent3.a);
                    }
                    this.h(list0);
                    FIN.finallyCodeBegin$NT(v);
                    return list0;
                }
                FIN.finallyExec$NT(v);
                return null;
            }
            throw new IllegalArgumentException("Need at least 1 observation");
        }
        throw new IllegalArgumentException("Need at least 1 observation");
    }

    public final List f(List list0) {
        List list1;
        List list2;
        synchronized(this) {
            this.i();
            if(this.f == null) {
                this.f = new fuzx();
            }
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(fuzt.a.contains(Integer.valueOf(((ActivityTransitionEvent)object0).a))) {
                    iterator0.remove();
                }
            }
            list1 = Collections.EMPTY_LIST;
            if(!list0.isEmpty()) {
                if(humv.f()) {
                    ActivityTransitionEvent activityTransitionEvent0 = this.g;
                    if(activityTransitionEvent0 != null) {
                        if(list0.isEmpty()) {
                            list2 = list0;
                        }
                        else {
                            list2 = new ArrayList();
                            int v1 = ((ActivityTransitionEvent)list0.get(0)).b;
                            for(Object object1: list0) {
                                if(((ActivityTransitionEvent)object1).b != v1) {
                                    break;
                                }
                                list2.add(((ActivityTransitionEvent)object1));
                            }
                        }
                        ActivityTransitionEvent activityTransitionEvent1 = fuzn.b(list2);
                        if(activityTransitionEvent0.a != activityTransitionEvent1.a) {
                            if(activityTransitionEvent0.b != 1 || activityTransitionEvent1.b != 0) {
                            label_32:
                                ActivityTransitionEvent activityTransitionEvent2 = this.g;
                                ActivityTransitionEvent activityTransitionEvent3 = (ActivityTransitionEvent)list0.get(0);
                                ArrayList arrayList0 = new ArrayList();
                                int v2 = activityTransitionEvent2.a;
                                int v3 = activityTransitionEvent3.a;
                                if(v2 == v3 && activityTransitionEvent3.b == 0) {
                                    int v4 = fuzn.a(list0, 1);
                                    if(v4 != -1) {
                                        arrayList0.addAll(list0.subList(v4, list0.size()));
                                    }
                                }
                                else {
                                    if(v2 != v3 && activityTransitionEvent2.b == 0) {
                                        ActivityTransitionEvent activityTransitionEvent4 = fuzn.g(activityTransitionEvent2, activityTransitionEvent3.c);
                                        arrayList0.add(activityTransitionEvent4);
                                        if(DetectedActivity.c(activityTransitionEvent4.a)) {
                                            arrayList0.add(new ActivityTransitionEvent(0, activityTransitionEvent4.b, activityTransitionEvent4.c));
                                        }
                                    }
                                    int v5 = fuzn.a(list0, 0);
                                    if(v5 != -1) {
                                        arrayList0.addAll(list0.subList(v5, list0.size()));
                                    }
                                }
                                list0 = arrayList0;
                            }
                        }
                        else if(activityTransitionEvent0.b == activityTransitionEvent1.b) {
                            goto label_32;
                        }
                    }
                }
                if(!list0.isEmpty()) {
                    ActivityTransitionEvent activityTransitionEvent5 = (ActivityTransitionEvent)list0.get(list0.size() - 1);
                    if(activityTransitionEvent5.b == 0) {
                        this.g = huml.c() ? fuzn.b(fuzn.d(list0)) : activityTransitionEvent5;
                        this.j(this.g.a);
                    }
                    else {
                        this.g = null;
                    }
                }
                list1 = list0;
            }
            this.h(list1);
        }
        return list1;
    }

    private static ActivityTransitionEvent g(ActivityTransitionEvent activityTransitionEvent0, long v) {
        return activityTransitionEvent0.b == 0 ? new ActivityTransitionEvent(activityTransitionEvent0.a, 1, v) : new ActivityTransitionEvent(activityTransitionEvent0.a, 0, v);
    }

    private final void h(List list0) {
        fvwz fvwz0 = this.j;
        if(fvwz0 != null && list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                fvwz0.i(101, ((ActivityTransitionEvent)object0).a, ((ActivityTransitionEvent)object0).b);
            }
            return;
        }
        if(list0 == null) {
        }
    }

    private final void i() {
        if(this.g == null) {
            SharedPreferences sharedPreferences0 = this.i.a;
            fvst fvst0 = null;
            if(sharedPreferences0 != null) {
                int v = sharedPreferences0.getInt("current_activity_key", -1);
                long v1 = sharedPreferences0.getLong("current_activity_epoch_time_key", -1L);
                if(v != -1 && v1 != -1L) {
                    fvst0 = new fvst(v, v1);
                }
            }
            if(fvst0 != null) {
                long v2 = this.h.c() - fvst0.b;
                long v3 = TimeUnit.MILLISECONDS.toNanos(v2);
                this.g = new ActivityTransitionEvent(fvst0.a, 0, v3);
            }
        }
    }

    private final void j(int v) {
        fvst fvst0 = new fvst(v, this.h.c());
        SharedPreferences sharedPreferences0 = this.i.a;
        if(sharedPreferences0 == null) {
            return;
        }
        gftb.b(fvst0.a >= 0 && fvst0.b > 0L, "Invalid activity and epoch time.");
        sharedPreferences0.edit().putInt("current_activity_key", fvst0.a).putLong("current_activity_epoch_time_key", fvst0.b).apply();
    }
}

