import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class qrq extends qrf {
    private qmq A;
    private qmq B;
    private qmq C;
    private qmq D;
    private final StringBuilder j;
    private final RectF k;
    private final Matrix l;
    private final Paint m;
    private final Paint n;
    private final Map o;
    private final byi p;
    private final List q;
    private final qng r;
    private final qkz s;
    private final qkb t;
    private qmq u;
    private qmq v;
    private qmq w;
    private qmq x;
    private qmq y;
    private qmq z;

    public qrq(qkz qkz0, qrj qrj0) {
        super(qkz0, qrj0);
        this.j = new StringBuilder(2);
        this.k = new RectF();
        this.l = new Matrix();
        this.m = new qrn(this);
        this.n = new qro(this);
        this.o = new HashMap();
        this.p = new byi();
        this.q = new ArrayList();
        this.s = qkz0;
        this.t = qrj0.b;
        qng qng0 = qrj0.p.d();
        this.r = qng0;
        qng0.h(this);
        this.k(qng0);
        qqf qqf0 = qrj0.q;
        if(qqf0 != null) {
            qpv qpv0 = qqf0.a;
            if(qpv0 != null) {
                qmq qmq0 = qpv0.a();
                this.u = qmq0;
                qmq0.h(this);
                this.k(this.u);
            }
        }
        if(qqf0 != null) {
            qpv qpv1 = qqf0.b;
            if(qpv1 != null) {
                qmq qmq1 = qpv1.a();
                this.w = qmq1;
                qmq1.h(this);
                this.k(this.w);
            }
        }
        if(qqf0 != null) {
            qpw qpw0 = qqf0.c;
            if(qpw0 != null) {
                qmq qmq2 = qpw0.a();
                this.y = qmq2;
                qmq2.h(this);
                this.k(this.y);
            }
        }
        if(qqf0 != null) {
            qpw qpw1 = qqf0.d;
            if(qpw1 != null) {
                qmq qmq3 = qpw1.a();
                this.A = qmq3;
                qmq3.h(this);
                this.k(this.A);
            }
        }
    }

    @Override  // qrf
    public final void a(Object object0, qub qub0) {
        super.a(object0, qub0);
        if(object0 == qle.a) {
            qmq qmq0 = this.v;
            if(qmq0 != null) {
                this.m(qmq0);
            }
            if(qub0 == null) {
                this.v = null;
                return;
            }
            qni qni0 = new qni(qub0);
            this.v = qni0;
            qni0.h(this);
            this.k(this.v);
            return;
        }
        if(object0 == qle.b) {
            qmq qmq1 = this.x;
            if(qmq1 != null) {
                this.m(qmq1);
            }
            if(qub0 == null) {
                this.x = null;
                return;
            }
            qni qni1 = new qni(qub0);
            this.x = qni1;
            qni1.h(this);
            this.k(this.x);
            return;
        }
        if(object0 == qle.s) {
            qmq qmq2 = this.z;
            if(qmq2 != null) {
                this.m(qmq2);
            }
            if(qub0 == null) {
                this.z = null;
                return;
            }
            qni qni2 = new qni(qub0);
            this.z = qni2;
            qni2.h(this);
            this.k(this.z);
            return;
        }
        if(object0 == qle.t) {
            qmq qmq3 = this.B;
            if(qmq3 != null) {
                this.m(qmq3);
            }
            if(qub0 == null) {
                this.B = null;
                return;
            }
            qni qni3 = new qni(qub0);
            this.B = qni3;
            qni3.h(this);
            this.k(this.B);
            return;
        }
        if(object0 == qle.F) {
            qmq qmq4 = this.C;
            if(qmq4 != null) {
                this.m(qmq4);
            }
            if(qub0 == null) {
                this.C = null;
                return;
            }
            qni qni4 = new qni(qub0);
            this.C = qni4;
            qni4.h(this);
            this.k(this.C);
            return;
        }
        if(object0 == qle.M) {
            qmq qmq5 = this.D;
            if(qmq5 != null) {
                this.m(qmq5);
            }
            if(qub0 == null) {
                this.D = null;
                return;
            }
            qni qni5 = new qni(qub0);
            this.D = qni5;
            qni5.h(this);
            this.k(this.D);
            return;
        }
        if(object0 == qle.O) {
            qua qua0 = new qua();
            qpn qpn0 = new qpn();
            this.r.d = new qnf(this.r, qua0, qub0, qpn0);
        }
    }

    @Override  // qrf
    public final void c(RectF rectF0, Matrix matrix0, boolean z) {
        super.c(rectF0, matrix0, z);
        rectF0.set(0.0f, 0.0f, ((float)this.t.j.width()), ((float)this.t.j.height()));
    }

    @Override  // qrf
    public final void l(Canvas canvas0, Matrix matrix0, int v) {
        String s5;
        qpo qpo1;
        Typeface typeface0;
        int v21;
        List list2;
        int v17;
        int v16;
        int v15;
        int v13;
        qrq qrq0 = this;
        qpn qpn0 = (qpn)qrq0.r.e();
        qkb qkb0 = qrq0.t;
        qpo qpo0 = (qpo)qkb0.e.get(qpn0.b);
        if(qpo0 == null) {
            return;
        }
        canvas0.save();
        canvas0.concat(matrix0);
        qmq qmq0 = qrq0.v;
        if(qmq0 == null) {
            qmq qmq1 = qrq0.u;
            if(qmq1 == null) {
                qrq0.m.setColor(qpn0.g);
            }
            else {
                int v2 = (int)(((Integer)qmq1.e()));
                qrq0.m.setColor(v2);
            }
        }
        else {
            int v1 = (int)(((Integer)qmq0.e()));
            qrq0.m.setColor(v1);
        }
        qmq qmq2 = qrq0.x;
        if(qmq2 == null) {
            qmq qmq3 = qrq0.w;
            if(qmq3 == null) {
                qrq0.n.setColor(qpn0.h);
            }
            else {
                int v4 = (int)(((Integer)qmq3.e()));
                qrq0.n.setColor(v4);
            }
        }
        else {
            int v3 = (int)(((Integer)qmq2.e()));
            qrq0.n.setColor(v3);
        }
        qmq qmq4 = qrq0.g.e;
        int v5 = qmq4 == null ? 100 : ((int)(((Integer)qmq4.e())));
        Paint paint0 = qrq0.m;
        int v6 = v5 * 0xFF / 100 * v / 0xFF;
        paint0.setAlpha(v6);
        Paint paint1 = qrq0.n;
        paint1.setAlpha(v6);
        qmq qmq5 = qrq0.z;
        if(qmq5 == null) {
            qmq qmq6 = qrq0.y;
            if(qmq6 == null) {
                paint1.setStrokeWidth(qpn0.i * qty.a());
            }
            else {
                paint1.setStrokeWidth(((Float)qmq6.e()).floatValue());
            }
        }
        else {
            paint1.setStrokeWidth(((Float)qmq5.e()).floatValue());
        }
        qkz qkz0 = qrq0.s;
        if(qkz0.b.g.c() > 0) {
            float f = (qrq0.C == null ? qpn0.c : ((float)(((Float)qrq0.C.e())))) / 100.0f;
            qty.c(matrix0);
            List list0 = qrq.y(qpn0.a);
            int v7 = list0.size();
            float f1 = ((float)qpn0.d) / 10.0f;
            qmq qmq7 = qrq0.B;
            if(qmq7 == null) {
                qmq qmq8 = qrq0.A;
                if(qmq8 != null) {
                    f1 += (float)(((Float)qmq8.e()));
                }
            }
            else {
                f1 += (float)(((Float)qmq7.e()));
            }
            int v8 = 0;
            while(v8 < v7) {
                float f2 = f1;
                int v10 = v8;
                List list1 = qrq0.u(((String)list0.get(v8)), (qpn0.l == null ? 0.0f : qpn0.l.x), qpo0, f, f2, true);
                int v11 = 0;
                for(int v9 = -1; v11 < list1.size(); v9 = v12) {
                    qrp qrp0 = (qrp)list1.get(v11);
                    int v12 = v9 + 1;
                    canvas0.save();
                    if(qrq0.v(canvas0, qpn0, v12, qrp0.b)) {
                        String s = qrp0.a;
                        v13 = v11;
                        int v14 = 0;
                        while(v14 < s.length()) {
                            qpp qpp0 = (qpp)bzu.a(qkb0.g, qpp.a(s.charAt(v14), qpo0.a, qpo0.c));
                            if(qpp0 == null) {
                                v15 = v14;
                                v16 = v10;
                                v17 = v12;
                            }
                            else {
                                Map map0 = qrq0.o;
                                if(map0.containsKey(qpp0)) {
                                    list2 = (List)map0.get(qpp0);
                                    v15 = v14;
                                    v16 = v10;
                                    v17 = v12;
                                }
                                else {
                                    List list3 = qpp0.a;
                                    v15 = v14;
                                    int v18 = list3.size();
                                    v16 = v10;
                                    ArrayList arrayList0 = new ArrayList(v18);
                                    v17 = v12;
                                    int v19 = 0;
                                    while(v19 < v18) {
                                        arrayList0.add(new qlu(qkz0, qrq0, ((qqy)list3.get(v19)), qkb0));
                                        ++v19;
                                        v18 = v18;
                                        list3 = list3;
                                    }
                                    map0.put(qpp0, arrayList0);
                                    list2 = arrayList0;
                                }
                                int v20 = 0;
                                while(v20 < list2.size()) {
                                    Path path0 = ((qlu)list2.get(v20)).i();
                                    path0.computeBounds(qrq0.k, false);
                                    qrq0.l.reset();
                                    float f3 = -qpn0.f * qty.a();
                                    qrq0.l.preTranslate(0.0f, f3);
                                    qrq0.l.preScale(f, f);
                                    path0.transform(qrq0.l);
                                    if(qpn0.j) {
                                        qrq.x(path0, paint0, canvas0);
                                        qrq.x(path0, paint1, canvas0);
                                    }
                                    else {
                                        qrq.x(path0, paint1, canvas0);
                                        qrq.x(path0, paint0, canvas0);
                                    }
                                    ++v20;
                                    list2 = list2;
                                }
                                float f4 = qty.a();
                                canvas0.translate(((float)qpp0.b) * f * f4 + f2, 0.0f);
                            }
                            v14 = v15 + 1;
                            s = s;
                            f2 = f2;
                            v10 = v16;
                            v12 = v17;
                        }
                    }
                    else {
                        v13 = v11;
                    }
                    canvas0.restore();
                    v11 = v13 + 1;
                    list1 = list1;
                    f2 = f2;
                    v10 = v10;
                }
                v8 = v10 + 1;
                f = f;
                v7 = v7;
                f1 = f2;
            }
        }
        else {
            qmq qmq9 = qrq0.D;
            if(qmq9 == null) {
            label_149:
                qpk qpk0 = qkz0.f();
                if(qpk0 == null) {
                    typeface0 = null;
                }
                else {
                    String s1 = qpo0.a;
                    String s2 = qpo0.c;
                    qpu qpu0 = qpk0.a;
                    qpu0.a = s1;
                    qpu0.b = s2;
                    Map map1 = qpk0.b;
                    Typeface typeface1 = (Typeface)map1.get(qpu0);
                    if(typeface1 == null) {
                        Map map2 = qpk0.c;
                        Typeface typeface2 = (Typeface)map2.get(s1);
                        if(typeface2 == null) {
                            typeface2 = qpo0.d;
                            if(typeface2 == null) {
                                typeface2 = Typeface.createFromAsset(qpk0.d, "fonts/" + s1 + qpk0.e);
                                map2.put(s1, typeface2);
                            }
                        }
                        boolean z = s2.contains("Italic");
                        boolean z1 = s2.contains("Bold");
                        if(!z) {
                        label_175:
                            if(z) {
                                v21 = 2;
                            }
                            else {
                                v21 = z1 ? 1 : 0;
                            }
                        }
                        else if(z1) {
                            v21 = 3;
                        }
                        else {
                            z1 = false;
                            goto label_175;
                        }
                        if(typeface2.getStyle() != v21) {
                            typeface2 = Typeface.create(typeface2, v21);
                        }
                        map1.put(qpu0, typeface2);
                        typeface0 = typeface2;
                    }
                    else {
                        typeface0 = typeface1;
                    }
                }
                if(typeface0 == null) {
                    typeface0 = qpo0.d;
                }
            }
            else {
                typeface0 = (Typeface)qmq9.e();
                if(typeface0 == null) {
                    goto label_149;
                }
            }
            if(typeface0 != null) {
                String s3 = qpn0.a;
                paint0.setTypeface(typeface0);
                float f5 = qrq0.C == null ? qpn0.c : ((float)(((Float)qrq0.C.e())));
                paint0.setTextSize(qty.a() * f5);
                paint1.setTypeface(paint0.getTypeface());
                paint1.setTextSize(paint0.getTextSize());
                float f6 = ((float)qpn0.d) / 10.0f;
                qmq qmq10 = qrq0.B;
                if(qmq10 == null) {
                    qmq qmq11 = qrq0.A;
                    if(qmq11 != null) {
                        f6 += (float)(((Float)qmq11.e()));
                    }
                }
                else {
                    f6 += (float)(((Float)qmq10.e()));
                }
                float f7 = f6 * qty.a() * f5 / 100.0f;
                List list4 = qrq.y(s3);
                int v22 = list4.size();
                int v23 = 0;
                int v24 = -1;
                while(v23 < v22) {
                    List list5 = qrq0.u(((String)list4.get(v23)), (qpn0.l == null ? 0.0f : qpn0.l.x), qpo0, 0.0f, f7, false);
                    int v25 = 0;
                    while(v25 < list5.size()) {
                        qrp qrp1 = (qrp)list5.get(v25);
                        int v26 = v24 + 1;
                        canvas0.save();
                        if(qrq0.v(canvas0, qpn0, v26, qrp1.b)) {
                            String s4 = qrp1.a;
                            int v27 = 0;
                            while(v27 < s4.length()) {
                                int v28 = s4.codePointAt(v27);
                                int v29 = v27 + Character.charCount(v28);
                            alab1:
                                while(true) {
                                    if(v29 < s4.length()) {
                                        int v30 = s4.codePointAt(v29);
                                        qpo1 = qpo0;
                                        switch(Character.getType(v30)) {
                                            case 6: 
                                            case 8: 
                                            case 16: 
                                            case 19: 
                                            case 27: 
                                            case 28: {
                                                v29 += Character.charCount(v30);
                                                v28 = v28 * 0x1F + v30;
                                                qpo0 = qpo1;
                                                continue;
                                            }
                                            default: {
                                                break alab1;
                                            }
                                        }
                                    }
                                    qpo1 = qpo0;
                                    break;
                                }
                                byi byi0 = qrq0.p;
                                if(byi0.j(((long)v28))) {
                                    s5 = (String)byi0.d(((long)v28));
                                }
                                else {
                                    StringBuilder stringBuilder0 = qrq0.j;
                                    stringBuilder0.setLength(0);
                                    int v31 = v27;
                                    while(v31 < v29) {
                                        int v32 = s4.codePointAt(v31);
                                        stringBuilder0.appendCodePoint(v32);
                                        v31 += Character.charCount(v32);
                                        v29 = v29;
                                    }
                                    s5 = stringBuilder0.toString();
                                    byi0.h(((long)v28), s5);
                                }
                                v27 += s5.length();
                                if(qpn0.j) {
                                    qrq.w(s5, paint0, canvas0);
                                    qrq.w(s5, paint1, canvas0);
                                }
                                else {
                                    qrq.w(s5, paint1, canvas0);
                                    qrq.w(s5, paint0, canvas0);
                                }
                                canvas0.translate(paint0.measureText(s5) + f7, 0.0f);
                                qrq0 = this;
                                list5 = list5;
                                f7 = f7;
                                v26 = v26;
                                v25 = v25;
                                qpo0 = qpo1;
                            }
                        }
                        v24 = v26;
                        canvas0.restore();
                        list5 = list5;
                        ++v25;
                        f7 = f7;
                        qpo0 = qpo0;
                        qrq0 = this;
                    }
                    ++v23;
                    qrq0 = this;
                    qpo0 = qpo0;
                }
            }
        }
        canvas0.restore();
    }

    private final qrp t(int v) {
        List list0 = this.q;
        for(int v1 = list0.size(); v1 < v; ++v1) {
            list0.add(new qrp());
        }
        return (qrp)list0.get(v - 1);
    }

    private final List u(String s, float f, qpo qpo0, float f1, float f2, boolean z) {
        float f7;
        int v = 0;
        float f3 = 0.0f;
        int v1 = 0;
        int v2 = 0;
        boolean z1 = false;
        float f4 = 0.0f;
        int v3 = 0;
        float f5 = 0.0f;
        while(v < s.length()) {
            int v4 = s.charAt(v);
            if(z) {
                qpp qpp0 = (qpp)bzu.a(this.t.g, qpp.a(((char)v4), qpo0.a, qpo0.c));
                if(qpp0 != null) {
                    float f6 = qty.a();
                    f7 = ((float)qpp0.b) * f1 * f6;
                    goto label_17;
                }
            }
            else {
                f7 = this.m.measureText(s.substring(v, v + 1));
            label_17:
                float f8 = f7 + f2;
                if(v4 == 0x20) {
                    z1 = true;
                    f5 = f8;
                }
                else {
                    if(z1) {
                        f4 = f8;
                        v3 = v;
                    }
                    else {
                        f4 += f8;
                    }
                    z1 = false;
                }
                f3 += f8;
                if((f > 0.0f) && (f3 >= f) && v4 != 0x20) {
                    ++v1;
                    qrp qrp0 = this.t(v1);
                    if(v3 == v2) {
                        String s1 = s.substring(v2, v);
                        String s2 = s1.trim();
                        qrp0.a(s2, f3 - f8 - ((float)(s2.length() - s1.length())) * f5);
                        f3 = f8;
                        f4 = f3;
                        v2 = v;
                        v3 = v2;
                    }
                    else {
                        String s3 = s.substring(v2, v3 - 1);
                        String s4 = s3.trim();
                        qrp0.a(s4, f3 - f4 - ((float)(s3.length() - s4.length())) * f5 - f5);
                        f3 = f4;
                        v2 = v3;
                    }
                }
            }
            ++v;
        }
        if((f3 > 0.0f)) {
            ++v1;
            this.t(v1).a(s.substring(v2), f3);
        }
        return this.q.subList(0, v1);
    }

    private final boolean v(Canvas canvas0, qpn qpn0, int v, float f) {
        PointF pointF0 = qpn0.k;
        PointF pointF1 = qpn0.l;
        float f1 = qty.a();
        float f2 = 0.0f;
        float f3 = ((float)v) * qpn0.e * f1 + (pointF0 == null ? 0.0f : qpn0.e * f1 + pointF0.y);
        if(this.s.o && pointF1 != null && pointF0 != null && f3 >= pointF0.y + pointF1.y + qpn0.c) {
            return false;
        }
        float f4 = pointF0 == null ? 0.0f : pointF0.x;
        if(pointF1 != null) {
            f2 = pointF1.x;
        }
        int v1 = qpn0.m - 1;
        if(qpn0.m != 0) {
            switch(v1) {
                case 0: {
                    canvas0.translate(f4, f3);
                    return true;
                }
                case 1: {
                    canvas0.translate(f4 + f2 - f, f3);
                    return true;
                }
                default: {
                    if(v1 == 2) {
                        canvas0.translate(f4 + f2 / 2.0f - f / 2.0f, f3);
                        return true;
                    }
                    return true;
                }
            }
        }
        throw null;
    }

    private static final void w(String s, Paint paint0, Canvas canvas0) {
        if(paint0.getColor() != 0 && (paint0.getStyle() != Paint.Style.STROKE || paint0.getStrokeWidth() != 0.0f)) {
            canvas0.drawText(s, 0, s.length(), 0.0f, 0.0f, paint0);
        }
    }

    private static final void x(Path path0, Paint paint0, Canvas canvas0) {
        if(paint0.getColor() != 0 && (paint0.getStyle() != Paint.Style.STROKE || paint0.getStrokeWidth() != 0.0f)) {
            canvas0.drawPath(path0, paint0);
        }
    }

    private static final List y(String s) {
        return Arrays.asList(s.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }
}

