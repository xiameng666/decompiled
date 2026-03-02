import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

public final class hvq {
    private long a;
    private final SparseLongArray b;
    private final SparseBooleanArray c;
    private final List d;
    private int e;
    private int f;

    public hvq() {
        this.b = new SparseLongArray();
        this.c = new SparseBooleanArray();
        this.d = new ArrayList();
        this.e = -1;
        this.f = -1;
    }

    public final hwh a(MotionEvent motionEvent0, hwy hwy0) {
        long v29;
        int v25;
        int v23;
        long v22;
        long v21;
        long v17;
        List list1;
        int v16;
        int v11;
        int v9;
        int v = motionEvent0.getActionMasked();
        if(v != 3 && v != 4) {
            if(motionEvent0.getPointerCount() == 1) {
                int v1 = motionEvent0.getToolType(0);
                int v2 = motionEvent0.getSource();
                if(v1 != this.e || v2 != this.f) {
                    this.e = v1;
                    this.f = v2;
                    this.c.clear();
                    this.b.clear();
                }
            }
            int v3 = motionEvent0.getActionMasked();
            if(v3 == 0) {
            label_21:
                int v6 = motionEvent0.getActionIndex();
                int v7 = motionEvent0.getPointerId(v6);
                SparseLongArray sparseLongArray1 = this.b;
                if(sparseLongArray1.indexOfKey(v7) < 0) {
                    long v8 = this.a;
                    this.a = v8 + 1L;
                    sparseLongArray1.put(v7, v8);
                    if(motionEvent0.getToolType(v6) == 3) {
                        this.c.put(v7, true);
                    }
                }
            }
            else {
                switch(v3) {
                    case 5: {
                        goto label_21;
                    }
                    case 9: {
                        int v4 = motionEvent0.getPointerId(0);
                        SparseLongArray sparseLongArray0 = this.b;
                        if(sparseLongArray0.indexOfKey(v4) < 0) {
                            long v5 = this.a;
                            this.a = v5 + 1L;
                            sparseLongArray0.put(v4, v5);
                        }
                    }
                }
            }
            if(v == 9) {
                v9 = 1;
            }
            else {
                switch(v) {
                    case 7: {
                        v9 = 1;
                        break;
                    }
                    case 10: {
                        v = 10;
                        v9 = 1;
                        break;
                    }
                    default: {
                        v9 = 0;
                    }
                }
            }
            if(v9 != 0) {
                int v10 = motionEvent0.getPointerId(motionEvent0.getActionIndex());
                this.c.put(v10, true);
            }
            switch(v) {
                case 1: {
                    v11 = 0;
                    break;
                }
                case 6: {
                    v11 = motionEvent0.getActionIndex();
                    break;
                }
                default: {
                    v11 = -1;
                }
            }
            List list0 = this.d;
            list0.clear();
            int v12 = motionEvent0.getPointerCount();
            int v13 = 0;
            while(v13 < v12) {
                boolean z = v9 == 0 && v13 != v11 && (v != 8 || motionEvent0.getButtonState() != 0);
                int v14 = motionEvent0.getPointerId(v13);
                SparseLongArray sparseLongArray2 = this.b;
                int v15 = sparseLongArray2.indexOfKey(v14);
                if(v15 >= 0) {
                    v16 = v9;
                    list1 = list0;
                    v17 = sparseLongArray2.valueAt(v15);
                }
                else {
                    v16 = v9;
                    long v18 = this.a;
                    list1 = list0;
                    this.a = v18 + 1L;
                    sparseLongArray2.put(v14, v18);
                    v17 = v18;
                }
                float f = motionEvent0.getPressure(v13);
                float f1 = motionEvent0.getX(v13);
                long v19 = hjz.i(((long)Float.floatToRawIntBits(motionEvent0.getY(v13))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f1)) << 0x20, 0.0f, 3);
                if(v13 == 0) {
                    float f2 = motionEvent0.getRawX();
                    long v20 = ((long)Float.floatToRawIntBits(motionEvent0.getRawY())) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f2)) << 0x20;
                    v21 = hwy0.g(v20);
                    v22 = v20;
                    v23 = 0;
                }
                else {
                    float f3 = motionEvent0.getRawX(v13);
                    long v24 = ((long)Float.floatToRawIntBits(motionEvent0.getRawY(v13))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f3)) << 0x20;
                    v21 = hwy0.g(v24);
                    v22 = v24;
                    v23 = v13;
                }
                switch(motionEvent0.getToolType(v23)) {
                    case 1: {
                        v25 = 1;
                        break;
                    }
                    case 2: {
                        v25 = 3;
                        break;
                    }
                    case 3: {
                        v25 = 2;
                        break;
                    }
                    case 4: {
                        v25 = 4;
                        break;
                    }
                    default: {
                        v25 = 0;
                    }
                }
                ArrayList arrayList0 = new ArrayList(motionEvent0.getHistorySize());
                int v26 = motionEvent0.getHistorySize();
                for(int v27 = 0; v27 < v26; ++v27) {
                    float f4 = motionEvent0.getHistoricalX(v23, v27);
                    float f5 = motionEvent0.getHistoricalY(v23, v27);
                    if((Float.floatToRawIntBits(f4) & 0x7FFFFFFF) < 0x7F800000 && (Float.floatToRawIntBits(f5) & 0x7FFFFFFF) < 0x7F800000) {
                        long v28 = ((long)Float.floatToRawIntBits(f4)) << 0x20 | ((long)Float.floatToRawIntBits(f5)) & 0xFFFFFFFFL;
                        arrayList0.add(new hvh(motionEvent0.getHistoricalEventTime(v27), v28, v28));
                    }
                }
                if(motionEvent0.getActionMasked() == 8) {
                    float f6 = motionEvent0.getAxisValue(10);
                    v29 = ((long)Float.floatToRawIntBits(-motionEvent0.getAxisValue(9) + 0.0f)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f6)) << 0x20;
                }
                else {
                    v29 = 0L;
                }
                int v30 = motionEvent0.getPointerId(v23);
                boolean z1 = this.c.get(v30, false);
                list1.add(new hwj(v17, motionEvent0.getEventTime(), v22, v21, z, f, v25, z1, arrayList0, v29, v19));
                ++v13;
                list0 = list1;
                v9 = v16;
            }
            switch(motionEvent0.getActionMasked()) {
                case 1: 
                case 6: {
                    int v31 = motionEvent0.getPointerId(motionEvent0.getActionIndex());
                    SparseBooleanArray sparseBooleanArray0 = this.c;
                    if(!sparseBooleanArray0.get(v31, false)) {
                        this.b.delete(v31);
                        sparseBooleanArray0.delete(v31);
                    }
                }
            }
            SparseLongArray sparseLongArray3 = this.b;
            if(sparseLongArray3.size() > motionEvent0.getPointerCount()) {
                int v32 = sparseLongArray3.size() - 1;
                while(v32 >= 0) {
                    int v33 = sparseLongArray3.keyAt(v32);
                    int v34 = motionEvent0.getPointerCount();
                    int v35 = 0;
                    while(true) {
                        if(v35 < v34) {
                            if(motionEvent0.getPointerId(v35) == v33) {
                                break;
                            }
                            else {
                                ++v35;
                                continue;
                            }
                        }
                        sparseLongArray3.removeAt(v32);
                        this.c.delete(v33);
                        break;
                    }
                    --v32;
                }
            }
            motionEvent0.getEventTime();
            return new hwh(list0, motionEvent0);
        }
        this.b.clear();
        this.c.clear();
        return null;
    }

    public final void b(int v) {
        this.c.delete(v);
        this.b.delete(v);
    }
}

