import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class futz extends fusr {
    public final fuwt d;
    public final fuwt e;
    private final int f;
    private final int g;
    private final fuui h;
    private final fuvw i;
    private final fvwz j;

    public futz(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1, Class class0, ByteBuffer byteBuffer2, fuui fuui0, fuzc fuzc0, fuvw fuvw0, fvwz fvwz0) {
        super(3200000000L);
        ByteBuffer byteBuffer3;
        fuwt fuwt0;
        Class class1;
        if(byteBuffer0 == null) {
            class1 = class0;
            fuwt0 = null;
        }
        else {
            class1 = class0;
            fuwt0 = new fuwt(byteBuffer0, byteBuffer1, this.b, class1, fuzc0);
        }
        byteBuffer3 = byteBuffer1;
        boolean z = class1 == fuwk.class;
        this.d = fuwt0;
        this.f = z ? fuxl.m.am : fuxl.i.am;
        this.h = fuui0;
        this.i = fuvw0;
        this.j = fvwz0;
        if(byteBuffer2 != null) {
            if(z) {
                this.e = new fuwt(byteBuffer2, byteBuffer3, this.b, fuwq.class, fuzc0);
                this.g = fuxl.i.am;
                return;
            }
            this.e = new fuwt(byteBuffer2, null, this.b, fuwk.class, fuzc0);
            this.g = fuxl.m.am;
            return;
        }
        this.e = null;
        this.g = -1;
    }

    @Override  // fusr
    public final fvuv b(long v, long v1, fvsf fvsf0) {
        long v9;
        ActivityRecognitionResult activityRecognitionResult2;
        boolean z2;
        boolean z1;
        int v7;
        fuwt fuwt0 = this.d;
        if(fuwt0 == null) {
            return new fvuv(fusv.b("simpleActivityDetector wasn\'t loaded properly"), null, Collections.EMPTY_LIST);
        }
        ArrayList arrayList0 = new ArrayList();
        int v2 = fvsf0.c;
        boolean z = hupk.g();
        int v3 = v2 - 1;
        long v4 = fvsf0.d(v3) - fvsf0.d(0);
        long v5 = this.a;
        if(v4 / v5 >= hupk.a.d().b()) {
            this.h.d();
        }
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while(true) {
            int v6 = fusr.a(fvsf0, v3, v5);
            if(v6 == -1) {
                v7 = v2;
                z1 = z;
                break;
            }
            fvsf fvsf1 = fvsf0.e(v6, v3 + 1 - v6);
            int v8 = fvsf1.c;
            if(v8 < 4) {
                v3 = v6;
                continue;
            }
            fvsf1.d(0);
            fvsf1.d(v8 - 1);
            List list0 = fuwt0.a(fvsf1);
            fuwi fuwi0 = (fuwi)list0.get(0);
            if(((fuwi)list0.get(0)).a == fuwh.c) {
                fuwi fuwi1 = (fuwi)list0.get(1);
            }
            ActivityRecognitionResult activityRecognitionResult0 = new ActivityRecognitionResult(futz.c(list0), v, v1, this.f, null);
            ActivityRecognitionResult activityRecognitionResult1 = this.e == null ? null : new ActivityRecognitionResult(futz.c(this.e.a(fvsf1)), v, v1, this.g, null);
            fuvw fuvw0 = this.i;
            if(fuvw0.a()) {
                if(activityRecognitionResult0.a(2) >= 80 || activityRecognitionResult0.a(7) >= 80 || activityRecognitionResult0.a(8) >= 80) {
                    switch(activityRecognitionResult0.d().a()) {
                        case 1: 
                        case 4: {
                            z2 = true;
                            goto label_39;
                        }
                        default: {
                            if(activityRecognitionResult0.e().a() == 17) {
                                z2 = true;
                                goto label_39;
                            }
                        }
                    }
                }
                else {
                    z2 = true;
                    goto label_39;
                }
            }
            z2 = false;
        label_39:
            if(activityRecognitionResult0.d().a() != 0 && activityRecognitionResult0.a(0) < 50) {
                if(z2) {
                    ++fuvw0.d;
                    goto label_50;
                }
                else {
                    goto label_45;
                }
                goto label_43;
            }
            else {
            label_43:
                ++fuvw0.e;
                if(!z2) {
                label_45:
                    v7 = v2;
                    z1 = z;
                    activityRecognitionResult2 = activityRecognitionResult0;
                    v9 = v5;
                    goto label_102;
                }
            }
        label_50:
            ++fuvw0.c;
            ArrayList arrayList3 = new ArrayList();
            int v10 = fuxl.a(activityRecognitionResult0.d).am;
            int v11 = v10 < fuxl.f.am || v10 >= fuxl.n.am ? 0 : 1;
            int v12 = Math.min(100, activityRecognitionResult0.a((1 == v11 ? 16 : 0)) + 51);
            if(v11 == 0) {
                z1 = z;
            }
            else {
                z1 = z;
                arrayList3.add(new DetectedActivity(16, v12));
            }
            arrayList3.add(new DetectedActivity(0, v12));
            if(hupk.i() || hupk.h()) {
                arrayList3.add(new DetectedActivity(19, v12));
            }
            if(hupk.h()) {
                arrayList3.add(new DetectedActivity(20, v12));
            }
            int v13 = activityRecognitionResult0.a(3);
            v9 = v5;
            if(v13 > 0) {
                arrayList3.add(new DetectedActivity(3, v13));
            }
            List list1 = activityRecognitionResult0.a;
            if(list1 == null) {
                v7 = v2;
            }
            else {
                int v14 = 0;
                Iterator iterator0 = list1.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    DetectedActivity detectedActivity0 = (DetectedActivity)object0;
                    if(fuvw.a.contains(Integer.valueOf(detectedActivity0.a()))) {
                        v14 += detectedActivity0.e;
                    }
                    iterator0 = iterator0;
                    v2 = v2;
                }
                v7 = v2;
                int v15 = 100 - Math.max(v13, v12);
                for(Iterator iterator1 = activityRecognitionResult0.a.iterator(); iterator1.hasNext(); iterator1 = iterator1) {
                    Object object1 = iterator1.next();
                    DetectedActivity detectedActivity1 = (DetectedActivity)object1;
                    int v16 = detectedActivity1.a();
                    if(!fuvw.a.contains(Integer.valueOf(v16))) {
                        switch(v16) {
                            case 0: 
                            case 3: 
                            case 16: 
                            case 18: 
                            case 19: 
                            case 20: 
                            case 21: {
                                break;
                            }
                            default: {
                                arrayList3.add(new DetectedActivity(v16, detectedActivity1.e));
                            }
                        }
                    }
                    else if(v14 > 0) {
                        int v17 = Math.round(((float)detectedActivity1.e) * ((float)v15) / ((float)v14));
                        if(v17 > 0) {
                            arrayList3.add(new DetectedActivity(v16, v17));
                        }
                    }
                }
            }
            Collections.sort(arrayList3, DetectedActivity.a);
            activityRecognitionResult2 = new ActivityRecognitionResult(arrayList3, activityRecognitionResult0.b, activityRecognitionResult0.c, activityRecognitionResult0.d, cmmq.d(activityRecognitionResult0.b(), 100));
        label_102:
            if(!activityRecognitionResult2.equals(activityRecognitionResult0)) {
                fvwz fvwz0 = this.j;
                Collection collection0 = fuvw0.b.a().values();
                List list2 = activityRecognitionResult0.a;
                int v18 = Math.min(list2.size(), 2);
                int v20 = 0;
                int v21 = 0;
                for(int v19 = 10000; v20 < v18; v19 = 1) {
                    DetectedActivity detectedActivity2 = (DetectedActivity)list2.get(v20);
                    v21 += (detectedActivity2.a() * 100 + Math.min(detectedActivity2.e, 99)) * v19;
                    ++v20;
                    list2 = list2;
                }
                fvwz0.a(new futy(fvwz0.f(), v21, activityRecognitionResult0, collection0));
            }
            arrayList0.add(activityRecognitionResult2);
            if(activityRecognitionResult1 != null) {
                arrayList1.add(activityRecognitionResult2);
                arrayList2.add(activityRecognitionResult1);
            }
            ActivityRecognitionResult activityRecognitionResult3 = this.h.b(activityRecognitionResult2);
            if(activityRecognitionResult3 != null) {
                this.c = false;
                if(!arrayList1.isEmpty() && !arrayList2.isEmpty()) {
                    ActivityRecognitionResult[][] arr2_activityRecognitionResult = new ActivityRecognitionResult[2][arrayList1.size()];
                    for(int v22 = 0; v22 < arrayList1.size(); ++v22) {
                        ActivityRecognitionResult[] arr_activityRecognitionResult = arr2_activityRecognitionResult[0];
                        arr_activityRecognitionResult[v22] = (ActivityRecognitionResult)arrayList1.get(v22);
                        ActivityRecognitionResult[] arr_activityRecognitionResult1 = arr2_activityRecognitionResult[1];
                        arr_activityRecognitionResult1[v22] = (ActivityRecognitionResult)arrayList2.get(v22);
                    }
                    activityRecognitionResult3 = new ActivityRecognitionResult(activityRecognitionResult3.a, activityRecognitionResult3.b, activityRecognitionResult3.c, activityRecognitionResult3.d, cmmq.a(null, new String[]{"test_ar_model_1", "test_ar_model_2"}, arr2_activityRecognitionResult));
                }
                arrayList1.clear();
                arrayList2.clear();
                return new fvuv(fusv.a, activityRecognitionResult3, arrayList0);
            }
            if(z1) {
                v3 = Math.max(v6 - 1, 0);
                goto label_145;
            }
            else {
                int v23 = fusr.a(fvsf0, v6, 5000000000L);
                if(v23 != -1) {
                    v3 = v23 + 1;
                label_145:
                    fuwt0 = fuwt0;
                    z = z1;
                    v5 = v9;
                    v2 = v7;
                    continue;
                }
                break;
            }
            goto label_154;
        }
        long v24 = 0L;
        if(arrayList0.isEmpty()) {
            this.c = false;
            return new fvuv(fusv.c(v7), null, arrayList0);
        }
    label_154:
        if(((ActivityRecognitionResult)arrayList0.get(0)).d().a() != 2 && !z1) {
            v24 = 5000L;
        }
        fusv fusv0 = fusv.d(v24);
        this.c = true;
        return new fvuv(fusv0, null, arrayList0);
    }

    @Override  // fusr
    public final void d() {
        super.d();
        this.h.c();
    }
}

