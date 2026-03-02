import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

public final class qnh {
    public qmq a;
    public qmq b;
    public qmq c;
    public qmq d;
    public qmq e;
    public qmu f;
    public qmu g;
    public qmq h;
    public qmq i;
    private final Matrix j;
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;
    private final boolean o;

    public qnh(qqg qqg0) {
        this.j = new Matrix();
        this.a = qqg0.a == null ? null : qqg0.a.a();
        this.b = qqg0.b == null ? null : qqg0.b.a();
        this.c = qqg0.c == null ? null : qqg0.c.a();
        this.d = qqg0.d == null ? null : qqg0.d.a();
        this.f = (qmu)(qqg0.f == null ? null : qqg0.f.a());
        this.o = qqg0.j;
        if(this.f == null) {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        else {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        }
        this.g = (qmu)(qqg0.g == null ? null : qqg0.g.a());
        qpy qpy0 = qqg0.e;
        if(qpy0 != null) {
            this.e = qpy0.a();
        }
        qpw qpw0 = qqg0.h;
        this.h = qpw0 == null ? null : qpw0.a();
        qpw qpw1 = qqg0.i;
        if(qpw1 != null) {
            this.i = qpw1.a();
            return;
        }
        this.i = null;
    }

    public final Matrix a() {
        Matrix matrix0 = this.j;
        matrix0.reset();
        qmq qmq0 = this.b;
        if(qmq0 != null) {
            PointF pointF0 = (PointF)qmq0.e();
            if(pointF0 != null && ((pointF0.x != 0.0f) || pointF0.y != 0.0f)) {
                matrix0.preTranslate(pointF0.x, pointF0.y);
            }
        }
        if(!this.o) {
            qmq qmq1 = this.d;
            if(qmq1 != null) {
                float f3 = (qmq1 instanceof qni) ? ((float)(((Float)qmq1.e()))) : ((qmu)qmq1).k();
                if(f3 != 0.0f) {
                    matrix0.preRotate(f3);
                }
            }
        }
        else if(qmq0 != null) {
            float f = qmq0.c;
            PointF pointF1 = (PointF)qmq0.e();
            float f1 = pointF1.x;
            float f2 = pointF1.y;
            qmq0.j(0.0001f + f);
            PointF pointF2 = (PointF)qmq0.e();
            qmq0.j(f);
            matrix0.preRotate(((float)Math.toDegrees(Math.atan2(pointF2.y - f2, pointF2.x - f1))));
        }
        qmu qmu0 = this.f;
        if(qmu0 != null) {
            float f4 = this.g == null ? 0.0f : ((float)Math.cos(Math.toRadians(-this.g.k() + 90.0f)));
            float f5 = this.g == null ? 1.0f : ((float)Math.sin(Math.toRadians(-this.g.k() + 90.0f)));
            float f6 = (float)Math.tan(Math.toRadians(qmu0.k()));
            this.f();
            this.n[0] = f4;
            this.n[1] = f5;
            this.n[3] = -f5;
            this.n[4] = f4;
            this.n[8] = 1.0f;
            this.k.setValues(this.n);
            this.f();
            this.n[0] = 1.0f;
            this.n[3] = f6;
            this.n[4] = 1.0f;
            this.n[8] = 1.0f;
            this.l.setValues(this.n);
            this.f();
            this.n[0] = f4;
            this.n[1] = -f5;
            this.n[3] = f5;
            this.n[4] = f4;
            this.n[8] = 1.0f;
            this.m.setValues(this.n);
            this.l.preConcat(this.k);
            this.m.preConcat(this.l);
            matrix0.preConcat(this.m);
        }
        qmq qmq2 = this.c;
        if(qmq2 != null) {
            quc quc0 = (quc)qmq2.e();
            if(quc0 != null) {
                float f7 = quc0.a;
                if((f7 != 1.0f) || quc0.b != 1.0f) {
                    matrix0.preScale(f7, quc0.b);
                }
            }
        }
        qmq qmq3 = this.a;
        if(qmq3 != null) {
            PointF pointF3 = (PointF)qmq3.e();
            if(pointF3 != null && ((pointF3.x != 0.0f) || pointF3.y != 0.0f)) {
                matrix0.preTranslate(-pointF3.x, -pointF3.y);
            }
        }
        return matrix0;
    }

    public final Matrix b(float f) {
        PointF pointF0 = null;
        PointF pointF1 = this.b == null ? null : ((PointF)this.b.e());
        quc quc0 = this.c == null ? null : ((quc)this.c.e());
        Matrix matrix0 = this.j;
        matrix0.reset();
        if(pointF1 != null) {
            matrix0.preTranslate(pointF1.x * f, pointF1.y * f);
        }
        if(quc0 != null) {
            matrix0.preScale(((float)Math.pow(quc0.a, f)), ((float)Math.pow(quc0.b, f)));
        }
        qmq qmq0 = this.d;
        if(qmq0 != null) {
            float f1 = (float)(((Float)qmq0.e()));
            qmq qmq1 = this.a;
            if(qmq1 != null) {
                pointF0 = (PointF)qmq1.e();
            }
            float f2 = 0.0f;
            float f3 = pointF0 == null ? 0.0f : pointF0.x;
            if(pointF0 != null) {
                f2 = pointF0.y;
            }
            matrix0.preRotate(f1 * f, f3, f2);
        }
        return matrix0;
    }

    public final void c(qrf qrf0) {
        qrf0.k(this.e);
        qrf0.k(this.h);
        qrf0.k(this.i);
        qrf0.k(this.a);
        qrf0.k(this.b);
        qrf0.k(this.c);
        qrf0.k(this.d);
        qrf0.k(this.f);
        qrf0.k(this.g);
    }

    public final void d(qml qml0) {
        qmq qmq0 = this.e;
        if(qmq0 != null) {
            qmq0.h(qml0);
        }
        qmq qmq1 = this.h;
        if(qmq1 != null) {
            qmq1.h(qml0);
        }
        qmq qmq2 = this.i;
        if(qmq2 != null) {
            qmq2.h(qml0);
        }
        qmq qmq3 = this.a;
        if(qmq3 != null) {
            qmq3.h(qml0);
        }
        qmq qmq4 = this.b;
        if(qmq4 != null) {
            qmq4.h(qml0);
        }
        qmq qmq5 = this.c;
        if(qmq5 != null) {
            qmq5.h(qml0);
        }
        qmq qmq6 = this.d;
        if(qmq6 != null) {
            qmq6.h(qml0);
        }
        qmu qmu0 = this.f;
        if(qmu0 != null) {
            qmu0.h(qml0);
        }
        qmu qmu1 = this.g;
        if(qmu1 != null) {
            qmu1.h(qml0);
        }
    }

    public final boolean e(Object object0, qub qub0) {
        if(object0 == qle.f) {
            qmq qmq0 = this.a;
            if(qmq0 == null) {
                this.a = new qni(qub0, new PointF());
                return true;
            }
            qmq0.d = qub0;
            return true;
        }
        if(object0 == qle.g) {
            qmq qmq1 = this.b;
            if(qmq1 == null) {
                this.b = new qni(qub0, new PointF());
                return true;
            }
            qmq1.d = qub0;
            return true;
        }
        if(object0 == qle.h) {
            qmq qmq2 = this.b;
            if((qmq2 instanceof qne)) {
                ((qne)qmq2).e = qub0;
                return true;
            }
        }
        if(object0 == qle.i) {
            qmq qmq3 = this.b;
            if((qmq3 instanceof qne)) {
                ((qne)qmq3).f = qub0;
                return true;
            }
        }
        if(object0 == qle.o) {
            qmq qmq4 = this.c;
            if(qmq4 == null) {
                this.c = new qni(qub0, new quc());
                return true;
            }
            qmq4.d = qub0;
            return true;
        }
        if(object0 == qle.p) {
            qmq qmq5 = this.d;
            if(qmq5 == null) {
                this.d = new qni(qub0, ((float)0.0f));
                return true;
            }
            qmq5.d = qub0;
            return true;
        }
        if(object0 == qle.c) {
            qmq qmq6 = this.e;
            if(qmq6 == null) {
                this.e = new qni(qub0, ((int)100));
                return true;
            }
            qmq6.d = qub0;
            return true;
        }
        if(object0 == qle.C) {
            qmq qmq7 = this.h;
            if(qmq7 == null) {
                this.h = new qni(qub0, ((float)100.0f));
                return true;
            }
            qmq7.d = qub0;
            return true;
        }
        if(object0 == qle.D) {
            qmq qmq8 = this.i;
            if(qmq8 == null) {
                this.i = new qni(qub0, ((float)100.0f));
                return true;
            }
            qmq8.d = qub0;
            return true;
        }
        if(object0 == qle.q) {
            if(this.f == null) {
                this.f = new qmu(Collections.singletonList(new qtz(((float)0.0f))));
            }
            this.f.d = qub0;
            return true;
        }
        if(object0 == qle.r) {
            if(this.g == null) {
                this.g = new qmu(Collections.singletonList(new qtz(((float)0.0f))));
            }
            this.g.d = qub0;
            return true;
        }
        return false;
    }

    private final void f() {
        for(int v = 0; v < 9; ++v) {
            this.n[v] = 0.0f;
        }
    }
}

