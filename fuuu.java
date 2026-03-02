import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public final class fuuu implements fuui {
    private int a;
    private int b;
    private final fyaq c;
    private final fuut d;
    private final List e;
    private final List f;
    private int g;

    public fuuu(fyaq fyaq0, fuut fuut0) {
        this.g = 0;
        this.c = fyaq0;
        this.d = fuut0;
        this.a = 3;
        this.b = 5;
        this.e = new ArrayList(2);
        this.f = new ArrayList(5);
    }

    @Override  // fuui
    public final ActivityRecognitionResult a(TreeMap treeMap0, long v, long v1, long v2, Bundle bundle0) {
        return fuuh.a();
    }

    @Override  // fuui
    public final ActivityRecognitionResult b(ActivityRecognitionResult activityRecognitionResult0) {
        ActivityRecognitionResult activityRecognitionResult4;
        ++this.g;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(activityRecognitionResult0.a);
        ActivityRecognitionResult activityRecognitionResult1 = new ActivityRecognitionResult(arrayList0, activityRecognitionResult0.b, activityRecognitionResult0.c, activityRecognitionResult0.d, activityRecognitionResult0.b());
        List list0 = this.f;
        list0.add(activityRecognitionResult1);
        futd futd0 = (futd)this.d;
        ActivityRecognitionResult activityRecognitionResult2 = futd0.o;
        if(activityRecognitionResult2 != null && this.e.isEmpty() && activityRecognitionResult1.e().a() == activityRecognitionResult2.e().a()) {
            int v = activityRecognitionResult1.d().a();
            Integer integer0 = v;
            integer0.getClass();
            if(v == 0) {
                return fuuu.e(list0);
            }
            integer0.getClass();
            if(v == 1) {
                return fuuu.e(list0);
            }
            integer0.getClass();
            if(v == 2) {
                return fuuu.e(list0);
            }
            integer0.getClass();
            if(v == 3) {
                return fuuu.e(list0);
            }
        }
        switch(activityRecognitionResult1.d().a()) {
            case 0: {
                if(futd0.x.a()) {
                    return new ActivityRecognitionResult(activityRecognitionResult1.a, activityRecognitionResult1.b, activityRecognitionResult1.c, activityRecognitionResult1.d, activityRecognitionResult1.b());
                }
            label_24:
                List list1 = this.e;
                int v1 = list1.size();
                do {
                    --v1;
                    if(v1 < 0) {
                        goto label_32;
                    }
                    ActivityRecognitionResult activityRecognitionResult3 = (ActivityRecognitionResult)list1.get(v1);
                }
                while(activityRecognitionResult1.e().a() == activityRecognitionResult3.e().a());
                int v2 = list1.size() - (v1 + 1);
                goto label_33;
            label_32:
                v2 = list1.size();
            label_33:
                if(v2 + 1 >= this.a || this.g + (this.a - (v2 + 1)) > this.b) {
                    activityRecognitionResult4 = fuuu.e(list0);
                    int v3 = activityRecognitionResult4.e().a();
                    if(this.g + (2 - v2) <= 5 && v2 + 1 < 3 && (v3 == 0 || v3 == 1 || v3 == 16 || (v3 == 4 || v3 == 17))) {
                        this.a = 3;
                        this.b = 5;
                        activityRecognitionResult4 = null;
                    }
                }
                else {
                    activityRecognitionResult4 = null;
                }
                if(activityRecognitionResult4 != null) {
                    ActivityRecognitionResult activityRecognitionResult5 = this.c.e(activityRecognitionResult4);
                    return !humr.s() || !((futd)this.c).Z || activityRecognitionResult5.d().a() != 1 ? activityRecognitionResult5 : futd.d(activityRecognitionResult5, fuxl.ak.am);
                }
                if(activityRecognitionResult1.d().a() != 4) {
                    list1.add(activityRecognitionResult0);
                }
                while(list1.size() >= this.a) {
                    list1.remove(0);
                }
                return null;
            }
            case 5: {
                throw new RuntimeException("TILTING is unexpected.");
            }
            default: {
                goto label_24;
            }
        }
    }

    @Override  // fuui
    public final void c() {
        this.e.clear();
        this.f.clear();
        this.g = 0;
        this.a = 3;
        this.b = 5;
    }

    @Override  // fuui
    public final void d() {
    }

    private static final ActivityRecognitionResult e(List list0) {
        ActivityRecognitionResult activityRecognitionResult0 = null;
        for(Object object0: list0) {
            ActivityRecognitionResult activityRecognitionResult1 = (ActivityRecognitionResult)object0;
            if(activityRecognitionResult0 == null || activityRecognitionResult0.b < activityRecognitionResult1.b) {
                activityRecognitionResult0 = activityRecognitionResult1;
            }
        }
        TreeMap treeMap0 = new TreeMap();
        for(Object object1: list0) {
            for(Object object2: ((ActivityRecognitionResult)object1).a) {
                Integer integer0 = (Integer)treeMap0.get(Integer.valueOf(((DetectedActivity)object2).a()));
                if(integer0 == null) {
                    integer0 = (int)0;
                }
                treeMap0.put(Integer.valueOf(((DetectedActivity)object2).a()), Integer.valueOf(((int)integer0) + ((DetectedActivity)object2).e));
            }
        }
        long v = activityRecognitionResult0.b;
        long v1 = activityRecognitionResult0.c;
        int v2 = activityRecognitionResult0.d;
        Bundle bundle0 = activityRecognitionResult0.b();
        return new ActivityRecognitionResult(fust.a(treeMap0, ((double)list0.size()), true), v, v1, v2, bundle0);
    }
}

