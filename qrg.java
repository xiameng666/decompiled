import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public final class qrg extends qrf {
    public float j;
    public boolean k;
    private qmq l;
    private final List m;
    private final RectF n;
    private final RectF o;
    private final Paint p;

    public qrg(qkz qkz0, qrj qrj0, List list0, qkb qkb0) {
        super(qkz0, qrj0);
        qrg qrg1;
        String s;
        this.m = new ArrayList();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new Paint();
        this.k = true;
        qpw qpw0 = qrj0.r;
        if(qpw0 == null) {
            this.l = null;
        }
        else {
            qmq qmq0 = qpw0.a();
            this.l = qmq0;
            this.k(qmq0);
            this.l.h(this);
        }
        byi byi0 = new byi(qkb0.i.size());
        int v = list0.size() - 1;
        qrg qrg0 = null;
        while(v >= 0) {
            qrj qrj1 = (qrj)list0.get(v);
            int v2 = qrj1.w;
            if(v2 == 0) {
                throw null;
            }
            switch(v2 - 1) {
                case 0: {
                    qrg1 = new qrg(qkz0, qrj1, ((List)qkb0.b.get(qrj1.f)), qkb0);
                    break;
                }
                case 1: {
                    qrg1 = new qrm(qkz0, qrj1);
                    break;
                }
                case 2: {
                    qrg1 = new qrh(qkz0, qrj1);
                    break;
                }
                case 3: {
                    qrg1 = new qrk(qkz0, qrj1);
                    break;
                }
                case 4: {
                    qrg1 = new qrl(qkz0, qrj1, this, qkb0);
                    break;
                }
                case 5: {
                    qrg1 = new qrq(qkz0, qrj1);
                    break;
                }
                default: {
                    switch(v2) {
                        case 1: {
                            s = "PRE_COMP";
                            break;
                        }
                        case 2: {
                            s = "SOLID";
                            break;
                        }
                        case 3: {
                            s = "IMAGE";
                            break;
                        }
                        case 4: {
                            s = "NULL";
                            break;
                        }
                        case 5: {
                            s = "SHAPE";
                            break;
                        }
                        case 6: {
                            s = "TEXT";
                            break;
                        }
                        default: {
                            s = "UNKNOWN";
                        }
                    }
                    qtq.a(("Unknown layer type " + s));
                    qrg1 = null;
                }
            }
            if(qrg1 != null) {
                byi0.h(qrg1.c.d, qrg1);
                if(qrg0 == null) {
                    this.m.add(0, qrg1);
                    int v3 = qrj1.x - 1;
                    if(qrj1.x == 0) {
                        throw null;
                    }
                    if(v3 == 1 || v3 == 2) {
                        qrg0 = qrg1;
                        --v;
                        continue;
                    }
                }
                else {
                    qrg0.e = qrg1;
                    qrg0 = null;
                }
            }
            --v;
            continue;
        }
        for(int v1 = 0; v1 < byi0.b(); ++v1) {
            qrf qrf0 = (qrf)byi0.d(byi0.c(v1));
            if(qrf0 != null) {
                qrf qrf1 = (qrf)byi0.d(qrf0.c.e);
                if(qrf1 != null) {
                    qrf0.f = qrf1;
                }
            }
        }
    }

    @Override  // qrf
    public final void a(Object object0, qub qub0) {
        super.a(object0, qub0);
        if(object0 == qle.E) {
            if(qub0 == null) {
                qmq qmq0 = this.l;
                if(qmq0 != null) {
                    qmq0.d = null;
                }
            }
            else {
                qni qni0 = new qni(qub0);
                this.l = qni0;
                qni0.h(this);
                this.k(this.l);
            }
        }
    }

    @Override  // qrf
    public final void c(RectF rectF0, Matrix matrix0, boolean z) {
        super.c(rectF0, matrix0, z);
        List list0 = this.m;
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            this.n.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((qrf)list0.get(v)).c(this.n, this.a, true);
            rectF0.union(this.n);
        }
    }

    @Override  // qrf
    public final void l(Canvas canvas0, Matrix matrix0, int v) {
        RectF rectF0 = this.o;
        qrj qrj0 = this.c;
        rectF0.set(0.0f, 0.0f, qrj0.n, qrj0.o);
        matrix0.mapRect(rectF0);
        int v1 = 0xFF;
        int v2 = 0;
        if(this.b.n && this.m.size() > 1) {
            if(v == 0xFF) {
                v = 0xFF;
            }
            else {
                v2 = 1;
            }
        }
        if(v2 == 0) {
            canvas0.save();
        }
        else {
            this.p.setAlpha(v);
            canvas0.saveLayer(rectF0, this.p);
        }
        if(1 != v2) {
            v1 = v;
        }
        List list0 = this.m;
        int v3 = list0.size();
        while(true) {
            --v3;
            if(v3 < 0) {
                break;
            }
            if(!this.k && "__container".equals(qrj0.c) || rectF0.isEmpty() || canvas0.clipRect(rectF0)) {
                ((qrf)list0.get(v3)).b(canvas0, matrix0, v1);
            }
        }
        canvas0.restore();
    }

    @Override  // qrf
    public final void n(qpq qpq0, int v, List list0, qpq qpq1) {
        for(int v1 = 0; true; ++v1) {
            List list1 = this.m;
            if(v1 >= list1.size()) {
                break;
            }
            ((qrf)list1.get(v1)).e(qpq0, v, list0, qpq1);
        }
    }

    @Override  // qrf
    public final void o(boolean z) {
        super.o(z);
        for(Object object0: this.m) {
            ((qrf)object0).o(z);
        }
    }

    @Override  // qrf
    public final void p(float f) {
        this.j = f;
        super.p(f);
        if(this.l != null) {
            float f1 = this.b.b.b() + 0.01f;
            qkb qkb0 = this.c.b;
            float f2 = qkb0.k;
            f = (((float)(((Float)this.l.e()))) * qkb0.m - f2) / f1;
        }
        if(this.l == null) {
            f -= this.c.m / this.c.b.b();
        }
        float f3 = this.c.l;
        if(f3 != 0.0f && !"__container".equals(this.c.c)) {
            f /= f3;
        }
        List list0 = this.m;
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            ((qrf)list0.get(v)).p(f);
        }
    }
}

