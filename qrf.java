import android.graphics.BlurMaskFilter.Blur;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class qrf implements qlv, qml, qpr {
    private boolean A;
    private Paint B;
    final Matrix a;
    final qkz b;
    public final qrj c;
    public qmu d;
    public qrf e;
    public qrf f;
    final qnh g;
    float h;
    BlurMaskFilter i;
    private final Path j;
    private final Matrix k;
    private final Matrix l;
    private final Paint m;
    private final Paint n;
    private final Paint o;
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private final RectF v;
    private qmy w;
    private List x;
    private final List y;
    private boolean z;

    public qrf(qkz qkz0, qrj qrj0) {
        this.j = new Path();
        this.k = new Matrix();
        this.l = new Matrix();
        boolean z = true;
        this.m = new qlp(1);
        this.n = new qlp(PorterDuff.Mode.DST_IN, null);
        this.o = new qlp(PorterDuff.Mode.DST_OUT, null);
        qlp qlp0 = new qlp(1);
        this.p = qlp0;
        this.q = new qlp(PorterDuff.Mode.CLEAR);
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new RectF();
        this.a = new Matrix();
        this.y = new ArrayList();
        this.z = true;
        this.h = 0.0f;
        this.b = qkz0;
        this.c = qrj0;
        if(qrj0.x == 3) {
            qlp0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        else {
            qlp0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        qnh qnh0 = new qnh(qrj0.h);
        this.g = qnh0;
        qnh0.d(this);
        if(qrj0.g != null && !qrj0.g.isEmpty()) {
            qmy qmy0 = new qmy(qrj0.g);
            this.w = qmy0;
            for(Object object0: qmy0.a) {
                ((qmq)object0).h(this);
            }
            for(Object object1: this.w.b) {
                this.k(((qmq)object1));
                ((qmq)object1).h(this);
            }
        }
        if(!this.c.s.isEmpty()) {
            qmu qmu0 = new qmu(this.c.s);
            this.d = qmu0;
            qmu0.b = true;
            qmu0.h(new qre(this));
            if(((float)(((Float)this.d.e()))) != 1.0f) {
                z = false;
            }
            this.q(z);
            this.k(this.d);
            return;
        }
        this.q(true);
    }

    @Override  // qpr
    public void a(Object object0, qub qub0) {
        this.g.e(object0, qub0);
    }

    @Override  // qlv
    public final void b(Canvas canvas0, Matrix matrix0, int v) {
        if(this.z) {
            qrj qrj0 = this.c;
            if(!qrj0.t) {
                this.t();
                Matrix matrix1 = this.k;
                matrix1.reset();
                matrix1.set(matrix0);
                int v1 = this.x.size();
                while(true) {
                    --v1;
                    if(v1 < 0) {
                        break;
                    }
                    matrix1.preConcat(((qrf)this.x.get(v1)).g.a());
                }
                qnh qnh0 = this.g;
                qmq qmq0 = qnh0.e;
                int v2 = 100;
                if(qmq0 != null) {
                    Integer integer0 = (Integer)qmq0.e();
                    if(integer0 != null) {
                        v2 = (int)integer0;
                    }
                }
                int v3 = (int)(((float)v) / 255.0f * ((float)v2) / 100.0f * 255.0f);
                if(!this.s() && !this.r()) {
                    matrix1.preConcat(qnh0.a());
                    this.l(canvas0, matrix1, v3);
                    return;
                }
                RectF rectF0 = this.r;
                this.c(rectF0, matrix1, false);
                if(this.s() && qrj0.x != 3) {
                    this.u.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.e.c(this.u, matrix0, true);
                    if(!rectF0.intersect(this.u)) {
                        rectF0.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                matrix1.preConcat(qnh0.a());
                RectF rectF1 = this.t;
                rectF1.set(0.0f, 0.0f, 0.0f, 0.0f);
                if(this.r()) {
                    int v4 = this.w.c.size();
                    int v5 = 0;
                    while(true) {
                        if(v5 < v4) {
                            qqq qqq0 = (qqq)this.w.c.get(v5);
                            Path path0 = (Path)((qmq)this.w.a.get(v5)).e();
                            if(path0 != null) {
                                Path path1 = this.j;
                                path1.set(path0);
                                path1.transform(matrix1);
                                int v6 = qqq0.d - 1;
                                if(qqq0.d != 0) {
                                    switch(v6) {
                                        case 0: 
                                        case 2: {
                                            if(qqq0.c) {
                                                goto label_62;
                                            }
                                        label_49:
                                            RectF rectF2 = this.v;
                                            path1.computeBounds(rectF2, false);
                                            if(v5 == 0) {
                                                rectF1.set(rectF2);
                                            }
                                            else {
                                                rectF1.set(Math.min(rectF1.left, rectF2.left), Math.min(rectF1.top, rectF2.top), Math.max(rectF1.right, rectF2.right), Math.max(rectF1.bottom, rectF2.bottom));
                                            }
                                            ++v5;
                                            continue;
                                        }
                                        case 1: 
                                        case 3: {
                                            goto label_62;
                                        }
                                        default: {
                                            goto label_49;
                                        }
                                    }
                                }
                                throw null;
                            }
                            ++v5;
                            continue;
                        }
                        if(rectF0.intersect(rectF1)) {
                            goto label_62;
                        }
                        rectF0.set(0.0f, 0.0f, 0.0f, 0.0f);
                        goto label_62;
                    }
                }
                else {
                label_62:
                    RectF rectF3 = this.s;
                    rectF3.set(0.0f, 0.0f, ((float)canvas0.getWidth()), ((float)canvas0.getHeight()));
                    Matrix matrix2 = this.l;
                    canvas0.getMatrix(matrix2);
                    if(!matrix2.isIdentity()) {
                        matrix2.invert(matrix2);
                        matrix2.mapRect(rectF3);
                    }
                }
                if(!rectF0.intersect(rectF3)) {
                    rectF0.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if((rectF0.width() >= 1.0f) && (rectF0.height() >= 1.0f)) {
                    Paint paint0 = this.m;
                    paint0.setAlpha(0xFF);
                    canvas0.saveLayer(rectF0, paint0);
                    this.u(canvas0);
                    this.l(canvas0, matrix1, v3);
                    if(this.r()) {
                        Paint paint1 = this.n;
                        canvas0.saveLayer(rectF0, paint1);
                        int v7 = 0;
                        while(v7 < this.w.c.size()) {
                            qqq qqq1 = (qqq)this.w.c.get(v7);
                            qmq qmq1 = (qmq)this.w.a.get(v7);
                            qmq qmq2 = (qmq)this.w.b.get(v7);
                            int v8 = qqq1.d - 1;
                            if(qqq1.d == 0) {
                                throw null;
                            }
                        alab1:
                            switch(v8) {
                                case 0: {
                                    if(qqq1.c) {
                                        canvas0.saveLayer(rectF0, paint0);
                                        canvas0.drawRect(rectF0, paint0);
                                        Path path2 = (Path)qmq1.e();
                                        this.j.set(path2);
                                        this.j.transform(matrix1);
                                        paint0.setAlpha(((int)(((float)(((int)(((Integer)qmq2.e()))))) * 2.55f)));
                                        canvas0.drawPath(this.j, this.o);
                                        canvas0.restore();
                                    }
                                    else {
                                        Path path3 = (Path)qmq1.e();
                                        this.j.set(path3);
                                        this.j.transform(matrix1);
                                        paint0.setAlpha(((int)(((float)(((int)(((Integer)qmq2.e()))))) * 2.55f)));
                                        canvas0.drawPath(this.j, paint0);
                                    }
                                    break;
                                }
                                case 1: {
                                    if(v7 == 0) {
                                        paint0.setColor(0xFF000000);
                                        paint0.setAlpha(0xFF);
                                        canvas0.drawRect(rectF0, paint0);
                                        v7 = 0;
                                    }
                                    if(qqq1.c) {
                                        canvas0.saveLayer(rectF0, this.o);
                                        canvas0.drawRect(rectF0, paint0);
                                        int v10 = (int)(((float)(((int)(((Integer)qmq2.e()))))) * 2.55f);
                                        this.o.setAlpha(v10);
                                        Path path4 = (Path)qmq1.e();
                                        this.j.set(path4);
                                        this.j.transform(matrix1);
                                        canvas0.drawPath(this.j, this.o);
                                        canvas0.restore();
                                    }
                                    else {
                                        Path path5 = (Path)qmq1.e();
                                        this.j.set(path5);
                                        this.j.transform(matrix1);
                                        canvas0.drawPath(this.j, this.o);
                                    }
                                    break;
                                }
                                case 2: {
                                    if(qqq1.c) {
                                        canvas0.saveLayer(rectF0, paint1);
                                        canvas0.drawRect(rectF0, paint0);
                                        int v11 = (int)(((float)(((int)(((Integer)qmq2.e()))))) * 2.55f);
                                        this.o.setAlpha(v11);
                                        Path path6 = (Path)qmq1.e();
                                        this.j.set(path6);
                                        this.j.transform(matrix1);
                                        canvas0.drawPath(this.j, this.o);
                                    }
                                    else {
                                        canvas0.saveLayer(rectF0, paint1);
                                        Path path7 = (Path)qmq1.e();
                                        this.j.set(path7);
                                        this.j.transform(matrix1);
                                        paint0.setAlpha(((int)(((float)(((int)(((Integer)qmq2.e()))))) * 2.55f)));
                                        canvas0.drawPath(this.j, paint0);
                                    }
                                    canvas0.restore();
                                    break;
                                }
                                default: {
                                    if(v8 == 3 && !this.w.a.isEmpty()) {
                                        int v9 = 0;
                                        while(v9 < this.w.c.size()) {
                                            if(((qqq)this.w.c.get(v9)).d == 4) {
                                                ++v9;
                                                continue;
                                            }
                                            else {
                                                break alab1;
                                            }
                                            break;
                                        }
                                        paint0.setAlpha(0xFF);
                                        canvas0.drawRect(rectF0, paint0);
                                    }
                                }
                            }
                            ++v7;
                            continue;
                        }
                        canvas0.restore();
                    }
                    if(this.s()) {
                        canvas0.saveLayer(rectF0, this.p);
                        this.u(canvas0);
                        this.e.b(canvas0, matrix0, v3);
                        canvas0.restore();
                    }
                    canvas0.restore();
                }
                if(this.A) {
                    Paint paint2 = this.B;
                    if(paint2 != null) {
                        paint2.setStyle(Paint.Style.STROKE);
                        this.B.setColor(0xFFFC2803);
                        this.B.setStrokeWidth(4.0f);
                        canvas0.drawRect(rectF0, this.B);
                        this.B.setStyle(Paint.Style.FILL);
                        this.B.setColor(0x50EBEBEB);
                        canvas0.drawRect(rectF0, this.B);
                    }
                }
            }
        }
    }

    @Override  // qlv
    public void c(RectF rectF0, Matrix matrix0, boolean z) {
        this.r.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.t();
        Matrix matrix1 = this.a;
        matrix1.set(matrix0);
        if(z) {
            List list0 = this.x;
            if(list0 == null) {
                qrf qrf0 = this.f;
                if(qrf0 != null) {
                    matrix1.preConcat(qrf0.g.a());
                }
            }
            else {
                int v = list0.size();
                while(true) {
                    --v;
                    if(v < 0) {
                        break;
                    }
                    matrix1.preConcat(((qrf)this.x.get(v)).g.a());
                }
            }
        }
        matrix1.preConcat(this.g.a());
    }

    @Override  // qml
    public final void d() {
        this.v();
    }

    @Override  // qpr
    public final void e(qpq qpq0, int v, List list0, qpq qpq1) {
        qrf qrf0 = this.e;
        if(qrf0 != null) {
            qpq qpq2 = qpq1.b(qrf0.g());
            if(qpq0.d(this.e.g(), v)) {
                list0.add(qpq2.c(this.e));
            }
            if(qpq0.f(this.g(), v)) {
                int v1 = qpq0.a(this.e.g(), v) + v;
                this.e.n(qpq0, v1, list0, qpq2);
            }
        }
        if(qpq0.e(this.g(), v)) {
            if(!"__container".equals(this.g())) {
                qpq1 = qpq1.b(this.g());
                if(qpq0.d(this.g(), v)) {
                    list0.add(qpq1.c(this));
                }
            }
            if(qpq0.f(this.g(), v)) {
                this.n(qpq0, v + qpq0.a(this.g(), v), list0, qpq1);
            }
        }
    }

    @Override  // qlt
    public final void f(List list0, List list1) {
    }

    @Override  // qlt
    public final String g() {
        return this.c.c;
    }

    public final BlurMaskFilter h(float f) {
        if(this.h == f) {
            return this.i;
        }
        BlurMaskFilter blurMaskFilter0 = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.i = blurMaskFilter0;
        this.h = f;
        return blurMaskFilter0;
    }

    public qqj i() {
        return this.c.u;
    }

    public qse j() {
        return this.c.v;
    }

    public final void k(qmq qmq0) {
        if(qmq0 == null) {
            return;
        }
        this.y.add(qmq0);
    }

    public abstract void l(Canvas arg1, Matrix arg2, int arg3);

    public final void m(qmq qmq0) {
        this.y.remove(qmq0);
    }

    public void n(qpq qpq0, int v, List list0, qpq qpq1) {
    }

    public void o(boolean z) {
        if(z && this.B == null) {
            this.B = new qlp();
        }
        this.A = z;
    }

    public void p(float f) {
        qnh qnh0 = this.g;
        qmq qmq0 = qnh0.e;
        if(qmq0 != null) {
            qmq0.j(f);
        }
        qmq qmq1 = qnh0.h;
        if(qmq1 != null) {
            qmq1.j(f);
        }
        qmq qmq2 = qnh0.i;
        if(qmq2 != null) {
            qmq2.j(f);
        }
        qmq qmq3 = qnh0.a;
        if(qmq3 != null) {
            qmq3.j(f);
        }
        qmq qmq4 = qnh0.b;
        if(qmq4 != null) {
            qmq4.j(f);
        }
        qmq qmq5 = qnh0.c;
        if(qmq5 != null) {
            qmq5.j(f);
        }
        qmq qmq6 = qnh0.d;
        if(qmq6 != null) {
            qmq6.j(f);
        }
        qmu qmu0 = qnh0.f;
        if(qmu0 != null) {
            qmu0.j(f);
        }
        qmu qmu1 = qnh0.g;
        if(qmu1 != null) {
            qmu1.j(f);
        }
        if(this.w != null) {
            for(int v1 = 0; v1 < this.w.a.size(); ++v1) {
                ((qmq)this.w.a.get(v1)).j(f);
            }
        }
        qmu qmu2 = this.d;
        if(qmu2 != null) {
            qmu2.j(f);
        }
        qrf qrf0 = this.e;
        if(qrf0 != null) {
            qrf0.p(f);
        }
        for(int v = 0; true; ++v) {
            List list0 = this.y;
            if(v >= list0.size()) {
                break;
            }
            ((qmq)list0.get(v)).j(f);
        }
    }

    public final void q(boolean z) {
        if(z != this.z) {
            this.z = z;
            this.v();
        }
    }

    final boolean r() {
        return this.w != null && !this.w.a.isEmpty();
    }

    final boolean s() {
        return this.e != null;
    }

    private final void t() {
        if(this.x == null) {
            if(this.f == null) {
                this.x = Collections.EMPTY_LIST;
                return;
            }
            this.x = new ArrayList();
            for(qrf qrf0 = this.f; qrf0 != null; qrf0 = qrf0.f) {
                this.x.add(qrf0);
            }
        }
    }

    private final void u(Canvas canvas0) {
        canvas0.drawRect(this.r.left - 1.0f, this.r.top - 1.0f, this.r.right + 1.0f, this.r.bottom + 1.0f, this.q);
    }

    private final void v() {
        this.b.invalidateSelf();
    }

    private final void w() {
    }
}

