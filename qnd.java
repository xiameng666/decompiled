import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public final class qnd extends qmq {
    public List e;
    private final qqw f;
    private final Path g;
    private Path h;
    private Path i;

    public qnd(List list0) {
        super(list0);
        this.f = new qqw();
        this.g = new Path();
    }

    @Override  // qmq
    public final Object f(qtz qtz0, float f) {
        qqw qqw15;
        qqw qqw14;
        qqw qqw13;
        qqw qqw12;
        qqw qqw11;
        qqw qqw10;
        qqw qqw9;
        qqw qqw8;
        qqw qqw7;
        qqw qqw6;
        PointF pointF2;
        List list6;
        PointF pointF1;
        int v7;
        int v2;
        qqw qqw0 = (qqw)qtz0.b;
        qqw qqw1 = (qqw)qtz0.c;
        qqw qqw2 = qqw1 == null ? qqw0 : qqw1;
        qqw qqw3 = this.f;
        if(qqw3.b == null) {
            qqw3.b = new PointF();
        }
        qqw3.c = qqw0.c || qqw2.c;
        List list0 = qqw0.a;
        List list1 = qqw2.a;
        if(list0.size() != list1.size()) {
            qtq.a(("Curves must have the same number of control points. Shape 1: " + list0.size() + "\tShape 2: " + list1.size()));
        }
        int v = Math.min(list0.size(), list1.size());
        List list2 = qqw3.a;
        if(list2.size() < v) {
            for(int v1 = list2.size(); v1 < v; ++v1) {
                list2.add(new qpm());
            }
        }
        else if(list2.size() > v) {
            int v3 = list2.size();
            while(true) {
                --v3;
                if(v3 < v) {
                    break;
                }
                list2.remove(list2.size() - 1);
            }
        }
        qqw3.a(qqw0.b.x + (qqw2.b.x - qqw0.b.x) * f, qqw0.b.y + (qqw2.b.y - qqw0.b.y) * f);
        v2 = list2.size() - 1;
        while(v2 >= 0) {
            qpm qpm0 = (qpm)list0.get(v2);
            qpm qpm1 = (qpm)list1.get(v2);
            ((qpm)list2.get(v2)).a(qpm0.a.x + (qpm1.a.x - qpm0.a.x) * f, qpm0.a.y + (qpm1.a.y - qpm0.a.y) * f);
            ((qpm)list2.get(v2)).b(qpm0.b.x + (qpm1.b.x - qpm0.b.x) * f, qpm0.b.y + (qpm1.b.y - qpm0.b.y) * f);
            ((qpm)list2.get(v2)).c(qpm0.c.x + (qpm1.c.x - qpm0.c.x) * f, qpm0.c.y + (qpm1.c.y - qpm0.c.y) * f);
            --v2;
            qqw3 = qqw3;
        }
        List list3 = this.e;
        if(list3 == null) {
            qqw12 = qqw3;
            qqw14 = qqw0;
            qqw13 = qqw1;
        }
        else {
            int v4 = list3.size() - 1;
            qqw qqw4 = qqw3;
            while(v4 >= 0) {
                qmh qmh0 = (qmh)this.e.get(v4);
                List list4 = qqw4.a;
                if(list4.size() > 2) {
                    float f1 = (float)(((Float)qmh0.a.e()));
                    if(f1 != 0.0f) {
                        boolean z = qqw4.c;
                        int v5 = list4.size() - 1;
                        int v6 = 0;
                        while(v5 >= 0) {
                            qpm qpm2 = (qpm)list4.get(v5);
                            qpm qpm3 = (qpm)list4.get(qmh.a(v5 - 1, list4.size()));
                            PointF pointF0 = v5 != 0 || z ? qpm3.c : qqw4.b;
                            boolean z1 = !qqw4.c && (v5 == 0 || v5 == list4.size() - 1);
                            v6 = !(v5 != 0 || z ? qpm3.b : pointF0).equals(pointF0) || !qpm2.a.equals(pointF0) || z1 ? v6 + 1 : v6 + 2;
                            --v5;
                            v4 = v4;
                        }
                        v7 = v4;
                        if(qmh0.b == null || qmh0.b.a.size() != v6) {
                            ArrayList arrayList0 = new ArrayList(v6);
                            for(int v8 = 0; v8 < v6; ++v8) {
                                arrayList0.add(new qpm());
                            }
                            qmh0.b = new qqw(new PointF(0.0f, 0.0f), false, arrayList0);
                        }
                        qqw qqw5 = qmh0.b;
                        qqw5.c = z;
                        qqw5.a(qqw4.b.x, qqw4.b.y);
                        List list5 = qqw5.a;
                        boolean z2 = qqw4.c;
                        int v9 = 0;
                        int v10 = 0;
                        while(v9 < list4.size()) {
                            qpm qpm4 = (qpm)list4.get(v9);
                            qpm qpm5 = (qpm)list4.get(qmh.a(v9 - 1, list4.size()));
                            qpm qpm6 = (qpm)list4.get(qmh.a(v9 - 2, list4.size()));
                            if(v9 == 0) {
                                if(z2) {
                                    v9 = 0;
                                }
                                else {
                                    pointF1 = qqw4.b;
                                    v9 = 0;
                                    goto label_91;
                                }
                            }
                            pointF1 = qpm5.c;
                        label_91:
                            if(v9 == 0) {
                                if(z2) {
                                    v9 = 0;
                                }
                                else {
                                    list6 = list4;
                                    pointF2 = pointF1;
                                    v9 = 0;
                                    goto label_100;
                                }
                            }
                            list6 = list4;
                            pointF2 = qpm5.b;
                        label_100:
                            PointF pointF3 = qpm4.a;
                            PointF pointF4 = qpm6.c;
                            PointF pointF5 = qpm4.c;
                            boolean z3 = !qqw4.c && (v9 == 0 || v9 == list6.size() - 1);
                            if(pointF2.equals(pointF1) && pointF3.equals(pointF1) && !z3) {
                                qqw6 = qqw4;
                                qqw7 = qqw0;
                                float f2 = (float)Math.hypot(pointF5.x - pointF1.x, pointF5.y - pointF1.y);
                                float f3 = Math.min(f1 / ((float)Math.hypot(pointF1.x - pointF4.x, pointF1.y - pointF4.y)), 0.5f);
                                float f4 = Math.min(f1 / f2, 0.5f);
                                float f5 = pointF1.x + (pointF4.x - pointF1.x) * f3;
                                float f6 = pointF1.y + (pointF4.y - pointF1.y) * f3;
                                float f7 = pointF1.x + (pointF5.x - pointF1.x) * f4;
                                float f8 = pointF1.y + (pointF5.y - pointF1.y) * f4;
                                float f9 = f5 - pointF1.x;
                                float f10 = f6 - pointF1.y;
                                float f11 = f7 - pointF1.x;
                                float f12 = f8 - pointF1.y;
                                qpm qpm7 = (qpm)list5.get(qmh.a(v10 - 1, list5.size()));
                                qpm qpm8 = (qpm)list5.get(v10);
                                qpm7.b(f5, f6);
                                qpm7.c(f5, f6);
                                if(v9 == 0) {
                                    qqw5.a(f5, f6);
                                }
                                qpm8.a(f5 - f9 * 0.5519f, f6 - f10 * 0.5519f);
                                qpm qpm9 = (qpm)list5.get(v10 + 1);
                                qpm8.b(f7 - f11 * 0.5519f, f8 - f12 * 0.5519f);
                                qpm8.c(f7, f8);
                                qpm9.a(f7, f8);
                                v10 += 2;
                                qqw8 = qqw5;
                            }
                            else {
                                qqw8 = qqw5;
                                qqw6 = qqw4;
                                qqw7 = qqw0;
                                qpm qpm10 = (qpm)list5.get(qmh.a(v10 - 1, list5.size()));
                                qpm qpm11 = (qpm)list5.get(v10);
                                qpm10.b(qpm5.b.x, qpm5.b.y);
                                qpm10.c(qpm5.c.x, qpm5.c.y);
                                qpm11.a(pointF3.x, pointF3.y);
                                ++v10;
                            }
                            ++v9;
                            qqw0 = qqw7;
                            f1 = f1;
                            z2 = z2;
                            list4 = list6;
                            qqw1 = qqw1;
                            qqw4 = qqw6;
                            qqw5 = qqw8;
                        }
                        qqw9 = qqw0;
                        qqw10 = qqw1;
                        qqw11 = qqw5;
                        goto label_158;
                    }
                }
                qqw10 = qqw1;
                v7 = v4;
                qqw11 = qqw4;
                qqw9 = qqw0;
            label_158:
                v4 = v7 - 1;
                qqw0 = qqw9;
                qqw1 = qqw10;
                qqw4 = qqw11;
            }
            qqw12 = qqw4;
            qqw13 = qqw1;
            qqw14 = qqw0;
        }
        Object object0 = this.g;
        qtt.d(qqw12, ((Path)object0));
        if(this.d != null) {
            if(this.h == null) {
                this.h = new Path();
                this.i = new Path();
            }
            qtt.d(qqw14, this.h);
            if(qqw13 == null) {
                qqw15 = null;
            }
            else {
                qqw15 = qqw13;
                qtt.d(qqw15, this.i);
            }
            qub qub0 = this.d;
            float f13 = (float)qtz0.h;
            Path path0 = this.h;
            return qqw15 == null ? ((Path)qub0.b(qtz0.g, f13, path0, path0, f, this.c(), this.c)) : ((Path)qub0.b(qtz0.g, f13, path0, this.i, f, this.c(), this.c));
        }
        return object0;
    }
}

