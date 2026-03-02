import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class fwyx implements fvsr, Cloneable {
    public static final int[] c;
    public final fwyd d;
    public final ibmu e;
    public final HashSet f;
    public final TreeMap g;
    public final fwyw h;
    public long i;
    public long j;
    public long k;
    public int l;
    public long m;
    public long n;
    private static final Comparator o;
    private static final List p;
    private final fyaq q;
    private final fuui r;
    private final Class s;
    private final List t;

    static {
        fwyx.o = new fwyv();
        fwyx.p = Collections.singletonList(new DetectedActivity(3, 100));
        fwyx.c = new int[]{0, 1, 3, 4, 7, 8};
    }

    public fwyx(fwyd fwyd0, fyaq fyaq0, fuui fuui0, Class class0, fwyw fwyw0) {
        int v;
        this.e = new ibmb();
        this.f = new HashSet();
        this.g = new TreeMap();
        this.i = -1L;
        this.j = -1L;
        this.k = -1L;
        this.l = fuxl.a.am;
        this.m = -1L;
        this.n = -1L;
        this.d = fwyd0;
        this.q = fyaq0;
        this.r = fuui0;
        this.s = class0;
        this.h = fwyw0;
        String s = fwyw0.a;
        if(s.length() == 0) {
            v = -1;
        }
        else {
            switch(s) {
                case "IN_VEHICLE": {
                    v = 0;
                    break;
                }
                case "ON_BICYCLE": {
                    v = 1;
                    break;
                }
                case "RUNNING": {
                    v = 8;
                    break;
                }
                case "STILL": {
                    v = 3;
                    break;
                }
                case "WALKING": {
                    v = 7;
                    break;
                }
                default: {
                    v = -1;
                }
            }
        }
        this.t = v == -1 ? null : Collections.singletonList(new DetectedActivity(v, 100));
    }

    public fwyx(fwyx fwyx0) {
        ibmb ibmb0 = new ibmb();
        this.e = ibmb0;
        HashSet hashSet0 = new HashSet();
        this.f = hashSet0;
        TreeMap treeMap0 = new TreeMap();
        this.g = treeMap0;
        this.i = -1L;
        this.j = -1L;
        this.k = -1L;
        this.l = fuxl.a.am;
        this.m = -1L;
        this.n = -1L;
        this.d = fwyx0.d;
        ibmb0.G(ibmb0.b, fwyx0.e);
        hashSet0.addAll(fwyx0.f);
        treeMap0.putAll(fwyx0.g);
        this.i = fwyx0.i;
        this.j = fwyx0.j;
        this.k = fwyx0.k;
        this.q = fwyx0.q;
        this.r = fwyx0.r;
        this.s = fwyx0.s;
        this.t = fwyx0.t;
        this.l = fwyx0.l;
        this.m = fwyx0.m;
        this.n = fwyx0.n;
        this.h = fwyx0.h;
    }

    @Override  // fvsr
    public final long a() {
        long v = this.e.isEmpty() ? -1L : Math.max(-1L, this.e.k(((ibmb)this.e).b - 1));
        return this.g.isEmpty() ? v : Math.max(v, ((Long)this.g.lastKey()).longValue());
    }

    @Override  // fvsr
    public final List b(long v, long v1, fvsq fvsq0) {
        long v12;
        long v13;
        int v11;
        gftb.r(Long.compare(this.i, -1L) != 0, "onFlushCompleted must called before getting the results.");
        TreeMap treeMap0 = this.g;
        if(!treeMap0.isEmpty() && this.i - ((long)(((Long)treeMap0.firstKey()))) > 600000L) {
            treeMap0.firstKey();
        }
        if(treeMap0.ceilingEntry(Long.valueOf(1L + v)) == null && this.i - v < 1000L) {
            return Collections.EMPTY_LIST;
        }
        long v2 = Math.min(v1 / 2L, 10000L);
        int v3 = this.h(v, 0);
        long v4 = fxbi.e();
        new Date(v4 + v);
        List list0 = new ArrayList();
        ArrayList arrayList0 = new ArrayList(treeMap0.entrySet());
        long v5 = this.i;
        int v6 = v3;
        int v7 = 0;
        long v8 = v + v1;
        long v9 = v;
        while(v8 <= v5) {
            while(v7 < arrayList0.size()) {
                Map.Entry map$Entry0 = (Map.Entry)arrayList0.get(v7);
                long v10 = (long)(((Long)map$Entry0.getKey()));
                if(v10 > v8) {
                    break;
                }
                if(v10 > v9 + 500L) {
                    v11 = v7;
                    ActivityRecognitionResult activityRecognitionResult0 = this.k(new ActivityRecognitionResult(((List)map$Entry0.getValue()), v4 + v10, v10, this.l, this.j()), fvsq0);
                    v6 = this.i(v4, v6, v10, list0);
                    if(activityRecognitionResult0 != null) {
                        list0.add(activityRecognitionResult0);
                    }
                }
                else {
                    v11 = v7;
                }
                v7 = v11 + 1;
            }
            if(v7 - 1 >= 0 && v7 - 1 < arrayList0.size()) {
                if(list0.isEmpty()) {
                    v12 = v4;
                label_38:
                    if(this.i - v8 > v2) {
                        Map.Entry map$Entry1 = (Map.Entry)arrayList0.get(v7 - 1);
                        List list1 = (List)map$Entry1.getValue();
                        if(list1.isEmpty()) {
                        label_49:
                            v4 = v12;
                            v13 = v8;
                        }
                        else {
                            if(((DetectedActivity)list1.get(0)).a() == 3 && v8 - ((long)(((Long)map$Entry1.getKey()))) > 480000L) {
                                v13 = v8;
                                v4 = v12;
                                goto label_59;
                            }
                            else {
                                v13 = v8;
                                v4 = v12;
                                goto label_51;
                            }
                            goto label_49;
                        }
                    label_51:
                        v6 = this.i(v4, v6, v13, list0);
                        ActivityRecognitionResult activityRecognitionResult1 = this.k(new ActivityRecognitionResult(((List)map$Entry1.getValue()), v4 + v13, v13, this.l, this.j()), fvsq0);
                        if(activityRecognitionResult1 != null) {
                            list0.add(activityRecognitionResult1);
                        }
                        v9 = v13;
                        goto label_59;
                    }
                }
                else {
                    v12 = v4;
                    if(((ActivityRecognitionResult)list0.get(list0.size() - 1)).c != v8) {
                        goto label_38;
                    }
                }
                v4 = v12;
            }
            v13 = v8;
        label_59:
            v8 = v13 + v1;
            v7 = v7;
        }
        ActivityRecognitionResult activityRecognitionResult2 = this.l(fvsq0);
        if(activityRecognitionResult2 != null) {
            this.i(v4, v6, activityRecognitionResult2.c, list0);
            list0.add(activityRecognitionResult2);
        }
        Collections.sort(list0, fwyx.o);
        return list0;
    }

    @Override  // fvsr
    public final List c() {
        return this.d(fvsr.a);
    }

    @Override
    public final Object clone() {
        return new fwyx(this);
    }

    @Override  // fvsr
    public final List d(fvsq fvsq0) {
        ActivityRecognitionResult activityRecognitionResult0;
        int v = 1;
        gftb.r(Long.compare(this.i, -1L) != 0, "onFlushCompleted must called before getting the results.");
        gftb.r(this.i != -1L, "onFlushCompleted must called before getting the results.");
        ibmu ibmu0 = this.e;
        if(ibmu0.isEmpty()) {
            activityRecognitionResult0 = null;
        }
        else {
            long v1 = ibmu0.k(0);
            activityRecognitionResult0 = new ActivityRecognitionResult(new DetectedActivity(5, 100), fxbi.e() + v1, v1, this.l, null);
        }
        ActivityRecognitionResult activityRecognitionResult1 = this.l(fvsq0);
        if(activityRecognitionResult1 == null) {
            v = 0;
        }
        ArrayList arrayList0 = new ArrayList((activityRecognitionResult0 == null ? 0 : 1) + v);
        if(activityRecognitionResult0 != null) {
            arrayList0.add(activityRecognitionResult0);
        }
        if(activityRecognitionResult1 != null) {
            arrayList0.add(activityRecognitionResult1);
        }
        Collections.sort(arrayList0, fwyx.o);
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    @Override  // fvsr
    public final boolean e() {
        return !this.e.isEmpty() || !this.g.isEmpty();
    }

    @Override  // fvsr
    public final List f(long v) {
        return this.b(v, 60000L, fvsr.a);
    }

    public final List g(Collection collection0) {
        Integer integer0;
        List list0 = new ArrayList();
        int[] arr_v = fwyx.c;
        int v = 0;
        int v1 = 0;
        while(v1 < 6) {
            int v2 = arr_v[v1];
            if(!collection0.contains(Integer.valueOf(v2))) {
                if(collection0.isEmpty() && v2 == 4) {
                    v2 = 4;
                }
                else {
                    integer0 = this.h.j;
                    goto label_13;
                }
            }
            integer0 = this.h.i;
        label_13:
            int v3 = (int)integer0;
            list0.add(new DetectedActivity(v2, v3));
            if(v2 == 7 || v2 == 8) {
                v += v3;
            }
            ++v1;
        }
        list0.add(new DetectedActivity(2, v));
        Collections.sort(list0, DetectedActivity.a);
        return list0;
    }

    private final int h(long v, int v1) {
        while(v1 < ((ibmb)this.e).b && this.e.k(v1) <= v) {
            ++v1;
        }
        return v1;
    }

    private final int i(long v, int v1, long v2, List list0) {
        ibmu ibmu0 = this.e;
        if(v1 < ((ibmb)ibmu0).b) {
            long v3 = ibmu0.k(v1);
            if(v3 < v2) {
                list0.add(new ActivityRecognitionResult(new DetectedActivity(5, 100), v + v3, v3, this.l, null));
                return this.h(v2, v1);
            }
        }
        return v1;
    }

    private final Bundle j() {
        return Long.compare(this.n, -1L) == 0 ? null : cmmq.b(null, this.n);
    }

    private final ActivityRecognitionResult k(ActivityRecognitionResult activityRecognitionResult0, fvsq fvsq0) {
        return fvsq0.a(this.q.e(activityRecognitionResult0));
    }

    private final ActivityRecognitionResult l(fvsq fvsq0) {
        ActivityRecognitionResult activityRecognitionResult1;
        Iterator iterator0;
        ActivityRecognitionResult activityRecognitionResult0;
        gftb.r(this.i != -1L, "onFlushCompleted must called before getting the results.");
        TreeMap treeMap0 = this.g;
        if(treeMap0.isEmpty()) {
            return null;
        }
        List list0 = this.t;
        if(list0 != null) {
            return this.k(new ActivityRecognitionResult(list0, this.j, this.i, this.l, null), fvsq0);
        }
        if(this.l >> 16 == 19) {
            long v = SystemClock.elapsedRealtime();
            fwyw fwyw0 = this.h;
            if(v - this.k > fwyw0.c) {
                SystemClock.elapsedRealtime();
                long v1 = this.j;
                long v2 = this.i;
                Bundle bundle0 = this.j();
                return this.k(new ActivityRecognitionResult(fwyx.p, v1, v2, fuxl.aj.am, bundle0), fvsq0);
            }
            if(this.l != fuxl.N.am && this.l != fuxl.P.am) {
                fuui fuui0 = this.r;
                fuui0.c();
                if(this.s == futs.class) {
                    activityRecognitionResult0 = fuui0.a(treeMap0, System.currentTimeMillis(), this.j, this.i, this.j());
                    if(activityRecognitionResult0 == null) {
                        iterator0 = treeMap0.descendingMap().entrySet().iterator();
                        goto label_25;
                    }
                }
                else {
                    iterator0 = treeMap0.descendingMap().entrySet().iterator();
                    while(true) {
                    label_25:
                        if(!iterator0.hasNext()) {
                            goto label_33;
                        }
                        Object object0 = iterator0.next();
                        Map.Entry map$Entry0 = treeMap0.lastEntry();
                        gftb.check(map$Entry0);
                        if(((long)(((Long)map$Entry0.getKey()))) - ((long)(((Long)((Map.Entry)object0).getKey()))) > fwyw0.d) {
                            goto label_33;
                        }
                        activityRecognitionResult1 = fuui0.b(new ActivityRecognitionResult(((List)((Map.Entry)object0).getValue()), this.j, this.i, this.l, this.j()));
                        if(activityRecognitionResult1 == null) {
                            continue;
                        }
                        activityRecognitionResult0 = activityRecognitionResult1;
                        return this.k(activityRecognitionResult0, fvsq0);
                    }
                }
            }
            else {
            label_33:
                Map.Entry map$Entry1 = treeMap0.lastEntry();
                gftb.check(map$Entry1);
                activityRecognitionResult1 = new ActivityRecognitionResult(((List)map$Entry1.getValue()), this.j, this.i, this.l, this.j());
                activityRecognitionResult0 = activityRecognitionResult1;
            }
            return this.k(activityRecognitionResult0, fvsq0);
        }
        Map.Entry map$Entry2 = treeMap0.lastEntry();
        gftb.check(map$Entry2);
        return this.k(new ActivityRecognitionResult(((List)map$Entry2.getValue()), this.j, this.i, this.l, null), fvsq0);
    }
}

